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
    val __obj = js.Dynamic.literal(changeType = changeType, changedBy = changedBy, changedDate = changedDate, comment = comment, fileId = fileId, revision = revision, taskGroupId = taskGroupId)
  
    __obj.asInstanceOf[TaskGroupRevision]
  }
}

