package typings.wegameApi.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.onInteractiveStorageModified")
@js.native
object onInteractiveStorageModified extends js.Object {
  /**
    * 监听成功修改好友的互动型托管数据事件，该接口在游戏主域使用
    * @param callback 事件发生的回调函数，只有一个参数为 wx.modifyFriendInteractiveStorage 传入的 key
    */
  def apply(callback: js.Function1[/* key */ String, Unit]): Unit = js.native
}

