package typings.wegameApi.wx

import typings.wegameApi.AnonImageUrlId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("wx.shareMessageToFriend")
@js.native
object shareMessageToFriend extends js.Object {
  /**
    * 给指定的好友分享游戏信息，该接口只可在开放数据域下使用
    * 定向分享不允许直接在开放数据域设置 query 参数 需要设置时请参见游戏域 wx.setMessageToFriendQuery 接口
    * @param param 分享参数
    */
  def apply(param: AnonImageUrlId): Unit = js.native
}

