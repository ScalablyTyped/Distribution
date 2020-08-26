package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A response containing the documents and aggregations for the query. */
@js.native
trait QueryResponse extends js.Object {
  /** Array of aggregation results for the query. */
  var aggregations: js.UndefOr[js.Array[QueryAggregation]] = js.native
  /** The number of duplicate results removed. */
  var duplicates_removed: js.UndefOr[Double] = js.native
  /** The number of matching results for the query. */
  var matching_results: js.UndefOr[Double] = js.native
  /** Array of passage results for the query. */
  var passages: js.UndefOr[js.Array[QueryPassages]] = js.native
  /** Array of document results for the query. */
  var results: js.UndefOr[js.Array[QueryResult]] = js.native
  /** An object contain retrieval type information. */
  var retrieval_details: js.UndefOr[RetrievalDetails] = js.native
  /** The session token for this query. The session token can be used to add events associated with this query to the query and event log. **Important:** Session tokens are case sensitive. */
  var session_token: js.UndefOr[String] = js.native
}

object QueryResponse {
  @scala.inline
  def apply(): QueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResponse]
  }
  @scala.inline
  implicit class QueryResponseOps[Self <: QueryResponse] (val x: Self) extends AnyVal {
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
    def setResultsVarargs(value: QueryResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[QueryResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setRetrieval_details(value: RetrievalDetails): Self = this.set("retrieval_details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetrieval_details: Self = this.set("retrieval_details", js.undefined)
    @scala.inline
    def setSession_token(value: String): Self = this.set("session_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession_token: Self = this.set("session_token", js.undefined)
  }
  
}

