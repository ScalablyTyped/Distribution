package typings.tsLoader.distInterfacesMod

import typings.chalk.mod.Chalk
import typings.tsLoader.anon.FnCallTypeReferenceDirectiveNameContainingFileOptionsHostRedirectedReferenceCacheResolutionMode
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.CustomTransformers
import typings.typescript.mod.ModuleResolutionHost
import typings.typescript.mod.Program
import typings.typescript.mod.ResolvedModuleWithFailedLookupLocations
import typings.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderOptions extends StObject {
  
  var allowTsInNodeModules: Boolean
  
  var appendTsSuffixTo: js.Array[js.RegExp | String]
  
  var appendTsxSuffixTo: js.Array[js.RegExp | String]
  
  var colors: Boolean
  
  var compiler: String
  
  var compilerOptions: CompilerOptions
  
  var configFile: String
  
  var context: String
  
  def errorFormatter(message: ErrorInfo, colors: Chalk): String
  
  var experimentalFileCaching: Boolean
  
  var experimentalWatchApi: Boolean
  
  var getCustomTransformers: String | (js.Function2[
    /* program */ Program, 
    /* getProgram */ js.Function0[Program], 
    js.UndefOr[CustomTransformers]
  ])
  
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
    parentResolver: FnCallTypeReferenceDirectiveNameContainingFileOptionsHostRedirectedReferenceCacheResolutionMode
  ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations
  @JSName("resolveTypeReferenceDirective")
  var resolveTypeReferenceDirective_Original: CustomResolveTypeReferenceDirective
  
  var silent: Boolean
  
  var transpileOnly: Boolean
  
  var useCaseSensitiveFileNames: js.UndefOr[Boolean] = js.undefined
}
object LoaderOptions {
  
