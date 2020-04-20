package typings.twitterText.mod

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
    val __obj = js.Dynamic.literal(displayRangeEnd = displayRangeEnd.asInstanceOf[js.Any], displayRangeStart = displayRangeStart.asInstanceOf[js.Any], permillage = permillage.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validRangeEnd = validRangeEnd.asInstanceOf[js.Any], validRangeStart = validRangeStart.asInstanceOf[js.Any], weightedLength = weightedLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedTweet]
  }
}

