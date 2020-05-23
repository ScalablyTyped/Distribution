package typings.weixinApp.anon

import typings.weixinApp.weixinAppStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  characteristics  :std.Array<{  uuid  :string,   properties  :std.Array<{  read  :boolean,   write  :boolean,   notify  :boolean,   indicate  :boolean}>}>} & weixin-app.wx.ErrMsgResponse */
trait characteristicsArrayuuids extends js.Object {
  var characteristics: js.Array[Properties]
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String
}

object characteristicsArrayuuids {
  @scala.inline
  def apply(characteristics: js.Array[Properties], errMsg: ok | String): characteristicsArrayuuids = {
    val __obj = js.Dynamic.literal(characteristics = characteristics.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[characteristicsArrayuuids]
  }
}

