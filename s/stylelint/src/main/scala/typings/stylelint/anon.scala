package typings.stylelint

import typings.postcss.mod.Node
import typings.postcss.mod.Result
import typings.std.Record
import typings.stylelint.mod.FormatterType
import typings.stylelint.mod.LintResult
import typings.stylelint.mod.Severity
import typings.stylelint.mod.SyntaxType
import typings.stylelint.mod.ValidateOptionsAssertion
import typings.stylelint.stylelintBooleans.`false`
import typings.stylelint.stylelintBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Actual
    extends StObject
       with ValidateOptionsAssertion {
    
    var actual: js.Any
    
    var optional: js.UndefOr[`false`] = js.undefined
    
    var possible: js.UndefOr[js.Any] = js.undefined
  }
  object Actual {
    
    inline def apply(actual: js.Any): Actual = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any])
      __obj.asInstanceOf[Actual]
    }
    
    extension [Self <: Actual](x: Self) {
      
      inline def setActual(value: js.Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setOptional(value: `false`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setPossible(value: js.Any): Self = StObject.set(x, "possible", value.asInstanceOf[js.Any])
      
      inline def setPossibleUndefined: Self = StObject.set(x, "possible", js.undefined)
    }
  }
  
  trait Index extends StObject {
    
    var index: js.UndefOr[Double] = js.undefined
    
    var line: js.UndefOr[Double] = js.undefined
    
    var message: String
    
    var node: Node
    
    var result: Result
    
    var ruleName: String
    
    var word: js.UndefOr[String] = js.undefined
  }
  object Index {
    
    inline def apply(message: String, node: Node, result: Result, ruleName: String): Index = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    extension [Self <: Index](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Result): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
      
      inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
      
      inline def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
    }
  }
  
  trait Optional
    extends StObject
       with ValidateOptionsAssertion {
    
    var actual: js.UndefOr[js.Any] = js.undefined
    
    var optional: `true`
    
    var possible: js.Any
  }
  object Optional {
    
    inline def apply(possible: js.Any): Optional = {
      val __obj = js.Dynamic.literal(optional = true, possible = possible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optional]
    }
    
    extension [Self <: Optional](x: Self) {
      
      inline def setActual(value: js.Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
      
      inline def setOptional(value: `true`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setPossible(value: js.Any): Self = StObject.set(x, "possible", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<stylelint.stylelint.Configuration> */
  trait PartialConfiguration extends StObject {
    
    var defaultSeverity: js.UndefOr[Severity] = js.undefined
    
    var `extends`: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var ignoreFiles: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var plugins: js.UndefOr[js.Array[String]] = js.undefined
    
    var processors: js.UndefOr[js.Array[String]] = js.undefined
    
    var rules: js.UndefOr[Record[String, js.Any]] = js.undefined
  }
  object PartialConfiguration {
    
    inline def apply(): PartialConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfiguration]
    }
    
    extension [Self <: PartialConfiguration](x: Self) {
      
      inline def setDefaultSeverity(value: Severity): Self = StObject.set(x, "defaultSeverity", value.asInstanceOf[js.Any])
      
      inline def setDefaultSeverityUndefined: Self = StObject.set(x, "defaultSeverity", js.undefined)
      
      inline def setExtends(value: String | js.Array[String]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value :_*))
      
      inline def setIgnoreFiles(value: String | js.Array[String]): Self = StObject.set(x, "ignoreFiles", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFilesUndefined: Self = StObject.set(x, "ignoreFiles", js.undefined)
      
      inline def setIgnoreFilesVarargs(value: String*): Self = StObject.set(x, "ignoreFiles", js.Array(value :_*))
      
      inline def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      inline def setProcessors(value: js.Array[String]): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
      
      inline def setProcessorsUndefined: Self = StObject.set(x, "processors", js.undefined)
      
      inline def setProcessorsVarargs(value: String*): Self = StObject.set(x, "processors", js.Array(value :_*))
      
      inline def setRules(value: Record[String, js.Any]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    }
  }
  
  /* Inlined std.Partial<stylelint.stylelint.LinterOptions> */
  trait PartialLinterOptions extends StObject {
    
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
    
    inline def apply(): PartialLinterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLinterOptions]
    }
    
    extension [Self <: PartialLinterOptions](x: Self) {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheLocation(value: String): Self = StObject.set(x, "cacheLocation", value.asInstanceOf[js.Any])
      
      inline def setCacheLocationUndefined: Self = StObject.set(x, "cacheLocation", js.undefined)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeFilename(value: String): Self = StObject.set(x, "codeFilename", value.asInstanceOf[js.Any])
      
      inline def setCodeFilenameUndefined: Self = StObject.set(x, "codeFilename", js.undefined)
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setConfig(value: PartialConfiguration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigBasedir(value: String): Self = StObject.set(x, "configBasedir", value.asInstanceOf[js.Any])
      
      inline def setConfigBasedirUndefined: Self = StObject.set(x, "configBasedir", js.undefined)
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
      
      inline def setConfigOverrides(value: PartialConfiguration): Self = StObject.set(x, "configOverrides", value.asInstanceOf[js.Any])
      
      inline def setConfigOverridesUndefined: Self = StObject.set(x, "configOverrides", js.undefined)
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setCustomSyntax(value: String): Self = StObject.set(x, "customSyntax", value.asInstanceOf[js.Any])
      
      inline def setCustomSyntaxUndefined: Self = StObject.set(x, "customSyntax", js.undefined)
      
      inline def setDisableDefaultIgnores(value: Boolean): Self = StObject.set(x, "disableDefaultIgnores", value.asInstanceOf[js.Any])
      
      inline def setDisableDefaultIgnoresUndefined: Self = StObject.set(x, "disableDefaultIgnores", js.undefined)
      
      inline def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      inline def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
      
      inline def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
      
      inline def setFormatter(value: FormatterType): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterFunction1(value: /* results */ js.Array[LintResult] => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setIgnoreDisables(value: Boolean): Self = StObject.set(x, "ignoreDisables", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDisablesUndefined: Self = StObject.set(x, "ignoreDisables", js.undefined)
      
      inline def setIgnorePath(value: String): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
      
      inline def setIgnorePathUndefined: Self = StObject.set(x, "ignorePath", js.undefined)
      
      inline def setMaxWarnings(value: Double): Self = StObject.set(x, "maxWarnings", value.asInstanceOf[js.Any])
      
      inline def setMaxWarningsUndefined: Self = StObject.set(x, "maxWarnings", js.undefined)
      
      inline def setReportNeedlessDisables(value: Boolean): Self = StObject.set(x, "reportNeedlessDisables", value.asInstanceOf[js.Any])
      
      inline def setReportNeedlessDisablesUndefined: Self = StObject.set(x, "reportNeedlessDisables", js.undefined)
      
      inline def setSyntax(value: SyntaxType): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    }
  }
  
  trait Root extends StObject {
    
    var root: js.Any
    
    var ruleName: String
    
    var ruleSettings: js.Any
  }
  object Root {
    
    inline def apply(root: js.Any, ruleName: String, ruleSettings: js.Any): Root = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any], ruleSettings = ruleSettings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Root]
    }
    
    extension [Self <: Root](x: Self) {
      
      inline def setRoot(value: js.Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
      
      inline def setRuleSettings(value: js.Any): Self = StObject.set(x, "ruleSettings", value.asInstanceOf[js.Any])
    }
  }
}
