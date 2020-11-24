package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** QueryNoticesResponse. */
@js.native
trait QueryNoticesResponse extends js.Object {
  
  /** Array of aggregation results that match the query. */
  var aggregations: js.UndefOr[js.Array[QueryAggregation]] = js.native
  
  /** The number of duplicates removed from this notices query. */
  var duplicates_removed: js.UndefOr[Double] = js.native
  
  /** The number of matching results. */
  var matching_results: js.UndefOr[Double] = js.native
  
  /** Array of passage results that match the query. */
  var passages: js.UndefOr[js.Array[QueryPassages]] = js.native
  
  /** Array of document results that match the query. */
  var results: js.UndefOr[js.Array[QueryNoticesResult]] = js.native
}
object QueryNoticesResponse {
  
  @scala.inline
  def apply(): QueryNoticesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryNoticesResponse]
  }
  
  @scala.inline
  implicit class QueryNoticesResponseOps[Self <: QueryNoticesResponse] (val x: Self) extends AnyVal {
    
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
    def setDuplicates_removed(value: Double): Self = this.set("duplicates_removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuplicates_removed: Self = this.set("duplicates_removed", js.undefined)
    
    @scala.inline
    def setMatching_results(value: Double): Self = this.set("matching_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatching_results: Self = this.set("matching_results", js.undefined)
    
    @scala.inline
    def setPassagesVarargs(value: QueryPassages*): Self = this.set("passages", js.Array(value :_*))
    
    @scala.inline
    def setPassages(value: js.Array[QueryPassages]): Self = this.set("passages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassages: Self = this.set("passages", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: QueryNoticesResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[QueryNoticesResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
}
