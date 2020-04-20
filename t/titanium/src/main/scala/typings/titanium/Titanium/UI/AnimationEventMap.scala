package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationEventMap extends ProxyEventMap {
  var complete: AnimationCompleteEvent
  var start: AnimationStartEvent
}

object AnimationEventMap {
  @scala.inline
  def apply(complete: AnimationCompleteEvent, start: AnimationStartEvent): AnimationEventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEventMap]
  }
}

