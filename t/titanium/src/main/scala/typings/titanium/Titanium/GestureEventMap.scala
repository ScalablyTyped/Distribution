package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureEventMap extends ProxyEventMap {
  var orientationchange: GestureOrientationchangeEvent
  var shake: GestureShakeEvent
}

object GestureEventMap {
  @scala.inline
  def apply(orientationchange: GestureOrientationchangeEvent, shake: GestureShakeEvent): GestureEventMap = {
    val __obj = js.Dynamic.literal(orientationchange = orientationchange.asInstanceOf[js.Any], shake = shake.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureEventMap]
  }
}

