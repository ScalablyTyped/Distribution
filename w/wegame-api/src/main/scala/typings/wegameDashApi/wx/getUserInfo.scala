package typings.wegameDashApi.wx

import typings.wegameDashApi.wx.types.NewUserInfoParam
import typings.wegameDashApi.wx.types.OldUserInfoParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.getUserInfo")
@js.native
object getUserInfo extends js.Object {
  /**
    * 在无须用户授权的情况下，批量获取用户信息。该接口只在开放数据域下可用
    * 请注意！！旧版本的该接口已过期，微信不允许主动弹出授权框，旧版本API会被逐渐作废，请使用wx.createUserInfoButton或在隔离数据区取得用户信息
    * 如使用旧接口取得用户信息，withCredentials 为 true 时需要先调用 wx.login 接口。需要用户授权 scope.userInfo
    */
  def apply(param: NewUserInfoParam): Unit = js.native
  def apply(param: OldUserInfoParam): Unit = js.native
}

