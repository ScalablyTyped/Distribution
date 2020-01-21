package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----扫码
/* Rewritten from type alias, can be one of: 
  - typings.weixinApp.weixinAppStrings.qrCode
  - typings.weixinApp.weixinAppStrings.barCode
*/
trait scanType extends js.Object

object scanType {
  @scala.inline
  def barCode: typings.weixinApp.weixinAppStrings.barCode = this.cast("barCode")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def qrCode: typings.weixinApp.weixinAppStrings.qrCode = this.cast("qrCode")
}

