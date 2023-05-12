package typings.workboxPrecaching

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCacheKeyForURLMod {
  
  @JSImport("workbox-precaching/getCacheKeyForURL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Takes in a URL, and returns the corresponding URL that could be used to
    * lookup the entry in the precache.
    *
    * If a relative URL is provided, the location of the service worker file will
    * be used as the base.
    *
    * For precached entries without revision information, the cache key will be the
    * same as the original URL.
    *
    * For precached entries with revision information, the cache key will be the
    * original URL with the addition of a query parameter used for keeping track of
    * the revision info.
    *
    * @param {string} url The URL whose cache key to look up.
    * @return {string} The cache key that corresponds to that URL.
    *
    * @memberof workbox-precaching
    */
  inline def getCacheKeyForURL(url: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheKeyForURL")(url.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
