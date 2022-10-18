package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The response generated from a call to a **metrics** method that evaluates tokens. */
trait MetricTokenResponse extends StObject {
  
  /** Array of metric token aggregations. */
  var aggregations: js.UndefOr[js.Array[MetricTokenAggregation]] = js.undefined
}
object MetricTokenResponse {
  
  inline def apply(): MetricTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricTokenResponse]
  }
  
  extension [Self <: MetricTokenResponse](x: Self) {
    
    inline def setAggregations(value: js.Array[MetricTokenAggregation]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    inline def setAggregationsVarargs(value: MetricTokenAggregation*): Self = StObject.set(x, "aggregations", js.Array(value*))
  }
}
