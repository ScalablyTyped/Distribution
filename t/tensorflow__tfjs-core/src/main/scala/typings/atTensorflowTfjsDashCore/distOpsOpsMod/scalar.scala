package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Scalar
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "scalar")
@js.native
object scalar extends js.Object {
  def apply(value: String): Scalar = js.native
  def apply(value: String, dtype: DataType): Scalar = js.native
  def apply(value: Boolean): Scalar = js.native
  def apply(value: Boolean, dtype: DataType): Scalar = js.native
  /**
    * Creates rank-0 `tf.Tensor` (scalar) with the provided value and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.scalar` as it makes the code more readable.
    *
    * ```js
    * tf.scalar(3.14).print();
    * ```
    *
    * @param value The value of the scalar.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def apply(value: Double): Scalar = js.native
  def apply(value: Double, dtype: DataType): Scalar = js.native
  def apply(value: Uint8Array): Scalar = js.native
  def apply(value: Uint8Array, dtype: DataType): Scalar = js.native
}

