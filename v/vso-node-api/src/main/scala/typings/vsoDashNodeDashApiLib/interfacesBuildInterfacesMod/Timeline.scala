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
    val __obj = js.Dynamic.literal(changeId = changeId, id = id, lastChangedBy = lastChangedBy, lastChangedOn = lastChangedOn, records = records, url = url)
  
    __obj.asInstanceOf[Timeline]
  }
}

