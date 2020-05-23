package typings.twitterText.mod

import typings.twitterText.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseTweetOptions extends js.Object {
  var defaultWeight: js.UndefOr[Double] = js.undefined
  var maxWeightedTweetLength: js.UndefOr[Double] = js.undefined
  var ranges: js.UndefOr[js.Array[End]] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var transformedURLLength: js.UndefOr[Double] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object ParseTweetOptions {
  @scala.inline
  def apply(
    defaultWeight: js.UndefOr[Double] = js.undefined,
    maxWeightedTweetLength: js.UndefOr[Double] = js.undefined,
    ranges: js.Array[End] = null,
    scale: js.UndefOr[Double] = js.undefined,
    transformedURLLength: js.UndefOr[Double] = js.undefined,
    version: js.UndefOr[Double] = js.undefined
  ): ParseTweetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultWeight)) __obj.updateDynamic("defaultWeight")(defaultWeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWeightedTweetLength)) __obj.updateDynamic("maxWeightedTweetLength")(maxWeightedTweetLength.get.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transformedURLLength)) __obj.updateDynamic("transformedURLLength")(transformedURLLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseTweetOptions]
  }
}

