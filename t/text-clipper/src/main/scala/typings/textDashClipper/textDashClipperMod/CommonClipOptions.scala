package typings.textDashClipper.textDashClipperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonClipOptions extends js.Object {
  /**
    * By default, we try to break only at word boundaries. Set to true if this is undesired.
    */
  var breakWords: js.UndefOr[Boolean] = js.undefined
  /**
    * The string to insert to indicate clipping. Default: "…".
    */
  var indicator: js.UndefOr[String] = js.undefined
  /**
    * Maximum amount of lines allowed. If given, the string will be clipped either at the moment
    * the maximum amount of characters is exceeded or the moment maxLines newlines are discovered,
    * whichever comes first.
    */
  var maxLines: js.UndefOr[Double] = js.undefined
}

object CommonClipOptions {
  @scala.inline
  def apply(
    breakWords: js.UndefOr[Boolean] = js.undefined,
    indicator: String = null,
    maxLines: Int | Double = null
  ): CommonClipOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(breakWords)) __obj.updateDynamic("breakWords")(breakWords)
    if (indicator != null) __obj.updateDynamic("indicator")(indicator)
    if (maxLines != null) __obj.updateDynamic("maxLines")(maxLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonClipOptions]
  }
}

