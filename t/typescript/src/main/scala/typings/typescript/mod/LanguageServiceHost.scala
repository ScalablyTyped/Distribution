package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageServiceHost extends GetEffectiveTypeRootsHost {
  
  var error: js.UndefOr[js.Function1[/* s */ java.lang.String, Unit]] = js.native
  
  var fileExists: js.UndefOr[js.Function1[/* path */ java.lang.String, Boolean]] = js.native
  
  var getCancellationToken: js.UndefOr[js.Function0[HostCancellationToken]] = js.native
  
  def getCompilationSettings(): CompilerOptions = js.native
  
  @JSName("getCurrentDirectory")
  def getCurrentDirectory_MLanguageServiceHost(): java.lang.String = js.native
  
  /**
    * Gets a set of custom transformers to use during emit.
    */
  var getCustomTransformers: js.UndefOr[js.Function0[js.UndefOr[CustomTransformers]]] = js.native
  
  def getDefaultLibFileName(options: CompilerOptions): java.lang.String = js.native
  
  var getDirectories: js.UndefOr[js.Function1[/* directoryName */ java.lang.String, js.Array[java.lang.String]]] = js.native
  
  var getLocalizedDiagnosticMessages: js.UndefOr[js.Function0[_]] = js.native
  
  var getNewLine: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  var getProjectReferences: js.UndefOr[js.Function0[js.UndefOr[js.Array[ProjectReference]]]] = js.native
  
  var getProjectVersion: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  var getResolvedModuleWithFailedLookupLocationsFromCache: js.UndefOr[
    js.Function2[
      /* modulename */ java.lang.String, 
      /* containingFile */ java.lang.String, 
      js.UndefOr[ResolvedModuleWithFailedLookupLocations]
    ]
  ] = js.native
  
  def getScriptFileNames(): js.Array[java.lang.String] = js.native
  
  var getScriptKind: js.UndefOr[js.Function1[/* fileName */ java.lang.String, ScriptKind]] = js.native
  
  def getScriptSnapshot(fileName: java.lang.String): js.UndefOr[IScriptSnapshot] = js.native
  
  def getScriptVersion(fileName: java.lang.String): java.lang.String = js.native
  
  var getTypeRootsVersion: js.UndefOr[js.Function0[Double]] = js.native
  
  var installPackage: js.UndefOr[
    js.Function1[/* options */ InstallPackageOptions, js.Promise[ApplyCodeActionCommandResult]]
  ] = js.native
  
  var isKnownTypesPackageName: js.UndefOr[js.Function1[/* name */ java.lang.String, Boolean]] = js.native
  
  var log: js.UndefOr[js.Function1[/* s */ java.lang.String, Unit]] = js.native
  
  var readDirectory: js.UndefOr[
    js.Function5[
      /* path */ java.lang.String, 
      /* extensions */ js.UndefOr[js.Array[java.lang.String]], 
      /* exclude */ js.UndefOr[js.Array[java.lang.String]], 
      /* include */ js.UndefOr[js.Array[java.lang.String]], 
      /* depth */ js.UndefOr[Double], 
      js.Array[java.lang.String]
    ]
  ] = js.native
  
  var readFile: js.UndefOr[
    js.Function2[
      /* path */ java.lang.String, 
      /* encoding */ js.UndefOr[java.lang.String], 
      js.UndefOr[java.lang.String]
    ]
  ] = js.native
  
  var realpath: js.UndefOr[js.Function1[/* path */ java.lang.String, java.lang.String]] = js.native
  
  var resolveModuleNames: js.UndefOr[
    js.Function5[
      /* moduleNames */ js.Array[java.lang.String], 
      /* containingFile */ java.lang.String, 
      /* reusedNames */ js.UndefOr[js.Array[java.lang.String]], 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      js.Array[js.UndefOr[ResolvedModule]]
    ]
  ] = js.native
  
  var resolveTypeReferenceDirectives: js.UndefOr[
    js.Function4[
      /* typeDirectiveNames */ js.Array[java.lang.String], 
      /* containingFile */ java.lang.String, 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
    ]
  ] = js.native
  
  var trace: js.UndefOr[js.Function1[/* s */ java.lang.String, Unit]] = js.native
  
  var useCaseSensitiveFileNames: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var writeFile: js.UndefOr[
    js.Function2[/* fileName */ java.lang.String, /* content */ java.lang.String, Unit]
  ] = js.native
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
  implicit class LanguageServiceHostOps[Self <: LanguageServiceHost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetCompilationSettings(value: () => CompilerOptions): Self = this.set("getCompilationSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentDirectory(value: () => java.lang.String): Self = this.set("getCurrentDirectory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultLibFileName(value: CompilerOptions => java.lang.String): Self = this.set("getDefaultLibFileName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetScriptFileNames(value: () => js.Array[java.lang.String]): Self = this.set("getScriptFileNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScriptSnapshot(value: java.lang.String => js.UndefOr[IScriptSnapshot]): Self = this.set("getScriptSnapshot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetScriptVersion(value: java.lang.String => java.lang.String): Self = this.set("getScriptVersion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: /* s */ java.lang.String => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFileExists(value: /* path */ java.lang.String => Boolean): Self = this.set("fileExists", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFileExists: Self = this.set("fileExists", js.undefined)
    
    @scala.inline
    def setGetCancellationToken(value: () => HostCancellationToken): Self = this.set("getCancellationToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCancellationToken: Self = this.set("getCancellationToken", js.undefined)
    
    @scala.inline
    def setGetCustomTransformers(value: () => js.UndefOr[CustomTransformers]): Self = this.set("getCustomTransformers", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCustomTransformers: Self = this.set("getCustomTransformers", js.undefined)
    
    @scala.inline
    def setGetDirectories(value: /* directoryName */ java.lang.String => js.Array[java.lang.String]): Self = this.set("getDirectories", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetDirectories: Self = this.set("getDirectories", js.undefined)
    
    @scala.inline
    def setGetLocalizedDiagnosticMessages(value: () => _): Self = this.set("getLocalizedDiagnosticMessages", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLocalizedDiagnosticMessages: Self = this.set("getLocalizedDiagnosticMessages", js.undefined)
    
    @scala.inline
    def setGetNewLine(value: () => java.lang.String): Self = this.set("getNewLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetNewLine: Self = this.set("getNewLine", js.undefined)
    
    @scala.inline
    def setGetProjectReferences(value: () => js.UndefOr[js.Array[ProjectReference]]): Self = this.set("getProjectReferences", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetProjectReferences: Self = this.set("getProjectReferences", js.undefined)
    
    @scala.inline
    def setGetProjectVersion(value: () => java.lang.String): Self = this.set("getProjectVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetProjectVersion: Self = this.set("getProjectVersion", js.undefined)
    
    @scala.inline
    def setGetResolvedModuleWithFailedLookupLocationsFromCache(
      value: (/* modulename */ java.lang.String, /* containingFile */ java.lang.String) => js.UndefOr[ResolvedModuleWithFailedLookupLocations]
    ): Self = this.set("getResolvedModuleWithFailedLookupLocationsFromCache", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetResolvedModuleWithFailedLookupLocationsFromCache: Self = this.set("getResolvedModuleWithFailedLookupLocationsFromCache", js.undefined)
    
    @scala.inline
    def setGetScriptKind(value: /* fileName */ java.lang.String => ScriptKind): Self = this.set("getScriptKind", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetScriptKind: Self = this.set("getScriptKind", js.undefined)
    
    @scala.inline
    def setGetTypeRootsVersion(value: () => Double): Self = this.set("getTypeRootsVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTypeRootsVersion: Self = this.set("getTypeRootsVersion", js.undefined)
    
    @scala.inline
    def setInstallPackage(value: /* options */ InstallPackageOptions => js.Promise[ApplyCodeActionCommandResult]): Self = this.set("installPackage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInstallPackage: Self = this.set("installPackage", js.undefined)
    
    @scala.inline
    def setIsKnownTypesPackageName(value: /* name */ java.lang.String => Boolean): Self = this.set("isKnownTypesPackageName", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsKnownTypesPackageName: Self = this.set("isKnownTypesPackageName", js.undefined)
    
    @scala.inline
    def setLog(value: /* s */ java.lang.String => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setReadDirectory(
      value: (/* path */ java.lang.String, /* extensions */ js.UndefOr[js.Array[java.lang.String]], /* exclude */ js.UndefOr[js.Array[java.lang.String]], /* include */ js.UndefOr[js.Array[java.lang.String]], /* depth */ js.UndefOr[Double]) => js.Array[java.lang.String]
    ): Self = this.set("readDirectory", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteReadDirectory: Self = this.set("readDirectory", js.undefined)
    
    @scala.inline
    def setReadFile(
      value: (/* path */ java.lang.String, /* encoding */ js.UndefOr[java.lang.String]) => js.UndefOr[java.lang.String]
    ): Self = this.set("readFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteReadFile: Self = this.set("readFile", js.undefined)
    
    @scala.inline
    def setRealpath(value: /* path */ java.lang.String => java.lang.String): Self = this.set("realpath", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRealpath: Self = this.set("realpath", js.undefined)
    
    @scala.inline
    def setResolveModuleNames(
      value: (/* moduleNames */ js.Array[java.lang.String], /* containingFile */ java.lang.String, /* reusedNames */ js.UndefOr[js.Array[java.lang.String]], /* redirectedReference */ js.UndefOr[ResolvedProjectReference], /* options */ CompilerOptions) => js.Array[js.UndefOr[ResolvedModule]]
    ): Self = this.set("resolveModuleNames", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteResolveModuleNames: Self = this.set("resolveModuleNames", js.undefined)
    
    @scala.inline
    def setResolveTypeReferenceDirectives(
      value: (/* typeDirectiveNames */ js.Array[java.lang.String], /* containingFile */ java.lang.String, /* redirectedReference */ js.UndefOr[ResolvedProjectReference], /* options */ CompilerOptions) => js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
    ): Self = this.set("resolveTypeReferenceDirectives", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteResolveTypeReferenceDirectives: Self = this.set("resolveTypeReferenceDirectives", js.undefined)
    
    @scala.inline
    def setTrace(value: /* s */ java.lang.String => Unit): Self = this.set("trace", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTrace: Self = this.set("trace", js.undefined)
    
    @scala.inline
    def setUseCaseSensitiveFileNames(value: () => Boolean): Self = this.set("useCaseSensitiveFileNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUseCaseSensitiveFileNames: Self = this.set("useCaseSensitiveFileNames", js.undefined)
    
    @scala.inline
    def setWriteFile(value: (/* fileName */ java.lang.String, /* content */ java.lang.String) => Unit): Self = this.set("writeFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteWriteFile: Self = this.set("writeFile", js.undefined)
  }
}
