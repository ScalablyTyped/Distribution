package typings.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --启动参数
trait LaunchOption extends js.Object {
  /**
    * 当前小游戏是否被显示在聊天顶部
    */
  var isSticky: Boolean
  /**
    * 启动参数
    */
  var query: js.Any
  /**
    * 场景值
    */
  var scene: Double
  /**
    * 票据
    */
  var shareTicket: String
}

object LaunchOption {
  @scala.inline
  def apply(isSticky: Boolean, query: js.Any, scene: Double, shareTicket: String): LaunchOption = {
    val __obj = js.Dynamic.literal(isSticky = isSticky.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchOption]
  }
}

