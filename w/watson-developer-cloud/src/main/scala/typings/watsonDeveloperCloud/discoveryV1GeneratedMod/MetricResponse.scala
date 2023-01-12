package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The response generated from a call to a **metrics** method. */
trait MetricResponse extends StObject {
  
  /** Array of metric aggregations. */
  var aggregations: js.UndefOr[js.Array[MetricAggregation]] = js.undefined
}
object MetricResponse {
  
  inline def apply(): MetricResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricResponse] (val x: Self) extends AnyVal {
    
    inline def setAggregations(value: js.Array[MetricAggregation]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    inline def setAggregationsVarargs(value: MetricAggregation*): Self = StObject.set(x, "aggregations", js.Array(value*))
  }
}
