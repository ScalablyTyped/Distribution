package typings.workboxPrecaching

import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsRemoveIgnoredSearchParamsMod {
  
  @JSImport("workbox-precaching/utils/removeIgnoredSearchParams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removeIgnoredSearchParams(urlObject: URL): URL = ^.asInstanceOf[js.Dynamic].applyDynamic("removeIgnoredSearchParams")(urlObject.asInstanceOf[js.Any]).asInstanceOf[URL]
  inline def removeIgnoredSearchParams(urlObject: URL, ignoreURLParametersMatching: js.Array[js.RegExp]): URL = (^.asInstanceOf[js.Dynamic].applyDynamic("removeIgnoredSearchParams")(urlObject.asInstanceOf[js.Any], ignoreURLParametersMatching.asInstanceOf[js.Any])).asInstanceOf[URL]
}
