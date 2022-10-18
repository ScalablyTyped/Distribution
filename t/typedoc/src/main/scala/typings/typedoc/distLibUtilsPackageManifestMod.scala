package typings.typedoc

import typings.minimatch.mod.Minimatch
import typings.std.Record
import typings.typedoc.anon.AdditionalProperties
import typings.typedoc.distLibUtilsLoggersMod.Logger
import typings.typedoc.distLibUtilsValidationMod.Infer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsPackageManifestMod {
  
  @JSImport("typedoc/dist/lib/utils/package-manifest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expandPackages(logger: Logger, packageJsonDir: String, workspaces: js.Array[String], exclude: js.Array[Minimatch]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("expandPackages")(logger.asInstanceOf[js.Any], packageJsonDir.asInstanceOf[js.Any], workspaces.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def extractTypedocConfigFromPackageManifest(logger: Logger, packageJsonPath: String): js.UndefOr[TypedocPackageManifestConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractTypedocConfigFromPackageManifest")(logger.asInstanceOf[js.Any], packageJsonPath.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TypedocPackageManifestConfig]]
  
  inline def getTsEntryPointForPackage(logger: Logger, packageJsonPath: String, packageJson: Record[String, Any]): js.UndefOr[String | js.Symbol] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTsEntryPointForPackage")(logger.asInstanceOf[js.Any], packageJsonPath.asInstanceOf[js.Any], packageJson.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | js.Symbol]]
  
  @JSImport("typedoc/dist/lib/utils/package-manifest", "ignorePackage")
  @js.native
  val ignorePackage: js.Symbol = js.native
  
  inline def loadPackageManifest(logger: Logger, packageJsonPath: String): js.UndefOr[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadPackageManifest")(logger.asInstanceOf[js.Any], packageJsonPath.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Record[String, Any]]]
  
  type TypedocPackageManifestConfig = Infer[AdditionalProperties]
}
