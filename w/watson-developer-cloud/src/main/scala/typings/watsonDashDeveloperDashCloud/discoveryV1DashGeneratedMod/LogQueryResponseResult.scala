package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Individual result object for a **logs** query. Each object represents either a query to a Discovery collection or an event that is associated with a query. */
trait LogQueryResponseResult extends js.Object {
  /** Date specified by the user when recording an event. Returned in `YYYY-MM-DDThh:mm:ssZ` format. Only returned with logs of type **event**. */
  var client_timestamp: js.UndefOr[String] = js.undefined
  /** The collection ID of the document associated with this event. Only returned with logs of type `event`. */
  var collection_id: js.UndefOr[String] = js.undefined
  /** Date that the log result was created. Returned in `YYYY-MM-DDThh:mm:ssZ` format. */
  var created_timestamp: js.UndefOr[String] = js.undefined
  /** The **customer_id** label that was specified in the header of the query or event API call that corresponds to this log entry. */
  var customer_id: js.UndefOr[String] = js.undefined
  /** The original display rank of the document associated with this event. Only returned with logs of type `event`. */
  var display_rank: js.UndefOr[Double] = js.undefined
  /** The document ID of the document associated with this event. Only returned with logs of type `event`. */
  var document_id: js.UndefOr[String] = js.undefined
  /** Object containing result information that was returned by the query used to create this log entry. Only returned with logs of type `query`. */
  var document_results: js.UndefOr[LogQueryResponseResultDocuments] = js.undefined
  /** The type of log entry returned. **query** indicates that the log represents the results of a call to the single collection **query** method. **event** indicates that the log represents  a call to the **events** API. */
  var document_type: js.UndefOr[String] = js.undefined
  /** The environment ID that is associated with this log entry. */
  var environment_id: js.UndefOr[String] = js.undefined
  /** The type of event that this object respresents. Possible values are -  `query` the log of a query to a collection -  `click` the result of a call to the **events** endpoint. */
  var event_type: js.UndefOr[String] = js.undefined
  /** The value of the **natural_language_query** query parameter that was used to create these results. Only returned with logs of type **query**. **Note:** Other query parameters (such as **filter** or **deduplicate**) might  have been used with this query, but are not recorded. */
  var natural_language_query: js.UndefOr[String] = js.undefined
  /** Identifier that corresponds to the **natural_language_query** string used in the original or associated query. All **event** and **query** log entries that have the same original **natural_language_query** string also have them same **query_id**. This field can be used to recall all **event** and **query** log results that have the same original query (**event** logs do not contain the original **natural_language_query** field). */
  var query_id: js.UndefOr[String] = js.undefined
  /** The type of result that this **event** is associated with. Only returned with logs of type `event`. */
  var result_type: js.UndefOr[String] = js.undefined
  /** Unique identifier (within a 24-hour period) that identifies a single `query` log and any `event` logs that were created for it. **Note:** If the exact same query is run at the exact same time on different days, the **session_token** for those queries might be identical. However, the **created_timestamp** differs. **Note:** Session tokens are case sensitive. To avoid matching on session tokens that are identical except for case, use the exact match operator (`::`) when you query for a specific session token. */
  var session_token: js.UndefOr[String] = js.undefined
}

object LogQueryResponseResult {
  @scala.inline
  def apply(
    client_timestamp: String = null,
    collection_id: String = null,
    created_timestamp: String = null,
    customer_id: String = null,
    display_rank: Int | Double = null,
    document_id: String = null,
    document_results: LogQueryResponseResultDocuments = null,
    document_type: String = null,
    environment_id: String = null,
    event_type: String = null,
    natural_language_query: String = null,
    query_id: String = null,
    result_type: String = null,
    session_token: String = null
  ): LogQueryResponseResult = {
    val __obj = js.Dynamic.literal()
    if (client_timestamp != null) __obj.updateDynamic("client_timestamp")(client_timestamp)
    if (collection_id != null) __obj.updateDynamic("collection_id")(collection_id)
    if (created_timestamp != null) __obj.updateDynamic("created_timestamp")(created_timestamp)
    if (customer_id != null) __obj.updateDynamic("customer_id")(customer_id)
    if (display_rank != null) __obj.updateDynamic("display_rank")(display_rank.asInstanceOf[js.Any])
    if (document_id != null) __obj.updateDynamic("document_id")(document_id)
    if (document_results != null) __obj.updateDynamic("document_results")(document_results)
    if (document_type != null) __obj.updateDynamic("document_type")(document_type)
    if (environment_id != null) __obj.updateDynamic("environment_id")(environment_id)
    if (event_type != null) __obj.updateDynamic("event_type")(event_type)
    if (natural_language_query != null) __obj.updateDynamic("natural_language_query")(natural_language_query)
    if (query_id != null) __obj.updateDynamic("query_id")(query_id)
    if (result_type != null) __obj.updateDynamic("result_type")(result_type)
    if (session_token != null) __obj.updateDynamic("session_token")(session_token)
    __obj.asInstanceOf[LogQueryResponseResult]
  }
}

