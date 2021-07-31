package typings.tsLoader

import org.scalablytyped.runtime.StringDictionary
import typings.chalk.mod.Chalk
import typings.std.Map
import typings.std.RegExp
import typings.std.Set
import typings.std.TemplateStringsArray
import typings.std.WeakMap
import typings.tsLoader.anon.FnCall
import typings.tsLoader.anon.OutputFileName
import typings.tsLoader.anon.TsLoaderDefinitionFileVersions
import typings.tsLoader.anon.Typeoftypescript
import typings.tsLoader.tsLoaderStrings.error_
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.CustomTransformers
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.DirectoryWatcherCallback
import typings.typescript.mod.EmitAndSemanticDiagnosticsBuilderProgram
import typings.typescript.mod.FileWatcher
import typings.typescript.mod.FileWatcherCallback
import typings.typescript.mod.FileWatcherEventKind
import typings.typescript.mod.LanguageService
import typings.typescript.mod.ModuleResolutionHost
import typings.typescript.mod.OutputFile
import typings.typescript.mod.Program
import typings.typescript.mod.ResolvedModuleWithFailedLookupLocations
import typings.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import typings.typescript.mod.SolutionBuilder
import typings.typescript.mod.WatchCompilerHostOfFilesAndCompilerOptions
import typings.typescript.mod.WatchOfFilesAndCompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  type CustomResolveModuleName = js.Function5[
    /* moduleName */ String, 
    /* containingFile */ String, 
    /* compilerOptions */ CompilerOptions, 
    /* moduleResolutionHost */ ModuleResolutionHost, 
    /* parentResolver */ ResolveModuleName, 
    ResolvedModuleWithFailedLookupLocations
  ]
  
  type CustomResolveTypeReferenceDirective = js.Function5[
    /* typeDirectiveName */ String, 
    /* containingFile */ String, 
    /* compilerOptions */ CompilerOptions, 
    /* moduleResolutionHost */ ModuleResolutionHost, 
    /* parentResolver */ FnCall, 
    ResolvedTypeReferenceDirectiveWithFailedLookupLocations
  ]
  
  type DependencyGraph = StringDictionary[js.UndefOr[js.Array[ResolvedModule]]]
  
  trait ErrorInfo extends StObject {
    
    var character: Double
    
    var code: Double
    
    var content: String
    
    var context: String
    
    var file: String
    
    var line: Double
    
    var severity: Severity
  }
  object ErrorInfo {
    
    @scala.inline
    def apply(
      character: Double,
      code: Double,
      content: String,
      context: String,
      file: String,
      line: Double,
      severity: Severity
    ): ErrorInfo = {
      val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorInfo]
    }
    
    @scala.inline
    implicit class ErrorInfoMutableBuilder[Self <: ErrorInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharacter(value: Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileLocation extends StObject {
    
    var character: Double
    
    var line: Double
  }
  object FileLocation {
    
    @scala.inline
    def apply(character: Double, line: Double): FileLocation = {
      val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileLocation]
    }
    
    @scala.inline
    implicit class FileLocationMutableBuilder[Self <: FileLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharacter(value: Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoaderOptions extends StObject {
    
    var allowTsInNodeModules: Boolean
    
    var appendTsSuffixTo: js.Array[RegExp]
    
    var appendTsxSuffixTo: js.Array[RegExp]
    
    var colors: Boolean
    
    var compiler: String
    
    var compilerOptions: CompilerOptions
    
    var configFile: String
    
    var context: String
    
    def errorFormatter(message: ErrorInfo, colors: Chalk): String
    
    var experimentalFileCaching: Boolean
    
    var experimentalWatchApi: Boolean
    
    var getCustomTransformers: String | (js.Function1[/* program */ Program, js.UndefOr[CustomTransformers]])
    
    var happyPackMode: Boolean
    
    var ignoreDiagnostics: js.Array[Double]
    
    var instance: String
    
    var logInfoToStdOut: Boolean
    
    var logLevel: LogLevel
    
    var onlyCompileBundledFiles: Boolean
    
    var projectReferences: Boolean
    
    var reportFiles: js.Array[String]
    
    def resolveModuleName(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      moduleResolutionHost: ModuleResolutionHost,
      parentResolver: ResolveModuleName
    ): ResolvedModuleWithFailedLookupLocations
    @JSName("resolveModuleName")
    var resolveModuleName_Original: CustomResolveModuleName
    
    def resolveTypeReferenceDirective(
      typeDirectiveName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      moduleResolutionHost: ModuleResolutionHost,
      parentResolver: FnCall
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    @JSName("resolveTypeReferenceDirective")
    var resolveTypeReferenceDirective_Original: CustomResolveTypeReferenceDirective
    
    var silent: Boolean
    
    var transpileOnly: Boolean
  }
  object LoaderOptions {
    
    @scala.inline
    def apply(
      allowTsInNodeModules: Boolean,
      appendTsSuffixTo: js.Array[RegExp],
      appendTsxSuffixTo: js.Array[RegExp],
      colors: Boolean,
      compiler: String,
      compilerOptions: CompilerOptions,
      configFile: String,
      context: String,
      errorFormatter: (ErrorInfo, Chalk) => String,
      experimentalFileCaching: Boolean,
      experimentalWatchApi: Boolean,
      getCustomTransformers: String | (js.Function1[/* program */ Program, js.UndefOr[CustomTransformers]]),
      happyPackMode: Boolean,
      ignoreDiagnostics: js.Array[Double],
      instance: String,
      logInfoToStdOut: Boolean,
      logLevel: LogLevel,
      onlyCompileBundledFiles: Boolean,
      projectReferences: Boolean,
      reportFiles: js.Array[String],
      resolveModuleName: (/* moduleName */ String, /* containingFile */ String, /* compilerOptions */ CompilerOptions, /* moduleResolutionHost */ ModuleResolutionHost, /* parentResolver */ ResolveModuleName) => ResolvedModuleWithFailedLookupLocations,
      resolveTypeReferenceDirective: (/* typeDirectiveName */ String, /* containingFile */ String, /* compilerOptions */ CompilerOptions, /* moduleResolutionHost */ ModuleResolutionHost, /* parentResolver */ FnCall) => ResolvedTypeReferenceDirectiveWithFailedLookupLocations,
      silent: Boolean,
      transpileOnly: Boolean
    ): LoaderOptions = {
      val __obj = js.Dynamic.literal(allowTsInNodeModules = allowTsInNodeModules.asInstanceOf[js.Any], appendTsSuffixTo = appendTsSuffixTo.asInstanceOf[js.Any], appendTsxSuffixTo = appendTsxSuffixTo.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], compiler = compiler.asInstanceOf[js.Any], compilerOptions = compilerOptions.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], errorFormatter = js.Any.fromFunction2(errorFormatter), experimentalFileCaching = experimentalFileCaching.asInstanceOf[js.Any], experimentalWatchApi = experimentalWatchApi.asInstanceOf[js.Any], getCustomTransformers = getCustomTransformers.asInstanceOf[js.Any], happyPackMode = happyPackMode.asInstanceOf[js.Any], ignoreDiagnostics = ignoreDiagnostics.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], logInfoToStdOut = logInfoToStdOut.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], onlyCompileBundledFiles = onlyCompileBundledFiles.asInstanceOf[js.Any], projectReferences = projectReferences.asInstanceOf[js.Any], reportFiles = reportFiles.asInstanceOf[js.Any], resolveModuleName = js.Any.fromFunction5(resolveModuleName), resolveTypeReferenceDirective = js.Any.fromFunction5(resolveTypeReferenceDirective), silent = silent.asInstanceOf[js.Any], transpileOnly = transpileOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoaderOptions]
    }
    
    @scala.inline
    implicit class LoaderOptionsMutableBuilder[Self <: LoaderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowTsInNodeModules(value: Boolean): Self = StObject.set(x, "allowTsInNodeModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendTsSuffixTo(value: js.Array[RegExp]): Self = StObject.set(x, "appendTsSuffixTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendTsSuffixToVarargs(value: RegExp*): Self = StObject.set(x, "appendTsSuffixTo", js.Array(value :_*))
      
      @scala.inline
      def setAppendTsxSuffixTo(value: js.Array[RegExp]): Self = StObject.set(x, "appendTsxSuffixTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendTsxSuffixToVarargs(value: RegExp*): Self = StObject.set(x, "appendTsxSuffixTo", js.Array(value :_*))
      
      @scala.inline
      def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompiler(value: String): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorFormatter(value: (ErrorInfo, Chalk) => String): Self = StObject.set(x, "errorFormatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExperimentalFileCaching(value: Boolean): Self = StObject.set(x, "experimentalFileCaching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExperimentalWatchApi(value: Boolean): Self = StObject.set(x, "experimentalWatchApi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetCustomTransformers(value: String | (js.Function1[/* program */ Program, js.UndefOr[CustomTransformers]])): Self = StObject.set(x, "getCustomTransformers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetCustomTransformersFunction1(value: /* program */ Program => js.UndefOr[CustomTransformers]): Self = StObject.set(x, "getCustomTransformers", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHappyPackMode(value: Boolean): Self = StObject.set(x, "happyPackMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDiagnostics(value: js.Array[Double]): Self = StObject.set(x, "ignoreDiagnostics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDiagnosticsVarargs(value: Double*): Self = StObject.set(x, "ignoreDiagnostics", js.Array(value :_*))
      
      @scala.inline
      def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogInfoToStdOut(value: Boolean): Self = StObject.set(x, "logInfoToStdOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyCompileBundledFiles(value: Boolean): Self = StObject.set(x, "onlyCompileBundledFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectReferences(value: Boolean): Self = StObject.set(x, "projectReferences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportFiles(value: js.Array[String]): Self = StObject.set(x, "reportFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportFilesVarargs(value: String*): Self = StObject.set(x, "reportFiles", js.Array(value :_*))
      
      @scala.inline
      def setResolveModuleName(
        value: (/* moduleName */ String, /* containingFile */ String, /* compilerOptions */ CompilerOptions, /* moduleResolutionHost */ ModuleResolutionHost, /* parentResolver */ ResolveModuleName) => ResolvedModuleWithFailedLookupLocations
      ): Self = StObject.set(x, "resolveModuleName", js.Any.fromFunction5(value))
      
      @scala.inline
      def setResolveTypeReferenceDirective(
        value: (/* typeDirectiveName */ String, /* containingFile */ String, /* compilerOptions */ CompilerOptions, /* moduleResolutionHost */ ModuleResolutionHost, /* parentResolver */ FnCall) => ResolvedTypeReferenceDirectiveWithFailedLookupLocations
      ): Self = StObject.set(x, "resolveTypeReferenceDirective", js.Any.fromFunction5(value))
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranspileOnly(value: Boolean): Self = StObject.set(x, "transpileOnly", value.asInstanceOf[js.Any])
    }
  }
  
  type LoaderOptionsCache = StringDictionary[WeakMap[LoaderOptions, LoaderOptions]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsLoader.tsLoaderStrings.INFO
    - typings.tsLoader.tsLoaderStrings.WARN
    - typings.tsLoader.tsLoaderStrings.ERROR
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    @scala.inline
    def ERROR: typings.tsLoader.tsLoaderStrings.ERROR = "ERROR".asInstanceOf[typings.tsLoader.tsLoaderStrings.ERROR]
    
    @scala.inline
    def INFO: typings.tsLoader.tsLoaderStrings.INFO = "INFO".asInstanceOf[typings.tsLoader.tsLoaderStrings.INFO]
    
    @scala.inline
    def WARN: typings.tsLoader.tsLoaderStrings.WARN = "WARN".asInstanceOf[typings.tsLoader.tsLoaderStrings.WARN]
  }
  
  type ResolveModuleName = js.Function4[
    /* moduleName */ String, 
    /* containingFile */ String, 
    /* compilerOptions */ CompilerOptions, 
    /* moduleResolutionHost */ ModuleResolutionHost, 
    ResolvedModuleWithFailedLookupLocations
  ]
  
  type ResolveSync = js.Function3[/* context */ js.UndefOr[String], /* path */ String, /* moduleName */ String, String]
  
  trait ResolvedModule extends StObject {
    
    var isExternalLibraryImport: js.UndefOr[Boolean] = js.undefined
    
    var originalFileName: String
    
    var resolvedFileName: String
    
    var resolvedModule: js.UndefOr[ResolvedModule] = js.undefined
  }
  object ResolvedModule {
    
    @scala.inline
    def apply(originalFileName: String, resolvedFileName: String): ResolvedModule = {
      val __obj = js.Dynamic.literal(originalFileName = originalFileName.asInstanceOf[js.Any], resolvedFileName = resolvedFileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedModule]
    }
    
    @scala.inline
    implicit class ResolvedModuleMutableBuilder[Self <: ResolvedModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsExternalLibraryImport(value: Boolean): Self = StObject.set(x, "isExternalLibraryImport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExternalLibraryImportUndefined: Self = StObject.set(x, "isExternalLibraryImport", js.undefined)
      
      @scala.inline
      def setOriginalFileName(value: String): Self = StObject.set(x, "originalFileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolvedFileName(value: String): Self = StObject.set(x, "resolvedFileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolvedModule(value: ResolvedModule): Self = StObject.set(x, "resolvedModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolvedModuleUndefined: Self = StObject.set(x, "resolvedModule", js.undefined)
    }
  }
  
  type ReverseDependencyGraph = StringDictionary[js.UndefOr[StringDictionary[Boolean]]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsLoader.tsLoaderStrings.error_
    - typings.tsLoader.tsLoaderStrings.warning
  */
  trait Severity extends StObject
  object Severity {
    
    @scala.inline
    def error: error_ = "error".asInstanceOf[error_]
    
    @scala.inline
    def warning: typings.tsLoader.tsLoaderStrings.warning = "warning".asInstanceOf[typings.tsLoader.tsLoaderStrings.warning]
  }
  
  @js.native
  trait SolutionBuilderWithWatchHost
    extends StObject
       with typings.typescript.mod.SolutionBuilderWithWatchHost[EmitAndSemanticDiagnosticsBuilderProgram]
       with WatchFactory {
    
    var diagnostics: SolutionDiagnostics = js.native
    
    /** Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added */
    /* InferMemberOverrides */
    override def watchDirectory(path: String, callback: DirectoryWatcherCallback): FileWatcher = js.native
    /* InferMemberOverrides */
    override def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Boolean): FileWatcher = js.native
    /* InferMemberOverrides */
    override def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Boolean, options: CompilerOptions): FileWatcher = js.native
    /* InferMemberOverrides */
    override def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Unit, options: CompilerOptions): FileWatcher = js.native
    
    /** Used to watch changes in source files, missing files needed to update the program or config file */
    /* InferMemberOverrides */
    override def watchFile(path: String, callback: FileWatcherCallback): FileWatcher = js.native
    /* InferMemberOverrides */
    override def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Double): FileWatcher = js.native
    /* InferMemberOverrides */
    override def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Double, options: CompilerOptions): FileWatcher = js.native
    /* InferMemberOverrides */
    override def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Unit, options: CompilerOptions): FileWatcher = js.native
  }
  
  trait SolutionDiagnostics extends StObject {
    
    var global: js.Array[Diagnostic]
    
    var perFile: Map[String, js.Array[Diagnostic]]
    
    var transpileErrors: js.Array[js.Tuple2[js.UndefOr[String], js.Array[Diagnostic]]]
  }
  object SolutionDiagnostics {
    
    @scala.inline
    def apply(
      global: js.Array[Diagnostic],
      perFile: Map[String, js.Array[Diagnostic]],
      transpileErrors: js.Array[js.Tuple2[js.UndefOr[String], js.Array[Diagnostic]]]
    ): SolutionDiagnostics = {
      val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any], perFile = perFile.asInstanceOf[js.Any], transpileErrors = transpileErrors.asInstanceOf[js.Any])
      __obj.asInstanceOf[SolutionDiagnostics]
    }
    
    @scala.inline
    implicit class SolutionDiagnosticsMutableBuilder[Self <: SolutionDiagnostics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobal(value: js.Array[Diagnostic]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalVarargs(value: Diagnostic*): Self = StObject.set(x, "global", js.Array(value :_*))
      
      @scala.inline
      def setPerFile(value: Map[String, js.Array[Diagnostic]]): Self = StObject.set(x, "perFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranspileErrors(value: js.Array[js.Tuple2[js.UndefOr[String], js.Array[Diagnostic]]]): Self = StObject.set(x, "transpileErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranspileErrorsVarargs(value: (js.Tuple2[js.UndefOr[String], js.Array[Diagnostic]])*): Self = StObject.set(x, "transpileErrors", js.Array(value :_*))
    }
  }
  
  trait TSFile extends StObject {
    
    var projectReference: js.UndefOr[OutputFileName] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var version: Double
  }
  object TSFile {
    
    @scala.inline
    def apply(version: Double): TSFile = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[TSFile]
    }
    
    @scala.inline
    implicit class TSFileMutableBuilder[Self <: TSFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProjectReference(value: OutputFileName): Self = StObject.set(x, "projectReference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectReferenceUndefined: Self = StObject.set(x, "projectReference", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type TSFiles = Map[String, TSFile]
  
  trait TSInstance extends StObject {
    
    /** Used for Vue for the most part */
    def appendTsTsxSuffixesIfRequired(filePath: String): String
    
    var builderProgram: js.UndefOr[EmitAndSemanticDiagnosticsBuilderProgram] = js.undefined
    
    var changedFilesList: js.UndefOr[Boolean] = js.undefined
    
    def colors(text: js.Any*): String
    /**
    		Use a template string.
    		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk`
    		CPU: {red ${cpu.totalPercent}%}
    		RAM: {green ${ram.used / ram.total * 100}%}
    		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
    		`);
    		```
    		@example
    		```
    		import chalk = require('chalk');
    		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
    		```
    		*/
    def colors(text: TemplateStringsArray, placeholders: js.Any*): String
    @JSName("colors")
    var colors_Original: Chalk
    
    var compiler: Typeoftypescript
    
    var compilerOptions: CompilerOptions
    
    var configFilePath: js.UndefOr[String] = js.undefined
    
    var dependencyGraph: DependencyGraph
    
    /**
      * a cache of all the files
      */
    var files: TSFiles
    
    var filesWithErrors: js.UndefOr[TSFiles] = js.undefined
    
    var hasUnaccountedModifiedFiles: js.UndefOr[Boolean] = js.undefined
    
    var languageService: js.UndefOr[LanguageService | Null] = js.undefined
    
    var loaderOptions: LoaderOptions
    
    /**
      * contains the modified files - cleared each time after-compile is called
      */
    var modifiedFiles: js.UndefOr[TSFiles] = js.undefined
    
    var otherFiles: TSFiles
    
    var program: js.UndefOr[Program] = js.undefined
    
    /**
      * Paths to project references that are missing source maps.
      * Cleared each time after-compile is called. Used to dedupe
      * warnings about source maps during a single compilation.
      */
    var projectsMissingSourceMaps: js.UndefOr[Set[String]] = js.undefined
    
    var reverseDependencyGraph: ReverseDependencyGraph
    
    var rootFileNames: Set[String]
    
    var solutionBuilder: js.UndefOr[SolutionBuilder[EmitAndSemanticDiagnosticsBuilderProgram]] = js.undefined
    
    var solutionBuilderHost: js.UndefOr[SolutionBuilderWithWatchHost] = js.undefined
    
    var transformers: CustomTransformers
    
    var version: js.UndefOr[Double] = js.undefined
    
    var watchHost: js.UndefOr[WatchHost] = js.undefined
    
    var watchOfFilesAndCompilerOptions: js.UndefOr[WatchOfFilesAndCompilerOptions[EmitAndSemanticDiagnosticsBuilderProgram]] = js.undefined
  }
  object TSInstance {
    
    @scala.inline
    def apply(
      appendTsTsxSuffixesIfRequired: String => String,
      colors: Chalk,
      compiler: Typeoftypescript,
      compilerOptions: CompilerOptions,
      dependencyGraph: DependencyGraph,
      files: TSFiles,
      loaderOptions: LoaderOptions,
      otherFiles: TSFiles,
      reverseDependencyGraph: ReverseDependencyGraph,
      rootFileNames: Set[String],
      transformers: CustomTransformers
    ): TSInstance = {
      val __obj = js.Dynamic.literal(appendTsTsxSuffixesIfRequired = js.Any.fromFunction1(appendTsTsxSuffixesIfRequired), colors = colors.asInstanceOf[js.Any], compiler = compiler.asInstanceOf[js.Any], compilerOptions = compilerOptions.asInstanceOf[js.Any], dependencyGraph = dependencyGraph.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], loaderOptions = loaderOptions.asInstanceOf[js.Any], otherFiles = otherFiles.asInstanceOf[js.Any], reverseDependencyGraph = reverseDependencyGraph.asInstanceOf[js.Any], rootFileNames = rootFileNames.asInstanceOf[js.Any], transformers = transformers.asInstanceOf[js.Any])
      __obj.asInstanceOf[TSInstance]
    }
    
    @scala.inline
    implicit class TSInstanceMutableBuilder[Self <: TSInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendTsTsxSuffixesIfRequired(value: String => String): Self = StObject.set(x, "appendTsTsxSuffixesIfRequired", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBuilderProgram(value: EmitAndSemanticDiagnosticsBuilderProgram): Self = StObject.set(x, "builderProgram", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuilderProgramUndefined: Self = StObject.set(x, "builderProgram", js.undefined)
      
      @scala.inline
      def setChangedFilesList(value: Boolean): Self = StObject.set(x, "changedFilesList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangedFilesListUndefined: Self = StObject.set(x, "changedFilesList", js.undefined)
      
      @scala.inline
      def setColors(value: Chalk): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompiler(value: Typeoftypescript): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigFilePath(value: String): Self = StObject.set(x, "configFilePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigFilePathUndefined: Self = StObject.set(x, "configFilePath", js.undefined)
      
      @scala.inline
      def setDependencyGraph(value: DependencyGraph): Self = StObject.set(x, "dependencyGraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiles(value: TSFiles): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesWithErrors(value: TSFiles): Self = StObject.set(x, "filesWithErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesWithErrorsUndefined: Self = StObject.set(x, "filesWithErrors", js.undefined)
      
      @scala.inline
      def setHasUnaccountedModifiedFiles(value: Boolean): Self = StObject.set(x, "hasUnaccountedModifiedFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasUnaccountedModifiedFilesUndefined: Self = StObject.set(x, "hasUnaccountedModifiedFiles", js.undefined)
      
      @scala.inline
      def setLanguageService(value: LanguageService): Self = StObject.set(x, "languageService", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageServiceNull: Self = StObject.set(x, "languageService", null)
      
      @scala.inline
      def setLanguageServiceUndefined: Self = StObject.set(x, "languageService", js.undefined)
      
      @scala.inline
      def setLoaderOptions(value: LoaderOptions): Self = StObject.set(x, "loaderOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiedFiles(value: TSFiles): Self = StObject.set(x, "modifiedFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiedFilesUndefined: Self = StObject.set(x, "modifiedFiles", js.undefined)
      
      @scala.inline
      def setOtherFiles(value: TSFiles): Self = StObject.set(x, "otherFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgram(value: Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
      
      @scala.inline
      def setProjectsMissingSourceMaps(value: Set[String]): Self = StObject.set(x, "projectsMissingSourceMaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectsMissingSourceMapsUndefined: Self = StObject.set(x, "projectsMissingSourceMaps", js.undefined)
      
      @scala.inline
      def setReverseDependencyGraph(value: ReverseDependencyGraph): Self = StObject.set(x, "reverseDependencyGraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootFileNames(value: Set[String]): Self = StObject.set(x, "rootFileNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolutionBuilder(value: SolutionBuilder[EmitAndSemanticDiagnosticsBuilderProgram]): Self = StObject.set(x, "solutionBuilder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolutionBuilderHost(value: SolutionBuilderWithWatchHost): Self = StObject.set(x, "solutionBuilderHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolutionBuilderHostUndefined: Self = StObject.set(x, "solutionBuilderHost", js.undefined)
      
      @scala.inline
      def setSolutionBuilderUndefined: Self = StObject.set(x, "solutionBuilder", js.undefined)
      
      @scala.inline
      def setTransformers(value: CustomTransformers): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setWatchHost(value: WatchHost): Self = StObject.set(x, "watchHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchHostUndefined: Self = StObject.set(x, "watchHost", js.undefined)
      
      @scala.inline
      def setWatchOfFilesAndCompilerOptions(value: WatchOfFilesAndCompilerOptions[EmitAndSemanticDiagnosticsBuilderProgram]): Self = StObject.set(x, "watchOfFilesAndCompilerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchOfFilesAndCompilerOptionsUndefined: Self = StObject.set(x, "watchOfFilesAndCompilerOptions", js.undefined)
    }
  }
  
  type TSInstances = StringDictionary[TSInstance]
  
  type WatchCallbacks[T] = Map[String, js.Array[T]]
  
  @js.native
  trait WatchFactory extends StObject {
    
    def invokeDirectoryWatcher(directory: String, fileAddedOrRemoved: String): Unit = js.native
    
    def invokeFileWatcher(fileName: String, eventKind: FileWatcherEventKind): Unit = js.native
    
    /** Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added */
    def watchDirectory(path: String, callback: DirectoryWatcherCallback): FileWatcher = js.native
    def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Boolean): FileWatcher = js.native
    def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Boolean, options: CompilerOptions): FileWatcher = js.native
    def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Unit, options: CompilerOptions): FileWatcher = js.native
    
    /** Used to watch changes in source files, missing files needed to update the program or config file */
    def watchFile(path: String, callback: FileWatcherCallback): FileWatcher = js.native
    def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Double): FileWatcher = js.native
    def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Double, options: CompilerOptions): FileWatcher = js.native
    def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Unit, options: CompilerOptions): FileWatcher = js.native
    
    var watchedDirectories: WatchCallbacks[DirectoryWatcherCallback] = js.native
    
    var watchedDirectoriesRecursive: WatchCallbacks[DirectoryWatcherCallback] = js.native
    
    var watchedFiles: WatchCallbacks[FileWatcherCallback] = js.native
  }
  
  @js.native
  trait WatchHost
    extends StObject
       with WatchCompilerHostOfFilesAndCompilerOptions[EmitAndSemanticDiagnosticsBuilderProgram] {
    
    def invokeDirectoryWatcher(directory: String, fileAddedOrRemoved: String): Unit = js.native
    
    def invokeFileWatcher(fileName: String, eventKind: FileWatcherEventKind): Unit = js.native
    
    var outputFiles: Map[String, js.Array[OutputFile]] = js.native
    
    var tsbuildinfo: js.UndefOr[OutputFile] = js.native
    
    def updateRootFileNames(): Unit = js.native
  }
  
  trait WebpackError extends StObject {
    
    var file: js.UndefOr[String] = js.undefined
    
    var loaderSource: String
    
    var location: js.UndefOr[FileLocation] = js.undefined
    
    var message: String
    
    var module: js.UndefOr[js.Any] = js.undefined
  }
  object WebpackError {
    
    @scala.inline
    def apply(loaderSource: String, message: String): WebpackError = {
      val __obj = js.Dynamic.literal(loaderSource = loaderSource.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebpackError]
    }
    
    @scala.inline
    implicit class WebpackErrorMutableBuilder[Self <: WebpackError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setLoaderSource(value: String): Self = StObject.set(x, "loaderSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: FileLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModule(value: js.Any): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    }
  }
  
  trait WebpackModule extends StObject {
    
    var buildMeta: TsLoaderDefinitionFileVersions
    
    var errors: js.Array[WebpackError]
    
    var resource: String
  }
  object WebpackModule {
    
    @scala.inline
    def apply(buildMeta: TsLoaderDefinitionFileVersions, errors: js.Array[WebpackError], resource: String): WebpackModule = {
      val __obj = js.Dynamic.literal(buildMeta = buildMeta.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebpackModule]
    }
    
    @scala.inline
    implicit class WebpackModuleMutableBuilder[Self <: WebpackModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuildMeta(value: TsLoaderDefinitionFileVersions): Self = StObject.set(x, "buildMeta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: js.Array[WebpackError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: WebpackError*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    }
  }
}
