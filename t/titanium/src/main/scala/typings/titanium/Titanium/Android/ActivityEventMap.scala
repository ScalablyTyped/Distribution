package typings.titanium.Titanium.Android

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityEventMap extends ProxyEventMap {
  var newintent: ActivityNewintentEvent
  var onIntent: ActivityOnIntentEvent
  var userinteraction: ActivityUserinteractionEvent
  var userleavehint: ActivityUserleavehintEvent
}

object ActivityEventMap {
  @scala.inline
  def apply(
    newintent: ActivityNewintentEvent,
    onIntent: ActivityOnIntentEvent,
    userinteraction: ActivityUserinteractionEvent,
    userleavehint: ActivityUserleavehintEvent
  ): ActivityEventMap = {
    val __obj = js.Dynamic.literal(newintent = newintent.asInstanceOf[js.Any], onIntent = onIntent.asInstanceOf[js.Any], userinteraction = userinteraction.asInstanceOf[js.Any], userleavehint = userleavehint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityEventMap]
  }
}

