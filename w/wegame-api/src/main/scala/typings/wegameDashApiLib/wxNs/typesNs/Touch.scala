package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// --触摸对象

trait Touch extends js.Object {
  /**
               * Touch 对象的唯一标识符，只读属性。一次触摸动作(我们值的是手指的触摸)在平面上移动的整个过程中, 该标识符不变。可以根据它来判断跟踪的是否是同一次触摸过程。
               */
  var identifier: scala.Double
  /**
               * 触点相对于屏幕左边沿的 X 坐标。
               */
  var screenX: scala.Double
  /**
               * 触点相对于屏幕左边沿的 Y 坐标。
               */
  var screenY: scala.Double
}

