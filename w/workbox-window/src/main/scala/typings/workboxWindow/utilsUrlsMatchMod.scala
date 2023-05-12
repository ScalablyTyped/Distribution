package typings.workboxWindow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsUrlsMatchMod {
  
  @JSImport("workbox-window/utils/urlsMatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def urlsMatch(url1: String, url2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("urlsMatch")(url1.asInstanceOf[js.Any], url2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
