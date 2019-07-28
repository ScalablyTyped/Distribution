package typings.tslint.tslintMod

import typings.tslint.libLanguageFormatterFormatterMod.FormatterConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILinterOptions extends js.Object {
  var fix: Boolean
  var formatter: js.UndefOr[String | FormatterConstructor] = js.undefined
  var formattersDirectory: js.UndefOr[String] = js.undefined
  var quiet: js.UndefOr[Boolean] = js.undefined
  var rulesDirectory: js.UndefOr[String | js.Array[String]] = js.undefined
}

object ILinterOptions {
  @scala.inline
  def apply(
    fix: Boolean,
    formatter: String | FormatterConstructor = null,
    formattersDirectory: String = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    rulesDirectory: String | js.Array[String] = null
  ): ILinterOptions = {
    val __obj = js.Dynamic.literal(fix = fix)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (formattersDirectory != null) __obj.updateDynamic("formattersDirectory")(formattersDirectory)
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet)
    if (rulesDirectory != null) __obj.updateDynamic("rulesDirectory")(rulesDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinterOptions]
  }
}

