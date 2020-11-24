package typings.workboxBuild

import typings.workboxBuild.generateSwMod.GenerateSWConfig
import typings.workboxBuild.generateSwMod.GenerateSWResult
import typings.workboxBuild.getManifestMod.GetManifestConfig
import typings.workboxBuild.getManifestMod.GetManifestResult
import typings.workboxBuild.injectManifestMod.InjectManifestConfig
import typings.workboxBuild.injectManifestMod.InjectManifestResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("workbox-build", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def copyWorkboxLibraries(destDirectory: String): js.Promise[String] = js.native
  
  def generateSW(config: GenerateSWConfig): GenerateSWResult = js.native
  
  def getManifest(config: GetManifestConfig): GetManifestResult = js.native
  
  def getModuleURL(moduleName: String): String = js.native
  def getModuleURL(moduleName: String, buildType: String): String = js.native
  
  def injectManifest(config: InjectManifestConfig): InjectManifestResult = js.native
}
