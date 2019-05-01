package typings
package twilioDashSyncLib.libListitemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemDescriptor extends js.Object {
  var dateExpires: java.lang.String
  var dateUpdated: stdLib.Date
  var index: scala.Double
  var lastEventId: scala.Double
  var revision: java.lang.String
  var uri: java.lang.String
  var value: js.Object
}

object ListItemDescriptor {
  @scala.inline
  def apply(
    dateExpires: java.lang.String,
    dateUpdated: stdLib.Date,
    index: scala.Double,
    lastEventId: scala.Double,
    revision: java.lang.String,
    uri: java.lang.String,
    value: js.Object
  ): ListItemDescriptor = {
    val __obj = js.Dynamic.literal(dateExpires = dateExpires, dateUpdated = dateUpdated, index = index, lastEventId = lastEventId, revision = revision, uri = uri, value = value)
  
    __obj.asInstanceOf[ListItemDescriptor]
  }
}

