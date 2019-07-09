package typings
package tensorflowLib.tensorflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tensor extends js.Object {
  var shape: js.Array[scala.Double]
  var `type`: Types
  var value: nodeLib.Buffer | TensorValue
}

object Tensor {
  @scala.inline
  def apply(shape: js.Array[scala.Double], `type`: Types, value: nodeLib.Buffer | TensorValue): Tensor = {
    val __obj = js.Dynamic.literal(shape = shape, value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Tensor]
  }
}

