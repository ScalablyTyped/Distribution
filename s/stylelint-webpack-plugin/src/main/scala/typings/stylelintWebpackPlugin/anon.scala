package typings.stylelintWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.postcss.mod.Result
import typings.stylelint.anon.Index
import typings.stylelint.anon.Root
import typings.stylelint.mod.LintResult
import typings.stylelint.mod.RuleMessageValue
import typings.stylelint.mod.ValidateOptionsAssertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<stylelint-webpack-plugin.stylelint-webpack-plugin/declarations/getOptions.Options> */
  trait PartialOptions extends StObject {
    
    var context: js.UndefOr[String] = js.undefined
    
    var emitError: js.UndefOr[Boolean] = js.undefined
    
    var emitWarning: js.UndefOr[Boolean] = js.undefined
    
    var failOnError: js.UndefOr[Boolean] = js.undefined
    
    var failOnWarning: js.UndefOr[Boolean] = js.undefined
    
    var files: js.UndefOr[js.Array[String] | String] = js.undefined
    
    var formatter: js.UndefOr[js.Function | String] = js.undefined
    
    var lintDirtyModulesOnly: js.UndefOr[Boolean] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var stylelintPath: js.UndefOr[String] = js.undefined
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setEmitError(value: Boolean): Self = StObject.set(x, "emitError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitErrorUndefined: Self = StObject.set(x, "emitError", js.undefined)
      
      @scala.inline
      def setEmitWarning(value: Boolean): Self = StObject.set(x, "emitWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitWarningUndefined: Self = StObject.set(x, "emitWarning", js.undefined)
      
      @scala.inline
      def setFailOnError(value: Boolean): Self = StObject.set(x, "failOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailOnErrorUndefined: Self = StObject.set(x, "failOnError", js.undefined)
      
      @scala.inline
      def setFailOnWarning(value: Boolean): Self = StObject.set(x, "failOnWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailOnWarningUndefined: Self = StObject.set(x, "failOnWarning", js.undefined)
      
      @scala.inline
      def setFiles(value: js.Array[String] | String): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setFormatter(value: js.Function | String): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setLintDirtyModulesOnly(value: Boolean): Self = StObject.set(x, "lintDirtyModulesOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLintDirtyModulesOnlyUndefined: Self = StObject.set(x, "lintDirtyModulesOnly", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setStylelintPath(value: String): Self = StObject.set(x, "stylelintPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylelintPathUndefined: Self = StObject.set(x, "stylelintPath", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  timestamp :number}> */
  trait Partialtimestampnumber extends StObject {
    
    var timestamp: js.UndefOr[Double] = js.undefined
  }
  object Partialtimestampnumber {
    
    @scala.inline
    def apply(): Partialtimestampnumber = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partialtimestampnumber]
    }
    
    @scala.inline
    implicit class PartialtimestampnumberMutableBuilder[Self <: Partialtimestampnumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  trait Typeofformatters extends StObject {
    
    def compact(results: js.Array[LintResult]): String
    
    def json(results: js.Array[LintResult]): String
    
    def string(results: js.Array[LintResult]): String
    
    def unix(results: js.Array[LintResult]): String
    
    def verbose(results: js.Array[LintResult]): String
  }
  object Typeofformatters {
    
    @scala.inline
    def apply(
      compact: js.Array[LintResult] => String,
      json: js.Array[LintResult] => String,
      string: js.Array[LintResult] => String,
      unix: js.Array[LintResult] => String,
      verbose: js.Array[LintResult] => String
    ): Typeofformatters = {
      val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), json = js.Any.fromFunction1(json), string = js.Any.fromFunction1(string), unix = js.Any.fromFunction1(unix), verbose = js.Any.fromFunction1(verbose))
      __obj.asInstanceOf[Typeofformatters]
    }
    
    @scala.inline
    implicit class TypeofformattersMutableBuilder[Self <: Typeofformatters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompact(value: js.Array[LintResult] => String): Self = StObject.set(x, "compact", js.Any.fromFunction1(value))
      
      @scala.inline
      def setJson(value: js.Array[LintResult] => String): Self = StObject.set(x, "json", js.Any.fromFunction1(value))
      
      @scala.inline
      def setString(value: js.Array[LintResult] => String): Self = StObject.set(x, "string", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnix(value: js.Array[LintResult] => String): Self = StObject.set(x, "unix", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVerbose(value: js.Array[LintResult] => String): Self = StObject.set(x, "verbose", js.Any.fromFunction1(value))
    }
  }
  
  trait Typeofutils extends StObject {
    
    def checkAgainstRule(options: Root, callback: js.Function1[/* warning */ String, Unit]): Unit
    
    def report(violation: Index): Unit
    
    def ruleMessages[T /* <: StringDictionary[RuleMessageValue] */](ruleName: String, messages: T): T
    
    def validateOptions(result: Result, ruleName: String, options: ValidateOptionsAssertion*): Boolean
  }
  object Typeofutils {
    
    @scala.inline
    def apply(
      checkAgainstRule: (Root, js.Function1[/* warning */ String, Unit]) => Unit,
      report: Index => Unit,
      ruleMessages: (String, js.Any) => js.Any,
      validateOptions: (Result, String, /* repeated */ ValidateOptionsAssertion) => Boolean
    ): Typeofutils = {
      val __obj = js.Dynamic.literal(checkAgainstRule = js.Any.fromFunction2(checkAgainstRule), report = js.Any.fromFunction1(report), ruleMessages = js.Any.fromFunction2(ruleMessages), validateOptions = js.Any.fromFunction3(validateOptions))
      __obj.asInstanceOf[Typeofutils]
    }
    
    @scala.inline
    implicit class TypeofutilsMutableBuilder[Self <: Typeofutils] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckAgainstRule(value: (Root, js.Function1[/* warning */ String, Unit]) => Unit): Self = StObject.set(x, "checkAgainstRule", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReport(value: Index => Unit): Self = StObject.set(x, "report", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRuleMessages(value: (String, js.Any) => js.Any): Self = StObject.set(x, "ruleMessages", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValidateOptions(value: (Result, String, /* repeated */ ValidateOptionsAssertion) => Boolean): Self = StObject.set(x, "validateOptions", js.Any.fromFunction3(value))
    }
  }
}
