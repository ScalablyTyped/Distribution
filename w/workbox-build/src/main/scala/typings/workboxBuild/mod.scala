package typings.workboxBuild

import typings.workboxBuild.anon.Count
import typings.workboxBuild.generateSwMod.GenerateSWConfig
import typings.workboxBuild.getManifestMod.GetManifestConfig
import typings.workboxBuild.injectManifestMod.InjectManifestConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copyWorkboxLibraries(destDirectory: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("copyWorkboxLibraries")(destDirectory.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def generateSW(config: GenerateSWConfig): js.Promise[Count] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSW")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Count]]
  
  inline def getManifest(config: GetManifestConfig): js.Promise[Count] = ^.asInstanceOf[js.Dynamic].applyDynamic("getManifest")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Count]]
  
  inline def getModuleURL(moduleName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModuleURL")(moduleName.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getModuleURL(moduleName: String, buildType: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getModuleURL")(moduleName.asInstanceOf[js.Any], buildType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def injectManifest(config: InjectManifestConfig): js.Promise[Count] = ^.asInstanceOf[js.Dynamic].applyDynamic("injectManifest")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Count]]
}
