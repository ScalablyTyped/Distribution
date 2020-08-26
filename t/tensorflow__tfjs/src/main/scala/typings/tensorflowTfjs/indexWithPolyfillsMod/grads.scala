package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "grads")
@js.native
object grads extends js.Object {
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
  def apply(
    f: js.Function1[
      /* repeated */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
      Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ): js.Function2[
    /* args */ js.Array[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike], 
    /* dy */ js.UndefOr[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] | TensorLike], 
    js.Array[Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]]
  ] = js.native
}

