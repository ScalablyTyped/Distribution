package typings.workboxBuild

import typings.workboxBuild.buildTypesMod.BuildResult
import typings.workboxBuild.buildTypesMod.InjectManifestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildInjectManifestMod {
  
  @JSImport("workbox-build/build/inject-manifest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def injectManifest(config: InjectManifestOptions): js.Promise[BuildResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("injectManifest")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BuildResult]]
}
