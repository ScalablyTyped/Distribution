package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastTrackingEvents
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] {
  var complete: js.Array[java.lang.String]
  var firstQuartile: js.Array[java.lang.String]
  var midpoint: js.Array[java.lang.String]
  var thirdQuartile: js.Array[java.lang.String]
}

object VastTrackingEvents {
  @scala.inline
  def apply(
    complete: js.Array[java.lang.String],
    firstQuartile: js.Array[java.lang.String],
    midpoint: js.Array[java.lang.String],
    thirdQuartile: js.Array[java.lang.String],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = null
  ): VastTrackingEvents = {
    val __obj = js.Dynamic.literal(complete = complete, firstQuartile = firstQuartile, midpoint = midpoint, thirdQuartile = thirdQuartile)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[VastTrackingEvents]
  }
}

