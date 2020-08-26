package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskGroupRevision extends js.Object {
  var changeType: AuditAction = js.native
  var changedBy: IdentityRef = js.native
  var changedDate: Date = js.native
  var comment: String = js.native
  var fileId: Double = js.native
  var revision: Double = js.native
  var taskGroupId: String = js.native
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
  @scala.inline
  implicit class TaskGroupRevisionOps[Self <: TaskGroupRevision] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChangeType(value: AuditAction): Self = this.set("changeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedBy(value: IdentityRef): Self = this.set("changedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedDate(value: Date): Self = this.set("changedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileId(value: Double): Self = this.set("fileId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskGroupId(value: String): Self = this.set("taskGroupId", value.asInstanceOf[js.Any])
  }
  
}

