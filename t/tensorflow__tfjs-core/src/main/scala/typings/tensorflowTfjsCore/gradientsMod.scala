package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.Grad
import typings.tensorflowTfjsCore.anon.GradsValue
import typings.tensorflowTfjsCore.anon.Value
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.engineMod.CustomGradientFunc
import typings.tensorflowTfjsCore.tensorMod.Scalar
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/gradients", JSImport.Namespace)
@js.native
object gradientsMod extends js.Object {
  /**
    * Overrides the gradient computation of a function `f`.
    *
    * Takes a function
    * `f(...inputs, save) => {value: Tensor, gradFunc: (dy, saved) => Tensor[]}`
    * and returns another function `g(...inputs)` which takes the same inputs as
    * `f`. When called, `g` returns `f().value`. In backward mode, custom gradients
    * with respect to each input of `f` are computed using `f().gradFunc`.
    *
    * The `save` function passsed to `f` should be used for saving tensors needed
    * in the gradient. And the `saved` passed to the `gradFunc` is a
    * `NamedTensorMap`, which contains those saved tensor.
    *
    * ```js
    * const customOp = tf.customGrad((x, save) => {
    *   // Save x to make sure it's available later for the gradient.
    *   save([x]);
    *   // Override gradient of our custom x ^ 2 op to be dy * abs(x);
    *   return {
    *     value: x.square(),
    *     // Note `saved.x` which points to the `x` we saved earlier.
    *     gradFunc: (dy, saved) => [dy.mul(saved[0].abs())]
    *   };
    * });
    *
    * const x = tf.tensor1d([-1, -2, 3]);
    * const dx = tf.grad(x => customOp(x));
    *
    * console.log(`f(x):`);
    * customOp(x).print();
    * console.log(`f'(x):`);
    * dx(x).print();
    * ```
    *
    * @param f The function to evaluate in forward mode, which should return
    *     `{value: Tensor, gradFunc: (dy, saved) => Tensor[]}`, where `gradFunc`
    *     returns the custom gradients of `f` with respect to its inputs.
    */
  /** @doc {heading: 'Training', subheading: 'Gradients'} */
  def customGrad[T /* <: Tensor[Rank] */](f: CustomGradientFunc[T]): js.Function1[/* repeated */ Tensor[Rank], T] = js.native
  /**
    * Provided `f(x)`, returns another function `g(x, dy?)`, which gives the
    * gradient of `f(x)` with respect to `x`.
    *
    * If `dy` is provided, the gradient of `f(x).mul(dy).sum()` with respect to
    * `x` is computed instead. `f(x)` must take a single tensor `x` and return a
    * single tensor `y`. If `f()` takes multiple inputs, use `tf.grads` instead.
    *
    * ```js
    * // f(x) = x ^ 2
    * const f = x => x.square();
    * // f'(x) = 2x
    * const g = tf.grad(f);
    *
    * const x = tf.tensor1d([2, 3]);
    * g(x).print();
    * ```
    *
    * ```js
    * // f(x) = x ^ 3
    * const f = x => x.pow(tf.scalar(3, 'int32'));
    * // f'(x) = 3x ^ 2
    * const g = tf.grad(f);
    * // f''(x) = 6x
    * const gg = tf.grad(g);
    *
    * const x = tf.tensor1d([2, 3]);
    * gg(x).print();
    * ```
    *
    * @param f The function f(x), to compute gradient for.
    */
  /** @doc {heading: 'Training', subheading: 'Gradients'} */
  def grad(f: js.Function1[/* x */ Tensor[Rank], Tensor[Rank]]): js.Function2[
    /* x */ TensorLike | Tensor[Rank], 
    /* dy */ js.UndefOr[TensorLike | Tensor[Rank]], 
    Tensor[Rank]
  ] = js.native
  /**
    * Provided `f(x1, x2,...)`, returns another function `g([x1, x2,...], dy?)`,
    * which gives an array of gradients of `f()` with respect to each input
    * [`x1`,`x2`,...].
    *
    * If `dy` is passed when calling `g()`, the gradient of
    * `f(x1,...).mul(dy).sum()` with respect to each input is computed instead.
    * The provided `f` must take one or more tensors and return a single tensor
    * `y`. If `f()` takes a single input, we recommend using `tf.grad` instead.
    *
    * ```js
    * // f(a, b) = a * b
    * const f = (a, b) => a.mul(b);
    * // df / da = b, df / db = a
    * const g = tf.grads(f);
    *
    * const a = tf.tensor1d([2, 3]);
    * const b = tf.tensor1d([-2, -3]);
    * const [da, db] = g([a, b]);
    * console.log('da');
    * da.print();
    * console.log('db');
    * db.print();
    * ```
    *
    * @param f The function `f(x1, x2,...)` to compute gradients for.
    */
  /** @doc {heading: 'Training', subheading: 'Gradients'} */
  def grads(f: js.Function1[/* repeated */ Tensor[Rank], Tensor[Rank]]): js.Function2[
    /* args */ js.Array[Tensor[Rank] | TensorLike], 
    /* dy */ js.UndefOr[Tensor[Rank] | TensorLike], 
    js.Array[Tensor[Rank]]
  ] = js.native
  /**
    * Like `tf.grad`, but also returns the value of `f()`. Useful when `f()`
    * returns a metric you want to show.
    *
    * The result is a rich object with the following properties:
    * - grad: The gradient of `f(x)` w.r.t `x` (result of `tf.grad`).
    * - value: The value returned by `f(x)`.
    *
    * ```js
    * // f(x) = x ^ 2
    * const f = x => x.square();
    * // f'(x) = 2x
    * const g = tf.valueAndGrad(f);
    *
    * const x = tf.tensor1d([2, 3]);
    * const {value, grad} = g(x);
    *
    * console.log('value');
    * value.print();
    * console.log('grad');
    * grad.print();
    * ```
    */
  /** @doc {heading: 'Training', subheading: 'Gradients'} */
  def valueAndGrad[I /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](f: js.Function1[/* x */ I, O]): js.Function2[/* x */ I, /* dy */ js.UndefOr[O], Grad[O, I]] = js.native
  /**
    * Like `tf.grads`, but returns also the value of `f()`. Useful when `f()`
    * returns a metric you want to show.
    *
    * The result is a rich object with the following properties:
    * - grads: The gradients of `f()` w.r.t each input (result of `tf.grads`).
    * - value: The value returned by `f(x)`.
    *
    * ```js
    * // f(a, b) = a * b
    * const f = (a, b) => a.mul(b);
    * // df/da = b, df/db = a
    * const g = tf.valueAndGrads(f);
    *
    * const a = tf.tensor1d([2, 3]);
    * const b = tf.tensor1d([-2, -3]);
    * const {value, grads} = g([a, b]);
    *
    * const [da, db] = grads;
    *
    * console.log('value');
    * value.print();
    *
    * console.log('da');
    * da.print();
    * console.log('db');
    * db.print();
    * ```
    */
  /** @doc {heading: 'Training', subheading: 'Gradients'} */
  def valueAndGrads[O /* <: Tensor[Rank] */](f: js.Function1[/* repeated */ Tensor[Rank], O]): js.Function2[/* args */ js.Array[Tensor[Rank]], /* dy */ js.UndefOr[O], GradsValue[O]] = js.native
  /**
    * Computes and returns the gradient of f(x) with respect to the list of
    * trainable variables provided by `varList`. If no list is provided, it
    * defaults to all trainable variables.
    *
    * ```js
    * const a = tf.variable(tf.tensor1d([3, 4]));
    * const b = tf.variable(tf.tensor1d([5, 6]));
    * const x = tf.tensor1d([1, 2]);
    *
    * // f(a, b) = a * x ^ 2 + b * x
    * const f = () => a.mul(x.square()).add(b.mul(x)).sum();
    * // df/da = x ^ 2, df/db = x
    * const {value, grads} = tf.variableGrads(f);
    *
    * Object.keys(grads).forEach(varName => grads[varName].print());
    * ```
    *
    * @param f The function to execute. f() should return a scalar.
    * @param varList The list of variables to compute the gradients with respect
    *     to. Defaults to all trainable variables.
    * @returns An object with the following keys and values:
    *   - `value`: The value of the function `f`.
    *   - `grads`: A map from the names of the variables to the gradients.
    *     If the `varList` argument is provided explicitly and contains a subset of
    *     non-trainable variables, this map in the return value will contain keys
    *     that map the names of the non-trainable variables to `null`.
    */
  /** @doc {heading: 'Training', subheading: 'Gradients'} */
  def variableGrads(f: js.Function0[Scalar]): Value = js.native
  def variableGrads(f: js.Function0[Scalar], varList: js.Array[Variable[Rank]]): Value = js.native
}

