package typings.stylelint

import org.scalablytyped.runtime.StringDictionary
import typings.postcss.mod.Result
import typings.postcss.mod.Root_
import typings.std.Record
import typings.stylelint.anon.Index
import typings.stylelint.anon.PartialConfiguration
import typings.stylelint.anon.PartialLinterOptions
import typings.stylelint.anon.Root
import typings.stylelint.stylelintBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stylelint", "createPlugin")
  @js.native
  def createPlugin(ruleName: String, plugin: Plugin): js.Any = js.native
  
  @JSImport("stylelint", "createRuleTester")
  @js.native
  def createRuleTester(
    fn: js.Function2[
      /* result */ js.Promise[js.Array[RuleTesterResult]], 
      /* context */ RuleTesterContext, 
      Unit
    ]
  ): js.Function2[/* rule */ Plugin, /* schema */ RuleTesterSchema, Unit] = js.native
  
  object formatters {
    
    @JSImport("stylelint", "formatters.compact")
    @js.native
    def compact(results: js.Array[LintResult]): String = js.native
    
    @JSImport("stylelint", "formatters.json")
    @js.native
    def json(results: js.Array[LintResult]): String = js.native
    
    @JSImport("stylelint", "formatters.string")
    @js.native
    def string(results: js.Array[LintResult]): String = js.native
    
    @JSImport("stylelint", "formatters.unix")
    @js.native
    def unix(results: js.Array[LintResult]): String = js.native
    
    @JSImport("stylelint", "formatters.verbose")
    @js.native
    def verbose(results: js.Array[LintResult]): String = js.native
  }
  
  @JSImport("stylelint", "lint")
  @js.native
  def lint(): js.Promise[LinterResult] = js.native
  @JSImport("stylelint", "lint")
  @js.native
  def lint(options: PartialLinterOptions): js.Promise[LinterResult] = js.native
  
  object utils {
    
    @JSImport("stylelint", "utils.checkAgainstRule")
    @js.native
    def checkAgainstRule(options: Root, callback: js.Function1[/* warning */ String, Unit]): Unit = js.native
    
    @JSImport("stylelint", "utils.report")
    @js.native
    def report(violation: Index): Unit = js.native
    
    @JSImport("stylelint", "utils.ruleMessages")
    @js.native
    def ruleMessages[T /* <: StringDictionary[RuleMessageValue] */](ruleName: String, messages: T): T = js.native
    
    @JSImport("stylelint", "utils.validateOptions")
    @js.native
    def validateOptions(result: Result, ruleName: String, options: ValidateOptionsAssertion*): Boolean = js.native
  }
  
  @js.native
  trait Configuration extends StObject {
    
    var defaultSeverity: Severity = js.native
    
    var `extends`: String | js.Array[String] = js.native
    
    var ignoreFiles: String | js.Array[String] = js.native
    
    var plugins: js.Array[String] = js.native
    
    var processors: js.Array[String] = js.native
    
    var rules: Record[String, _] = js.native
  }
  object Configuration {
    
    @scala.inline
    def apply(
      defaultSeverity: Severity,
      `extends`: String | js.Array[String],
      ignoreFiles: String | js.Array[String],
      plugins: js.Array[String],
      processors: js.Array[String],
      rules: Record[String, _]
    ): Configuration = {
      val __obj = js.Dynamic.literal(defaultSeverity = defaultSeverity.asInstanceOf[js.Any], ignoreFiles = ignoreFiles.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], processors = processors.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
      __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultSeverity(value: Severity): Self = StObject.set(x, "defaultSeverity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtends(value: String | js.Array[String]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreFiles(value: String | js.Array[String]): Self = StObject.set(x, "ignoreFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreFilesVarargs(value: String*): Self = StObject.set(x, "ignoreFiles", js.Array(value :_*))
      
      @scala.inline
      def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setProcessors(value: js.Array[String]): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessorsVarargs(value: String*): Self = StObject.set(x, "processors", js.Array(value :_*))
      
      @scala.inline
      def setRules(value: Record[String, _]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait LintResult extends StObject {
    
    var deprecations: js.Array[String] = js.native
    
    var errored: js.UndefOr[Boolean] = js.native
    
    var ignored: js.UndefOr[Boolean] = js.native
    
    var invalidOptionWarnings: js.Array[_] = js.native
    
    var source: String = js.native
    
    var warnings: js.Array[Warning] = js.native
  }
  object LintResult {
    
    @scala.inline
    def apply(
      deprecations: js.Array[String],
      invalidOptionWarnings: js.Array[_],
      source: String,
      warnings: js.Array[Warning]
    ): LintResult = {
      val __obj = js.Dynamic.literal(deprecations = deprecations.asInstanceOf[js.Any], invalidOptionWarnings = invalidOptionWarnings.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[LintResult]
    }
    
    @scala.inline
    implicit class LintResultMutableBuilder[Self <: LintResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeprecations(value: js.Array[String]): Self = StObject.set(x, "deprecations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecationsVarargs(value: String*): Self = StObject.set(x, "deprecations", js.Array(value :_*))
      
      @scala.inline
      def setErrored(value: Boolean): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErroredUndefined: Self = StObject.set(x, "errored", js.undefined)
      
      @scala.inline
      def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
      
      @scala.inline
      def setInvalidOptionWarnings(value: js.Array[_]): Self = StObject.set(x, "invalidOptionWarnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidOptionWarningsVarargs(value: js.Any*): Self = StObject.set(x, "invalidOptionWarnings", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnings(value: js.Array[Warning]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsVarargs(value: Warning*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LinterOptions extends StObject {
    
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
    implicit class LinterOptionsMutableBuilder[Self <: LinterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheLocation(value: String): Self = StObject.set(x, "cacheLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeFilename(value: String): Self = StObject.set(x, "codeFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfig(value: PartialConfiguration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigBasedir(value: String): Self = StObject.set(x, "configBasedir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigOverrides(value: PartialConfiguration): Self = StObject.set(x, "configOverrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSyntax(value: String): Self = StObject.set(x, "customSyntax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDefaultIgnores(value: Boolean): Self = StObject.set(x, "disableDefaultIgnores", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatter(value: FormatterType): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterFunction1(value: /* results */ js.Array[LintResult] => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIgnoreDisables(value: Boolean): Self = StObject.set(x, "ignoreDisables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePath(value: String): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWarnings(value: Double): Self = StObject.set(x, "maxWarnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportNeedlessDisables(value: Boolean): Self = StObject.set(x, "reportNeedlessDisables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyntax(value: SyntaxType): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LinterResult extends StObject {
    
    var errored: Boolean = js.native
    
    var output: String = js.native
    
    var results: js.Array[LintResult] = js.native
  }
  object LinterResult {
    
    @scala.inline
    def apply(errored: Boolean, output: String, results: js.Array[LintResult]): LinterResult = {
      val __obj = js.Dynamic.literal(errored = errored.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinterResult]
    }
    
    @scala.inline
    implicit class LinterResultMutableBuilder[Self <: LinterResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrored(value: Boolean): Self = StObject.set(x, "errored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResults(value: js.Array[LintResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsVarargs(value: LintResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    }
  }
  
  type Plugin = js.Function2[
    /* primaryOption */ js.Any, 
    /* secondaryOptions */ js.UndefOr[js.Object], 
    js.Function2[/* root */ Root_, /* result */ Result, Unit | js.Thenable[Unit]]
  ]
  
  type RuleMessageValue = String | (js.Function1[/* repeated */ js.Any, String])
  
  @js.native
  trait RuleTesterContext extends StObject {
    
    var caseDescription: String = js.native
    
    var comparisonCount: Double = js.native
    
    var completeAssertionDescription: String = js.native
    
    var only: js.UndefOr[Boolean] = js.native
  }
  object RuleTesterContext {
    
    @scala.inline
    def apply(caseDescription: String, comparisonCount: Double, completeAssertionDescription: String): RuleTesterContext = {
      val __obj = js.Dynamic.literal(caseDescription = caseDescription.asInstanceOf[js.Any], comparisonCount = comparisonCount.asInstanceOf[js.Any], completeAssertionDescription = completeAssertionDescription.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleTesterContext]
    }
    
    @scala.inline
    implicit class RuleTesterContextMutableBuilder[Self <: RuleTesterContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseDescription(value: String): Self = StObject.set(x, "caseDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparisonCount(value: Double): Self = StObject.set(x, "comparisonCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleteAssertionDescription(value: String): Self = StObject.set(x, "completeAssertionDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    }
  }
  
  @js.native
  trait RuleTesterResult extends StObject {
    
    var actual: Double = js.native
    
    var description: String = js.native
    
    var expected: Double = js.native
  }
  object RuleTesterResult {
    
    @scala.inline
    def apply(actual: Double, description: String, expected: Double): RuleTesterResult = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleTesterResult]
    }
    
    @scala.inline
    implicit class RuleTesterResultMutableBuilder[Self <: RuleTesterResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActual(value: Double): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpected(value: Double): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RuleTesterSchema extends StObject {
    
    var accept: js.UndefOr[js.Array[RuleTesterTest]] = js.native
    
    var config: js.UndefOr[js.Any] = js.native
    
    var reject: js.UndefOr[js.Array[RuleTesterTestRejected]] = js.native
    
    var ruleName: String = js.native
    
    var syntax: js.UndefOr[SyntaxType] = js.native
  }
  object RuleTesterSchema {
    
    @scala.inline
    def apply(ruleName: String): RuleTesterSchema = {
      val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleTesterSchema]
    }
    
    @scala.inline
    implicit class RuleTesterSchemaMutableBuilder[Self <: RuleTesterSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccept(value: js.Array[RuleTesterTest]): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setAcceptVarargs(value: RuleTesterTest*): Self = StObject.set(x, "accept", js.Array(value :_*))
      
      @scala.inline
      def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setReject(value: js.Array[RuleTesterTestRejected]): Self = StObject.set(x, "reject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUndefined: Self = StObject.set(x, "reject", js.undefined)
      
      @scala.inline
      def setRejectVarargs(value: RuleTesterTestRejected*): Self = StObject.set(x, "reject", js.Array(value :_*))
      
      @scala.inline
      def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyntax(value: SyntaxType): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    }
  }
  
  @js.native
  trait RuleTesterTest extends StObject {
    
    var code: String = js.native
    
    var description: js.UndefOr[String] = js.native
  }
  object RuleTesterTest {
    
    @scala.inline
    def apply(code: String): RuleTesterTest = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleTesterTest]
    }
    
    @scala.inline
    implicit class RuleTesterTestMutableBuilder[Self <: RuleTesterTest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    }
  }
  
  @js.native
  trait RuleTesterTestRejected extends RuleTesterTest {
    
    var column: js.UndefOr[Double] = js.native
    
    var line: js.UndefOr[Double] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var only: js.UndefOr[Boolean] = js.native
  }
  object RuleTesterTestRejected {
    
    @scala.inline
    def apply(code: String): RuleTesterTestRejected = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleTesterTestRejected]
    }
    
    @scala.inline
    implicit class RuleTesterTestRejectedMutableBuilder[Self <: RuleTesterTestRejected] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stylelint.stylelintStrings.warning
    - typings.stylelint.stylelintStrings.error
  */
  trait Severity extends StObject
  object Severity {
    
    @scala.inline
    def error: typings.stylelint.stylelintStrings.error = "error".asInstanceOf[typings.stylelint.stylelintStrings.error]
    
    @scala.inline
    def warning: typings.stylelint.stylelintStrings.warning = "warning".asInstanceOf[typings.stylelint.stylelintStrings.warning]
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
    
    @scala.inline
    def `css-in-js`: typings.stylelint.stylelintStrings.`css-in-js` = "css-in-js".asInstanceOf[typings.stylelint.stylelintStrings.`css-in-js`]
    
    @scala.inline
    def html: typings.stylelint.stylelintStrings.html = "html".asInstanceOf[typings.stylelint.stylelintStrings.html]
    
    @scala.inline
    def less: typings.stylelint.stylelintStrings.less = "less".asInstanceOf[typings.stylelint.stylelintStrings.less]
    
    @scala.inline
    def markdown: typings.stylelint.stylelintStrings.markdown = "markdown".asInstanceOf[typings.stylelint.stylelintStrings.markdown]
    
    @scala.inline
    def sass: typings.stylelint.stylelintStrings.sass = "sass".asInstanceOf[typings.stylelint.stylelintStrings.sass]
    
    @scala.inline
    def scss: typings.stylelint.stylelintStrings.scss = "scss".asInstanceOf[typings.stylelint.stylelintStrings.scss]
    
    @scala.inline
    def sugarss: typings.stylelint.stylelintStrings.sugarss = "sugarss".asInstanceOf[typings.stylelint.stylelintStrings.sugarss]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.stylelint.anon.Actual
    - typings.stylelint.anon.Optional
  */
  trait ValidateOptionsAssertion extends StObject
  object ValidateOptionsAssertion {
    
    @scala.inline
    def Actual(actual: js.Any): typings.stylelint.anon.Actual = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stylelint.anon.Actual]
    }
    
    @scala.inline
    def Optional(optional: `true`, possible: js.Any): typings.stylelint.anon.Optional = {
      val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], possible = possible.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.stylelint.anon.Optional]
    }
  }
  
  @js.native
  trait Warning extends StObject {
    
    var column: Double = js.native
    
    var line: Double = js.native
    
    var rule: String = js.native
    
    var severity: Severity = js.native
    
    var text: String = js.native
  }
  object Warning {
    
    @scala.inline
    def apply(column: Double, line: Double, rule: String, severity: Severity, text: String): Warning = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Warning]
    }
    
    @scala.inline
    implicit class WarningMutableBuilder[Self <: Warning] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait _FormatterType extends StObject
}
