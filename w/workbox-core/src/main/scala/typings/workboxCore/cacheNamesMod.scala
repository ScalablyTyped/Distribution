package typings.workboxCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheNamesMod {
  
  /**
    * Get the current cache names and prefix/suffix used by Workbox.
    *
    * `cacheNames.precache` is used for precached assets,
    * `cacheNames.googleAnalytics` is used by `workbox-google-analytics` to
    * store `analytics.js`, and `cacheNames.runtime` is used for everything else.
    *
    * `cacheNames.prefix` can be used to retrieve just the current prefix value.
    * `cacheNames.suffix` can be used to retrieve just the current suffix value.
    *
    * @return {Object} An object with `precache`, `runtime`, `prefix`, and
    *     `googleAnalytics` properties.
    *
    * @memberof workbox-core
    */
  object cacheNames {
    
    @JSImport("workbox-core/cacheNames", "cacheNames.googleAnalytics")
    @js.native
    val googleAnalytics: String = js.native
    
    @JSImport("workbox-core/cacheNames", "cacheNames.precache")
    @js.native
    val precache: String = js.native
    
    @JSImport("workbox-core/cacheNames", "cacheNames.prefix")
    @js.native
    val prefix: String = js.native
    
    @JSImport("workbox-core/cacheNames", "cacheNames.runtime")
    @js.native
    val runtime: String = js.native
    
    @JSImport("workbox-core/cacheNames", "cacheNames.suffix")
    @js.native
    val suffix: String = js.native
  }
}
