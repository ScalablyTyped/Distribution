package typings.wegameDashApi.wx

import typings.wegameDashApi.Anon_EncryptedDataIv
import typings.wegameDashApi.wx.types.CallbacksWithType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.getWeRunData")
@js.native
object getWeRunData extends js.Object {
  // --微信运动
  /**
    * 获取用户过去三十天微信运动步数，需要先调用 wx.login 接口。需要用户授权 scope.werun。
    */
  def apply(p: CallbacksWithType[Anon_EncryptedDataIv]): Unit = js.native
}

