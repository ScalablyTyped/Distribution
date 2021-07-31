package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageServiceHost
  extends StObject
     with GetEffectiveTypeRootsHost {
  
  var error: js.UndefOr[js.Function1[/* s */ java.lang.String, Unit]] = js.undefined
  
  var fileExists: js.UndefOr[js.Function1[/* path */ java.lang.String, Boolean]] = js.undefined
  
  var getCancellationToken: js.UndefOr[js.Function0[HostCancellationToken]] = js.undefined
  
  def getCompilationSettings(): CompilerOptions
  
  @JSName("getCurrentDirectory")
  def getCurrentDirectory_MLanguageServiceHost(): java.lang.String
  
  /**
    * Gets a set of custom transformers to use during emit.
    */
  var getCustomTransformers: js.UndefOr[js.Function0[js.UndefOr[CustomTransformers]]] = js.undefined
  
  def getDefaultLibFileName(options: CompilerOptions): java.lang.String
  
  var getDirectories: js.UndefOr[js.Function1[/* directoryName */ java.lang.String, js.Array[java.lang.String]]] = js.undefined
  
  var getLocalizedDiagnosticMessages: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var getNewLine: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  var getProjectReferences: js.UndefOr[js.Function0[js.UndefOr[js.Array[ProjectReference]]]] = js.undefined
  
  var getProjectVersion: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  var getResolvedModuleWithFailedLookupLocationsFromCache: js.UndefOr[
    js.Function2[
      /* modulename */ java.lang.String, 
      /* containingFile */ java.lang.String, 
      js.UndefOr[ResolvedModuleWithFailedLookupLocations]
    ]
  ] = js.undefined
  
  def getScriptFileNames(): js.Array[java.lang.String]
  
  var getScriptKind: js.UndefOr[js.Function1[/* fileName */ java.lang.String, ScriptKind]] = js.undefined
  
  def getScriptSnapshot(fileName: java.lang.String): js.UndefOr[IScriptSnapshot]
  
  def getScriptVersion(fileName: java.lang.String): java.lang.String
  
  var getTypeRootsVersion: js.UndefOr[js.Function0[Double]] = js.undefined
  
  var installPackage: js.UndefOr[
    js.Function1[/* options */ InstallPackageOptions, js.Promise[ApplyCodeActionCommandResult]]
  ] = js.undefined
  
  var isKnownTypesPackageName: js.UndefOr[js.Function1[/* name */ java.lang.String, Boolean]] = js.undefined
  
  var log: js.UndefOr[js.Function1[/* s */ java.lang.String, Unit]] = js.undefined
  
  var readDirectory: js.UndefOr[
    js.Function5[
      /* path */ java.lang.String, 
      /* extensions */ js.UndefOr[js.Array[java.lang.String]], 
      /* exclude */ js.UndefOr[js.Array[java.lang.String]], 
      /* include */ js.UndefOr[js.Array[java.lang.String]], 
      /* depth */ js.UndefOr[Double], 
      js.Array[java.lang.String]
    ]
  ] = js.undefined
  
  var readFile: js.UndefOr[
    js.Function2[
      /* path */ java.lang.String, 
      /* encoding */ js.UndefOr[java.lang.String], 
      js.UndefOr[java.lang.String]
    ]
  ] = js.undefined
  
  var realpath: js.UndefOr[js.Function1[/* path */ java.lang.String, java.lang.String]] = js.undefined
  
  var resolveModuleNames: js.UndefOr[
    js.Function5[
      /* moduleNames */ js.Array[java.lang.String], 
      /* containingFile */ java.lang.String, 
      /* reusedNames */ js.UndefOr[js.Array[java.lang.String]], 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      js.Array[js.UndefOr[ResolvedModule]]
    ]
  ] = js.undefined
  
  var resolveTypeReferenceDirectives: js.UndefOr[
    js.Function4[
      /* typeDirectiveNames */ js.Array[java.lang.String], 
      /* containingFile */ java.lang.String, 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
    ]
  ] = js.undefined
  
  var trace: js.UndefOr[js.Function1[/* s */ java.lang.String, Unit]] = js.undefined
  
  var useCaseSensitiveFileNames: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var writeFile: js.UndefOr[
    js.Function2[/* fileName */ java.lang.String, /* content */ java.lang.String, Unit]
  ] = js.undefined
}
object LanguageServiceHost {
  
