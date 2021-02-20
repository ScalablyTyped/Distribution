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
import scala.scalajs.js.`|`
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
  
  @js.native
  trait ErrorInfo extends StObject {
    
    var character: Double = js.native
    
    var code: Double = js.native
    
    var content: String = js.native
    
    var context: String = js.native
    
    var file: String = js.native
    
    var line: Double = js.native
    
    var severity: Severity = js.native
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
  
  @js.native
  trait FileLocation extends StObject {
    
    var character: Double = js.native
    
    var line: Double = js.native
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
  
  @js.native
  trait LoaderOptions extends StObject {
    
    var allowTsInNodeModules: Boolean = js.native
    
    var appendTsSuffixTo: js.Array[RegExp] = js.native
    
    var appendTsxSuffixTo: js.Array[RegExp] = js.native
    
    var colors: Boolean = js.native
    
    var compiler: String = js.native
    
    var compilerOptions: CompilerOptions = js.native
    
    var configFile: String = js.native
    
    var context: String = js.native
    
    def errorFormatter(message: ErrorInfo, colors: Chalk): String = js.native
    
    var experimentalFileCaching: Boolean = js.native
    
    var experimentalWatchApi: Boolean = js.native
    
    var getCustomTransformers: String | (js.Function1[/* program */ Program, js.UndefOr[CustomTransformers]]) = js.native
    
    var happyPackMode: Boolean = js.native
    
    var ignoreDiagnostics: js.Array[Double] = js.native
    
    var instance: String = js.native
    
    var logInfoToStdOut: Boolean = js.native
    
    var logLevel: LogLevel = js.native
    
    var onlyCompileBundledFiles: Boolean = js.native
    
    var projectReferences: Boolean = js.native
    
    var reportFiles: js.Array[String] = js.native
    
    def resolveModuleName(
      moduleName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      moduleResolutionHost: ModuleResolutionHost,
      parentResolver: ResolveModuleName
    ): ResolvedModuleWithFailedLookupLocations = js.native
    @JSName("resolveModuleName")
    var resolveModuleName_Original: CustomResolveModuleName = js.native
    
    def resolveTypeReferenceDirective(
      typeDirectiveName: String,
      containingFile: String,
      compilerOptions: CompilerOptions,
      moduleResolutionHost: ModuleResolutionHost,
      parentResolver: FnCall
    ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
    @JSName("resolveTypeReferenceDirective")
    var resolveTypeReferenceDirective_Original: CustomResolveTypeReferenceDirective = js.native
    
    var silent: Boolean = js.native
    
    var transpileOnly: Boolean = js.native
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
  
  @js.native
  trait ResolvedModule extends StObject {
    
    var isExternalLibraryImport: js.UndefOr[Boolean] = js.native
    
    var originalFileName: String = js.native
    
    var resolvedFileName: String = js.native
    
    var resolvedModule: js.UndefOr[ResolvedModule] = js.native
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
    extends typings.typescript.mod.SolutionBuilderWithWatchHost[EmitAndSemanticDiagnosticsBuilderProgram]
       with WatchFactory {
    
    var diagnostics: SolutionDiagnostics = js.native
    
    /** Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added */
    /* InferMemberOverrides */
    override def watchDirectory(path: String, callback: DirectoryWatcherCallback): FileWatcher = js.native
    /* InferMemberOverrides */
    override def watchDirectory(
      path: String,
      callback: DirectoryWatcherCallback,
      recursive: js.UndefOr[scala.Nothing],
      options: CompilerOptions
    ): FileWatcher = js.native
    /* InferMemberOverrides */
    override def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Boolean): FileWatcher = js.native
    /* InferMemberOverrides */
    override def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Boolean, options: CompilerOptions): FileWatcher = js.native
    
    /** Used to watch changes in source files, missing files needed to update the program or config file */
    /* InferMemberOverrides */
    override def watchFile(path: String, callback: FileWatcherCallback): FileWatcher = js.native
    /* InferMemberOverrides */
    override def watchFile(
      path: String,
      callback: FileWatcherCallback,
      pollingInterval: js.UndefOr[scala.Nothing],
      options: CompilerOptions
    ): FileWatcher = js.native
    /* InferMemberOverrides */
    override def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Double): FileWatcher = js.native
    /* InferMemberOverrides */
    override def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Double, options: CompilerOptions): FileWatcher = js.native
  }
  
  @js.native
  trait SolutionDiagnostics extends StObject {
    
    var global: js.Array[Diagnostic] = js.native
    
    var perFile: Map[String, js.Array[Diagnostic]] = js.native
    
    var transpileErrors: js.Array[js.Tuple2[js.UndefOr[String], js.Array[Diagnostic]]] = js.native
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
  
  @js.native
  trait TSFile extends StObject {
    
    var projectReference: js.UndefOr[OutputFileName] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var version: Double = js.native
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
  
  @js.native
  trait TSInstance extends StObject {
    
    /** Used for Vue for the most part */
    def appendTsTsxSuffixesIfRequired(filePath: String): String = js.native
    
    var builderProgram: js.UndefOr[EmitAndSemanticDiagnosticsBuilderProgram] = js.native
    
    var changedFilesList: js.UndefOr[Boolean] = js.native
    
    def colors(text: js.Any*): String = js.native
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
    def colors(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
    @JSName("colors")
    var colors_Original: Chalk = js.native
    
    var compiler: Typeoftypescript = js.native
    
    var compilerOptions: CompilerOptions = js.native
    
    var configFilePath: js.UndefOr[String] = js.native
    
    var dependencyGraph: DependencyGraph = js.native
    
    /**
      * a cache of all the files
      */
    var files: TSFiles = js.native
    
    var filesWithErrors: js.UndefOr[TSFiles] = js.native
    
    var hasUnaccountedModifiedFiles: js.UndefOr[Boolean] = js.native
    
    var languageService: js.UndefOr[LanguageService | Null] = js.native
    
    var loaderOptions: LoaderOptions = js.native
    
    /**
      * contains the modified files - cleared each time after-compile is called
      */
    var modifiedFiles: js.UndefOr[TSFiles] = js.native
    
    var otherFiles: TSFiles = js.native
    
    var program: js.UndefOr[Program] = js.native
    
    /**
      * Paths to project references that are missing source maps.
      * Cleared each time after-compile is called. Used to dedupe
      * warnings about source maps during a single compilation.
      */
    var projectsMissingSourceMaps: js.UndefOr[Set[String]] = js.native
    
    var reverseDependencyGraph: ReverseDependencyGraph = js.native
    
    var rootFileNames: Set[String] = js.native
    
    var solutionBuilder: js.UndefOr[SolutionBuilder[EmitAndSemanticDiagnosticsBuilderProgram]] = js.native
    
    var solutionBuilderHost: js.UndefOr[SolutionBuilderWithWatchHost] = js.native
    
    var transformers: CustomTransformers = js.native
    
    var version: js.UndefOr[Double] = js.native
    
    var watchHost: js.UndefOr[WatchHost] = js.native
    
    var watchOfFilesAndCompilerOptions: js.UndefOr[WatchOfFilesAndCompilerOptions[EmitAndSemanticDiagnosticsBuilderProgram]] = js.native
  }
  
  type TSInstances = StringDictionary[TSInstance]
  
  type WatchCallbacks[T] = Map[String, js.Array[T]]
  
  @js.native
  trait WatchFactory extends StObject {
    
    def invokeDirectoryWatcher(directory: String, fileAddedOrRemoved: String): Unit = js.native
    
    def invokeFileWatcher(fileName: String, eventKind: FileWatcherEventKind): Unit = js.native
    
    /** Used to watch resolved module's failed lookup locations, config file specs, type roots where auto type reference directives are added */
    def watchDirectory(path: String, callback: DirectoryWatcherCallback): FileWatcher = js.native
    def watchDirectory(
      path: String,
      callback: DirectoryWatcherCallback,
      recursive: js.UndefOr[scala.Nothing],
      options: CompilerOptions
    ): FileWatcher = js.native
    def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Boolean): FileWatcher = js.native
    def watchDirectory(path: String, callback: DirectoryWatcherCallback, recursive: Boolean, options: CompilerOptions): FileWatcher = js.native
    
    /** Used to watch changes in source files, missing files needed to update the program or config file */
    def watchFile(path: String, callback: FileWatcherCallback): FileWatcher = js.native
    def watchFile(
      path: String,
      callback: FileWatcherCallback,
      pollingInterval: js.UndefOr[scala.Nothing],
      options: CompilerOptions
    ): FileWatcher = js.native
    def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Double): FileWatcher = js.native
    def watchFile(path: String, callback: FileWatcherCallback, pollingInterval: Double, options: CompilerOptions): FileWatcher = js.native
    
    var watchedDirectories: WatchCallbacks[DirectoryWatcherCallback] = js.native
    
    var watchedDirectoriesRecursive: WatchCallbacks[DirectoryWatcherCallback] = js.native
    
    var watchedFiles: WatchCallbacks[FileWatcherCallback] = js.native
  }
  
  @js.native
  trait WatchHost extends WatchCompilerHostOfFilesAndCompilerOptions[EmitAndSemanticDiagnosticsBuilderProgram] {
    
    def invokeDirectoryWatcher(directory: String, fileAddedOrRemoved: String): Unit = js.native
    
    def invokeFileWatcher(fileName: String, eventKind: FileWatcherEventKind): Unit = js.native
    
    var outputFiles: Map[String, js.Array[OutputFile]] = js.native
    
    var tsbuildinfo: js.UndefOr[OutputFile] = js.native
    
    def updateRootFileNames(): Unit = js.native
  }
  
  @js.native
  trait WebpackError extends StObject {
    
    var file: js.UndefOr[String] = js.native
    
    var loaderSource: String = js.native
    
    var location: js.UndefOr[FileLocation] = js.native
    
    var message: String = js.native
    
    var module: js.UndefOr[js.Any] = js.native
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
  
  @js.native
  trait WebpackModule extends StObject {
    
    var buildMeta: TsLoaderDefinitionFileVersions = js.native
    
    var errors: js.Array[WebpackError] = js.native
    
    var resource: String = js.native
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
