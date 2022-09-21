package typings.tsLoader.interfacesMod

import typings.chalk.mod.Chalk
import typings.std.Map
import typings.std.Set
import typings.tsLoader.anon.Typeoftypescript
import typings.tsLoader.loggerMod.Logger
import typings.tsLoader.tsLoaderBooleans.`true`
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.CustomTransformers
import typings.typescript.mod.EmitAndSemanticDiagnosticsBuilderProgram
import typings.typescript.mod.LanguageService
import typings.typescript.mod.ParsedCommandLine
import typings.typescript.mod.Program
import typings.typescript.mod.TypeReferenceDirectiveResolutionCache
import typings.typescript.mod.WatchOfFilesAndCompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSInstance extends StObject {
  
  /** Used for Vue for the most part */
  def appendTsTsxSuffixesIfRequired(filePath: String): String
  
  var builderProgram: js.UndefOr[EmitAndSemanticDiagnosticsBuilderProgram] = js.undefined
  
  var changedFilesList: js.UndefOr[Boolean] = js.undefined
  
  var colors: Chalk
  
  var compiler: Typeoftypescript
  
  var compilerOptions: CompilerOptions
  
  var configFilePath: js.UndefOr[String] = js.undefined
  
  var configParseResult: ParsedCommandLine
  
  var dependencyGraph: DependencyGraph
  
  def filePathKeyMapper(fileName: String): FilePathKey
  
  /**
    * a cache of all the files
    */
  var files: TSFiles
  
  var filesWithErrors: js.UndefOr[TSFiles] = js.undefined
  
  var hasUnaccountedModifiedFiles: js.UndefOr[Boolean] = js.undefined
  
  var initialSetupPending: Boolean
  
  var languageService: js.UndefOr[LanguageService | Null] = js.undefined
  
  var loaderOptions: LoaderOptions
  
  var log: Logger
  
  /**
    * contains the modified files - cleared each time after-compile is called
    */
  var modifiedFiles: js.UndefOr[Map[FilePathKey, `true`]] = js.undefined
  
  var moduleResolutionCache: js.UndefOr[ModuleResolutionCache] = js.undefined
  
  var otherFiles: TSFiles
  
  var program: js.UndefOr[Program] = js.undefined
  
  /**
    * Paths to project references that are missing source maps.
    * Cleared each time after-compile is called. Used to dedupe
    * warnings about source maps during a single compilation.
    */
  var projectsMissingSourceMaps: js.UndefOr[Set[String]] = js.undefined
  
  var reportTranspileErrors: js.UndefOr[Boolean] = js.undefined
  
  var rootFileNames: Set[String]
  
  var servicesHost: js.UndefOr[ServiceHostWhichMayBeCacheable] = js.undefined
  
  var solutionBuilderHost: js.UndefOr[SolutionBuilderWithWatchHost] = js.undefined
  
  var transformers: CustomTransformers
  
  var typeReferenceResolutionCache: js.UndefOr[TypeReferenceDirectiveResolutionCache] = js.undefined
  
  var version: Double
  
  var watchHost: js.UndefOr[WatchHost] = js.undefined
  
  var watchOfFilesAndCompilerOptions: js.UndefOr[WatchOfFilesAndCompilerOptions[EmitAndSemanticDiagnosticsBuilderProgram]] = js.undefined
}
object TSInstance {
  
