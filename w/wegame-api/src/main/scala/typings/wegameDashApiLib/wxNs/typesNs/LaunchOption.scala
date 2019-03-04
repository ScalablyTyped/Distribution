package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --启动参数
trait LaunchOption extends js.Object {
  /**
    * 当前小游戏是否被显示在聊天顶部
    */
  var isSticky: scala.Boolean
  /**
    * 启动参数
    */
  var query: js.Any
  /**
    * 场景值
    */
  var scene: scala.Double
  /**
    * 票据
    */
  var shareTicket: java.lang.String
}

object LaunchOption {
  @scala.inline
  def apply(isSticky: scala.Boolean, query: js.Any, scene: scala.Double, shareTicket: java.lang.String): LaunchOption = {
    val __obj = js.Dynamic.literal(isSticky = isSticky, query = query, scene = scene, shareTicket = shareTicket)
  
    __obj.asInstanceOf[LaunchOption]
  }
}

