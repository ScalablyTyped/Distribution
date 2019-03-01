package typings
package tinycolor2Lib.tinycolor2Mod.tinycolorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MostReadableArgs extends WCAG2Options {
  var includeFallbackColors: js.UndefOr[scala.Boolean] = js.undefined
}

object MostReadableArgs {
  @scala.inline
  def apply(
    includeFallbackColors: js.UndefOr[scala.Boolean] = js.undefined,
    level: tinycolor2Lib.tinycolor2LibStrings.AA | tinycolor2Lib.tinycolor2LibStrings.AAA = null,
    size: tinycolor2Lib.tinycolor2LibStrings.large | tinycolor2Lib.tinycolor2LibStrings.small = null
  ): MostReadableArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeFallbackColors)) __obj.updateDynamic("includeFallbackColors")(includeFallbackColors)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MostReadableArgs]
  }
}

