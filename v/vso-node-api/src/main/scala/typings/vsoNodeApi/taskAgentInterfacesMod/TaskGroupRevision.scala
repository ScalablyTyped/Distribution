package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskGroupRevision extends StObject {
  
  var changeType: AuditAction
  
  var changedBy: IdentityRef
  
  var changedDate: Date
  
  var comment: String
  
  var fileId: Double
  
  var revision: Double
  
  var taskGroupId: String
}
object TaskGroupRevision {
  
  inline def apply(
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
  
  extension [Self <: TaskGroupRevision](x: Self) {
    
    inline def setChangeType(value: AuditAction): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setChangedBy(value: IdentityRef): Self = StObject.set(x, "changedBy", value.asInstanceOf[js.Any])
    
    inline def setChangedDate(value: Date): Self = StObject.set(x, "changedDate", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setFileId(value: Double): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setTaskGroupId(value: String): Self = StObject.set(x, "taskGroupId", value.asInstanceOf[js.Any])
  }
}
