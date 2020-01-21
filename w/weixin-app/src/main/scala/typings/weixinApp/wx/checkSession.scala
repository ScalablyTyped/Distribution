package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.checkSession")
@js.native
object checkSession extends js.Object {
  /**
  	 * 检测当前用户登录态是否有效。
  	 * 通过wx.login获得的用户登录态拥有一定的时效性。用户越久未使用小程序，用户登录态越有可能失效。
  	 * 反之如果用户一直在使用小程序，则用户登录态一直保持有效。具体时效逻辑由微信维护，对开发者透明。
  	 * 开发者只需要调用wx.checkSession接口检测当前用户登录态是否有效。
  	 * 登录态过期后开发者可以再调用wx.login获取新的用户登录态。
  	 */
  def apply(options: CheckSessionOption): Unit = js.native
}

