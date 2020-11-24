package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TopHitsResults. */
@js.native
trait TopHitsResults extends js.Object {
  
  /** Top results returned by the aggregation. */
  var hits: js.UndefOr[js.Array[QueryResult]] = js.native
  
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.native
}
object TopHitsResults {
  
  @scala.inline
  def apply(): TopHitsResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopHitsResults]
  }
  
  @scala.inline
  implicit class TopHitsResultsOps[Self <: TopHitsResults] (val x: Self) extends AnyVal {
    
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
    def setHitsVarargs(value: QueryResult*): Self = this.set("hits", js.Array(value :_*))
    
    @scala.inline
    def setHits(value: js.Array[QueryResult]): Self = this.set("hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHits: Self = this.set("hits", js.undefined)
    
    @scala.inline
    def setMatching_results(value: Double): Self = this.set("matching_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatching_results: Self = this.set("matching_results", js.undefined)
  }
}
