package typings.stylelint.anon

import typings.stylelint.mod.FormatterType
import typings.stylelint.mod.SyntaxType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<stylelint.stylelint.LinterOptions> */
trait PartialLinterOptions extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var cacheLocation: js.UndefOr[String] = js.undefined
  var code: js.UndefOr[String] = js.undefined
  var codeFilename: js.UndefOr[String] = js.undefined
  var config: js.UndefOr[PartialConfiguration] = js.undefined
  var configBasedir: js.UndefOr[String] = js.undefined
  var configFile: js.UndefOr[String] = js.undefined
  var configOverrides: js.UndefOr[PartialConfiguration] = js.undefined
  var customSyntax: js.UndefOr[String] = js.undefined
  var disableDefaultIgnores: js.UndefOr[Boolean] = js.undefined
  var files: js.UndefOr[String | js.Array[String]] = js.undefined
  var fix: js.UndefOr[Boolean] = js.undefined
  var formatter: js.UndefOr[FormatterType] = js.undefined
  var ignoreDisables: js.UndefOr[Boolean] = js.undefined
  var ignorePath: js.UndefOr[String] = js.undefined
  var maxWarnings: js.UndefOr[Double] = js.undefined
  var reportNeedlessDisables: js.UndefOr[Boolean] = js.undefined
  var syntax: js.UndefOr[SyntaxType] = js.undefined
}

object PartialLinterOptions {
  @scala.inline
  def apply(
    cache: js.UndefOr[Boolean] = js.undefined,
    cacheLocation: String = null,
    code: String = null,
    codeFilename: String = null,
    config: PartialConfiguration = null,
    configBasedir: String = null,
    configFile: String = null,
    configOverrides: PartialConfiguration = null,
    customSyntax: String = null,
    disableDefaultIgnores: js.UndefOr[Boolean] = js.undefined,
    files: String | js.Array[String] = null,
    fix: js.UndefOr[Boolean] = js.undefined,
    formatter: FormatterType = null,
    ignoreDisables: js.UndefOr[Boolean] = js.undefined,
    ignorePath: String = null,
    maxWarnings: js.UndefOr[Double] = js.undefined,
    reportNeedlessDisables: js.UndefOr[Boolean] = js.undefined,
    syntax: SyntaxType = null
  ): PartialLinterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (cacheLocation != null) __obj.updateDynamic("cacheLocation")(cacheLocation.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (codeFilename != null) __obj.updateDynamic("codeFilename")(codeFilename.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (configBasedir != null) __obj.updateDynamic("configBasedir")(configBasedir.asInstanceOf[js.Any])
    if (configFile != null) __obj.updateDynamic("configFile")(configFile.asInstanceOf[js.Any])
    if (configOverrides != null) __obj.updateDynamic("configOverrides")(configOverrides.asInstanceOf[js.Any])
    if (customSyntax != null) __obj.updateDynamic("customSyntax")(customSyntax.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDefaultIgnores)) __obj.updateDynamic("disableDefaultIgnores")(disableDefaultIgnores.get.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(fix)) __obj.updateDynamic("fix")(fix.get.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDisables)) __obj.updateDynamic("ignoreDisables")(ignoreDisables.get.asInstanceOf[js.Any])
    if (ignorePath != null) __obj.updateDynamic("ignorePath")(ignorePath.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWarnings)) __obj.updateDynamic("maxWarnings")(maxWarnings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reportNeedlessDisables)) __obj.updateDynamic("reportNeedlessDisables")(reportNeedlessDisables.get.asInstanceOf[js.Any])
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLinterOptions]
  }
}

