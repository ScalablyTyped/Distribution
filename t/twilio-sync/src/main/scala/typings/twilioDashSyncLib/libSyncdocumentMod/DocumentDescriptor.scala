package typings
package twilioDashSyncLib.libSyncdocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentDescriptor extends js.Object {
  var data: js.Object
  var date_expires: java.lang.String
  var date_updated: stdLib.Date
  var last_event_id: scala.Double
  var revision: java.lang.String
  var sid: java.lang.String
  var unique_name: java.lang.String
  var url: java.lang.String
}

object DocumentDescriptor {
  @scala.inline
  def apply(
    data: js.Object,
    date_expires: java.lang.String,
    date_updated: stdLib.Date,
    last_event_id: scala.Double,
    revision: java.lang.String,
    sid: java.lang.String,
    unique_name: java.lang.String,
    url: java.lang.String
  ): DocumentDescriptor = {
    val __obj = js.Dynamic.literal(data = data, date_expires = date_expires, date_updated = date_updated, last_event_id = last_event_id, revision = revision, sid = sid, unique_name = unique_name, url = url)
  
    __obj.asInstanceOf[DocumentDescriptor]
  }
}

