package typings.wegameDashApi.wx

import typings.wegameDashApi.Anon_Accept
import typings.wegameDashApi.Anon_ErrCode
import typings.wegameDashApi.Anon_TmplIds
import typings.wegameDashApi.wx.types.CallbacksWithType2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.requestSubscribeMessage")
@js.native
object requestSubscribeMessage extends js.Object {
  // --订阅消息
  /**
    * 调起小游戏订阅消息界面，返回用户订阅消息的操作结果。（需要在 touchend 事件的回调中调用）
    */
  def apply(param: Anon_TmplIds with (CallbacksWithType2[Anon_Accept, Anon_ErrCode])): Unit = js.native
}

