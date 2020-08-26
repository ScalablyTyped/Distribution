package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.center
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForceCenter extends Force {
  var force: center = js.native
  var x: js.UndefOr[Double | SignalRef] = js.native
  var y: js.UndefOr[Double | SignalRef] = js.native
}

object ForceCenter {
  @scala.inline
  def apply(force: center): ForceCenter = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceCenter]
  }
  @scala.inline
  implicit class ForceCenterOps[Self <: ForceCenter] (val x: Self) extends AnyVal {
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
    def setForce(value: center): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double | SignalRef): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double | SignalRef): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

