package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.Anon_Grad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "valueAndGrad")
@js.native
object valueAndGrad extends js.Object {
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
  def apply[I /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] */](f: js.Function1[/* x */ I, O]): js.Function2[/* x */ I, /* dy */ js.UndefOr[O], Anon_Grad[O, I]] = js.native
}

