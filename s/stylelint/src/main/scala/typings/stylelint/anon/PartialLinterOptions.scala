package typings.stylelint.anon

import typings.stylelint.mod.FormatterType
import typings.stylelint.mod.LintResult
import typings.stylelint.mod.SyntaxType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<stylelint.stylelint.LinterOptions> */
@js.native
trait PartialLinterOptions extends js.Object {
  
  var cache: js.UndefOr[Boolean] = js.native
  
  var cacheLocation: js.UndefOr[String] = js.native
  
  var code: js.UndefOr[String] = js.native
  
  var codeFilename: js.UndefOr[String] = js.native
  
  var config: js.UndefOr[PartialConfiguration] = js.native
  
  var configBasedir: js.UndefOr[String] = js.native
  
  var configFile: js.UndefOr[String] = js.native
  
  var configOverrides: js.UndefOr[PartialConfiguration] = js.native
  
  var customSyntax: js.UndefOr[String] = js.native
  
  var disableDefaultIgnores: js.UndefOr[Boolean] = js.native
  
  var files: js.UndefOr[String | js.Array[String]] = js.native
  
  var fix: js.UndefOr[Boolean] = js.native
  
  var formatter: js.UndefOr[FormatterType] = js.native
  
  var ignoreDisables: js.UndefOr[Boolean] = js.native
  
  var ignorePath: js.UndefOr[String] = js.native
  
  var maxWarnings: js.UndefOr[Double] = js.native
  
  var reportNeedlessDisables: js.UndefOr[Boolean] = js.native
  
  var syntax: js.UndefOr[SyntaxType] = js.native
}
object PartialLinterOptions {
  
  @scala.inline
  def apply(): PartialLinterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLinterOptions]
  }
  
  @scala.inline
  implicit class PartialLinterOptionsOps[Self <: PartialLinterOptions] (val x: Self) extends AnyVal {
    
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
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCacheLocation(value: String): Self = this.set("cacheLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheLocation: Self = this.set("cacheLocation", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setCodeFilename(value: String): Self = this.set("codeFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeFilename: Self = this.set("codeFilename", js.undefined)
    
    @scala.inline
    def setConfig(value: PartialConfiguration): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setConfigBasedir(value: String): Self = this.set("configBasedir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigBasedir: Self = this.set("configBasedir", js.undefined)
    
    @scala.inline
    def setConfigFile(value: String): Self = this.set("configFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigFile: Self = this.set("configFile", js.undefined)
    
    @scala.inline
    def setConfigOverrides(value: PartialConfiguration): Self = this.set("configOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigOverrides: Self = this.set("configOverrides", js.undefined)
    
    @scala.inline
    def setCustomSyntax(value: String): Self = this.set("customSyntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSyntax: Self = this.set("customSyntax", js.undefined)
    
    @scala.inline
    def setDisableDefaultIgnores(value: Boolean): Self = this.set("disableDefaultIgnores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDefaultIgnores: Self = this.set("disableDefaultIgnores", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: String | js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setFix(value: Boolean): Self = this.set("fix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFix: Self = this.set("fix", js.undefined)
    
    @scala.inline
    def setFormatterFunction1(value: /* results */ js.Array[LintResult] => String): Self = this.set("formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatter(value: FormatterType): Self = this.set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setIgnoreDisables(value: Boolean): Self = this.set("ignoreDisables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreDisables: Self = this.set("ignoreDisables", js.undefined)
    
    @scala.inline
    def setIgnorePath(value: String): Self = this.set("ignorePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePath: Self = this.set("ignorePath", js.undefined)
    
    @scala.inline
    def setMaxWarnings(value: Double): Self = this.set("maxWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWarnings: Self = this.set("maxWarnings", js.undefined)
    
    @scala.inline
    def setReportNeedlessDisables(value: Boolean): Self = this.set("reportNeedlessDisables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportNeedlessDisables: Self = this.set("reportNeedlessDisables", js.undefined)
    
    @scala.inline
    def setSyntax(value: SyntaxType): Self = this.set("syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyntax: Self = this.set("syntax", js.undefined)
  }
}
