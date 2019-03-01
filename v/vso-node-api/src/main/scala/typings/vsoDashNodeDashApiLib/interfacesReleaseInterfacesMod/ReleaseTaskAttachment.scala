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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("createdOn")(createdOn)
    __obj.updateDynamic("modifiedBy")(modifiedBy)
    __obj.updateDynamic("modifiedOn")(modifiedOn)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("recordId")(recordId)
    __obj.updateDynamic("timelineId")(timelineId)
    __obj.asInstanceOf[ReleaseTaskAttachment]
  }
}

