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
    val __obj = js.Dynamic.literal(dateExpires = dateExpires, dateUpdated = dateUpdated, index = index, lastEventId = lastEventId, revision = revision, uri = uri, value = value)
  
    __obj.asInstanceOf[ListItemDescriptor]
  }
}

