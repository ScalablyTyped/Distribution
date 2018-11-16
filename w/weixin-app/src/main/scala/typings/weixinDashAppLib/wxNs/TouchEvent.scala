package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TouchEvent[T /* <: TouchEventType */]
  extends BaseEvent[T, weixinDashAppLib.Anon_Y] {
  var changedTouches: js.Array[Touch]
  var touches: js.Array[Touch]
}

