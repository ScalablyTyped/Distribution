package typings.workboxBuild

import typings.workboxBuild.buildTypesMod.BuildResult
import typings.workboxBuild.buildTypesMod.BuildType
import typings.workboxBuild.buildTypesMod.GenerateSWOptions
import typings.workboxBuild.buildTypesMod.GetManifestOptions
import typings.workboxBuild.buildTypesMod.GetManifestResult
import typings.workboxBuild.buildTypesMod.InjectManifestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copyWorkboxLibraries(destDirectory: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyWorkboxLibraries")(destDirectory.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def generateSW(config: GenerateSWOptions): js.Promise[BuildResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSW")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BuildResult]]
  
  inline def getManifest(config: GetManifestOptions): js.Promise[GetManifestResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getManifest")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetManifestResult]]
  
  inline def getModuleURL(moduleName: String, buildType: BuildType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getModuleURL")(moduleName.asInstanceOf[js.Any], buildType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def injectManifest(config: InjectManifestOptions): js.Promise[BuildResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("injectManifest")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BuildResult]]
}
