package typings.stylelintWebpackPlugin

import typings.stylelint.mod.Config
import typings.stylelint.mod.CustomSyntax
import typings.stylelint.mod.Formatter
import typings.stylelint.mod.LintResult
import typings.stylelint.mod.LinterResult
import typings.stylelintWebpackPlugin.typesGetStylelintMod.Stylelint
import typings.stylelintWebpackPlugin.typesGetStylelintMod.isPathIgnored
import typings.stylelintWebpackPlugin.typesLinterMod.Linter
import typings.stylelintWebpackPlugin.typesLinterMod.Report
import typings.stylelintWebpackPlugin.typesLinterMod.Reporter
import typings.stylelintWebpackPlugin.typesOptionsMod.FormatterType
import typings.stylelintWebpackPlugin.typesOptionsMod.OutputReport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IsPathIgnored extends StObject {
    
    def isPathIgnored(stylelint: Stylelint, filePath: String): js.Promise[Boolean]
    @JSName("isPathIgnored")
    var isPathIgnored_Original: isPathIgnored
    
    def lint(files: String): Unit
    def lint(files: js.Array[String]): Unit
    @JSName("lint")
    var lint_Original: Linter
    
    def report(): js.Promise[Report]
    @JSName("report")
    var report_Original: Reporter
    
    var stylelint: typings.stylelintWebpackPlugin.typesLinterMod.Stylelint
    
    var threads: Double
  }
  object IsPathIgnored {
    
    inline def apply(
      isPathIgnored: (/* stylelint */ Stylelint, /* filePath */ String) => js.Promise[Boolean],
      lint: /* files */ String | js.Array[String] => Unit,
      report: () => js.Promise[Report],
      stylelint: typings.stylelintWebpackPlugin.typesLinterMod.Stylelint,
      threads: Double
    ): IsPathIgnored = {
      val __obj = js.Dynamic.literal(isPathIgnored = js.Any.fromFunction2(isPathIgnored), lint = js.Any.fromFunction1(lint), report = js.Any.fromFunction0(report), stylelint = stylelint.asInstanceOf[js.Any], threads = threads.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsPathIgnored]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsPathIgnored] (val x: Self) extends AnyVal {
      
      inline def setIsPathIgnored(value: (/* stylelint */ Stylelint, /* filePath */ String) => js.Promise[Boolean]): Self = StObject.set(x, "isPathIgnored", js.Any.fromFunction2(value))
      
      inline def setLint(value: /* files */ String | js.Array[String] => Unit): Self = StObject.set(x, "lint", js.Any.fromFunction1(value))
      
      inline def setReport(value: () => js.Promise[Report]): Self = StObject.set(x, "report", js.Any.fromFunction0(value))
      
      inline def setStylelint(value: typings.stylelintWebpackPlugin.typesLinterMod.Stylelint): Self = StObject.set(x, "stylelint", value.asInstanceOf[js.Any])
      
      inline def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<stylelint-webpack-plugin.stylelint-webpack-plugin/types/options.PluginOptions> */
  trait PartialPluginOptions extends StObject {
    
    var context: js.UndefOr[String] = js.undefined
    
    var emitError: js.UndefOr[Boolean] = js.undefined
    
    var emitWarning: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var extensions: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var failOnError: js.UndefOr[Boolean] = js.undefined
    
    var failOnWarning: js.UndefOr[Boolean] = js.undefined
    
    var files: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var formatter: js.UndefOr[FormatterType] = js.undefined
    
    var lintDirtyModulesOnly: js.UndefOr[Boolean] = js.undefined
    
    var outputReport: js.UndefOr[OutputReport] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var stylelintPath: js.UndefOr[String] = js.undefined
    
    var threads: js.UndefOr[Double | Boolean] = js.undefined
  }
  object PartialPluginOptions {
    
    inline def apply(): PartialPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialPluginOptions] (val x: Self) extends AnyVal {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
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
      
      inline def setFormatter(value: FormatterType): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setLintDirtyModulesOnly(value: Boolean): Self = StObject.set(x, "lintDirtyModulesOnly", value.asInstanceOf[js.Any])
      
      inline def setLintDirtyModulesOnlyUndefined: Self = StObject.set(x, "lintDirtyModulesOnly", js.undefined)
      
      inline def setOutputReport(value: OutputReport): Self = StObject.set(x, "outputReport", value.asInstanceOf[js.Any])
      
      inline def setOutputReportUndefined: Self = StObject.set(x, "outputReport", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setStylelintPath(value: String): Self = StObject.set(x, "stylelintPath", value.asInstanceOf[js.Any])
      
      inline def setStylelintPathUndefined: Self = StObject.set(x, "stylelintPath", js.undefined)
      
      inline def setThreads(value: Double | Boolean): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
      
      inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    }
  }
  
  /* Inlined std.Partial<stylelint-webpack-plugin.stylelint-webpack-plugin/types/options.StylelintOptions> */
  trait PartialStylelintOptions extends StObject {
    
    var allowEmptyInput: js.UndefOr[Boolean] = js.undefined
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var cacheLocation: js.UndefOr[String] = js.undefined
    
    var cacheStrategy: js.UndefOr[String] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var codeFilename: js.UndefOr[String] = js.undefined
    
    var config: js.UndefOr[Config] = js.undefined
    
    var configBasedir: js.UndefOr[String] = js.undefined
    
    var configFile: js.UndefOr[String] = js.undefined
    
    var customSyntax: js.UndefOr[CustomSyntax] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var disableDefaultIgnores: js.UndefOr[Boolean] = js.undefined
    
    var files: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var fix: js.UndefOr[Boolean] = js.undefined
    
    var formatter: js.UndefOr[typings.stylelint.mod.FormatterType | Formatter] = js.undefined
    
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
  object PartialStylelintOptions {
    
    inline def apply(): PartialStylelintOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialStylelintOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialStylelintOptions] (val x: Self) extends AnyVal {
      
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
      
      inline def setFormatter(value: typings.stylelint.mod.FormatterType | Formatter): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
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
  
  trait Timestamp extends StObject {
    
    var timestamp: Double
  }
  object Timestamp {
    
    inline def apply(timestamp: Double): Timestamp = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timestamp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Timestamp] (val x: Self) extends AnyVal {
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
