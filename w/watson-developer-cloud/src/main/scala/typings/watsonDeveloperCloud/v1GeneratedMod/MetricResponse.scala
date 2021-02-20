package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The response generated from a call to a **metrics** method. */
@js.native
trait MetricResponse extends StObject {
  
  /** Array of metric aggregations. */
  var aggregations: js.UndefOr[js.Array[MetricAggregation]] = js.native
}
object MetricResponse {
  
  @scala.inline
  def apply(): MetricResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricResponse]
  }
  
  @scala.inline
  implicit class MetricResponseMutableBuilder[Self <: MetricResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregations(value: js.Array[MetricAggregation]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    @scala.inline
    def setAggregationsVarargs(value: MetricAggregation*): Self = StObject.set(x, "aggregations", js.Array(value :_*))
  }
}
