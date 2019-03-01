package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeline extends TimelineReference {
  /**
    * The process or person that last changed the timeline.
    */
  var lastChangedBy: java.lang.String
  /**
    * The time the timeline was last changed.
    */
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
    records: js.Array[TimelineRecord],
    url: java.lang.String
  ): Timeline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeId")(changeId)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("lastChangedBy")(lastChangedBy)
    __obj.updateDynamic("lastChangedOn")(lastChangedOn)
    __obj.updateDynamic("records")(records)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Timeline]
  }
}

