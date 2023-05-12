package typings.workboxPrecaching

import typings.workboxPrecaching.typesMod.PrecacheRouteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsGetCacheKeyForURLMod {
  
  @JSImport("workbox-precaching/utils/getCacheKeyForURL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCacheKeyForURL(url: String, options: PrecacheRouteOptions): String | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getCacheKeyForURL")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Unit]
}
