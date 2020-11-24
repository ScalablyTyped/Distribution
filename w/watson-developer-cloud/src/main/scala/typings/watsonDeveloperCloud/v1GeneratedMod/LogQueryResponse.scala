package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object containing results that match the requested **logs** query. */
@js.native
trait LogQueryResponse extends js.Object {
  
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.native
  
  /** Array of log query response results. */
  var results: js.UndefOr[js.Array[LogQueryResponseResult]] = js.native
}
object LogQueryResponse {
  
  @scala.inline
  def apply(): LogQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogQueryResponse]
  }
  
  @scala.inline
  implicit class LogQueryResponseOps[Self <: LogQueryResponse] (val x: Self) extends AnyVal {
    
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
    def setMatching_results(value: Double): Self = this.set("matching_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatching_results: Self = this.set("matching_results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: LogQueryResponseResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[LogQueryResponseResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
}
