package typings.workboxBuild

import typings.workboxBuild.buildTypesMod.GetManifestOptions
import typings.workboxBuild.buildTypesMod.GetManifestResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibGetFileManifestEntriesMod {
  
  @JSImport("workbox-build/build/lib/get-file-manifest-entries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFileManifestEntries(param0: GetManifestOptions): js.Promise[GetManifestResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileManifestEntries")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetManifestResult]]
}
