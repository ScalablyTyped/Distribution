package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 开放接口-----微信支付
/* Rewritten from type alias, can be one of: 
  - typings.weixinApp.weixinAppStrings.MD5
  - typings.weixinApp.weixinAppStrings.`HMAC-SHA256`
*/
trait PaymentSignType extends js.Object

object PaymentSignType {
  @scala.inline
  def `HMAC-SHA256`: typings.weixinApp.weixinAppStrings.`HMAC-SHA256` = "HMAC-SHA256".asInstanceOf[typings.weixinApp.weixinAppStrings.`HMAC-SHA256`]
  @scala.inline
  def MD5: typings.weixinApp.weixinAppStrings.MD5 = "MD5".asInstanceOf[typings.weixinApp.weixinAppStrings.MD5]
}

