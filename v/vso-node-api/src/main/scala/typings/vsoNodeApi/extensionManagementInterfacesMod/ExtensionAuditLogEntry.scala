package typings.vsoNodeApi.extensionManagementInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionAuditLogEntry extends js.Object {
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
  implicit class ExtensionAuditLogEntryOps[Self <: ExtensionAuditLogEntry] (val x: Self) extends AnyVal {
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
    def setAuditAction(value: String): Self = this.set("auditAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuditDate(value: Date): Self = this.set("auditDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedBy(value: IdentityRef): Self = this.set("updatedBy", value.asInstanceOf[js.Any])
  }
  
}

