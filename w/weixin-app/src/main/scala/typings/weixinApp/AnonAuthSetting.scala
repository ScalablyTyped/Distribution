package typings.weixinApp

import typings.weixinApp.weixinAppStrings.Anon_AuthSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthSetting extends js.Object {
  var authSetting: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in weixin-app.wx.Scope ]: boolean}
    */ Anon_AuthSetting with js.Any
}

object AnonAuthSetting {
  @scala.inline
  def apply(
    authSetting: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in weixin-app.wx.Scope ]: boolean}
    */ Anon_AuthSetting with js.Any
  ): AnonAuthSetting = {
    val __obj = js.Dynamic.literal(authSetting = authSetting.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAuthSetting]
  }
}

