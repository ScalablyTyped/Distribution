package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.distEngineMod.CustomGradientFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "customGrad")
@js.native
object customGrad extends js.Object {
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
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] */](f: CustomGradientFunc[T]): js.Function1[
    /* repeated */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank], 
    T
  ] = js.native
}

