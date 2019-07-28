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
    val __obj = js.Dynamic.literal(cache = cache, cacheLocation = cacheLocation, code = code, codeFilename = codeFilename, config = config, configBasedir = configBasedir, configFile = configFile, configOverrides = configOverrides, customSyntax = customSyntax, disableDefaultIgnores = disableDefaultIgnores, files = files.asInstanceOf[js.Any], fix = fix, formatter = formatter, ignoreDisables = ignoreDisables, ignorePath = ignorePath, maxWarnings = maxWarnings, reportNeedlessDisables = reportNeedlessDisables, syntax = syntax)
  
    __obj.asInstanceOf[LinterOptions]
  }
}

