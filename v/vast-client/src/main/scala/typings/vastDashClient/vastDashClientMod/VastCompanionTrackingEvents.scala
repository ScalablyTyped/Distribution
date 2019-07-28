package typings.vastDashClient.vastDashClientMod

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
    val __obj = js.Dynamic.literal(creativeView = creativeView)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[VastCompanionTrackingEvents]
  }
}

