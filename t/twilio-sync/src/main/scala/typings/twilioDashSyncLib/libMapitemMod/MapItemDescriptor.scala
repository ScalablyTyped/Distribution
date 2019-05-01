package typings
package twilioDashSyncLib.libMapitemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapItemDescriptor extends js.Object {
  var data: js.Object
  var date_expires: java.lang.String
  var date_updated: stdLib.Date
  var key: java.lang.String
  var last_event_id: scala.Double
  var revision: java.lang.String
  var url: java.lang.String
}

object MapItemDescriptor {
  @scala.inline
  def apply(
    data: js.Object,
    date_expires: java.lang.String,
    date_updated: stdLib.Date,
    key: java.lang.String,
    last_event_id: scala.Double,
    revision: java.lang.String,
    url: java.lang.String
  ): MapItemDescriptor = {
    val __obj = js.Dynamic.literal(data = data, date_expires = date_expires, date_updated = date_updated, key = key, last_event_id = last_event_id, revision = revision, url = url)
  
    __obj.asInstanceOf[MapItemDescriptor]
  }
}

