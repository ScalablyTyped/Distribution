package typings.tinycolor2.mod

import typings.tinycolor2.tinycolor2Strings.AA
import typings.tinycolor2.tinycolor2Strings.AAA
import typings.tinycolor2.tinycolor2Strings.large
import typings.tinycolor2.tinycolor2Strings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MostReadableArgs extends WCAG2Options {
  var includeFallbackColors: js.UndefOr[Boolean] = js.undefined
}

object MostReadableArgs {
  @scala.inline
  def apply(
    includeFallbackColors: js.UndefOr[Boolean] = js.undefined,
    level: AA | AAA = null,
    size: large | small = null
  ): MostReadableArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeFallbackColors)) __obj.updateDynamic("includeFallbackColors")(includeFallbackColors.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MostReadableArgs]
  }
}

