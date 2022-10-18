package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `getMetricsQueryTokenEvent` operation. */
trait GetMetricsQueryTokenEventParams extends StObject {
  
  /** Number of results to return. The maximum for the **count** and **offset** values together in any one query is **10000**. */
  var count: js.UndefOr[Double] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object GetMetricsQueryTokenEventParams {
  
  inline def apply(): GetMetricsQueryTokenEventParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricsQueryTokenEventParams]
  }
  
  extension [Self <: GetMetricsQueryTokenEventParams](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
