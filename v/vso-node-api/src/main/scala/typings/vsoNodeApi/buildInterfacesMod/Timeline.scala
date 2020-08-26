package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timeline extends TimelineReference {
  /**
    * The process or person that last changed the timeline.
    */
  var lastChangedBy: String = js.native
  /**
    * The time the timeline was last changed.
    */
  var lastChangedOn: Date = js.native
  var records: js.Array[TimelineRecord] = js.native
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
  @scala.inline
  implicit class TimelineOps[Self <: Timeline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLastChangedBy(value: String): Self = this.set("lastChangedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastChangedOn(value: Date): Self = this.set("lastChangedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordsVarargs(value: TimelineRecord*): Self = this.set("records", js.Array(value :_*))
    @scala.inline
    def setRecords(value: js.Array[TimelineRecord]): Self = this.set("records", value.asInstanceOf[js.Any])
  }
  
}

