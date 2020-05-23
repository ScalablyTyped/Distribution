package typings.weixinApp.anon

import typings.weixinApp.weixinAppStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  services  :std.Array<{  uuid  :string,   isPrimary  :boolean}>} & weixin-app.wx.ErrMsgResponse */
trait servicesArrayuuidstringis extends js.Object {
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String
  var services: js.Array[IsPrimary]
}

object servicesArrayuuidstringis {
  @scala.inline
  def apply(errMsg: ok | String, services: js.Array[IsPrimary]): servicesArrayuuidstringis = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[servicesArrayuuidstringis]
  }
}

