package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAttachment extends js.Object {
  var _links: js.Any
  var createdOn: Date
  var lastChangedBy: String
  var lastChangedOn: Date
  var name: String
  var recordId: String
  var timelineId: String
  var `type`: String
}

object TaskAttachment {
  @scala.inline
  def apply(
    _links: js.Any,
    createdOn: Date,
    lastChangedBy: String,
    lastChangedOn: Date,
    name: String,
    recordId: String,
    timelineId: String,
    `type`: String
  ): TaskAttachment = {
    val __obj = js.Dynamic.literal(_links = _links, createdOn = createdOn, lastChangedBy = lastChangedBy, lastChangedOn = lastChangedOn, name = name, recordId = recordId, timelineId = timelineId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TaskAttachment]
  }
}