  @scala.inline
  def apply(
    getCompilationSettings: () => CompilerOptions,
    getCurrentDirectory: () => java.lang.String,
    getDefaultLibFileName: CompilerOptions => java.lang.String,
    getScriptFileNames: () => js.Array[java.lang.String],
    getScriptSnapshot: java.lang.String => js.UndefOr[IScriptSnapshot],
    getScriptVersion: java.lang.String => java.lang.String
  ): LanguageServiceHost = {
    val __obj = js.Dynamic.literal(getCompilationSettings = js.Any.fromFunction0(getCompilationSettings), getCurrentDirectory = js.Any.fromFunction0(getCurrentDirectory), getDefaultLibFileName = js.Any.fromFunction1(getDefaultLibFileName), getScriptFileNames = js.Any.fromFunction0(getScriptFileNames), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), getScriptVersion = js.Any.fromFunction1(getScriptVersion))
    __obj.asInstanceOf[LanguageServiceHost]
  }
  
  @scala.inline
  implicit class LanguageServiceHostMutableBuilder[Self <: LanguageServiceHost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: /* s */ java.lang.String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFileExists(value: /* path */ java.lang.String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFileExistsUndefined: Self = StObject.set(x, "fileExists", js.undefined)
    
    @scala.inline
    def setGetCancellationToken(value: () => HostCancellationToken): Self = StObject.set(x, "getCancellationToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCancellationTokenUndefined: Self = StObject.set(x, "getCancellationToken", js.undefined)
    
    @scala.inline
    def setGetCompilationSettings(value: () => CompilerOptions): Self = StObject.set(x, "getCompilationSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentDirectory(value: () => java.lang.String): Self = StObject.set(x, "getCurrentDirectory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCustomTransformers(value: () => js.UndefOr[CustomTransformers]): Self = StObject.set(x, "getCustomTransformers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCustomTransformersUndefined: Self = StObject.set(x, "getCustomTransformers", js.undefined)
    
    @scala.inline
    def setGetDefaultLibFileName(value: CompilerOptions => java.lang.String): Self = StObject.set(x, "getDefaultLibFileName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDirectories(value: /* directoryName */ java.lang.String => js.Array[java.lang.String]): Self = StObject.set(x, "getDirectories", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDirectoriesUndefined: Self = StObject.set(x, "getDirectories", js.undefined)
    
    @scala.inline
    def setGetLocalizedDiagnosticMessages(value: () => js.Any): Self = StObject.set(x, "getLocalizedDiagnosticMessages", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLocalizedDiagnosticMessagesUndefined: Self = StObject.set(x, "getLocalizedDiagnosticMessages", js.undefined)
    
    @scala.inline
    def setGetNewLine(value: () => java.lang.String): Self = StObject.set(x, "getNewLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNewLineUndefined: Self = StObject.set(x, "getNewLine", js.undefined)
    
    @scala.inline
    def setGetProjectReferences(value: () => js.UndefOr[js.Array[ProjectReference]]): Self = StObject.set(x, "getProjectReferences", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProjectReferencesUndefined: Self = StObject.set(x, "getProjectReferences", js.undefined)
    
    @scala.inline
    def setGetProjectVersion(value: () => java.lang.String): Self = StObject.set(x, "getProjectVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProjectVersionUndefined: Self = StObject.set(x, "getProjectVersion", js.undefined)
    
    @scala.inline
    def setGetResolvedModuleWithFailedLookupLocationsFromCache(
      value: (/* modulename */ java.lang.String, /* containingFile */ java.lang.String) => js.UndefOr[ResolvedModuleWithFailedLookupLocations]
    ): Self = StObject.set(x, "getResolvedModuleWithFailedLookupLocationsFromCache", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetResolvedModuleWithFailedLookupLocationsFromCacheUndefined: Self = StObject.set(x, "getResolvedModuleWithFailedLookupLocationsFromCache", js.undefined)
    
    @scala.inline
    def setGetScriptFileNames(value: () => js.Array[java.lang.String]): Self = StObject.set(x, "getScriptFileNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScriptKind(value: /* fileName */ java.lang.String => ScriptKind): Self = StObject.set(x, "getScriptKind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetScriptKindUndefined: Self = StObject.set(x, "getScriptKind", js.undefined)
    
    @scala.inline
    def setGetScriptSnapshot(value: java.lang.String => js.UndefOr[IScriptSnapshot]): Self = StObject.set(x, "getScriptSnapshot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetScriptVersion(value: java.lang.String => java.lang.String): Self = StObject.set(x, "getScriptVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTypeRootsVersion(value: () => Double): Self = StObject.set(x, "getTypeRootsVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTypeRootsVersionUndefined: Self = StObject.set(x, "getTypeRootsVersion", js.undefined)
    
    @scala.inline
    def setInstallPackage(value: /* options */ InstallPackageOptions => js.Promise[ApplyCodeActionCommandResult]): Self = StObject.set(x, "installPackage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInstallPackageUndefined: Self = StObject.set(x, "installPackage", js.undefined)
    
    @scala.inline
    def setIsKnownTypesPackageName(value: /* name */ java.lang.String => Boolean): Self = StObject.set(x, "isKnownTypesPackageName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsKnownTypesPackageNameUndefined: Self = StObject.set(x, "isKnownTypesPackageName", js.undefined)
    
    @scala.inline
    def setLog(value: /* s */ java.lang.String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    @scala.inline
    def setReadDirectory(
      value: (/* path */ java.lang.String, /* extensions */ js.UndefOr[js.Array[java.lang.String]], /* exclude */ js.UndefOr[js.Array[java.lang.String]], /* include */ js.UndefOr[js.Array[java.lang.String]], /* depth */ js.UndefOr[Double]) => js.Array[java.lang.String]
    ): Self = StObject.set(x, "readDirectory", js.Any.fromFunction5(value))
    
    @scala.inline
    def setReadDirectoryUndefined: Self = StObject.set(x, "readDirectory", js.undefined)
    
    @scala.inline
    def setReadFile(
      value: (/* path */ java.lang.String, /* encoding */ js.UndefOr[java.lang.String]) => js.UndefOr[java.lang.String]
    ): Self = StObject.set(x, "readFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReadFileUndefined: Self = StObject.set(x, "readFile", js.undefined)
    
    @scala.inline
    def setRealpath(value: /* path */ java.lang.String => java.lang.String): Self = StObject.set(x, "realpath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRealpathUndefined: Self = StObject.set(x, "realpath", js.undefined)
    
    @scala.inline
    def setResolveModuleNames(
      value: (/* moduleNames */ js.Array[java.lang.String], /* containingFile */ java.lang.String, /* reusedNames */ js.UndefOr[js.Array[java.lang.String]], /* redirectedReference */ js.UndefOr[ResolvedProjectReference], /* options */ CompilerOptions) => js.Array[js.UndefOr[ResolvedModule]]
    ): Self = StObject.set(x, "resolveModuleNames", js.Any.fromFunction5(value))
    
    @scala.inline
    def setResolveModuleNamesUndefined: Self = StObject.set(x, "resolveModuleNames", js.undefined)
    
    @scala.inline
    def setResolveTypeReferenceDirectives(
      value: (/* typeDirectiveNames */ js.Array[java.lang.String], /* containingFile */ java.lang.String, /* redirectedReference */ js.UndefOr[ResolvedProjectReference], /* options */ CompilerOptions) => js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
    ): Self = StObject.set(x, "resolveTypeReferenceDirectives", js.Any.fromFunction4(value))
    
    @scala.inline
    def setResolveTypeReferenceDirectivesUndefined: Self = StObject.set(x, "resolveTypeReferenceDirectives", js.undefined)
    
    @scala.inline
    def setTrace(value: /* s */ java.lang.String => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    
    @scala.inline
    def setUseCaseSensitiveFileNames(value: () => Boolean): Self = StObject.set(x, "useCaseSensitiveFileNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUseCaseSensitiveFileNamesUndefined: Self = StObject.set(x, "useCaseSensitiveFileNames", js.undefined)
    
    @scala.inline
    def setWriteFile(value: (/* fileName */ java.lang.String, /* content */ java.lang.String) => Unit): Self = StObject.set(x, "writeFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWriteFileUndefined: Self = StObject.set(x, "writeFile", js.undefined)
  }
}
