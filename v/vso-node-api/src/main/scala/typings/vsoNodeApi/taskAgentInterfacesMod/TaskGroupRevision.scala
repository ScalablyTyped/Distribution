package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskGroupRevision extends StObject {
  
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
  implicit class TaskGroupRevisionMutableBuilder[Self <: TaskGroupRevision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeType(value: AuditAction): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedBy(value: IdentityRef): Self = StObject.set(x, "changedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedDate(value: Date): Self = StObject.set(x, "changedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileId(value: Double): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskGroupId(value: String): Self = StObject.set(x, "taskGroupId", value.asInstanceOf[js.Any])
  }
}
