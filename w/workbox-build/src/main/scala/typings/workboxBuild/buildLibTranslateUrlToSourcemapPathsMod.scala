package typings.workboxBuild

import typings.workboxBuild.anon.DestPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibTranslateUrlToSourcemapPathsMod {
  
  @JSImport("workbox-build/build/lib/translate-url-to-sourcemap-paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def translateURLToSourcemapPaths(url: String, swSrc: String, swDest: String): DestPath = (^.asInstanceOf[js.Dynamic].applyDynamic("translateURLToSourcemapPaths")(url.asInstanceOf[js.Any], swSrc.asInstanceOf[js.Any], swDest.asInstanceOf[js.Any])).asInstanceOf[DestPath]
  inline def translateURLToSourcemapPaths(url: Null, swSrc: String, swDest: String): DestPath = (^.asInstanceOf[js.Dynamic].applyDynamic("translateURLToSourcemapPaths")(url.asInstanceOf[js.Any], swSrc.asInstanceOf[js.Any], swDest.asInstanceOf[js.Any])).asInstanceOf[DestPath]
}
