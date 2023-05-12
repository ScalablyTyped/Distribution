package typings.workboxBuild

import typings.workboxBuild.buildTypesMod.GetManifestOptions
import typings.workboxBuild.buildTypesMod.GetManifestResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildGetManifestMod {
  
  @JSImport("workbox-build/build/get-manifest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getManifest(config: GetManifestOptions): js.Promise[GetManifestResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getManifest")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetManifestResult]]
}
