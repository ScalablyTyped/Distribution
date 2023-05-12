package typings.stylelint.anon

import typings.stylelint.mod.CustomSyntax
import typings.stylelint.mod.Formatter
import typings.stylelint.mod.FormatterType
import typings.stylelint.mod.LintResult
import typings.stylelint.mod.LinterResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stylelint.stylelint.LinterOptions & {  cwd :string} */
trait LinterOptionscwdstring extends StObject {
  
  var allowEmptyInput: js.UndefOr[Boolean] = js.undefined
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var cacheLocation: js.UndefOr[String] = js.undefined
  
  var cacheStrategy: js.UndefOr[String] = js.undefined
  
  var code: js.UndefOr[String] = js.undefined
  
  var codeFilename: js.UndefOr[String] = js.undefined
  
  var config: js.UndefOr[typings.stylelint.mod.Config] = js.undefined
  
  var configBasedir: js.UndefOr[String] = js.undefined
  
  var configFile: js.UndefOr[String] = js.undefined
  
  var customSyntax: js.UndefOr[CustomSyntax] = js.undefined
  
  /**
  		 * The working directory to resolve files from. Defaults to the
  		 * current working directory.
  		 */
  var cwd: js.UndefOr[String] = js.undefined
  
  var disableDefaultIgnores: js.UndefOr[Boolean] = js.undefined
  
  var files: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var fix: js.UndefOr[Boolean] = js.undefined
  
  var formatter: js.UndefOr[FormatterType | Formatter] = js.undefined
  
  var globbyOptions: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobbyOptions */ Any
  ] = js.undefined
  
  var ignoreDisables: js.UndefOr[Boolean] = js.undefined
  
  var ignorePath: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var ignorePattern: js.UndefOr[js.Array[String]] = js.undefined
  
  var maxWarnings: js.UndefOr[Double] = js.undefined
  
  var quiet: js.UndefOr[Boolean] = js.undefined
  
  var quietDeprecationWarnings: js.UndefOr[Boolean] = js.undefined
  
  var reportDescriptionlessDisables: js.UndefOr[Boolean] = js.undefined
  
  var reportInvalidScopeDisables: js.UndefOr[Boolean] = js.undefined
  
  var reportNeedlessDisables: js.UndefOr[Boolean] = js.undefined
}
object LinterOptionscwdstring {
  
  inline def apply(): LinterOptionscwdstring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinterOptionscwdstring]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinterOptionscwdstring] (val x: Self) extends AnyVal {
    
    inline def setAllowEmptyInput(value: Boolean): Self = StObject.set(x, "allowEmptyInput", value.asInstanceOf[js.Any])
    
    inline def setAllowEmptyInputUndefined: Self = StObject.set(x, "allowEmptyInput", js.undefined)
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheLocation(value: String): Self = StObject.set(x, "cacheLocation", value.asInstanceOf[js.Any])
    
    inline def setCacheLocationUndefined: Self = StObject.set(x, "cacheLocation", js.undefined)
    
    inline def setCacheStrategy(value: String): Self = StObject.set(x, "cacheStrategy", value.asInstanceOf[js.Any])
    
    inline def setCacheStrategyUndefined: Self = StObject.set(x, "cacheStrategy", js.undefined)
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeFilename(value: String): Self = StObject.set(x, "codeFilename", value.asInstanceOf[js.Any])
    
    inline def setCodeFilenameUndefined: Self = StObject.set(x, "codeFilename", js.undefined)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setConfig(value: typings.stylelint.mod.Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigBasedir(value: String): Self = StObject.set(x, "configBasedir", value.asInstanceOf[js.Any])
    
    inline def setConfigBasedirUndefined: Self = StObject.set(x, "configBasedir", js.undefined)
    
    inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
    
    inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCustomSyntax(value: CustomSyntax): Self = StObject.set(x, "customSyntax", value.asInstanceOf[js.Any])
    
    inline def setCustomSyntaxUndefined: Self = StObject.set(x, "customSyntax", js.undefined)
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setDisableDefaultIgnores(value: Boolean): Self = StObject.set(x, "disableDefaultIgnores", value.asInstanceOf[js.Any])
    
    inline def setDisableDefaultIgnoresUndefined: Self = StObject.set(x, "disableDefaultIgnores", js.undefined)
    
    inline def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
    
    inline def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
    
    inline def setFormatter(value: FormatterType | Formatter): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterFunction2(value: (/* results */ js.Array[LintResult], /* returnValue */ LinterResult) => String): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setGlobbyOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobbyOptions */ Any
    ): Self = StObject.set(x, "globbyOptions", value.asInstanceOf[js.Any])
    
    inline def setGlobbyOptionsUndefined: Self = StObject.set(x, "globbyOptions", js.undefined)
    
    inline def setIgnoreDisables(value: Boolean): Self = StObject.set(x, "ignoreDisables", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDisablesUndefined: Self = StObject.set(x, "ignoreDisables", js.undefined)
    
    inline def setIgnorePath(value: String | js.Array[String]): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
    
    inline def setIgnorePathUndefined: Self = StObject.set(x, "ignorePath", js.undefined)
    
    inline def setIgnorePathVarargs(value: String*): Self = StObject.set(x, "ignorePath", js.Array(value*))
    
    inline def setIgnorePattern(value: js.Array[String]): Self = StObject.set(x, "ignorePattern", value.asInstanceOf[js.Any])
    
    inline def setIgnorePatternUndefined: Self = StObject.set(x, "ignorePattern", js.undefined)
    
    inline def setIgnorePatternVarargs(value: String*): Self = StObject.set(x, "ignorePattern", js.Array(value*))
    
    inline def setMaxWarnings(value: Double): Self = StObject.set(x, "maxWarnings", value.asInstanceOf[js.Any])
    
    inline def setMaxWarningsUndefined: Self = StObject.set(x, "maxWarnings", js.undefined)
    
    inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    
    inline def setQuietDeprecationWarnings(value: Boolean): Self = StObject.set(x, "quietDeprecationWarnings", value.asInstanceOf[js.Any])
    
    inline def setQuietDeprecationWarningsUndefined: Self = StObject.set(x, "quietDeprecationWarnings", js.undefined)
    
    inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    
    inline def setReportDescriptionlessDisables(value: Boolean): Self = StObject.set(x, "reportDescriptionlessDisables", value.asInstanceOf[js.Any])
    
    inline def setReportDescriptionlessDisablesUndefined: Self = StObject.set(x, "reportDescriptionlessDisables", js.undefined)
    
    inline def setReportInvalidScopeDisables(value: Boolean): Self = StObject.set(x, "reportInvalidScopeDisables", value.asInstanceOf[js.Any])
    
    inline def setReportInvalidScopeDisablesUndefined: Self = StObject.set(x, "reportInvalidScopeDisables", js.undefined)
    
    inline def setReportNeedlessDisables(value: Boolean): Self = StObject.set(x, "reportNeedlessDisables", value.asInstanceOf[js.Any])
    
    inline def setReportNeedlessDisablesUndefined: Self = StObject.set(x, "reportNeedlessDisables", js.undefined)
  }
}
