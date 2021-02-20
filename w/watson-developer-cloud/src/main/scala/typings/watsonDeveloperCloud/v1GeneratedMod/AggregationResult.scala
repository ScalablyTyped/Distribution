package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * model interfaces
  ************************/
/** AggregationResult. */
@js.native
trait AggregationResult extends StObject {
  
  /** Aggregations returned in the case of chained aggregations. */
  var aggregations: js.UndefOr[js.Array[QueryAggregation]] = js.native
  
  /** Key that matched the aggregation type. */
  var key: js.UndefOr[String] = js.native
  
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.native
}
object AggregationResult {
  
  @scala.inline
  def apply(): AggregationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationResult]
  }
  
  @scala.inline
  implicit class AggregationResultMutableBuilder[Self <: AggregationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregations(value: js.Array[QueryAggregation]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    @scala.inline
    def setAggregationsVarargs(value: QueryAggregation*): Self = StObject.set(x, "aggregations", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMatching_results(value: Double): Self = StObject.set(x, "matching_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatching_resultsUndefined: Self = StObject.set(x, "matching_results", js.undefined)
  }
}
