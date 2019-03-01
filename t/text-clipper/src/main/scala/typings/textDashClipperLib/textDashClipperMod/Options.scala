package typings
package textDashClipperLib.textDashClipperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var breakWords: js.UndefOr[scala.Boolean] = js.undefined
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var imageWeight: js.UndefOr[scala.Double] = js.undefined
  var indicator: js.UndefOr[java.lang.String] = js.undefined
  var maxLines: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    breakWords: js.UndefOr[scala.Boolean] = js.undefined,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    imageWeight: scala.Int | scala.Double = null,
    indicator: java.lang.String = null,
    maxLines: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(breakWords)) __obj.updateDynamic("breakWords")(breakWords)
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (imageWeight != null) __obj.updateDynamic("imageWeight")(imageWeight.asInstanceOf[js.Any])
    if (indicator != null) __obj.updateDynamic("indicator")(indicator)
    if (maxLines != null) __obj.updateDynamic("maxLines")(maxLines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

