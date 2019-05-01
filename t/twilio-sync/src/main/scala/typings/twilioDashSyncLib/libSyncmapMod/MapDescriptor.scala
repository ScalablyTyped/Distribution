package typings
package twilioDashSyncLib.libSyncmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapDescriptor extends js.Object {
  var date_expires: java.lang.String
  var date_updated: stdLib.Date
  var items: js.UndefOr[js.Array[twilioDashSyncLib.libMapitemMod.MapItemDescriptor]] = js.undefined
  var last_event_id: scala.Double
  var links: js.Any
  var revision: java.lang.String
  var sid: java.lang.String
  var unique_name: java.lang.String
  var url: java.lang.String
}

object MapDescriptor {
  @scala.inline
  def apply(
    date_expires: java.lang.String,
    date_updated: stdLib.Date,
    last_event_id: scala.Double,
    links: js.Any,
    revision: java.lang.String,
    sid: java.lang.String,
    unique_name: java.lang.String,
    url: java.lang.String,
    items: js.Array[twilioDashSyncLib.libMapitemMod.MapItemDescriptor] = null
  ): MapDescriptor = {
    val __obj = js.Dynamic.literal(date_expires = date_expires, date_updated = date_updated, last_event_id = last_event_id, links = links, revision = revision, sid = sid, unique_name = unique_name, url = url)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[MapDescriptor]
  }
}

