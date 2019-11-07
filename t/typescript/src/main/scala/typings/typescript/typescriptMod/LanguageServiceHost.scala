package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageServiceHost extends ModuleSpecifierResolutionHost {
  var error: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.undefined
  var getCancellationToken: js.UndefOr[js.Function0[HostCancellationToken]] = js.undefined
  /**
    * Gets a set of custom transformers to use during emit.
    */
  var getCustomTransformers: js.UndefOr[js.Function0[js.UndefOr[CustomTransformers]]] = js.undefined
  var getDirectories: js.UndefOr[js.Function1[/* directoryName */ String, js.Array[String]]] = js.undefined
  var getLocalizedDiagnosticMessages: js.UndefOr[js.Function0[_]] = js.undefined
  var getNewLine: js.UndefOr[js.Function0[String]] = js.undefined
  var getProjectReferences: js.UndefOr[js.Function0[js.UndefOr[js.Array[ProjectReference]]]] = js.undefined
  var getProjectVersion: js.UndefOr[js.Function0[String]] = js.undefined
  var getResolvedModuleWithFailedLookupLocationsFromCache: js.UndefOr[
    js.Function2[
      /* modulename */ String, 
      /* containingFile */ String, 
      js.UndefOr[ResolvedModuleWithFailedLookupLocations]
    ]
  ] = js.undefined
  var getScriptKind: js.UndefOr[js.Function1[/* fileName */ String, ScriptKind]] = js.undefined
  var getTypeRootsVersion: js.UndefOr[js.Function0[Double]] = js.undefined
  var installPackage: js.UndefOr[
    js.Function1[/* options */ InstallPackageOptions, js.Promise[ApplyCodeActionCommandResult]]
  ] = js.undefined
  var isKnownTypesPackageName: js.UndefOr[js.Function1[/* name */ String, Boolean]] = js.undefined
  var log: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.undefined
  var readDirectory: js.UndefOr[
    js.Function5[
      /* path */ String, 
      /* extensions */ js.UndefOr[js.Array[String]], 
      /* exclude */ js.UndefOr[js.Array[String]], 
      /* include */ js.UndefOr[js.Array[String]], 
      /* depth */ js.UndefOr[Double], 
      js.Array[String]
    ]
  ] = js.undefined
  @JSName("readFile")
  var readFile_LanguageServiceHost: js.UndefOr[
    js.Function2[/* path */ String, /* encoding */ js.UndefOr[String], js.UndefOr[String]]
  ] = js.undefined
  var realpath: js.UndefOr[js.Function1[/* path */ String, String]] = js.undefined
  var resolveModuleNames: js.UndefOr[
    js.Function5[
      /* moduleNames */ js.Array[String], 
      /* containingFile */ String, 
      /* reusedNames */ js.UndefOr[js.Array[String]], 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      js.Array[js.UndefOr[ResolvedModule]]
    ]
  ] = js.undefined
  var resolveTypeReferenceDirectives: js.UndefOr[
    js.Function4[
      /* typeDirectiveNames */ js.Array[String], 
      /* containingFile */ String, 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
    ]
  ] = js.undefined
  var trace: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.undefined
  var writeFile: js.UndefOr[js.Function2[/* fileName */ String, /* content */ String, Unit]] = js.undefined
  def getCompilationSettings(): CompilerOptions
  @JSName("getCurrentDirectory")
  def getCurrentDirectory_MLanguageServiceHost(): String
  def getDefaultLibFileName(options: CompilerOptions): String
  def getScriptFileNames(): js.Array[String]
  def getScriptSnapshot(fileName: String): js.UndefOr[IScriptSnapshot]
  def getScriptVersion(fileName: String): String
}

