package typings.stylelint.mod

import typings.stylelint.anon.PartialConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinterOptions extends js.Object {
  var cache: Boolean = js.native
  var cacheLocation: String = js.native
  var code: String = js.native
  var codeFilename: String = js.native
  var config: PartialConfiguration = js.native
  var configBasedir: String = js.native
  var configFile: String = js.native
  var configOverrides: PartialConfiguration = js.native
  var customSyntax: String = js.native
  var disableDefaultIgnores: Boolean = js.native
  var files: String | js.Array[String] = js.native
  var fix: Boolean = js.native
  var formatter: FormatterType = js.native
  var ignoreDisables: Boolean = js.native
  var ignorePath: String = js.native
  var maxWarnings: Double = js.native
  var reportNeedlessDisables: Boolean = js.native
  var syntax: SyntaxType = js.native
}

object LinterOptions {
  @scala.inline
  def apply(
    cache: Boolean,
    cacheLocation: String,
    code: String,
    codeFilename: String,
    config: PartialConfiguration,
    configBasedir: String,
    configFile: String,
    configOverrides: PartialConfiguration,
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
  @scala.inline
  implicit class LinterOptionsOps[Self <: LinterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheLocation(value: String): Self = this.set("cacheLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodeFilename(value: String): Self = this.set("codeFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: PartialConfiguration): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigBasedir(value: String): Self = this.set("configBasedir", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigFile(value: String): Self = this.set("configFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigOverrides(value: PartialConfiguration): Self = this.set("configOverrides", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomSyntax(value: String): Self = this.set("customSyntax", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableDefaultIgnores(value: Boolean): Self = this.set("disableDefaultIgnores", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: String | js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setFix(value: Boolean): Self = this.set("fix", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatterFunction1(value: /* results */ js.Array[LintResult] => String): Self = this.set("formatter", js.Any.fromFunction1(value))
    @scala.inline
    def setFormatter(value: FormatterType): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreDisables(value: Boolean): Self = this.set("ignoreDisables", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnorePath(value: String): Self = this.set("ignorePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxWarnings(value: Double): Self = this.set("maxWarnings", value.asInstanceOf[js.Any])
    @scala.inline
    def setReportNeedlessDisables(value: Boolean): Self = this.set("reportNeedlessDisables", value.asInstanceOf[js.Any])
    @scala.inline
    def setSyntax(value: SyntaxType): Self = this.set("syntax", value.asInstanceOf[js.Any])
  }
  
}

