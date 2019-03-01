package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageServiceHost extends GetEffectiveTypeRootsHost {
  var error: js.UndefOr[js.Function1[/* s */ java.lang.String, scala.Unit]] = js.undefined
  var fileExists: js.UndefOr[js.Function1[/* path */ java.lang.String, scala.Boolean]] = js.undefined
  var getCancellationToken: js.UndefOr[js.Function0[HostCancellationToken]] = js.undefined
  /**
    * Gets a set of custom transformers to use during emit.
    */
  var getCustomTransformers: js.UndefOr[js.Function0[js.UndefOr[CustomTransformers]]] = js.undefined
  var getDirectories: js.UndefOr[js.Function1[/* directoryName */ java.lang.String, js.Array[java.lang.String]]] = js.undefined
  var getLocalizedDiagnosticMessages: js.UndefOr[js.Function0[_]] = js.undefined
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
  var getScriptKind: js.UndefOr[js.Function1[/* fileName */ java.lang.String, ScriptKind]] = js.undefined
  var getTypeRootsVersion: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  var installPackage: js.UndefOr[
    js.Function1[/* options */ InstallPackageOptions, js.Promise[ApplyCodeActionCommandResult]]
  ] = js.undefined
  var isKnownTypesPackageName: js.UndefOr[js.Function1[/* name */ java.lang.String, scala.Boolean]] = js.undefined
  var log: js.UndefOr[js.Function1[/* s */ java.lang.String, scala.Unit]] = js.undefined
  var readDirectory: js.UndefOr[
    js.Function5[
      /* path */ java.lang.String, 
      /* extensions */ js.UndefOr[js.Array[java.lang.String]], 
      /* exclude */ js.UndefOr[js.Array[java.lang.String]], 
      /* include */ js.UndefOr[js.Array[java.lang.String]], 
      /* depth */ js.UndefOr[scala.Double], 
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
    js.Function4[
      /* moduleNames */ js.Array[java.lang.String], 
      /* containingFile */ java.lang.String, 
      /* reusedNames */ js.UndefOr[js.Array[java.lang.String]], 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      js.Array[js.UndefOr[ResolvedModule]]
    ]
  ] = js.undefined
  var resolveTypeReferenceDirectives: js.UndefOr[
    js.Function3[
      /* typeDirectiveNames */ js.Array[java.lang.String], 
      /* containingFile */ java.lang.String, 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
    ]
  ] = js.undefined
  var trace: js.UndefOr[js.Function1[/* s */ java.lang.String, scala.Unit]] = js.undefined
  var useCaseSensitiveFileNames: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var writeFile: js.UndefOr[
    js.Function2[/* fileName */ java.lang.String, /* content */ java.lang.String, scala.Unit]
  ] = js.undefined
  def getCompilationSettings(): CompilerOptions
  @JSName("getCurrentDirectory")
  def getCurrentDirectory_MLanguageServiceHost(): java.lang.String
  def getDefaultLibFileName(options: CompilerOptions): java.lang.String
  def getScriptFileNames(): js.Array[java.lang.String]
  def getScriptSnapshot(fileName: java.lang.String): js.UndefOr[IScriptSnapshot]
  def getScriptVersion(fileName: java.lang.String): java.lang.String
}

object LanguageServiceHost {
  @scala.inline
  def apply(
    getCompilationSettings: js.Function0[CompilerOptions],
    getCurrentDirectory: js.Function0[java.lang.String],
    getDefaultLibFileName: js.Function1[CompilerOptions, java.lang.String],
    getScriptFileNames: js.Function0[js.Array[java.lang.String]],
    getScriptSnapshot: js.Function1[java.lang.String, js.UndefOr[IScriptSnapshot]],
    getScriptVersion: js.Function1[java.lang.String, java.lang.String],
    directoryExists: js.Function1[/* directoryName */ java.lang.String, scala.Boolean] = null,
    error: js.Function1[/* s */ java.lang.String, scala.Unit] = null,
    fileExists: js.Function1[/* path */ java.lang.String, scala.Boolean] = null,
    getCancellationToken: js.Function0[HostCancellationToken] = null,
    getCustomTransformers: js.Function0[js.UndefOr[CustomTransformers]] = null,
    getDirectories: js.Function1[/* directoryName */ java.lang.String, js.Array[java.lang.String]] = null,
    getLocalizedDiagnosticMessages: js.Function0[_] = null,
    getNewLine: js.Function0[java.lang.String] = null,
    getProjectReferences: js.Function0[js.UndefOr[js.Array[ProjectReference]]] = null,
    getProjectVersion: js.Function0[java.lang.String] = null,
    getResolvedModuleWithFailedLookupLocationsFromCache: js.Function2[
      /* modulename */ java.lang.String, 
      /* containingFile */ java.lang.String, 
      js.UndefOr[ResolvedModuleWithFailedLookupLocations]
    ] = null,
    getScriptKind: js.Function1[/* fileName */ java.lang.String, ScriptKind] = null,
    getTypeRootsVersion: js.Function0[scala.Double] = null,
    installPackage: js.Function1[/* options */ InstallPackageOptions, js.Promise[ApplyCodeActionCommandResult]] = null,
    isKnownTypesPackageName: js.Function1[/* name */ java.lang.String, scala.Boolean] = null,
    log: js.Function1[/* s */ java.lang.String, scala.Unit] = null,
    readDirectory: js.Function5[
      /* path */ java.lang.String, 
      /* extensions */ js.UndefOr[js.Array[java.lang.String]], 
      /* exclude */ js.UndefOr[js.Array[java.lang.String]], 
      /* include */ js.UndefOr[js.Array[java.lang.String]], 
      /* depth */ js.UndefOr[scala.Double], 
      js.Array[java.lang.String]
    ] = null,
    readFile: js.Function2[
      /* path */ java.lang.String, 
      /* encoding */ js.UndefOr[java.lang.String], 
      js.UndefOr[java.lang.String]
    ] = null,
    realpath: js.Function1[/* path */ java.lang.String, java.lang.String] = null,
    resolveModuleNames: js.Function4[
      /* moduleNames */ js.Array[java.lang.String], 
      /* containingFile */ java.lang.String, 
      /* reusedNames */ js.UndefOr[js.Array[java.lang.String]], 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      js.Array[js.UndefOr[ResolvedModule]]
    ] = null,
    resolveTypeReferenceDirectives: js.Function3[
      /* typeDirectiveNames */ js.Array[java.lang.String], 
      /* containingFile */ java.lang.String, 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
    ] = null,
    trace: js.Function1[/* s */ java.lang.String, scala.Unit] = null,
    useCaseSensitiveFileNames: js.Function0[scala.Boolean] = null,
    writeFile: js.Function2[/* fileName */ java.lang.String, /* content */ java.lang.String, scala.Unit] = null
  ): LanguageServiceHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCompilationSettings")(getCompilationSettings)
    __obj.updateDynamic("getCurrentDirectory")(getCurrentDirectory)
    __obj.updateDynamic("getDefaultLibFileName")(getDefaultLibFileName)
    __obj.updateDynamic("getScriptFileNames")(getScriptFileNames)
    __obj.updateDynamic("getScriptSnapshot")(getScriptSnapshot)
    __obj.updateDynamic("getScriptVersion")(getScriptVersion)
    if (directoryExists != null) __obj.updateDynamic("directoryExists")(directoryExists)
    if (error != null) __obj.updateDynamic("error")(error)
    if (fileExists != null) __obj.updateDynamic("fileExists")(fileExists)
    if (getCancellationToken != null) __obj.updateDynamic("getCancellationToken")(getCancellationToken)
    if (getCustomTransformers != null) __obj.updateDynamic("getCustomTransformers")(getCustomTransformers)
    if (getDirectories != null) __obj.updateDynamic("getDirectories")(getDirectories)
    if (getLocalizedDiagnosticMessages != null) __obj.updateDynamic("getLocalizedDiagnosticMessages")(getLocalizedDiagnosticMessages)
    if (getNewLine != null) __obj.updateDynamic("getNewLine")(getNewLine)
    if (getProjectReferences != null) __obj.updateDynamic("getProjectReferences")(getProjectReferences)
    if (getProjectVersion != null) __obj.updateDynamic("getProjectVersion")(getProjectVersion)
    if (getResolvedModuleWithFailedLookupLocationsFromCache != null) __obj.updateDynamic("getResolvedModuleWithFailedLookupLocationsFromCache")(getResolvedModuleWithFailedLookupLocationsFromCache)
    if (getScriptKind != null) __obj.updateDynamic("getScriptKind")(getScriptKind)
    if (getTypeRootsVersion != null) __obj.updateDynamic("getTypeRootsVersion")(getTypeRootsVersion)
    if (installPackage != null) __obj.updateDynamic("installPackage")(installPackage)
    if (isKnownTypesPackageName != null) __obj.updateDynamic("isKnownTypesPackageName")(isKnownTypesPackageName)
    if (log != null) __obj.updateDynamic("log")(log)
    if (readDirectory != null) __obj.updateDynamic("readDirectory")(readDirectory)
    if (readFile != null) __obj.updateDynamic("readFile")(readFile)
    if (realpath != null) __obj.updateDynamic("realpath")(realpath)
    if (resolveModuleNames != null) __obj.updateDynamic("resolveModuleNames")(resolveModuleNames)
    if (resolveTypeReferenceDirectives != null) __obj.updateDynamic("resolveTypeReferenceDirectives")(resolveTypeReferenceDirectives)
    if (trace != null) __obj.updateDynamic("trace")(trace)
    if (useCaseSensitiveFileNames != null) __obj.updateDynamic("useCaseSensitiveFileNames")(useCaseSensitiveFileNames)
    if (writeFile != null) __obj.updateDynamic("writeFile")(writeFile)
    __obj.asInstanceOf[LanguageServiceHost]
  }
}

