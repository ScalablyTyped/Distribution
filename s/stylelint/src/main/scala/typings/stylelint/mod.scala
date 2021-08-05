package typings.stylelint

import org.scalablytyped.runtime.StringDictionary
import typings.postcss.mod.Result
import typings.postcss.mod.Root_
import typings.std.Record
import typings.stylelint.anon.Index
import typings.stylelint.anon.PartialConfiguration
import typings.stylelint.anon.PartialLinterOptions
import typings.stylelint.anon.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stylelint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPlugin(ruleName: String, plugin: Plugin): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlugin")(ruleName.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def createRuleTester(
    fn: js.Function2[
      /* result */ js.Promise[js.Array[RuleTesterResult]], 
      /* context */ RuleTesterContext, 
      Unit
    ]
  ): js.Function2[/* rule */ Plugin, /* schema */ RuleTesterSchema, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRuleTester")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* rule */ Plugin, /* schema */ RuleTesterSchema, Unit]]
  
  object formatters {
    
    @JSImport("stylelint", "formatters")
    @js.native
    val ^ : js.Any = js.native
    
    inline def compact(results: js.Array[LintResult]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(results.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def json(results: js.Array[LintResult]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(results.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def string(results: js.Array[LintResult]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(results.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def unix(results: js.Array[LintResult]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unix")(results.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def verbose(results: js.Array[LintResult]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("verbose")(results.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def lint(): js.Promise[LinterResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("lint")().asInstanceOf[js.Promise[LinterResult]]
  inline def lint(options: PartialLinterOptions): js.Promise[LinterResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("lint")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LinterResult]]
  
  object utils {
    
    @JSImport("stylelint", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def checkAgainstRule(options: Root, callback: js.Function1[/* warning */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkAgainstRule")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def report(violation: Index): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("report")(violation.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def ruleMessages[T /* <: StringDictionary[RuleMessageValue] */](ruleName: String, messages: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("ruleMessages")(ruleName.asInstanceOf[js.Any], messages.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def validateOptions(result: Result, ruleName: String, options: ValidateOptionsAssertion*): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateOptions")(result.asInstanceOf[js.Any], ruleName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  trait Configuration extends StObject {
    
    var defaultSeverity: Severity
    
    var `extends`: String | js.Array[String]
    
    var ignoreFiles: String | js.Array[String]
    
    var plugins: js.Array[String]
    
    var processors: js.Array[String]
    
    var rules: Record[String, js.Any]
  }
  object Configuration {
    
    inline def apply(
      defaultSeverity: Severity,
      `extends`: String | js.Array[String],
      ignoreFiles: String | js.Array[String],
      plugins: js.Array[String],
      processors: js.Array[String],
      rules: Record[String, js.Any]
    ): Configuration = {
      val __obj = js.Dynamic.literal(defaultSeverity = defaultSeverity.asInstanceOf[js.Any], ignoreFiles = ignoreFiles.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], processors = processors.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
      __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def setDefaultSeverity(value: Severity): Self = StObject.set(x, "defaultSeverity", value.asInstanceOf[js.Any])
      
      inline def setExtends(value: String | js.Array[String]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value :_*))
      
      inline def setIgnoreFiles(value: String | js.Array[String]): Self = StObject.set(x, "ignoreFiles", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFilesVarargs(value: String*): Self = StObject.set(x, "ignoreFiles", js.Array(value :_*))
      
      inline def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      inline def setProcessors(value: js.Array[String]): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
      
      inline def setProcessorsVarargs(value: String*): Self = StObject.set(x, "processors", js.Array(value :_*))
      
      inline def setRules(value: Record[String, js.Any]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stylelint.stylelintStrings.json
    - typings.stylelint.stylelintStrings.string
    - typings.stylelint.stylelintStrings.verbose
    - typings.stylelint.stylelintStrings.compact
    - typings.stylelint.stylelintStrings.unix
    - js.Function1[/ * results * / js.Array[typings.stylelint.mod.LintResult], java.lang.String]
  */
  type FormatterType = _FormatterType | (js.Function1[/* results */ js.Array[LintResult], String])
  
  trait LintResult extends StObject {
    
    var deprecations: js.Array[String]
    
    var errored: js.UndefOr[Boolean] = js.undefined
    
    var ignored: js.UndefOr[Boolean] = js.undefined
    
    var invalidOptionWarnings: js.Array[js.Any]
    
    var source: String
    
    var warnings: js.Array[Warning]
  }
  object LintResult {
    
    inline def apply(
      deprecations: js.Array[String],
      invalidOptionWarnings: js.Array[js.Any],
      source: String,
      warnings: js.Array[Warning]
    ): LintResult = {
      val __obj = js.Dynamic.literal(deprecations = deprecations.asInstanceOf[js.Any], invalidOptionWarnings = invalidOptionWarnings.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintResult]
    }
    
    extension [Self <: LintResult](x: Self) {
      
      inline def setDeprecations(value: js.Array[String]): Self = StObject.set(x, "deprecations", value.asInstanceOf[js.Any])
      
      inline def setDeprecationsVarargs(value: String*): Self = StObject.set(x, "deprecations", js.Array(value :_*))
      
      inline def setErrored(value: Boolean): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
      
      inline def setErroredUndefined: Self = StObject.set(x, "errored", js.undefined)
      
      inline def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
      
      inline def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
      
      inline def setInvalidOptionWarnings(value: js.Array[js.Any]): Self = StObject.set(x, "invalidOptionWarnings", value.asInstanceOf[js.Any])
      
      inline def setInvalidOptionWarningsVarargs(value: js.Any*): Self = StObject.set(x, "invalidOptionWarnings", js.Array(value :_*))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: js.Array[Warning]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: Warning*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    }
  }
  
  trait LinterOptions extends StObject {
    
    var cache: Boolean
    
    var cacheLocation: String
    
    var code: String
    
    var codeFilename: String
    
    var config: PartialConfiguration
    
    var configBasedir: String
    
    var configFile: String
    
    var configOverrides: PartialConfiguration
    
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
    
    inline def apply(
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
    
    extension [Self <: LinterOptions](x: Self) {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheLocation(value: String): Self = StObject.set(x, "cacheLocation", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeFilename(value: String): Self = StObject.set(x, "codeFilename", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: PartialConfiguration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigBasedir(value: String): Self = StObject.set(x, "configBasedir", value.asInstanceOf[js.Any])
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setConfigOverrides(value: PartialConfiguration): Self = StObject.set(x, "configOverrides", value.asInstanceOf[js.Any])
      
      inline def setCustomSyntax(value: String): Self = StObject.set(x, "customSyntax", value.asInstanceOf[js.Any])
      
      inline def setDisableDefaultIgnores(value: Boolean): Self = StObject.set(x, "disableDefaultIgnores", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      inline def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
      
      inline def setFormatter(value: FormatterType): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterFunction1(value: /* results */ js.Array[LintResult] => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setIgnoreDisables(value: Boolean): Self = StObject.set(x, "ignoreDisables", value.asInstanceOf[js.Any])
      
      inline def setIgnorePath(value: String): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
      
      inline def setMaxWarnings(value: Double): Self = StObject.set(x, "maxWarnings", value.asInstanceOf[js.Any])
      
      inline def setReportNeedlessDisables(value: Boolean): Self = StObject.set(x, "reportNeedlessDisables", value.asInstanceOf[js.Any])
      
      inline def setSyntax(value: SyntaxType): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    }
  }
  
  trait LinterResult extends StObject {
    
    var errored: Boolean
    
    var output: String
    
    var results: js.Array[LintResult]
  }
  object LinterResult {
    
    inline def apply(errored: Boolean, output: String, results: js.Array[LintResult]): LinterResult = {
      val __obj = js.Dynamic.literal(errored = errored.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinterResult]
    }
    
    extension [Self <: LinterResult](x: Self) {
      
      inline def setErrored(value: Boolean): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setResults(value: js.Array[LintResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: LintResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    }
  }
  
  type Plugin = js.Function2[
    /* primaryOption */ js.Any, 
    /* secondaryOptions */ js.UndefOr[js.Object], 
    js.Function2[/* root */ Root_, /* result */ Result, Unit | js.Thenable[Unit]]
  ]
  
  type RuleMessageValue = String | (js.Function1[/* repeated */ js.Any, String])
  
  trait RuleTesterContext extends StObject {
    
    var caseDescription: String
    
    var comparisonCount: Double
    
    var completeAssertionDescription: String
    
    var only: js.UndefOr[Boolean] = js.undefined
  }
  object RuleTesterContext {
    
    inline def apply(caseDescription: String, comparisonCount: Double, completeAssertionDescription: String): RuleTesterContext = {
      val __obj = js.Dynamic.literal(caseDescription = caseDescription.asInstanceOf[js.Any], comparisonCount = comparisonCount.asInstanceOf[js.Any], completeAssertionDescription = completeAssertionDescription.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleTesterContext]
    }
    
    extension [Self <: RuleTesterContext](x: Self) {
      
      inline def setCaseDescription(value: String): Self = StObject.set(x, "caseDescription", value.asInstanceOf[js.Any])
      
      inline def setComparisonCount(value: Double): Self = StObject.set(x, "comparisonCount", value.asInstanceOf[js.Any])
      
      inline def setCompleteAssertionDescription(value: String): Self = StObject.set(x, "completeAssertionDescription", value.asInstanceOf[js.Any])
      
      inline def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    }
  }
  
  trait RuleTesterResult extends StObject {
    
    var actual: Double
    
    var description: String
    
    var expected: Double
  }
  object RuleTesterResult {
    
    inline def apply(actual: Double, description: String, expected: Double): RuleTesterResult = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleTesterResult]
    }
    
    extension [Self <: RuleTesterResult](x: Self) {
      
      inline def setActual(value: Double): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setExpected(value: Double): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    }
  }
  
  trait RuleTesterSchema extends StObject {
    
    var accept: js.UndefOr[js.Array[RuleTesterTest]] = js.undefined
    
    var config: js.UndefOr[js.Any] = js.undefined
    
    var reject: js.UndefOr[js.Array[RuleTesterTestRejected]] = js.undefined
    
    var ruleName: String
    
    var syntax: js.UndefOr[SyntaxType] = js.undefined
  }
  object RuleTesterSchema {
    
    inline def apply(ruleName: String): RuleTesterSchema = {
      val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleTesterSchema]
    }
    
    extension [Self <: RuleTesterSchema](x: Self) {
      
      inline def setAccept(value: js.Array[RuleTesterTest]): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAcceptVarargs(value: RuleTesterTest*): Self = StObject.set(x, "accept", js.Array(value :_*))
      
      inline def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setReject(value: js.Array[RuleTesterTestRejected]): Self = StObject.set(x, "reject", value.asInstanceOf[js.Any])
      
      inline def setRejectUndefined: Self = StObject.set(x, "reject", js.undefined)
      
      inline def setRejectVarargs(value: RuleTesterTestRejected*): Self = StObject.set(x, "reject", js.Array(value :_*))
      
      inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
      
      inline def setSyntax(value: SyntaxType): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    }
  }
  
  trait RuleTesterTest extends StObject {
    
    var code: String
    
    var description: js.UndefOr[String] = js.undefined
  }
  object RuleTesterTest {
    
    inline def apply(code: String): RuleTesterTest = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleTesterTest]
    }
    
    extension [Self <: RuleTesterTest](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    }
  }
  
  trait RuleTesterTestRejected
    extends StObject
       with RuleTesterTest {
    
    var column: js.UndefOr[Double] = js.undefined
    
    var line: js.UndefOr[Double] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var only: js.UndefOr[Boolean] = js.undefined
  }
  object RuleTesterTestRejected {
    
    inline def apply(code: String): RuleTesterTestRejected = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleTesterTestRejected]
    }
    
    extension [Self <: RuleTesterTestRejected](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stylelint.stylelintStrings.warning
    - typings.stylelint.stylelintStrings.error
  */
  trait Severity extends StObject
  object Severity {
    
    inline def error: typings.stylelint.stylelintStrings.error = "error".asInstanceOf[typings.stylelint.stylelintStrings.error]
    
    inline def warning: typings.stylelint.stylelintStrings.warning = "warning".asInstanceOf[typings.stylelint.stylelintStrings.warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stylelint.stylelintStrings.`css-in-js`
    - typings.stylelint.stylelintStrings.html
    - typings.stylelint.stylelintStrings.less
    - typings.stylelint.stylelintStrings.markdown
    - typings.stylelint.stylelintStrings.sass
    - typings.stylelint.stylelintStrings.scss
    - typings.stylelint.stylelintStrings.sugarss
  */
  trait SyntaxType extends StObject
  object SyntaxType {
    
    inline def `css-in-js`: typings.stylelint.stylelintStrings.`css-in-js` = "css-in-js".asInstanceOf[typings.stylelint.stylelintStrings.`css-in-js`]
    
    inline def html: typings.stylelint.stylelintStrings.html = "html".asInstanceOf[typings.stylelint.stylelintStrings.html]
    
    inline def less: typings.stylelint.stylelintStrings.less = "less".asInstanceOf[typings.stylelint.stylelintStrings.less]
    
    inline def markdown: typings.stylelint.stylelintStrings.markdown = "markdown".asInstanceOf[typings.stylelint.stylelintStrings.markdown]
    
    inline def sass: typings.stylelint.stylelintStrings.sass = "sass".asInstanceOf[typings.stylelint.stylelintStrings.sass]
    
    inline def scss: typings.stylelint.stylelintStrings.scss = "scss".asInstanceOf[typings.stylelint.stylelintStrings.scss]
    
    inline def sugarss: typings.stylelint.stylelintStrings.sugarss = "sugarss".asInstanceOf[typings.stylelint.stylelintStrings.sugarss]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stylelint.anon.Actual
    - typings.stylelint.anon.Optional
  */
  trait ValidateOptionsAssertion extends StObject
  object ValidateOptionsAssertion {
    
    inline def Actual(actual: js.Any): typings.stylelint.anon.Actual = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stylelint.anon.Actual]
    }
    
    inline def Optional(possible: js.Any): typings.stylelint.anon.Optional = {
      val __obj = js.Dynamic.literal(optional = true, possible = possible.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stylelint.anon.Optional]
    }
  }
  
  trait Warning extends StObject {
    
    var column: Double
    
    var line: Double
    
    var rule: String
    
    var severity: Severity
    
    var text: String
  }
  object Warning {
    
    inline def apply(column: Double, line: Double, rule: String, severity: Severity, text: String): Warning = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Warning]
    }
    
    extension [Self <: Warning](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait _FormatterType extends StObject
}
