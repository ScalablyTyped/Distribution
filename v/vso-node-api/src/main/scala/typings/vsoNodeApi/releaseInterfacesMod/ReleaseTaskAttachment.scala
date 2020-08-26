package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseTaskAttachment extends js.Object {
  var _links: js.Any = js.native
  var createdOn: Date = js.native
  var modifiedBy: String = js.native
  var modifiedOn: Date = js.native
  var name: String = js.native
  var recordId: String = js.native
  var timelineId: String = js.native
  var `type`: String = js.native
}

object ReleaseTaskAttachment {
  @scala.inline
  def apply(
    _links: js.Any,
    createdOn: Date,
    modifiedBy: String,
    modifiedOn: Date,
    name: String,
    recordId: String,
    timelineId: String,
    `type`: String
  ): ReleaseTaskAttachment = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], modifiedBy = modifiedBy.asInstanceOf[js.Any], modifiedOn = modifiedOn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recordId = recordId.asInstanceOf[js.Any], timelineId = timelineId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseTaskAttachment]
  }
  @scala.inline
  implicit class ReleaseTaskAttachmentOps[Self <: ReleaseTaskAttachment] (val x: Self) extends AnyVal {
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedOn(value: Date): Self = this.set("createdOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedBy(value: String): Self = this.set("modifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifiedOn(value: Date): Self = this.set("modifiedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordId(value: String): Self = this.set("recordId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimelineId(value: String): Self = this.set("timelineId", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