  inline def apply(
    allowTsInNodeModules: Boolean,
    appendTsSuffixTo: js.Array[js.RegExp | String],
    appendTsxSuffixTo: js.Array[js.RegExp | String],
    colors: Boolean,
    compiler: String,
    compilerOptions: CompilerOptions,
    configFile: String,
    context: String,
    errorFormatter: (ErrorInfo, Chalk) => String,
    experimentalFileCaching: Boolean,
    experimentalWatchApi: Boolean,
    getCustomTransformers: String | (js.Function2[
      /* program */ Program, 
      /* getProgram */ js.Function0[Program], 
      js.UndefOr[CustomTransformers]
    ]),
    happyPackMode: Boolean,
    ignoreDiagnostics: js.Array[Double],
    instance: String,
    logInfoToStdOut: Boolean,
    logLevel: LogLevel,
    onlyCompileBundledFiles: Boolean,
    projectReferences: Boolean,
    reportFiles: js.Array[String],
    resolveModuleName: (/* moduleName */ String, /* containingFile */ String, /* compilerOptions */ CompilerOptions, /* moduleResolutionHost */ ModuleResolutionHost, /* parentResolver */ ResolveModuleName) => ResolvedModuleWithFailedLookupLocations,
    resolveTypeReferenceDirective: (/* typeDirectiveName */ String, /* containingFile */ String, /* compilerOptions */ CompilerOptions, /* moduleResolutionHost */ ModuleResolutionHost, /* parentResolver */ FnCallTypeReferenceDirectiveNameContainingFileOptionsHostRedirectedReferenceCacheResolutionMode) => ResolvedTypeReferenceDirectiveWithFailedLookupLocations,
    silent: Boolean,
    transpileOnly: Boolean
  ): LoaderOptions = {
    val __obj = js.Dynamic.literal(allowTsInNodeModules = allowTsInNodeModules.asInstanceOf[js.Any], appendTsSuffixTo = appendTsSuffixTo.asInstanceOf[js.Any], appendTsxSuffixTo = appendTsxSuffixTo.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], compiler = compiler.asInstanceOf[js.Any], compilerOptions = compilerOptions.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], errorFormatter = js.Any.fromFunction2(errorFormatter), experimentalFileCaching = experimentalFileCaching.asInstanceOf[js.Any], experimentalWatchApi = experimentalWatchApi.asInstanceOf[js.Any], getCustomTransformers = getCustomTransformers.asInstanceOf[js.Any], happyPackMode = happyPackMode.asInstanceOf[js.Any], ignoreDiagnostics = ignoreDiagnostics.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], logInfoToStdOut = logInfoToStdOut.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], onlyCompileBundledFiles = onlyCompileBundledFiles.asInstanceOf[js.Any], projectReferences = projectReferences.asInstanceOf[js.Any], reportFiles = reportFiles.asInstanceOf[js.Any], resolveModuleName = js.Any.fromFunction5(resolveModuleName), resolveTypeReferenceDirective = js.Any.fromFunction5(resolveTypeReferenceDirective), silent = silent.asInstanceOf[js.Any], transpileOnly = transpileOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderOptions]
  }
  
  extension [Self <: LoaderOptions](x: Self) {
    
    inline def setAllowTsInNodeModules(value: Boolean): Self = StObject.set(x, "allowTsInNodeModules", value.asInstanceOf[js.Any])
    
    inline def setAppendTsSuffixTo(value: js.Array[js.RegExp | String]): Self = StObject.set(x, "appendTsSuffixTo", value.asInstanceOf[js.Any])
    
    inline def setAppendTsSuffixToVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "appendTsSuffixTo", js.Array(value*))
    
    inline def setAppendTsxSuffixTo(value: js.Array[js.RegExp | String]): Self = StObject.set(x, "appendTsxSuffixTo", value.asInstanceOf[js.Any])
    
    inline def setAppendTsxSuffixToVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "appendTsxSuffixTo", js.Array(value*))
    
    inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setCompiler(value: String): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setErrorFormatter(value: (ErrorInfo, Chalk) => String): Self = StObject.set(x, "errorFormatter", js.Any.fromFunction2(value))
    
    inline def setExperimentalFileCaching(value: Boolean): Self = StObject.set(x, "experimentalFileCaching", value.asInstanceOf[js.Any])
    
    inline def setExperimentalWatchApi(value: Boolean): Self = StObject.set(x, "experimentalWatchApi", value.asInstanceOf[js.Any])
    
    inline def setGetCustomTransformers(
      value: String | (js.Function2[
          /* program */ Program, 
          /* getProgram */ js.Function0[Program], 
          js.UndefOr[CustomTransformers]
        ])
    ): Self = StObject.set(x, "getCustomTransformers", value.asInstanceOf[js.Any])
    
    inline def setGetCustomTransformersFunction2(
      value: (/* program */ Program, /* getProgram */ js.Function0[Program]) => js.UndefOr[CustomTransformers]
    ): Self = StObject.set(x, "getCustomTransformers", js.Any.fromFunction2(value))
    
    inline def setHappyPackMode(value: Boolean): Self = StObject.set(x, "happyPackMode", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDiagnostics(value: js.Array[Double]): Self = StObject.set(x, "ignoreDiagnostics", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDiagnosticsVarargs(value: Double*): Self = StObject.set(x, "ignoreDiagnostics", js.Array(value*))
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setLogInfoToStdOut(value: Boolean): Self = StObject.set(x, "logInfoToStdOut", value.asInstanceOf[js.Any])
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setOnlyCompileBundledFiles(value: Boolean): Self = StObject.set(x, "onlyCompileBundledFiles", value.asInstanceOf[js.Any])
    
    inline def setProjectReferences(value: Boolean): Self = StObject.set(x, "projectReferences", value.asInstanceOf[js.Any])
    
    inline def setReportFiles(value: js.Array[String]): Self = StObject.set(x, "reportFiles", value.asInstanceOf[js.Any])
    
    inline def setReportFilesVarargs(value: String*): Self = StObject.set(x, "reportFiles", js.Array(value*))
    
    inline def setResolveModuleName(
      value: (/* moduleName */ String, /* containingFile */ String, /* compilerOptions */ CompilerOptions, /* moduleResolutionHost */ ModuleResolutionHost, /* parentResolver */ ResolveModuleName) => ResolvedModuleWithFailedLookupLocations
    ): Self = StObject.set(x, "resolveModuleName", js.Any.fromFunction5(value))
    
    inline def setResolveTypeReferenceDirective(
      value: (/* typeDirectiveName */ String, /* containingFile */ String, /* compilerOptions */ CompilerOptions, /* moduleResolutionHost */ ModuleResolutionHost, /* parentResolver */ FnCallTypeReferenceDirectiveNameContainingFileOptionsHostRedirectedReferenceCacheResolutionMode) => ResolvedTypeReferenceDirectiveWithFailedLookupLocations
    ): Self = StObject.set(x, "resolveTypeReferenceDirective", js.Any.fromFunction5(value))
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setTranspileOnly(value: Boolean): Self = StObject.set(x, "transpileOnly", value.asInstanceOf[js.Any])
    
    inline def setUseCaseSensitiveFileNames(value: Boolean): Self = StObject.set(x, "useCaseSensitiveFileNames", value.asInstanceOf[js.Any])
    
    inline def setUseCaseSensitiveFileNamesUndefined: Self = StObject.set(x, "useCaseSensitiveFileNames", js.undefined)
  }
}
