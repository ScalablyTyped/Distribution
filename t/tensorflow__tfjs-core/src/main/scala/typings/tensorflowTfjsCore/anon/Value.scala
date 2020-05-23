package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.tensorMod.Scalar
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var grads: NamedTensorMap
  var value: Scalar
}

object Value {
  @scala.inline
  def apply(grads: NamedTensorMap, value: Scalar): Value = {
    val __obj = js.Dynamic.literal(grads = grads.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

