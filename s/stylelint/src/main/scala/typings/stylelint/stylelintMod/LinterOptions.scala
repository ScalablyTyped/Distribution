package typings.stylelint.stylelintMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinterOptions extends js.Object {
  var cache: Boolean
  var cacheLocation: String
  var code: String
  var codeFilename: String
  var config: Partial[Configuration]
  var configBasedir: String
  var configFile: String
  var configOverrides: Partial[Configuration]
  var customSyntax: String
  var disableDefaultIgnores: Boolean
  var files: String | js.Array[String]
  var fix: Boolean
  var formatter: FormatterType
  var ignoreDisables: Boolean
  var ignorePath: String
  var maxWarnings: Double
  var reportNeedlessDisables: Boolean
  var syntax: SyntaxType
}

object LinterOptions {
  @scala.inline
  def apply(
    cache: Boolean,
    cacheLocation: String,
    code: String,
    codeFilename: String,
    config: Partial[Configuration],
    configBasedir: String,
    configFile: String,
    configOverrides: Partial[Configuration],
    customSyntax: String,
    disableDefaultIgnores: Boolean,
    files: String | js.Array[String],
    fix: Boolean,
    formatter: FormatterType,
    ignoreDisables: Boolean,
    ignorePath: String,
    maxWarnings: Double,
    reportNeedlessDisables: Boolean,
    syntax: SyntaxType
  ): LinterOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], cacheLocation = cacheLocation.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], codeFilename = codeFilename.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], configBasedir = configBasedir.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], configOverrides = configOverrides.asInstanceOf[js.Any], customSyntax = customSyntax.asInstanceOf[js.Any], disableDefaultIgnores = disableDefaultIgnores.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], fix = fix.asInstanceOf[js.Any], formatter = formatter.asInstanceOf[js.Any], ignoreDisables = ignoreDisables.asInstanceOf[js.Any], ignorePath = ignorePath.asInstanceOf[js.Any], maxWarnings = maxWarnings.asInstanceOf[js.Any], reportNeedlessDisables = reportNeedlessDisables.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LinterOptions]
  }
}