object LanguageServiceHost {
  @scala.inline
  def apply(
    getCompilationSettings: () => CompilerOptions,
    getCurrentDirectory: () => String,
    getDefaultLibFileName: CompilerOptions => String,
    getScriptFileNames: () => js.Array[String],
    getScriptSnapshot: String => js.UndefOr[IScriptSnapshot],
    getScriptVersion: String => String,
    directoryExists: /* directoryName */ String => Boolean = null,
    error: /* s */ String => Unit = null,
    fileExists: /* path */ String => Boolean = null,
    getCancellationToken: () => HostCancellationToken = null,
    getCustomTransformers: () => js.UndefOr[CustomTransformers] = null,
    getDirectories: /* directoryName */ String => js.Array[String] = null,
    getLocalizedDiagnosticMessages: () => _ = null,
    getNewLine: () => String = null,
    getProjectReferences: () => js.UndefOr[js.Array[ProjectReference]] = null,
    getProjectVersion: () => String = null,
    getResolvedModuleWithFailedLookupLocationsFromCache: (/* modulename */ String, /* containingFile */ String) => js.UndefOr[ResolvedModuleWithFailedLookupLocations] = null,
    getScriptKind: /* fileName */ String => ScriptKind = null,
    getTypeRootsVersion: () => Double = null,
    installPackage: /* options */ InstallPackageOptions => js.Promise[ApplyCodeActionCommandResult] = null,
    isKnownTypesPackageName: /* name */ String => Boolean = null,
    log: /* s */ String => Unit = null,
    readDirectory: (/* path */ String, /* extensions */ js.UndefOr[js.Array[String]], /* exclude */ js.UndefOr[js.Array[String]], /* include */ js.UndefOr[js.Array[String]], /* depth */ js.UndefOr[Double]) => js.Array[String] = null,
    readFile: (/* path */ String, /* encoding */ js.UndefOr[String]) => js.UndefOr[String] = null,
    realpath: /* path */ String => String = null,
    resolveModuleNames: (/* moduleNames */ js.Array[String], /* containingFile */ String, /* reusedNames */ js.UndefOr[js.Array[String]], /* redirectedReference */ js.UndefOr[ResolvedProjectReference], /* options */ CompilerOptions) => js.Array[js.UndefOr[ResolvedModule]] = null,
    resolveTypeReferenceDirectives: (/* typeDirectiveNames */ js.Array[String], /* containingFile */ String, /* redirectedReference */ js.UndefOr[ResolvedProjectReference], /* options */ CompilerOptions) => js.Array[js.UndefOr[ResolvedTypeReferenceDirective]] = null,
    trace: /* s */ String => Unit = null,
    useCaseSensitiveFileNames: () => Boolean = null,
    writeFile: (/* fileName */ String, /* content */ String) => Unit = null
  ): LanguageServiceHost = {
    val __obj = js.Dynamic.literal(getCompilationSettings = js.Any.fromFunction0(getCompilationSettings), getCurrentDirectory = js.Any.fromFunction0(getCurrentDirectory), getDefaultLibFileName = js.Any.fromFunction1(getDefaultLibFileName), getScriptFileNames = js.Any.fromFunction0(getScriptFileNames), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), getScriptVersion = js.Any.fromFunction1(getScriptVersion))
    if (directoryExists != null) __obj.updateDynamic("directoryExists")(js.Any.fromFunction1(directoryExists))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (fileExists != null) __obj.updateDynamic("fileExists")(js.Any.fromFunction1(fileExists))
    if (getCancellationToken != null) __obj.updateDynamic("getCancellationToken")(js.Any.fromFunction0(getCancellationToken))
    if (getCustomTransformers != null) __obj.updateDynamic("getCustomTransformers")(js.Any.fromFunction0(getCustomTransformers))
    if (getDirectories != null) __obj.updateDynamic("getDirectories")(js.Any.fromFunction1(getDirectories))
    if (getLocalizedDiagnosticMessages != null) __obj.updateDynamic("getLocalizedDiagnosticMessages")(js.Any.fromFunction0(getLocalizedDiagnosticMessages))
    if (getNewLine != null) __obj.updateDynamic("getNewLine")(js.Any.fromFunction0(getNewLine))
    if (getProjectReferences != null) __obj.updateDynamic("getProjectReferences")(js.Any.fromFunction0(getProjectReferences))
    if (getProjectVersion != null) __obj.updateDynamic("getProjectVersion")(js.Any.fromFunction0(getProjectVersion))
    if (getResolvedModuleWithFailedLookupLocationsFromCache != null) __obj.updateDynamic("getResolvedModuleWithFailedLookupLocationsFromCache")(js.Any.fromFunction2(getResolvedModuleWithFailedLookupLocationsFromCache))
    if (getScriptKind != null) __obj.updateDynamic("getScriptKind")(js.Any.fromFunction1(getScriptKind))
    if (getTypeRootsVersion != null) __obj.updateDynamic("getTypeRootsVersion")(js.Any.fromFunction0(getTypeRootsVersion))
    if (installPackage != null) __obj.updateDynamic("installPackage")(js.Any.fromFunction1(installPackage))
    if (isKnownTypesPackageName != null) __obj.updateDynamic("isKnownTypesPackageName")(js.Any.fromFunction1(isKnownTypesPackageName))
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1(log))
    if (readDirectory != null) __obj.updateDynamic("readDirectory")(js.Any.fromFunction5(readDirectory))
    if (readFile != null) __obj.updateDynamic("readFile")(js.Any.fromFunction2(readFile))
    if (realpath != null) __obj.updateDynamic("realpath")(js.Any.fromFunction1(realpath))
    if (resolveModuleNames != null) __obj.updateDynamic("resolveModuleNames")(js.Any.fromFunction5(resolveModuleNames))
    if (resolveTypeReferenceDirectives != null) __obj.updateDynamic("resolveTypeReferenceDirectives")(js.Any.fromFunction4(resolveTypeReferenceDirectives))
    if (trace != null) __obj.updateDynamic("trace")(js.Any.fromFunction1(trace))
    if (useCaseSensitiveFileNames != null) __obj.updateDynamic("useCaseSensitiveFileNames")(js.Any.fromFunction0(useCaseSensitiveFileNames))
    if (writeFile != null) __obj.updateDynamic("writeFile")(js.Any.fromFunction2(writeFile))
    __obj.asInstanceOf[LanguageServiceHost]
  }
}

