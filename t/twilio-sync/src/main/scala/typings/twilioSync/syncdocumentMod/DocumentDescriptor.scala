package typings.twilioSync.syncdocumentMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentDescriptor extends js.Object {
  var data: js.Object = js.native
  var date_expires: String = js.native
  var date_updated: Date = js.native
  var last_event_id: Double = js.native
  var revision: String = js.native
  var sid: String = js.native
  var unique_name: String = js.native
  var url: String = js.native
}

object DocumentDescriptor {
  @scala.inline
  def apply(
    data: js.Object,
    date_expires: String,
    date_updated: Date,
    last_event_id: Double,
    revision: String,
    sid: String,
    unique_name: String,
    url: String
  ): DocumentDescriptor = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], date_expires = date_expires.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], last_event_id = last_event_id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentDescriptor]
  }
  @scala.inline
  implicit class DocumentDescriptorOps[Self <: DocumentDescriptor] (val x: Self) extends AnyVal {
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
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate_expires(value: String): Self = this.set("date_expires", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate_updated(value: Date): Self = this.set("date_updated", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_event_id(value: Double): Self = this.set("last_event_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: String): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setSid(value: String): Self = this.set("sid", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnique_name(value: String): Self = this.set("unique_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

