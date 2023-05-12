package typings.workboxCore

import typings.workboxCore.privateCacheNamesMod.PartialCacheNameDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setCacheNameDetailsMod {
  
  @JSImport("workbox-core/setCacheNameDetails", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Modifies the default cache names used by the Workbox packages.
    * Cache names are generated as `<prefix>-<Cache Name>-<suffix>`.
    *
    * @param {Object} details
    * @param {Object} [details.prefix] The string to add to the beginning of
    *     the precache and runtime cache names.
    * @param {Object} [details.suffix] The string to add to the end of
    *     the precache and runtime cache names.
    * @param {Object} [details.precache] The cache name to use for precache
    *     caching.
    * @param {Object} [details.runtime] The cache name to use for runtime caching.
    * @param {Object} [details.googleAnalytics] The cache name to use for
    *     `workbox-google-analytics` caching.
    *
    * @memberof workbox-core
    */
  inline def setCacheNameDetails(details: PartialCacheNameDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCacheNameDetails")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
