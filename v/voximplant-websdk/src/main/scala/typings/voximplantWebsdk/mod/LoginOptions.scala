package typings.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    VoxImplant login options
  */
@js.native
trait LoginOptions extends js.Object {
  /**
    *    If set to false Web SDK can be used only for ACD status management
    */
  var receiveCalls: js.UndefOr[Boolean] = js.native
  /**
    *    If set to true user presence will be changed automatically while a call
    */
  var serverPresenceControl: js.UndefOr[Boolean] = js.native
}

object LoginOptions {
  @scala.inline
  def apply(): LoginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginOptions]
  }
  @scala.inline
  implicit class LoginOptionsOps[Self <: LoginOptions] (val x: Self) extends AnyVal {
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
    def setReceiveCalls(value: Boolean): Self = this.set("receiveCalls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceiveCalls: Self = this.set("receiveCalls", js.undefined)
    @scala.inline
    def setServerPresenceControl(value: Boolean): Self = this.set("serverPresenceControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerPresenceControl: Self = this.set("serverPresenceControl", js.undefined)
  }
  
}

