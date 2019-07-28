package typings.twilioDashSync.libSyncmapMod

import typings.std.Date
import typings.twilioDashSync.libMapitemMod.MapItemDescriptor
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
    val __obj = js.Dynamic.literal(date_expires = date_expires, date_updated = date_updated, last_event_id = last_event_id, links = links, revision = revision, sid = sid, unique_name = unique_name, url = url)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[MapDescriptor]
  }
}

