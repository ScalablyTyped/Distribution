package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.login")
@js.native
object login extends js.Object {
  /**
  	 * 调用接口获取登录凭证（code）进而换取用户登录态信息，
  	 * 包括用户的唯一标识（openid） 及本次登录的 会话密钥（session_key）。
  	 * 用户数据的加解密通讯需要依赖会话密钥完成。
  	 */
  def apply(option: LoginOptions): Unit = js.native
}

