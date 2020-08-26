package typings.weixinApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthSetting extends js.Object {
  var authSetting: keyinScopeboolean = js.native
}

object AuthSetting {
  @scala.inline
  def apply(authSetting: keyinScopeboolean): AuthSetting = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSetting]
  }
  @scala.inline
  implicit class AuthSettingOps[Self <: AuthSetting] (val x: Self) extends AnyVal {
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
    def setAuthSetting(value: keyinScopeboolean): Self = this.set("authSetting", value.asInstanceOf[js.Any])
  }
  
}

