package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.tensorMod.Scalar
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value extends js.Object {
  var grads: NamedTensorMap = js.native
  var value: Scalar = js.native
}

object Value {
  @scala.inline
  def apply(grads: NamedTensorMap, value: Scalar): Value = {
    val __obj = js.Dynamic.literal(grads = grads.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGrads(value: NamedTensorMap): Self = this.set("grads", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Scalar): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

