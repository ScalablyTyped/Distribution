package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----扫码
/* Rewritten from type alias, can be one of: 
  - typings.weixinDashApp.weixinDashAppStrings.qrCode
  - typings.weixinDashApp.weixinDashAppStrings.barCode
*/
trait scanType extends js.Object

object scanType {
  @scala.inline
  def barCode: typings.weixinDashApp.weixinDashAppStrings.barCode = this.cast("barCode")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def qrCode: typings.weixinDashApp.weixinDashAppStrings.qrCode = this.cast("qrCode")
}

