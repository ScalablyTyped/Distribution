package typings.workboxBuild

import typings.workboxBuild.buildTypesMod.BuildResult
import typings.workboxBuild.buildTypesMod.GenerateSWOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildGenerateSwMod {
  
  @JSImport("workbox-build/build/generate-sw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateSW(config: GenerateSWOptions): js.Promise[BuildResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSW")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BuildResult]]
}
