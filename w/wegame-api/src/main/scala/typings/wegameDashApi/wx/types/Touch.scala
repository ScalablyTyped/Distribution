package typings.wegameDashApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --触摸对象
trait Touch extends js.Object {
  /**
    * 触点相对于游戏窗口的 X 轴距离。
    */
  var clientX: Double
  /**
    * 触点相对于游戏窗口的 Y 轴距离。
    */
  var clientY: Double
  /**
    * Touch 对象的唯一标识符，只读属性。一次触摸动作(我们值的是手指的触摸)在平面上移动的整个过程中, 该标识符不变。可以根据它来判断跟踪的是否是同一次触摸过程。
    */
  var identifier: Double
  /**
    * 触点相对于整体页面的 X 轴距离。
    */
  var pageX: Double
  /**
    * 触点相对于整体页面的 Y 轴距离。
    */
  var pageY: Double
}

object Touch {
  @scala.inline
  def apply(clientX: Double, clientY: Double, identifier: Double, pageX: Double, pageY: Double): Touch = {
    val __obj = js.Dynamic.literal(clientX = clientX, clientY = clientY, identifier = identifier, pageX = pageX, pageY = pageY)
  
    __obj.asInstanceOf[Touch]
  }
}

