package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskGroupRevision extends js.Object {
  var changeType: AuditAction
  var changedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var changedDate: stdLib.Date
  var comment: java.lang.String
  var fileId: scala.Double
  var revision: scala.Double
  var taskGroupId: java.lang.String
}

object TaskGroupRevision {
  @scala.inline
  def apply(
    changeType: AuditAction,
    changedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    changedDate: stdLib.Date,
    comment: java.lang.String,
    fileId: scala.Double,
    revision: scala.Double,
    taskGroupId: java.lang.String
  ): TaskGroupRevision = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeType")(changeType)
    __obj.updateDynamic("changedBy")(changedBy)
    __obj.updateDynamic("changedDate")(changedDate)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("fileId")(fileId)
    __obj.updateDynamic("revision")(revision)
    __obj.updateDynamic("taskGroupId")(taskGroupId)
    __obj.asInstanceOf[TaskGroupRevision]
  }
}

