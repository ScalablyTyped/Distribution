package typings.twilioSync.livequeryMod

import typings.twilioSync.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsQueryResponse extends js.Object {
  var items: js.UndefOr[js.Array[Data]] = js.native
  var last_event_id: Double = js.native
  var query_id: String = js.native
}

object InsightsQueryResponse {
  @scala.inline
  def apply(last_event_id: Double, query_id: String): InsightsQueryResponse = {
    val __obj = js.Dynamic.literal(last_event_id = last_event_id.asInstanceOf[js.Any], query_id = query_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsQueryResponse]
  }
  @scala.inline
  implicit class InsightsQueryResponseOps[Self <: InsightsQueryResponse] (val x: Self) extends AnyVal {
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
    def setLast_event_id(value: Double): Self = this.set("last_event_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery_id(value: String): Self = this.set("query_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: Data*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Data]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

