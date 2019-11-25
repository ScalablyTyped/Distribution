package typings.twilioDashSync.libListitemMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemDescriptor extends js.Object {
  var dateExpires: String
  var dateUpdated: Date
  var index: Double
  var lastEventId: Double
  var revision: String
  var uri: String
  var value: js.Object
}

object ListItemDescriptor {
  @scala.inline
  def apply(
    dateExpires: String,
    dateUpdated: Date,
    index: Double,
    lastEventId: Double,
    revision: String,
    uri: String,
    value: js.Object
  ): ListItemDescriptor = {
    val __obj = js.Dynamic.literal(dateExpires = dateExpires.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], lastEventId = lastEventId.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListItemDescriptor]
  }
}

