package typings.workboxSw.mod.global.workbox

import typings.workboxCacheableResponse.cacheableResponseMod.CacheableResponseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof WorkboxCacheableResponse` */
object cacheableResponse {
  
  /**
    * This class allows you to set up rules determining what
    * status codes and/or headers need to be present in order for a
    * [`Response`](https://developer.mozilla.org/en-US/docs/Web/API/Response)
    * to be considered cacheable.
    *
    * @memberof workbox-cacheable-response
    */
  @JSGlobal("workbox.cacheableResponse.CacheableResponse")
  @js.native
  /**
    * To construct a new CacheableResponse instance you must provide at least
    * one of the `config` properties.
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
  open class CacheableResponse ()
    extends typings.workboxCacheableResponse.mod.CacheableResponse {
    def this(config: CacheableResponseOptions) = this()
  }
  
  /**
    * A class implementing the `cacheWillUpdate` lifecycle callback. This makes it
    * easier to add in cacheability checks to requests made via Workbox's built-in
    * strategies.
    *
    * @memberof workbox-cacheable-response
    */
  @JSGlobal("workbox.cacheableResponse.CacheableResponsePlugin")
  @js.native
  open class CacheableResponsePlugin protected ()
    extends typings.workboxCacheableResponse.mod.CacheableResponsePlugin {
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
  }
}
