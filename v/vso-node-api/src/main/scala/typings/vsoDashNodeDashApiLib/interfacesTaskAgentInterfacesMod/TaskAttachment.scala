package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAttachment extends js.Object {
  var _links: js.Any
  var createdOn: stdLib.Date
  var lastChangedBy: java.lang.String
  var lastChangedOn: stdLib.Date
  var name: java.lang.String
  var recordId: java.lang.String
  var timelineId: java.lang.String
  var `type`: java.lang.String
}

object TaskAttachment {
  @scala.inline
  def apply(
    _links: js.Any,
    createdOn: stdLib.Date,
    lastChangedBy: java.lang.String,
    lastChangedOn: stdLib.Date,
    name: java.lang.String,
    recordId: java.lang.String,
    timelineId: java.lang.String,
    `type`: java.lang.String
  ): TaskAttachment = {
    val __obj = js.Dynamic.literal(_links = _links, createdOn = createdOn, lastChangedBy = lastChangedBy, lastChangedOn = lastChangedOn, name = name, recordId = recordId, timelineId = timelineId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TaskAttachment]
  }
}

