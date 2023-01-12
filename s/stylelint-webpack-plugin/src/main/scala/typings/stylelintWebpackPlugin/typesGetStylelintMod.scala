package typings.stylelintWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.postcss.libProcessorMod.default
import typings.postcss.mod.Plugin
import typings.postcss.mod.PluginCreator
import typings.stylelint.mod.Config
import typings.stylelint.mod.CustomSyntax
import typings.stylelint.mod.Formatter
import typings.stylelint.mod.InternalApi
import typings.stylelint.mod.LinterOptions
import typings.stylelint.mod.LinterResult
import typings.stylelint.mod.PostcssPluginOptions
import typings.stylelintWebpackPlugin.anon.CheckAgainstRule
import typings.stylelintWebpackPlugin.anon.PickLinterOptionscwdconfi
import typings.stylelintWebpackPlugin.anon.Rule
import typings.stylelintWebpackPlugin.typesOptionsMod.FormatterType
import typings.stylelintWebpackPlugin.typesOptionsMod.OutputReport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetStylelintMod {
  
  /**
    * @param {string|undefined} key
    * @param {Options} options
    * @returns {Linter}
    */
  inline def apply(key: String, param1: Options): Linter = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Linter]
  inline def apply(key: Unit, param1: Options): Linter = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Linter]
  
  @JSImport("stylelint-webpack-plugin/types/getStylelint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type AsyncTask = js.Function0[js.Promise[Unit]]
  
  type LintResult = typings.stylelint.mod.LintResult
  
  type LintTask = js.Function1[/* files */ String | js.Array[String], js.Promise[js.Array[LintResult]]]
  
  trait Linter extends StObject {
    
    var api: InternalApi
    
    def cleanup(): js.Promise[Unit]
    @JSName("cleanup")
    var cleanup_Original: AsyncTask
    
    def lintFiles(files: String): js.Promise[js.Array[LintResult]]
    def lintFiles(files: js.Array[String]): js.Promise[js.Array[LintResult]]
    @JSName("lintFiles")
    var lintFiles_Original: LintTask
    
    def stylelint(): Plugin | default
    def stylelint(opts: PostcssPluginOptions): Plugin | default
    @JSName("stylelint")
    var stylelint_Original: Stylelint
    
    var threads: Double
  }
  object Linter {
    
    inline def apply(
      api: InternalApi,
      cleanup: () => js.Promise[Unit],
      lintFiles: /* files */ String | js.Array[String] => js.Promise[js.Array[LintResult]],
      stylelint: Stylelint,
      threads: Double
    ): Linter = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], cleanup = js.Any.fromFunction0(cleanup), lintFiles = js.Any.fromFunction1(lintFiles), stylelint = stylelint.asInstanceOf[js.Any], threads = threads.asInstanceOf[js.Any])
      __obj.asInstanceOf[Linter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Linter] (val x: Self) extends AnyVal {
      
      inline def setApi(value: InternalApi): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setCleanup(value: () => js.Promise[Unit]): Self = StObject.set(x, "cleanup", js.Any.fromFunction0(value))
      
      inline def setLintFiles(value: /* files */ String | js.Array[String] => js.Promise[js.Array[LintResult]]): Self = StObject.set(x, "lintFiles", js.Any.fromFunction1(value))
      
      inline def setStylelint(value: Stylelint): Self = StObject.set(x, "stylelint", value.asInstanceOf[js.Any])
      
      inline def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined stylelint-webpack-plugin.stylelint-webpack-plugin/types/options.Options */
  trait Options extends StObject {
    
    var allowEmptyInput: js.UndefOr[Boolean] = js.undefined
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var cacheLocation: js.UndefOr[String] = js.undefined
    
    var cacheStrategy: js.UndefOr[String] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var codeFilename: js.UndefOr[String] = js.undefined
    
    var config: js.UndefOr[Config] = js.undefined
    
    var configBasedir: js.UndefOr[String] = js.undefined
    
    var configFile: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[String] = js.undefined
    
    var customSyntax: js.UndefOr[CustomSyntax] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var disableDefaultIgnores: js.UndefOr[Boolean] = js.undefined
    
    var emitError: js.UndefOr[Boolean] = js.undefined
    
    var emitWarning: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var extensions: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var failOnError: js.UndefOr[Boolean] = js.undefined
    
    var failOnWarning: js.UndefOr[Boolean] = js.undefined
    
    var files: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var fix: js.UndefOr[Boolean] = js.undefined
    
    var formatter: js.UndefOr[FormatterType] = js.undefined
    
    var globbyOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobbyOptions */ Any
      ] = js.undefined
    
    var ignoreDisables: js.UndefOr[Boolean] = js.undefined
    
    var ignorePath: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var ignorePattern: js.UndefOr[js.Array[String]] = js.undefined
    
    var lintDirtyModulesOnly: js.UndefOr[Boolean] = js.undefined
    
    var maxWarnings: js.UndefOr[Double] = js.undefined
    
    var outputReport: js.UndefOr[OutputReport] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var reportDescriptionlessDisables: js.UndefOr[Boolean] = js.undefined
    
    var reportInvalidScopeDisables: js.UndefOr[Boolean] = js.undefined
    
    var reportNeedlessDisables: js.UndefOr[Boolean] = js.undefined
    
    var stylelintPath: js.UndefOr[String] = js.undefined
    
    var syntax: js.UndefOr[String] = js.undefined
    
    var threads: js.UndefOr[Double | Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
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
      
      inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigBasedir(value: String): Self = StObject.set(x, "configBasedir", value.asInstanceOf[js.Any])
      
      inline def setConfigBasedirUndefined: Self = StObject.set(x, "configBasedir", js.undefined)
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setCustomSyntax(value: CustomSyntax): Self = StObject.set(x, "customSyntax", value.asInstanceOf[js.Any])
      
      inline def setCustomSyntaxUndefined: Self = StObject.set(x, "customSyntax", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDisableDefaultIgnores(value: Boolean): Self = StObject.set(x, "disableDefaultIgnores", value.asInstanceOf[js.Any])
      
      inline def setDisableDefaultIgnoresUndefined: Self = StObject.set(x, "disableDefaultIgnores", js.undefined)
      
      inline def setEmitError(value: Boolean): Self = StObject.set(x, "emitError", value.asInstanceOf[js.Any])
      
      inline def setEmitErrorUndefined: Self = StObject.set(x, "emitError", js.undefined)
      
      inline def setEmitWarning(value: Boolean): Self = StObject.set(x, "emitWarning", value.asInstanceOf[js.Any])
      
      inline def setEmitWarningUndefined: Self = StObject.set(x, "emitWarning", js.undefined)
      
      inline def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setExtensions(value: String | js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setFailOnError(value: Boolean): Self = StObject.set(x, "failOnError", value.asInstanceOf[js.Any])
      
      inline def setFailOnErrorUndefined: Self = StObject.set(x, "failOnError", js.undefined)
      
      inline def setFailOnWarning(value: Boolean): Self = StObject.set(x, "failOnWarning", value.asInstanceOf[js.Any])
      
      inline def setFailOnWarningUndefined: Self = StObject.set(x, "failOnWarning", js.undefined)
      
      inline def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
      
      inline def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
      
      inline def setFormatter(value: FormatterType): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
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
      
      inline def setLintDirtyModulesOnly(value: Boolean): Self = StObject.set(x, "lintDirtyModulesOnly", value.asInstanceOf[js.Any])
      
      inline def setLintDirtyModulesOnlyUndefined: Self = StObject.set(x, "lintDirtyModulesOnly", js.undefined)
      
      inline def setMaxWarnings(value: Double): Self = StObject.set(x, "maxWarnings", value.asInstanceOf[js.Any])
      
      inline def setMaxWarningsUndefined: Self = StObject.set(x, "maxWarnings", js.undefined)
      
      inline def setOutputReport(value: OutputReport): Self = StObject.set(x, "outputReport", value.asInstanceOf[js.Any])
      
      inline def setOutputReportUndefined: Self = StObject.set(x, "outputReport", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setReportDescriptionlessDisables(value: Boolean): Self = StObject.set(x, "reportDescriptionlessDisables", value.asInstanceOf[js.Any])
      
      inline def setReportDescriptionlessDisablesUndefined: Self = StObject.set(x, "reportDescriptionlessDisables", js.undefined)
      
      inline def setReportInvalidScopeDisables(value: Boolean): Self = StObject.set(x, "reportInvalidScopeDisables", value.asInstanceOf[js.Any])
      
      inline def setReportInvalidScopeDisablesUndefined: Self = StObject.set(x, "reportInvalidScopeDisables", js.undefined)
      
      inline def setReportNeedlessDisables(value: Boolean): Self = StObject.set(x, "reportNeedlessDisables", value.asInstanceOf[js.Any])
      
      inline def setReportNeedlessDisablesUndefined: Self = StObject.set(x, "reportNeedlessDisables", js.undefined)
      
      inline def setStylelintPath(value: String): Self = StObject.set(x, "stylelintPath", value.asInstanceOf[js.Any])
      
      inline def setStylelintPathUndefined: Self = StObject.set(x, "stylelintPath", js.undefined)
      
      inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      inline def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
      
      inline def setThreads(value: Double | Boolean): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
      
      inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    }
  }
  
  @js.native
  trait Stylelint
    extends StObject
       with PluginCreator[PostcssPluginOptions] {
    
    def createLinter(options: LinterOptions): InternalApi = js.native
    
    def createPlugin(ruleName: String, plugin: typings.stylelint.mod.Plugin): Rule = js.native
    
    var formatters: StringDictionary[Formatter] = js.native
    
    def lint(options: LinterOptions): js.Promise[LinterResult] = js.native
    
    def resolveConfig(filePath: String): js.Promise[js.UndefOr[Config]] = js.native
    def resolveConfig(filePath: String, options: PickLinterOptionscwdconfi): js.Promise[js.UndefOr[Config]] = js.native
    
    var rules: StringDictionary[typings.stylelint.mod.Rule[Any, Any]] = js.native
    
    var utils: CheckAgainstRule = js.native
  }
  
  @js.native
  trait Worker
    extends typings.jestWorker.mod.Worker {
    
    def lintFiles(files: String): js.Promise[js.Array[LintResult]] = js.native
    def lintFiles(files: js.Array[String]): js.Promise[js.Array[LintResult]] = js.native
    @JSName("lintFiles")
    var lintFiles_Original: LintTask = js.native
  }
}
