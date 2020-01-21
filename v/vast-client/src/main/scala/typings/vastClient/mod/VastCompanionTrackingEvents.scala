package typings.vastClient.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastCompanionTrackingEvents
  extends /* key */ StringDictionary[js.Array[String]] {
  var creativeView: js.Array[String]
}

object VastCompanionTrackingEvents {
  @scala.inline
  def apply(
    creativeView: js.Array[String],
    StringDictionary: /* key */ StringDictionary[js.Array[String]] = null
  ): VastCompanionTrackingEvents = {
    val __obj = js.Dynamic.literal(creativeView = creativeView.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[VastCompanionTrackingEvents]
  }
}

