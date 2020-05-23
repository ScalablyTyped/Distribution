package typings.twilioSync.livequeryMod

import typings.twilioSync.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsQueryResponse extends js.Object {
  var items: js.UndefOr[js.Array[Data]] = js.undefined
  var last_event_id: Double
  var query_id: String
}

object InsightsQueryResponse {
  @scala.inline
  def apply(last_event_id: Double, query_id: String, items: js.Array[Data] = null): InsightsQueryResponse = {
    val __obj = js.Dynamic.literal(last_event_id = last_event_id.asInstanceOf[js.Any], query_id = query_id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsQueryResponse]
  }
}

