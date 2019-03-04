package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastCompanionTrackingEvents
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] {
  var creativeView: js.Array[java.lang.String]
}

object VastCompanionTrackingEvents {
  @scala.inline
  def apply(
    creativeView: js.Array[java.lang.String],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = null
  ): VastCompanionTrackingEvents = {
    val __obj = js.Dynamic.literal(creativeView = creativeView)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[VastCompanionTrackingEvents]
  }
}

