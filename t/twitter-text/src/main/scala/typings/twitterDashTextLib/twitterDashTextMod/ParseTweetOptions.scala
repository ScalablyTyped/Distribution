package typings
package twitterDashTextLib.twitterDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseTweetOptions extends js.Object {
  var defaultWeight: js.UndefOr[scala.Double] = js.undefined
  var maxWeightedTweetLength: js.UndefOr[scala.Double] = js.undefined
  var ranges: js.UndefOr[js.Array[twitterDashTextLib.Anon_End]] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var transformedURLLength: js.UndefOr[scala.Double] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object ParseTweetOptions {
  @scala.inline
  def apply(
    defaultWeight: scala.Int | scala.Double = null,
    maxWeightedTweetLength: scala.Int | scala.Double = null,
    ranges: js.Array[twitterDashTextLib.Anon_End] = null,
    scale: scala.Int | scala.Double = null,
    transformedURLLength: scala.Int | scala.Double = null,
    version: scala.Int | scala.Double = null
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

