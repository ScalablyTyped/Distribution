package typings.twilioDashSync.libSyncdocumentMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentDescriptor extends js.Object {
  var data: js.Object
  var date_expires: String
  var date_updated: Date
  var last_event_id: Double
  var revision: String
  var sid: String
  var unique_name: String
  var url: String
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
}

