package typings.workboxCacheableResponse

import org.scalablytyped.runtime.StringDictionary
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheableResponseMod {
  
  /**
    * This class allows you to set up rules determining what
    * status codes and/or headers need to be present in order for a
    * [`Response`](https://developer.mozilla.org/en-US/docs/Web/API/Response)
    * to be considered cacheable.
    *
    * @memberof workbox-cacheable-response
    */
  @JSImport("workbox-cacheable-response/CacheableResponse", "CacheableResponse")
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
  open class CacheableResponse () extends StObject {
    def this(config: CacheableResponseOptions) = this()
    
    /* private */ val _headers: Any = js.native
    
    /* private */ val _statuses: Any = js.native
    
    /**
      * Checks a response to see whether it's cacheable or not, based on this
      * object's configuration.
      *
      * @param {Response} response The response whose cacheability is being
      * checked.
      * @return {boolean} `true` if the `Response` is cacheable, and `false`
      * otherwise.
      */
    def isResponseCacheable(response: Response): Boolean = js.native
  }
  
  trait CacheableResponseOptions extends StObject {
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var statuses: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object CacheableResponseOptions {
    
    inline def apply(): CacheableResponseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheableResponseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheableResponseOptions] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setStatuses(value: js.Array[Double]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
      
      inline def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
      
      inline def setStatusesVarargs(value: Double*): Self = StObject.set(x, "statuses", js.Array(value*))
    }
  }
}
