package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskGroupRevision extends js.Object {
  var changeType: AuditAction
  var changedBy: IdentityRef
  var changedDate: Date
  var comment: String
  var fileId: Double
  var revision: Double
  var taskGroupId: String
}

object TaskGroupRevision {
  @scala.inline
  def apply(
    changeType: AuditAction,
    changedBy: IdentityRef,
    changedDate: Date,
    comment: String,
    fileId: Double,
    revision: Double,
    taskGroupId: String
  ): TaskGroupRevision = {
    val __obj = js.Dynamic.literal(changeType = changeType, changedBy = changedBy, changedDate = changedDate, comment = comment, fileId = fileId, revision = revision, taskGroupId = taskGroupId)
  
    __obj.asInstanceOf[TaskGroupRevision]
  }
}

