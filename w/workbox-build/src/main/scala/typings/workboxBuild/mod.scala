package typings.workboxBuild

import typings.workboxBuild.generateSwMod.GenerateSWConfig
import typings.workboxBuild.generateSwMod.GenerateSWResult
import typings.workboxBuild.getManifestMod.GetManifestConfig
import typings.workboxBuild.getManifestMod.GetManifestResult
import typings.workboxBuild.injectManifestMod.InjectManifestConfig
import typings.workboxBuild.injectManifestMod.InjectManifestResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copyWorkboxLibraries(destDirectory: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyWorkboxLibraries")(destDirectory.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def generateSW(config: GenerateSWConfig): GenerateSWResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSW")(config.asInstanceOf[js.Any]).asInstanceOf[GenerateSWResult]
  
  inline def getManifest(config: GetManifestConfig): GetManifestResult = ^.asInstanceOf[js.Dynamic].applyDynamic("getManifest")(config.asInstanceOf[js.Any]).asInstanceOf[GetManifestResult]
  
  inline def getModuleURL(moduleName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModuleURL")(moduleName.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getModuleURL(moduleName: String, buildType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getModuleURL")(moduleName.asInstanceOf[js.Any], buildType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def injectManifest(config: InjectManifestConfig): InjectManifestResult = ^.asInstanceOf[js.Dynamic].applyDynamic("injectManifest")(config.asInstanceOf[js.Any]).asInstanceOf[InjectManifestResult]
}
