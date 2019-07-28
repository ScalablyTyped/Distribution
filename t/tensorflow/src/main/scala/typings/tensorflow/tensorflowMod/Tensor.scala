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

