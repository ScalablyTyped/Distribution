package typings.vsoNodeApi.extensionManagementInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionAuditLogEntry extends js.Object {
  /**
    * Change that was made to extension
    */
  var auditAction: String
  /**
    * Date at which the change was made
    */
  var auditDate: Date
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
  @scala.inline
  def apply(auditAction: String, auditDate: Date, comment: String, updatedBy: IdentityRef): ExtensionAuditLogEntry = {
    val __obj = js.Dynamic.literal(auditAction = auditAction.asInstanceOf[js.Any], auditDate = auditDate.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], updatedBy = updatedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionAuditLogEntry]
  }
}

