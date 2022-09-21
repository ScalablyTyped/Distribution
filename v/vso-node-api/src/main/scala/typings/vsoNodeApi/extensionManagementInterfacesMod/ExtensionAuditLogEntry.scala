package typings.vsoNodeApi.extensionManagementInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionAuditLogEntry extends StObject {
  
  /**
    * Change that was made to extension
    */
  var auditAction: String
  
  /**
    * Date at which the change was made
    */
  var auditDate: js.Date
  
  /**
    * Extra information about the change
    */
  var comment: String
  
  /**
    * Represents the user who made the change
    */
  var updatedBy: IdentityRef
}
object ExtensionAuditLogEntry {
  
  inline def apply(auditAction: String, auditDate: js.Date, comment: String, updatedBy: IdentityRef): ExtensionAuditLogEntry = {
    val __obj = js.Dynamic.literal(auditAction = auditAction.asInstanceOf[js.Any], auditDate = auditDate.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], updatedBy = updatedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionAuditLogEntry]
  }
  
  extension [Self <: ExtensionAuditLogEntry](x: Self) {
    
    inline def setAuditAction(value: String): Self = StObject.set(x, "auditAction", value.asInstanceOf[js.Any])
    
    inline def setAuditDate(value: js.Date): Self = StObject.set(x, "auditDate", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setUpdatedBy(value: IdentityRef): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
  }
}
