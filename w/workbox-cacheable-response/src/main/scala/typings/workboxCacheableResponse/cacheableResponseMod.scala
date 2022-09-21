package typings.workboxCacheableResponse

import typings.std.Record
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheableResponseMod {
  
  @JSImport("workbox-cacheable-response/CacheableResponse", "CacheableResponse")
  @js.native
  open class CacheableResponse () extends StObject {
    def this(config: CacheableResponseConfig) = this()
    
    def isResponseCacheable(response: Response): Boolean = js.native
  }
  
  trait CacheableResponseConfig extends StObject {
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var statuses: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object CacheableResponseConfig {
    
    inline def apply(): CacheableResponseConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheableResponseConfig]
    }
    
    extension [Self <: CacheableResponseConfig](x: Self) {
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setStatuses(value: js.Array[Double]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
      
      inline def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
      
      inline def setStatusesVarargs(value: Double*): Self = StObject.set(x, "statuses", js.Array(value*))
    }
  }
}
