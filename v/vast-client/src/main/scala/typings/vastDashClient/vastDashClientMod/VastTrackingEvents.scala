package typings.vastDashClient.vastDashClientMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastTrackingEvents
  extends /* key */ StringDictionary[js.Array[String]] {
  var complete: js.Array[String]
  var firstQuartile: js.Array[String]
  var midpoint: js.Array[String]
  var thirdQuartile: js.Array[String]
}

object VastTrackingEvents {
  @scala.inline
  def apply(
    complete: js.Array[String],
    firstQuartile: js.Array[String],
    midpoint: js.Array[String],
    thirdQuartile: js.Array[String],
    StringDictionary: /* key */ StringDictionary[js.Array[String]] = null
  ): VastTrackingEvents = {
    val __obj = js.Dynamic.literal(complete = complete, firstQuartile = firstQuartile, midpoint = midpoint, thirdQuartile = thirdQuartile)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[VastTrackingEvents]
  }
}

