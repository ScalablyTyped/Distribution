package typings.twilioSync.syncmapMod

import typings.std.Date
import typings.twilioSync.mapitemMod.MapItemDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapDescriptor extends js.Object {
  var date_expires: String
  var date_updated: Date
  var items: js.UndefOr[js.Array[MapItemDescriptor]] = js.undefined
  var last_event_id: Double
  var links: js.Any
  var revision: String
  var sid: String
  var unique_name: String
  var url: String
}

object MapDescriptor {
  @scala.inline
  def apply(
    date_expires: String,
    date_updated: Date,
    last_event_id: Double,
    links: js.Any,
    revision: String,
    sid: String,
    unique_name: String,
    url: String,
    items: js.Array[MapItemDescriptor] = null
  ): MapDescriptor = {
    val __obj = js.Dynamic.literal(date_expires = date_expires.asInstanceOf[js.Any], date_updated = date_updated.asInstanceOf[js.Any], last_event_id = last_event_id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDescriptor]
  }
}

