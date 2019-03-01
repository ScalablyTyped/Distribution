package typings
package twitterDashTextLib.twitterDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedTweet extends js.Object {
  var displayRangeEnd: scala.Double
  var displayRangeStart: scala.Double
  var permillage: scala.Double
  var valid: scala.Boolean
  var validRangeEnd: scala.Double
  var validRangeStart: scala.Double
  var weightedLength: scala.Double
}

object ParsedTweet {
  @scala.inline
  def apply(
    displayRangeEnd: scala.Double,
    displayRangeStart: scala.Double,
    permillage: scala.Double,
    valid: scala.Boolean,
    validRangeEnd: scala.Double,
    validRangeStart: scala.Double,
    weightedLength: scala.Double
  ): ParsedTweet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayRangeEnd")(displayRangeEnd)
    __obj.updateDynamic("displayRangeStart")(displayRangeStart)
    __obj.updateDynamic("permillage")(permillage)
    __obj.updateDynamic("valid")(valid)
    __obj.updateDynamic("validRangeEnd")(validRangeEnd)
    __obj.updateDynamic("validRangeStart")(validRangeStart)
    __obj.updateDynamic("weightedLength")(weightedLength)
    __obj.asInstanceOf[ParsedTweet]
  }
}

