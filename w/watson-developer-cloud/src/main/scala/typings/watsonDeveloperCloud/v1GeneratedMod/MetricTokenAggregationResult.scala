package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Aggregation result data for the requested metric. */
trait MetricTokenAggregationResult extends StObject {
  
  /** The number of queries with associated events divided by the total number of queries currently stored (queries and events are stored in the log for 30 days). */
  var event_rate: js.UndefOr[Double] = js.undefined
  
  /** The content of the **natural_language_query** parameter used in the query that this result represents. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.undefined
}
object MetricTokenAggregationResult {
  
  @scala.inline
  def apply(): MetricTokenAggregationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricTokenAggregationResult]
  }
  
  @scala.inline
  implicit class MetricTokenAggregationResultMutableBuilder[Self <: MetricTokenAggregationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent_rate(value: Double): Self = StObject.set(x, "event_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent_rateUndefined: Self = StObject.set(x, "event_rate", js.undefined)
    
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
