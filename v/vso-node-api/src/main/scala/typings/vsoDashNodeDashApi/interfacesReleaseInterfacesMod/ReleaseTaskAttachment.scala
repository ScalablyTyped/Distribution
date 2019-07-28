package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseTaskAttachment extends js.Object {
  var _links: js.Any
  var createdOn: Date
  var modifiedBy: String
  var modifiedOn: Date
  var name: String
  var recordId: String
  var timelineId: String
  var `type`: String
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
    val __obj = js.Dynamic.literal(_links = _links, createdOn = createdOn, modifiedBy = modifiedBy, modifiedOn = modifiedOn, name = name, recordId = recordId, timelineId = timelineId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReleaseTaskAttachment]
  }
}

