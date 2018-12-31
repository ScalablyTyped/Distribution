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

