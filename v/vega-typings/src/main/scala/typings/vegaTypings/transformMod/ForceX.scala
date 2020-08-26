package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.x
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForceX extends Force {
  var force: x = js.native
  var strength: js.UndefOr[Double | SignalRef] = js.native
  var x: js.UndefOr[FieldRef] = js.native
}

object ForceX {
  @scala.inline
  def apply(force: x): ForceX = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceX]
  }
  @scala.inline
  implicit class ForceXOps[Self <: ForceX] (val x: Self) extends AnyVal {
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
    def setForce(value: typings.vegaTypings.vegaTypingsStrings.x): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrength(value: Double | SignalRef): Self = this.set("strength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrength: Self = this.set("strength", js.undefined)
    @scala.inline
    def setX(value: FieldRef): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
  }
  
}

