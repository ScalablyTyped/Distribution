package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBitmapOptions extends js.Object {
  var colorSpaceConversion: js.UndefOr[xtermLib.xtermLibStrings.none | xtermLib.xtermLibStrings.default] = js.undefined
  var imageOrientation: js.UndefOr[xtermLib.xtermLibStrings.none | xtermLib.xtermLibStrings.flipY] = js.undefined
  var premultiplyAlpha: js.UndefOr[
    xtermLib.xtermLibStrings.none | xtermLib.xtermLibStrings.premultiply | xtermLib.xtermLibStrings.default
  ] = js.undefined
  var resizeHeight: js.UndefOr[scala.Double] = js.undefined
  var resizeQuality: js.UndefOr[
    xtermLib.xtermLibStrings.pixelated | xtermLib.xtermLibStrings.low | xtermLib.xtermLibStrings.medium | xtermLib.xtermLibStrings.high
  ] = js.undefined
  var resizeWidth: js.UndefOr[scala.Double] = js.undefined
}

object ImageBitmapOptions {
  @scala.inline
  def apply(
    colorSpaceConversion: xtermLib.xtermLibStrings.none | xtermLib.xtermLibStrings.default = null,
    imageOrientation: xtermLib.xtermLibStrings.none | xtermLib.xtermLibStrings.flipY = null,
    premultiplyAlpha: xtermLib.xtermLibStrings.none | xtermLib.xtermLibStrings.premultiply | xtermLib.xtermLibStrings.default = null,
    resizeHeight: scala.Int | scala.Double = null,
    resizeQuality: xtermLib.xtermLibStrings.pixelated | xtermLib.xtermLibStrings.low | xtermLib.xtermLibStrings.medium | xtermLib.xtermLibStrings.high = null,
    resizeWidth: scala.Int | scala.Double = null
  ): ImageBitmapOptions = {
    val __obj = js.Dynamic.literal()
    if (colorSpaceConversion != null) __obj.updateDynamic("colorSpaceConversion")(colorSpaceConversion.asInstanceOf[js.Any])
    if (imageOrientation != null) __obj.updateDynamic("imageOrientation")(imageOrientation.asInstanceOf[js.Any])
    if (premultiplyAlpha != null) __obj.updateDynamic("premultiplyAlpha")(premultiplyAlpha.asInstanceOf[js.Any])
    if (resizeHeight != null) __obj.updateDynamic("resizeHeight")(resizeHeight.asInstanceOf[js.Any])
    if (resizeQuality != null) __obj.updateDynamic("resizeQuality")(resizeQuality.asInstanceOf[js.Any])
    if (resizeWidth != null) __obj.updateDynamic("resizeWidth")(resizeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBitmapOptions]
  }
}

