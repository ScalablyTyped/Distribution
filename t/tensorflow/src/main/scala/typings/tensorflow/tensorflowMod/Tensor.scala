package typings.tensorflow.tensorflowMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tensor extends js.Object {
  var shape: js.Array[Double]
  var `type`: Types
  var value: Buffer | TensorValue
}

object Tensor {
  @scala.inline
  def apply(shape: js.Array[Double], `type`: Types, value: Buffer | TensorValue): Tensor = {
    val __obj = js.Dynamic.literal(shape = shape, value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Tensor]
  }
}

@JSImport("tensorflow", "tensor")
@js.native
object tensor extends js.Object {
  def apply(value: Buffer): Tensor = js.native
  def apply(value: Buffer, `type`: Types): Tensor = js.native
  def apply(value: Buffer, `type`: Types, shape: js.Array[Double]): Tensor = js.native
  def apply(value: TensorValue): Tensor = js.native
  def apply(value: TensorValue, `type`: Types): Tensor = js.native
  def apply(value: TensorValue, `type`: Types, shape: js.Array[Double]): Tensor = js.native
}

