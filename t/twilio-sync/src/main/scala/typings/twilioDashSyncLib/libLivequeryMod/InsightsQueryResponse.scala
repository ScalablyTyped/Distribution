package typings
package twilioDashSyncLib.libLivequeryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightsQueryResponse extends js.Object {
  var items: js.UndefOr[js.Array[InsightsItem]] = js.undefined
  var query_id: java.lang.String
}

object InsightsQueryResponse {
  @scala.inline
  def apply(query_id: java.lang.String, items: js.Array[InsightsItem] = null): InsightsQueryResponse = {
    val __obj = js.Dynamic.literal(query_id = query_id)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[InsightsQueryResponse]
  }
}

