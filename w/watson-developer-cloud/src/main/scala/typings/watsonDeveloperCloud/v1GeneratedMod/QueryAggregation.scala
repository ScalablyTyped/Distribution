package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An aggregation produced by the Discovery service to analyze the input provided. */
@js.native
trait QueryAggregation extends js.Object {
  
  /** Aggregations returned by the Discovery service. */
  var aggregations: js.UndefOr[js.Array[QueryAggregation]] = js.native
  
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.native
  
  /** Array of aggregation results. */
  var results: js.UndefOr[js.Array[AggregationResult]] = js.native
  
  /** The type of aggregation command used. For example: term, filter, max, min, etc. */
  var `type`: js.UndefOr[String] = js.native
}
object QueryAggregation {
  
  @scala.inline
  def apply(): QueryAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryAggregation]
  }
  
  @scala.inline
  implicit class QueryAggregationOps[Self <: QueryAggregation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAggregationsVarargs(value: QueryAggregation*): Self = this.set("aggregations", js.Array(value :_*))
    
    @scala.inline
    def setAggregations(value: js.Array[QueryAggregation]): Self = this.set("aggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregations: Self = this.set("aggregations", js.undefined)
    
    @scala.inline
    def setMatching_results(value: Double): Self = this.set("matching_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatching_results: Self = this.set("matching_results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: AggregationResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[AggregationResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
