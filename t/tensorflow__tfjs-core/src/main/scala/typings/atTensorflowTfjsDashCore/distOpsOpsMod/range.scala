package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "range")
@js.native
object range extends js.Object {
  /**
    * Creates a new `tf.Tensor1D` filled with the numbers in the range provided.
    *
    * The tensor is a is half-open interval meaning it includes start, but
    * excludes stop. Decrementing ranges and negative step values are also
    * supported.
    *
    * ```js
    * tf.range(0, 9, 2).print();
    * ```
    *
    * @param start An integer start value
    * @param stop An integer stop value
    * @param step An integer increment (will default to 1 or -1)
    * @param dtype The data type of the output tensor. Defaults to 'float32'.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def apply(start: Double, stop: Double): Tensor1D = js.native
  def apply(start: Double, stop: Double, step: Double): Tensor1D = js.native
}

