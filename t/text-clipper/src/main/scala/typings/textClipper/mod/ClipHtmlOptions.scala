package typings.textClipper.mod

import typings.textClipper.textClipperBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipHtmlOptions extends CommonClipOptions {
  /**
    * Set to true if the string is HTML-encoded. If so, this method will take extra care to make
    * sure the HTML-encoding is correctly maintained.
    */
  var html: `true`
  /**
    * The amount of characters to assume for images. This is used whenever an image is encountered,
    * but also for SVG and MathML content. Default: 2.
    */
  var imageWeight: js.UndefOr[Double] = js.undefined
}

object ClipHtmlOptions {
  @scala.inline
  def apply(
    html: `true`,
    breakWords: js.UndefOr[Boolean] = js.undefined,
    imageWeight: js.UndefOr[Double] = js.undefined,
    indicator: String = null,
    maxLines: js.UndefOr[Double] = js.undefined
  ): ClipHtmlOptions = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    if (!js.isUndefined(breakWords)) __obj.updateDynamic("breakWords")(breakWords.get.asInstanceOf[js.Any])
    if (!js.isUndefined(imageWeight)) __obj.updateDynamic("imageWeight")(imageWeight.get.asInstanceOf[js.Any])
    if (indicator != null) __obj.updateDynamic("indicator")(indicator.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLines)) __obj.updateDynamic("maxLines")(maxLines.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipHtmlOptions]
  }
}

