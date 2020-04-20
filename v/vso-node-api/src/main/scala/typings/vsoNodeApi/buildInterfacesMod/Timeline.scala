package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeline extends TimelineReference {
  /**
    * The process or person that last changed the timeline.
    */
  var lastChangedBy: String
  /**
    * The time the timeline was last changed.
    */
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
    records: js.Array[TimelineRecord],
    url: String
  ): Timeline = {
    val __obj = js.Dynamic.literal(changeId = changeId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastChangedBy = lastChangedBy.asInstanceOf[js.Any], lastChangedOn = lastChangedOn.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeline]
  }
}

