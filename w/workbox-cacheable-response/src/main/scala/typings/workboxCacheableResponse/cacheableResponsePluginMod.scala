package typings.workboxCacheableResponse

import typings.workboxCacheableResponse.cacheableResponseMod.CacheableResponseOptions
import typings.workboxCore.typesMod.WorkboxPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheableResponsePluginMod {
  
  /**
    * A class implementing the `cacheWillUpdate` lifecycle callback. This makes it
    * easier to add in cacheability checks to requests made via Workbox's built-in
    * strategies.
    *
    * @memberof workbox-cacheable-response
    */
  @JSImport("workbox-cacheable-response/CacheableResponsePlugin", "CacheableResponsePlugin")
  @js.native
  open class CacheableResponsePlugin protected ()
    extends StObject
       with WorkboxPlugin {
    /**
      * To construct a new CacheableResponsePlugin instance you must provide at
      * least one of the `config` properties.
      *
      * If both `statuses` and `headers` are specified, then both conditions must
      * be met for the `Response` to be considered cacheable.
      *
      * @param {Object} config
      * @param {Array<number>} [config.statuses] One or more status codes that a
      * `Response` can have and be considered cacheable.
      * @param {Object<string,string>} [config.headers] A mapping of header names
      * and expected values that a `Response` can have and be considered cacheable.
      * If multiple headers are provided, only one needs to be present.
      */
    def this(config: CacheableResponseOptions) = this()
    
    /* private */ val _cacheableResponse: Any = js.native
  }
}
