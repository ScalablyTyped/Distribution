package typings.uiBox.safeHrefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafeHrefConfigObj extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var origin: js.UndefOr[String] = js.native
}

object SafeHrefConfigObj {
  @scala.inline
  def apply(): SafeHrefConfigObj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeHrefConfigObj]
  }
  @scala.inline
  implicit class SafeHrefConfigObjOps[Self <: SafeHrefConfigObj] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
  
}

