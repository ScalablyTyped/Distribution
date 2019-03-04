package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeline extends TimelineReference {
  var lastChangedBy: java.lang.String
  var lastChangedOn: stdLib.Date
  var records: js.Array[TimelineRecord]
}

object Timeline {
  @scala.inline
  def apply(
    changeId: scala.Double,
    id: java.lang.String,
    lastChangedBy: java.lang.String,
    lastChangedOn: stdLib.Date,
    location: java.lang.String,
    records: js.Array[TimelineRecord]
  ): Timeline = {
    val __obj = js.Dynamic.literal(changeId = changeId, id = id, lastChangedBy = lastChangedBy, lastChangedOn = lastChangedOn, location = location, records = records)
  
    __obj.asInstanceOf[Timeline]
  }
}

