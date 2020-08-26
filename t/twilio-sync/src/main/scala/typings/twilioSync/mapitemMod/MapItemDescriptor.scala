package typings.twilioSync.mapitemMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapItemDescriptor extends js.Object {
  var data: js.Object = js.native
  var date_expires: String = js.native
  var date_updated: Date = js.native
  var key: String = js.native
  var last_event_id: Double = js.native
  var revision: String = js.native
  var url: String = js.native
}

object MapItemDescriptor {
  @scala.inline
  def apply(
    data: js.Object,
    date_expires: String,
    date_updated: Date,
    key: String,
    last_event_id: Double,
    revision: String,
    url: String
  ): MapItemDescriptor = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], date_expires = date_expires.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], last_event_id = last_event_id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapItemDescriptor]
  }
  @scala.inline
  implicit class MapItemDescriptorOps[Self <: MapItemDescriptor] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_event_id(value: Double): Self = this.set("last_event_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: String): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

