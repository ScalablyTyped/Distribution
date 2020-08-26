package typings.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedTweet extends js.Object {
  var displayRangeEnd: Double = js.native
  var displayRangeStart: Double = js.native
  var permillage: Double = js.native
  var valid: Boolean = js.native
  var validRangeEnd: Double = js.native
  var validRangeStart: Double = js.native
  var weightedLength: Double = js.native
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
  @scala.inline
  implicit class ParsedTweetOps[Self <: ParsedTweet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayRangeEnd(value: Double): Self = this.set("displayRangeEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayRangeStart(value: Double): Self = this.set("displayRangeStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermillage(value: Double): Self = this.set("permillage", value.asInstanceOf[js.Any])
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidRangeEnd(value: Double): Self = this.set("validRangeEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidRangeStart(value: Double): Self = this.set("validRangeStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeightedLength(value: Double): Self = this.set("weightedLength", value.asInstanceOf[js.Any])
  }
  
}

