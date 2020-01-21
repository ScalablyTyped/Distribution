package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Query event data object. */
trait EventData extends js.Object {
  /** The optional timestamp for the event that was created. If not provided, the time that the event was created in the log was used. */
  var client_timestamp: js.UndefOr[String] = js.undefined
  /** The **collection_id** of the document that this event is associated with. */
  var collection_id: String
  /** The rank of the result item which the event is associated with. */
  var display_rank: js.UndefOr[Double] = js.undefined
  /** The **document_id** of the document that this event is associated with. */
  var document_id: String
  /** The **environment_id** associated with the query that the event is associated with. */
  var environment_id: String
  /** The query identifier stored in the log. The query and any events associated with that query are stored with the same **query_id**. */
  var query_id: js.UndefOr[String] = js.undefined
  /** The session token that was returned as part of the query results that this event is associated with. */
  var session_token: String
}

object EventData {
  @scala.inline
  def apply(
    collection_id: String,
    document_id: String,
    environment_id: String,
    session_token: String,
    client_timestamp: String = null,
    display_rank: Int | Double = null,
    query_id: String = null
  ): EventData = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], document_id = document_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], session_token = session_token.asInstanceOf[js.Any])
    if (client_timestamp != null) __obj.updateDynamic("client_timestamp")(client_timestamp.asInstanceOf[js.Any])
    if (display_rank != null) __obj.updateDynamic("display_rank")(display_rank.asInstanceOf[js.Any])
    if (query_id != null) __obj.updateDynamic("query_id")(query_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
}

