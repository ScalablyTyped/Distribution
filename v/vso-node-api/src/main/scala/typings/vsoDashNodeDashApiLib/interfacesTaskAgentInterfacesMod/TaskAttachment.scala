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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("createdOn")(createdOn)
    __obj.updateDynamic("lastChangedBy")(lastChangedBy)
    __obj.updateDynamic("lastChangedOn")(lastChangedOn)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("recordId")(recordId)
    __obj.updateDynamic("timelineId")(timelineId)
    __obj.asInstanceOf[TaskAttachment]
  }
}

