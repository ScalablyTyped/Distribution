package typings
package tinycolor2Lib.tinycolor2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WCAG2Options extends js.Object {
  var level: js.UndefOr[tinycolor2Lib.tinycolor2LibStrings.AA | tinycolor2Lib.tinycolor2LibStrings.AAA] = js.undefined
  var size: js.UndefOr[
    tinycolor2Lib.tinycolor2LibStrings.large | tinycolor2Lib.tinycolor2LibStrings.small
  ] = js.undefined
}

object WCAG2Options {
  @scala.inline
  def apply(
    level: tinycolor2Lib.tinycolor2LibStrings.AA | tinycolor2Lib.tinycolor2LibStrings.AAA = null,
    size: tinycolor2Lib.tinycolor2LibStrings.large | tinycolor2Lib.tinycolor2LibStrings.small = null
  ): WCAG2Options = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[WCAG2Options]
  }
}

