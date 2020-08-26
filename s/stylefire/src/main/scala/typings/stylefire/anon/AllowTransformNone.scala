package typings.stylefire.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowTransformNone extends js.Object {
  var allowTransformNone: js.UndefOr[Boolean] = js.native
  var enableHardwareAcceleration: js.UndefOr[Boolean] = js.native
  var isDashCase: js.UndefOr[Boolean] = js.native
}

object AllowTransformNone {
  @scala.inline
  def apply(): AllowTransformNone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowTransformNone]
  }
  @scala.inline
  implicit class AllowTransformNoneOps[Self <: AllowTransformNone] (val x: Self) extends AnyVal {
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
    def setAllowTransformNone(value: Boolean): Self = this.set("allowTransformNone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTransformNone: Self = this.set("allowTransformNone", js.undefined)
    @scala.inline
    def setEnableHardwareAcceleration(value: Boolean): Self = this.set("enableHardwareAcceleration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHardwareAcceleration: Self = this.set("enableHardwareAcceleration", js.undefined)
    @scala.inline
    def setIsDashCase(value: Boolean): Self = this.set("isDashCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDashCase: Self = this.set("isDashCase", js.undefined)
  }
  
}

