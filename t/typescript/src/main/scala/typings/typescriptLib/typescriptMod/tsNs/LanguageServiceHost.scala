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

