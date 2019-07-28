package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeline extends TimelineReference {
  var lastChangedBy: String
  var lastChangedOn: Date
  var records: js.Array[TimelineRecord]
}

object Timeline {
  @scala.inline
  def apply(
    changeId: Double,
    id: String,
    lastChangedBy: String,
    lastChangedOn: Date,
    location: String,
    records: js.Array[TimelineRecord]
  ): Timeline = {
    val __obj = js.Dynamic.literal(changeId = changeId, id = id, lastChangedBy = lastChangedBy, lastChangedOn = lastChangedOn, location = location, records = records)
  
    __obj.asInstanceOf[Timeline]
  }
}

