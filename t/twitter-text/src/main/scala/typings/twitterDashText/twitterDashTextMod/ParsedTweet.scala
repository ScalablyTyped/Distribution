package typings.twitterDashText.twitterDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedTweet extends js.Object {
  var displayRangeEnd: Double
  var displayRangeStart: Double
  var permillage: Double
  var valid: Boolean
  var validRangeEnd: Double
  var validRangeStart: Double
  var weightedLength: Double
}

object ParsedTweet {
  @scala.inline
  def apply(
    displayRangeEnd: Double,
    displayRangeStart: Double,
    permillage: Double,
    valid: Boolean,
    validRangeEnd: Double,
    validRangeStart: Double,
    weightedLength: Double
  ): ParsedTweet = {
    val __obj = js.Dynamic.literal(displayRangeEnd = displayRangeEnd, displayRangeStart = displayRangeStart, permillage = permillage, valid = valid, validRangeEnd = validRangeEnd, validRangeStart = validRangeStart, weightedLength = weightedLength)
  
    __obj.asInstanceOf[ParsedTweet]
  }
}

