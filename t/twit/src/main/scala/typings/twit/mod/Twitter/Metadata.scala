package typings.twit.mod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  var completed_in: js.UndefOr[Double] = js.native
  var count: js.UndefOr[Double] = js.native
  var max_id: js.UndefOr[Double] = js.native
  var max_id_str: js.UndefOr[String] = js.native
  var next_results: js.UndefOr[String] = js.native
  var query: js.UndefOr[String] = js.native
  var refresh_url: js.UndefOr[String] = js.native
  var since_id: js.UndefOr[Double] = js.native
  var since_id_str: js.UndefOr[String] = js.native
}

object Metadata {
  @scala.inline
  def apply(): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
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
    def setCompleted_in(value: Double): Self = this.set("completed_in", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompleted_in: Self = this.set("completed_in", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setMax_id(value: Double): Self = this.set("max_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_id: Self = this.set("max_id", js.undefined)
    @scala.inline
    def setMax_id_str(value: String): Self = this.set("max_id_str", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_id_str: Self = this.set("max_id_str", js.undefined)
    @scala.inline
    def setNext_results(value: String): Self = this.set("next_results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext_results: Self = this.set("next_results", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setRefresh_url(value: String): Self = this.set("refresh_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefresh_url: Self = this.set("refresh_url", js.undefined)
    @scala.inline
    def setSince_id(value: Double): Self = this.set("since_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSince_id: Self = this.set("since_id", js.undefined)
    @scala.inline
    def setSince_id_str(value: String): Self = this.set("since_id_str", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSince_id_str: Self = this.set("since_id_str", js.undefined)
  }
  
}

