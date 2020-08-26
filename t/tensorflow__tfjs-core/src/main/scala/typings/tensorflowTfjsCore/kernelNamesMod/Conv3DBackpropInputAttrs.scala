package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conv3DBackpropInputAttrs extends js.Object {
  var pad: valid_ | same_ = js.native
}

object Conv3DBackpropInputAttrs {
  @scala.inline
  def apply(pad: valid_ | same_): Conv3DBackpropInputAttrs = {
    val __obj = js.Dynamic.literal(pad = pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conv3DBackpropInputAttrs]
  }
  @scala.inline
  implicit class Conv3DBackpropInputAttrsOps[Self <: Conv3DBackpropInputAttrs] (val x: Self) extends AnyVal {
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
    def setPad(value: valid_ | same_): Self = this.set("pad", value.asInstanceOf[js.Any])
  }
  
}

