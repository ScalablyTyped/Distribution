package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 开放接口
// 开放接口-----签名加密
// [签名加密](https://mp.weixin.qq.com/debug/wxadoc/dev/api/signature.html)
/**
	 * 登录态维护
	 * 通过 wx.login() 获取到用户登录态之后，需要维护登录态。
	 * 开发者要注意不应该直接把 session_key、openid 等字段作为用户的标识
	 * 或者 session 的标识，而应该自己派发一个 session 登录态（请参考登录时序图）。
	 * 对于开发者自己生成的 session，应该保证其安全性且不应该设置较长的过期时间。
	 * session 派发到小程序客户端之后，可将其存储在 storage ，用于后续通信使用。
	 * 通过wx.checkSession() 检测用户登录态是否失效。并决定是否调用wx.login()
	 * 重新获取登录态
	 */
trait LoginResponse extends js.Object {
  /**
  		 * 用户允许登录后，回调内容会带上 code（有效期五分钟），
  		 * 开发者需要将 code 发送到开发者服务器后台，
  		 * 使用code 换取 session_key api，
  		 * 将 code 换成 openid 和 session_key
  		 */
  var code: java.lang.String
  /** 调用结果 */
  var errMsg: java.lang.String
}

object LoginResponse {
  @scala.inline
  def apply(code: java.lang.String, errMsg: java.lang.String): LoginResponse = {
    val __obj = js.Dynamic.literal(code = code, errMsg = errMsg)
  
    __obj.asInstanceOf[LoginResponse]
  }
}

