package typings.twitterText.mod

import typings.twitterText.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseTweetOptions extends js.Object {
  var defaultWeight: js.UndefOr[Double] = js.native
  var maxWeightedTweetLength: js.UndefOr[Double] = js.native
  var ranges: js.UndefOr[js.Array[End]] = js.native
  var scale: js.UndefOr[Double] = js.native
  var transformedURLLength: js.UndefOr[Double] = js.native
  var version: js.UndefOr[Double] = js.native
}

object ParseTweetOptions {
  @scala.inline
  def apply(): ParseTweetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseTweetOptions]
  }
  @scala.inline
  implicit class ParseTweetOptionsOps[Self <: ParseTweetOptions] (val x: Self) extends AnyVal {
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
    def setDefaultWeight(value: Double): Self = this.set("defaultWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultWeight: Self = this.set("defaultWeight", js.undefined)
    @scala.inline
    def setMaxWeightedTweetLength(value: Double): Self = this.set("maxWeightedTweetLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWeightedTweetLength: Self = this.set("maxWeightedTweetLength", js.undefined)
    @scala.inline
    def setRangesVarargs(value: End*): Self = this.set("ranges", js.Array(value :_*))
    @scala.inline
    def setRanges(value: js.Array[End]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setTransformedURLLength(value: Double): Self = this.set("transformedURLLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformedURLLength: Self = this.set("transformedURLLength", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

