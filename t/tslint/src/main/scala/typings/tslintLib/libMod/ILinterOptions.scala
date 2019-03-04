package typings
package tslintLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILinterOptions extends js.Object {
  var fix: scala.Boolean
  var formatter: js.UndefOr[
    java.lang.String | tslintLib.libLanguageFormatterFormatterMod.FormatterConstructor
  ] = js.undefined
  var formattersDirectory: js.UndefOr[java.lang.String] = js.undefined
  var quiet: js.UndefOr[scala.Boolean] = js.undefined
  var rulesDirectory: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object ILinterOptions {
  @scala.inline
  def apply(
    fix: scala.Boolean,
    formatter: java.lang.String | tslintLib.libLanguageFormatterFormatterMod.FormatterConstructor = null,
    formattersDirectory: java.lang.String = null,
    quiet: js.UndefOr[scala.Boolean] = js.undefined,
    rulesDirectory: java.lang.String | js.Array[java.lang.String] = null
  ): ILinterOptions = {
    val __obj = js.Dynamic.literal(fix = fix)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (formattersDirectory != null) __obj.updateDynamic("formattersDirectory")(formattersDirectory)
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet)
    if (rulesDirectory != null) __obj.updateDynamic("rulesDirectory")(rulesDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinterOptions]
  }
}

