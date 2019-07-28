package typings.tinycolor2.tinycolor2Mod

import typings.tinycolor2.tinycolor2Strings.AA
import typings.tinycolor2.tinycolor2Strings.AAA
import typings.tinycolor2.tinycolor2Strings.large
import typings.tinycolor2.tinycolor2Strings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WCAG2Options extends js.Object {
  var level: js.UndefOr[AA | AAA] = js.undefined
  var size: js.UndefOr[large | small] = js.undefined
}

object WCAG2Options {
  @scala.inline
  def apply(level: AA | AAA = null, size: large | small = null): WCAG2Options = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[WCAG2Options]
  }
}

