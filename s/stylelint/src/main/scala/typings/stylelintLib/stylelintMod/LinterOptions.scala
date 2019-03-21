package typings
package stylelintLib.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinterOptions extends js.Object {
  var cache: scala.Boolean
  var cacheLocation: java.lang.String
  var code: java.lang.String
  var codeFilename: java.lang.String
  var config: stdLib.Partial[Configuration]
  var configBasedir: java.lang.String
  var configFile: java.lang.String
  var configOverrides: stdLib.Partial[Configuration]
  var customSyntax: java.lang.String
  var disableDefaultIgnores: scala.Boolean
  var files: java.lang.String | js.Array[java.lang.String]
  var fix: scala.Boolean
  var formatter: FormatterType
  var ignoreDisables: scala.Boolean
  var ignorePath: java.lang.String
  var maxWarnings: scala.Double
  var reportNeedlessDisables: scala.Boolean
  var syntax: SyntaxType
}

object LinterOptions {
  @scala.inline
  def apply(
    cache: scala.Boolean,
    cacheLocation: java.lang.String,
    code: java.lang.String,
    codeFilename: java.lang.String,
    config: stdLib.Partial[Configuration],
    configBasedir: java.lang.String,
    configFile: java.lang.String,
    configOverrides: stdLib.Partial[Configuration],
    customSyntax: java.lang.String,
    disableDefaultIgnores: scala.Boolean,
    files: java.lang.String | js.Array[java.lang.String],
    fix: scala.Boolean,
    formatter: FormatterType,
    ignoreDisables: scala.Boolean,
    ignorePath: java.lang.String,
    maxWarnings: scala.Double,
    reportNeedlessDisables: scala.Boolean,
    syntax: SyntaxType
  ): LinterOptions = {
    val __obj = js.Dynamic.literal(cache = cache, cacheLocation = cacheLocation, code = code, codeFilename = codeFilename, config = config, configBasedir = configBasedir, configFile = configFile, configOverrides = configOverrides, customSyntax = customSyntax, disableDefaultIgnores = disableDefaultIgnores, files = files.asInstanceOf[js.Any], fix = fix, formatter = formatter, ignoreDisables = ignoreDisables, ignorePath = ignorePath, maxWarnings = maxWarnings, reportNeedlessDisables = reportNeedlessDisables, syntax = syntax)
  
    __obj.asInstanceOf[LinterOptions]
  }
}

