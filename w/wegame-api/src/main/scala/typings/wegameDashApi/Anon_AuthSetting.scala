package typings.wegameDashApi

import typings.wegameDashApi.wx.types.AuthSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthSetting extends js.Object {
  var authSetting: AuthSetting
}

object Anon_AuthSetting {
  @scala.inline
  def apply(authSetting: AuthSetting): Anon_AuthSetting = {
    val __obj = js.Dynamic.literal(authSetting = authSetting)
  
    __obj.asInstanceOf[Anon_AuthSetting]
  }
}

