package typings
package stylelintLib.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinterOptions extends js.Object {
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  var cacheLocation: js.UndefOr[java.lang.String] = js.undefined
  var code: js.UndefOr[java.lang.String] = js.undefined
  var codeFilename: js.UndefOr[java.lang.String] = js.undefined
  var config: js.UndefOr[stdLib.JSON] = js.undefined
  var configBasedir: js.UndefOr[java.lang.String] = js.undefined
  var configFile: js.UndefOr[java.lang.String] = js.undefined
  var configOverrides: js.UndefOr[stdLib.JSON] = js.undefined
  var customSyntax: js.UndefOr[java.lang.String] = js.undefined
  var files: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var fix: js.UndefOr[scala.Boolean] = js.undefined
  var formatter: js.UndefOr[FormatterType] = js.undefined
  var ignoreDisables: js.UndefOr[scala.Boolean] = js.undefined
  var ignorePath: js.UndefOr[scala.Boolean] = js.undefined
  var reportNeedlessDisables: js.UndefOr[scala.Boolean] = js.undefined
  var syntax: js.UndefOr[SyntaxType] = js.undefined
}

object LinterOptions {
  @scala.inline
  def apply(
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    cacheLocation: java.lang.String = null,
    code: java.lang.String = null,
    codeFilename: java.lang.String = null,
    config: stdLib.JSON = null,
    configBasedir: java.lang.String = null,
    configFile: java.lang.String = null,
    configOverrides: stdLib.JSON = null,
    customSyntax: java.lang.String = null,
    files: java.lang.String | js.Array[java.lang.String] = null,
    fix: js.UndefOr[scala.Boolean] = js.undefined,
    formatter: FormatterType = null,
    ignoreDisables: js.UndefOr[scala.Boolean] = js.undefined,
    ignorePath: js.UndefOr[scala.Boolean] = js.undefined,
    reportNeedlessDisables: js.UndefOr[scala.Boolean] = js.undefined,
    syntax: SyntaxType = null
  ): LinterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (cacheLocation != null) __obj.updateDynamic("cacheLocation")(cacheLocation)
    if (code != null) __obj.updateDynamic("code")(code)
    if (codeFilename != null) __obj.updateDynamic("codeFilename")(codeFilename)
    if (config != null) __obj.updateDynamic("config")(config)
    if (configBasedir != null) __obj.updateDynamic("configBasedir")(configBasedir)
    if (configFile != null) __obj.updateDynamic("configFile")(configFile)
    if (configOverrides != null) __obj.updateDynamic("configOverrides")(configOverrides)
    if (customSyntax != null) __obj.updateDynamic("customSyntax")(customSyntax)
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(fix)) __obj.updateDynamic("fix")(fix)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (!js.isUndefined(ignoreDisables)) __obj.updateDynamic("ignoreDisables")(ignoreDisables)
    if (!js.isUndefined(ignorePath)) __obj.updateDynamic("ignorePath")(ignorePath)
    if (!js.isUndefined(reportNeedlessDisables)) __obj.updateDynamic("reportNeedlessDisables")(reportNeedlessDisables)
    if (syntax != null) __obj.updateDynamic("syntax")(syntax)
    __obj.asInstanceOf[LinterOptions]
  }
}

