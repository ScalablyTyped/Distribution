package typings.vsoNodeApi.extensionManagementInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionAuditLogEntry extends StObject {
  
  /**
    * Change that was made to extension
    */
  var auditAction: String = js.native
  
  /**
    * Date at which the change was made
    */
  var auditDate: Date = js.native
  
  /**
    * Extra information about the change
    */
  var comment: String = js.native
  
  /**
    * Represents the user who made the change
    */
  var updatedBy: IdentityRef = js.native
}
object ExtensionAuditLogEntry {
  
  @scala.inline
  def apply(auditAction: String, auditDate: Date, comment: String, updatedBy: IdentityRef): ExtensionAuditLogEntry = {
    val __obj = js.Dynamic.literal(auditAction = auditAction.asInstanceOf[js.Any], auditDate = auditDate.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], updatedBy = updatedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionAuditLogEntry]
  }
  
  @scala.inline
  implicit class ExtensionAuditLogEntryMutableBuilder[Self <: ExtensionAuditLogEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuditAction(value: String): Self = StObject.set(x, "auditAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditDate(value: Date): Self = StObject.set(x, "auditDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedBy(value: IdentityRef): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
  }
}
