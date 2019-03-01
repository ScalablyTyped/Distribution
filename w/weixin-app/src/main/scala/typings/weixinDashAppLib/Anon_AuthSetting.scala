package typings
package weixinDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthSetting extends js.Object {
  var authSetting: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in weixin-app.wx.Scope ]: boolean}
    */ weixinDashAppLib.weixinDashAppLibStrings.Anon_AuthSetting with js.Any
}

object Anon_AuthSetting {
  @scala.inline
  def apply(
    authSetting: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in weixin-app.wx.Scope ]: boolean}
    */ weixinDashAppLib.weixinDashAppLibStrings.Anon_AuthSetting with js.Any
  ): Anon_AuthSetting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authSetting")(authSetting)
    __obj.asInstanceOf[Anon_AuthSetting]
  }
}

