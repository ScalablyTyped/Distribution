package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseTaskAttachment extends js.Object {
  var _links: js.Any
  var createdOn: stdLib.Date
  var modifiedBy: java.lang.String
  var modifiedOn: stdLib.Date
  var name: java.lang.String
  var recordId: java.lang.String
  var timelineId: java.lang.String
  var `type`: java.lang.String
}

object ReleaseTaskAttachment {
  @scala.inline
  def apply(
    _links: js.Any,
    createdOn: stdLib.Date,
    modifiedBy: java.lang.String,
    modifiedOn: stdLib.Date,
    name: java.lang.String,
    recordId: java.lang.String,
    timelineId: java.lang.String,
    `type`: java.lang.String
  ): ReleaseTaskAttachment = {
    val __obj = js.Dynamic.literal(_links = _links, createdOn = createdOn, modifiedBy = modifiedBy, modifiedOn = modifiedOn, name = name, recordId = recordId, timelineId = timelineId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReleaseTaskAttachment]
  }
}

