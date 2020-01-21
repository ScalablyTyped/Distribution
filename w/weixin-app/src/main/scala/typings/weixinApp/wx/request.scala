package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.request")
@js.native
object request extends js.Object {
  /**
  	 * wx.request发起的是https请求。一个微信小程序，同时只能有5个网络请求连接。
  	 */
  def apply(options: RequestOptions): RequestTask = js.native
}

