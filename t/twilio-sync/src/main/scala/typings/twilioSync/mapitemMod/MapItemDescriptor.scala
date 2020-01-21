package typings.twilioSync.mapitemMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapItemDescriptor extends js.Object {
  var data: js.Object
  var date_expires: String
  var date_updated: Date
  var key: String
  var last_event_id: Double
  var revision: String
  var url: String
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
}

