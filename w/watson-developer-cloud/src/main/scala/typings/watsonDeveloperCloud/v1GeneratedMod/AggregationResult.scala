package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * model interfaces
  ************************/
/** AggregationResult. */
@js.native
trait AggregationResult extends js.Object {
  
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
  implicit class AggregationResultOps[Self <: AggregationResult] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMatching_results(value: Double): Self = this.set("matching_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatching_results: Self = this.set("matching_results", js.undefined)
  }
}
