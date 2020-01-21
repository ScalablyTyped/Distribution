package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A response containing the documents and aggregations for the query. */
trait QueryResponse extends js.Object {
  /** Array of aggregation results for the query. */
  var aggregations: js.UndefOr[js.Array[QueryAggregation]] = js.undefined
  /** The number of duplicate results removed. */
  var duplicates_removed: js.UndefOr[Double] = js.undefined
  /** The number of matching results for the query. */
  var matching_results: js.UndefOr[Double] = js.undefined
  /** Array of passage results for the query. */
  var passages: js.UndefOr[js.Array[QueryPassages]] = js.undefined
  /** Array of document results for the query. */
  var results: js.UndefOr[js.Array[QueryResult]] = js.undefined
  /** An object contain retrieval type information. */
  var retrieval_details: js.UndefOr[RetrievalDetails] = js.undefined
  /** The session token for this query. The session token can be used to add events associated with this query to the query and event log. **Important:** Session tokens are case sensitive. */
  var session_token: js.UndefOr[String] = js.undefined
}

object QueryResponse {
  @scala.inline
  def apply(
    aggregations: js.Array[QueryAggregation] = null,
    duplicates_removed: Int | Double = null,
    matching_results: Int | Double = null,
    passages: js.Array[QueryPassages] = null,
    results: js.Array[QueryResult] = null,
    retrieval_details: RetrievalDetails = null,
    session_token: String = null
  ): QueryResponse = {
    val __obj = js.Dynamic.literal()
    if (aggregations != null) __obj.updateDynamic("aggregations")(aggregations.asInstanceOf[js.Any])
    if (duplicates_removed != null) __obj.updateDynamic("duplicates_removed")(duplicates_removed.asInstanceOf[js.Any])
    if (matching_results != null) __obj.updateDynamic("matching_results")(matching_results.asInstanceOf[js.Any])
    if (passages != null) __obj.updateDynamic("passages")(passages.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (retrieval_details != null) __obj.updateDynamic("retrieval_details")(retrieval_details.asInstanceOf[js.Any])
    if (session_token != null) __obj.updateDynamic("session_token")(session_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResponse]
  }
}

