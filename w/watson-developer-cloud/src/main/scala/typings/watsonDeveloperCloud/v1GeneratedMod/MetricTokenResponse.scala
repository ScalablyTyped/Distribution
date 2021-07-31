package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The response generated from a call to a **metrics** method that evaluates tokens. */
trait MetricTokenResponse extends StObject {
  
  /** Array of metric token aggregations. */
  var aggregations: js.UndefOr[js.Array[MetricTokenAggregation]] = js.undefined
}
object MetricTokenResponse {
  
  @scala.inline
  def apply(): MetricTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricTokenResponse]
  }
  
  @scala.inline
  implicit class MetricTokenResponseMutableBuilder[Self <: MetricTokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregations(value: js.Array[MetricTokenAggregation]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    @scala.inline
    def setAggregationsVarargs(value: MetricTokenAggregation*): Self = StObject.set(x, "aggregations", js.Array(value :_*))
  }
}
