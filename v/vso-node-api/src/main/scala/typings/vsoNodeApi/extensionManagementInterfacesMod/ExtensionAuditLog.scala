package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionAuditLog extends js.Object {
  
  /**
    * Collection of audit log entries
    */
  var entries: js.Array[ExtensionAuditLogEntry] = js.native
  
  /**
    * Extension that the change was made for
    */
  var extensionName: String = js.native
  
  /**
    * Publisher that the extension is part of
    */
  var publisherName: String = js.native
}
object ExtensionAuditLog {
  
  @scala.inline
  def apply(entries: js.Array[ExtensionAuditLogEntry], extensionName: String, publisherName: String): ExtensionAuditLog = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], extensionName = extensionName.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionAuditLog]
  }
  
  @scala.inline
  implicit class ExtensionAuditLogOps[Self <: ExtensionAuditLog] (val x: Self) extends AnyVal {
    
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
    def setEntriesVarargs(value: ExtensionAuditLogEntry*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[ExtensionAuditLogEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionName(value: String): Self = this.set("extensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherName(value: String): Self = this.set("publisherName", value.asInstanceOf[js.Any])
  }
}
