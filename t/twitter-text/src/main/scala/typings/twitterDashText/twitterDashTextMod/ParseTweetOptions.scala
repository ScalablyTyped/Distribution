package typings.twitterDashText.twitterDashTextMod

import typings.twitterDashText.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseTweetOptions extends js.Object {
  var defaultWeight: js.UndefOr[Double] = js.undefined
  var maxWeightedTweetLength: js.UndefOr[Double] = js.undefined
  var ranges: js.UndefOr[js.Array[Anon_End]] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var transformedURLLength: js.UndefOr[Double] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object ParseTweetOptions {
  @scala.inline
  def apply(
    defaultWeight: Int | Double = null,
    maxWeightedTweetLength: Int | Double = null,
    ranges: js.Array[Anon_End] = null,
    scale: Int | Double = null,
    transformedURLLength: Int | Double = null,
    version: Int | Double = null
  ): ParseTweetOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultWeight != null) __obj.updateDynamic("defaultWeight")(defaultWeight.asInstanceOf[js.Any])
    if (maxWeightedTweetLength != null) __obj.updateDynamic("maxWeightedTweetLength")(maxWeightedTweetLength.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (transformedURLLength != null) __obj.updateDynamic("transformedURLLength")(transformedURLLength.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseTweetOptions]
  }
}

