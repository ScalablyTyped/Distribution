package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], changedBy = changedBy.asInstanceOf[js.Any], changedDate = changedDate.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], fileId = fileId.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], taskGroupId = taskGroupId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskGroupRevision]
  }
}

