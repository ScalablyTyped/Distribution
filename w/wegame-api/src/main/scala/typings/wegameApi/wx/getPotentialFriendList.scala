package typings.wegameApi.wx

import typings.wegameApi.AnonList
import typings.wegameApi.wx.types.CallbacksWithType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.getPotentialFriendList")
@js.native
object getPotentialFriendList extends js.Object {
  /**
    * 获取可能对游戏感兴趣的未注册的好友名单。每次调用最多可获得 5 个好友，此接口只能在开放数据域中使用
    */
  def apply(callback: CallbacksWithType[AnonList]): Unit = js.native
}