  inline def apply(
    appendTsTsxSuffixesIfRequired: String => String,
    colors: Chalk,
    compiler: Typeoftypescript,
    compilerOptions: CompilerOptions,
    configParseResult: ParsedCommandLine,
    dependencyGraph: DependencyGraph,
    filePathKeyMapper: String => FilePathKey,
    files: TSFiles,
    initialSetupPending: Boolean,
    loaderOptions: LoaderOptions,
    log: Logger,
    otherFiles: TSFiles,
    rootFileNames: Set[String],
    transformers: CustomTransformers,
    version: Double
  ): TSInstance = {
    val __obj = js.Dynamic.literal(appendTsTsxSuffixesIfRequired = js.Any.fromFunction1(appendTsTsxSuffixesIfRequired), colors = colors.asInstanceOf[js.Any], compiler = compiler.asInstanceOf[js.Any], compilerOptions = compilerOptions.asInstanceOf[js.Any], configParseResult = configParseResult.asInstanceOf[js.Any], dependencyGraph = dependencyGraph.asInstanceOf[js.Any], filePathKeyMapper = js.Any.fromFunction1(filePathKeyMapper), files = files.asInstanceOf[js.Any], initialSetupPending = initialSetupPending.asInstanceOf[js.Any], loaderOptions = loaderOptions.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], otherFiles = otherFiles.asInstanceOf[js.Any], rootFileNames = rootFileNames.asInstanceOf[js.Any], transformers = transformers.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSInstance]
  }
  
  extension [Self <: TSInstance](x: Self) {
    
    inline def setAppendTsTsxSuffixesIfRequired(value: String => String): Self = StObject.set(x, "appendTsTsxSuffixesIfRequired", js.Any.fromFunction1(value))
    
    inline def setBuilderProgram(value: EmitAndSemanticDiagnosticsBuilderProgram): Self = StObject.set(x, "builderProgram", value.asInstanceOf[js.Any])
    
    inline def setBuilderProgramUndefined: Self = StObject.set(x, "builderProgram", js.undefined)
    
    inline def setChangedFilesList(value: Boolean): Self = StObject.set(x, "changedFilesList", value.asInstanceOf[js.Any])
    
    inline def setChangedFilesListUndefined: Self = StObject.set(x, "changedFilesList", js.undefined)
    
    inline def setColors(value: Chalk): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setCompiler(value: Typeoftypescript): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    inline def setConfigFilePath(value: String): Self = StObject.set(x, "configFilePath", value.asInstanceOf[js.Any])
    
    inline def setConfigFilePathUndefined: Self = StObject.set(x, "configFilePath", js.undefined)
    
    inline def setConfigParseResult(value: ParsedCommandLine): Self = StObject.set(x, "configParseResult", value.asInstanceOf[js.Any])
    
    inline def setDependencyGraph(value: DependencyGraph): Self = StObject.set(x, "dependencyGraph", value.asInstanceOf[js.Any])
    
    inline def setFilePathKeyMapper(value: String => FilePathKey): Self = StObject.set(x, "filePathKeyMapper", js.Any.fromFunction1(value))
    
    inline def setFiles(value: TSFiles): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesWithErrors(value: TSFiles): Self = StObject.set(x, "filesWithErrors", value.asInstanceOf[js.Any])
    
    inline def setFilesWithErrorsUndefined: Self = StObject.set(x, "filesWithErrors", js.undefined)
    
    inline def setHasUnaccountedModifiedFiles(value: Boolean): Self = StObject.set(x, "hasUnaccountedModifiedFiles", value.asInstanceOf[js.Any])
    
    inline def setHasUnaccountedModifiedFilesUndefined: Self = StObject.set(x, "hasUnaccountedModifiedFiles", js.undefined)
    
    inline def setInitialSetupPending(value: Boolean): Self = StObject.set(x, "initialSetupPending", value.asInstanceOf[js.Any])
    
    inline def setLanguageService(value: LanguageService): Self = StObject.set(x, "languageService", value.asInstanceOf[js.Any])
    
    inline def setLanguageServiceNull: Self = StObject.set(x, "languageService", null)
    
    inline def setLanguageServiceUndefined: Self = StObject.set(x, "languageService", js.undefined)
    
    inline def setLoaderOptions(value: LoaderOptions): Self = StObject.set(x, "loaderOptions", value.asInstanceOf[js.Any])
    
    inline def setLog(value: Logger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setModifiedFiles(value: Map[FilePathKey, `true`]): Self = StObject.set(x, "modifiedFiles", value.asInstanceOf[js.Any])
    
    inline def setModifiedFilesUndefined: Self = StObject.set(x, "modifiedFiles", js.undefined)
    
    inline def setModuleResolutionCache(value: ModuleResolutionCache): Self = StObject.set(x, "moduleResolutionCache", value.asInstanceOf[js.Any])
    
    inline def setModuleResolutionCacheUndefined: Self = StObject.set(x, "moduleResolutionCache", js.undefined)
    
    inline def setOtherFiles(value: TSFiles): Self = StObject.set(x, "otherFiles", value.asInstanceOf[js.Any])
    
    inline def setProgram(value: Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
    
    inline def setProjectsMissingSourceMaps(value: Set[String]): Self = StObject.set(x, "projectsMissingSourceMaps", value.asInstanceOf[js.Any])
    
    inline def setProjectsMissingSourceMapsUndefined: Self = StObject.set(x, "projectsMissingSourceMaps", js.undefined)
    
    inline def setReportTranspileErrors(value: Boolean): Self = StObject.set(x, "reportTranspileErrors", value.asInstanceOf[js.Any])
    
    inline def setReportTranspileErrorsUndefined: Self = StObject.set(x, "reportTranspileErrors", js.undefined)
    
    inline def setRootFileNames(value: Set[String]): Self = StObject.set(x, "rootFileNames", value.asInstanceOf[js.Any])
    
    inline def setServicesHost(value: ServiceHostWhichMayBeCacheable): Self = StObject.set(x, "servicesHost", value.asInstanceOf[js.Any])
    
    inline def setServicesHostUndefined: Self = StObject.set(x, "servicesHost", js.undefined)
    
    inline def setSolutionBuilderHost(value: SolutionBuilderWithWatchHost): Self = StObject.set(x, "solutionBuilderHost", value.asInstanceOf[js.Any])
    
    inline def setSolutionBuilderHostUndefined: Self = StObject.set(x, "solutionBuilderHost", js.undefined)
    
    inline def setTransformers(value: CustomTransformers): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
    
    inline def setTypeReferenceResolutionCache(value: TypeReferenceDirectiveResolutionCache): Self = StObject.set(x, "typeReferenceResolutionCache", value.asInstanceOf[js.Any])
    
    inline def setTypeReferenceResolutionCacheUndefined: Self = StObject.set(x, "typeReferenceResolutionCache", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setWatchHost(value: WatchHost): Self = StObject.set(x, "watchHost", value.asInstanceOf[js.Any])
    
    inline def setWatchHostUndefined: Self = StObject.set(x, "watchHost", js.undefined)
    
    inline def setWatchOfFilesAndCompilerOptions(value: WatchOfFilesAndCompilerOptions[EmitAndSemanticDiagnosticsBuilderProgram]): Self = StObject.set(x, "watchOfFilesAndCompilerOptions", value.asInstanceOf[js.Any])
    
    inline def setWatchOfFilesAndCompilerOptionsUndefined: Self = StObject.set(x, "watchOfFilesAndCompilerOptions", js.undefined)
  }
}
