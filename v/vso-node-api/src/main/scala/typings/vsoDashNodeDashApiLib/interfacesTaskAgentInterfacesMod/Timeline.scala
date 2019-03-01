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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeId")(changeId)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("lastChangedBy")(lastChangedBy)
    __obj.updateDynamic("lastChangedOn")(lastChangedOn)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("records")(records)
    __obj.asInstanceOf[Timeline]
  }
}

