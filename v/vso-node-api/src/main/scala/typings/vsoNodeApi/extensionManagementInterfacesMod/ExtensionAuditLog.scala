package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionAuditLog extends StObject {
  
  /**
    * Collection of audit log entries
    */
  var entries: js.Array[ExtensionAuditLogEntry]
  
  /**
    * Extension that the change was made for
    */
  var extensionName: String
  
  /**
    * Publisher that the extension is part of
    */
  var publisherName: String
}
object ExtensionAuditLog {
  
  @scala.inline
  def apply(entries: js.Array[ExtensionAuditLogEntry], extensionName: String, publisherName: String): ExtensionAuditLog = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], extensionName = extensionName.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionAuditLog]
  }
  
  @scala.inline
  implicit class ExtensionAuditLogMutableBuilder[Self <: ExtensionAuditLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[ExtensionAuditLogEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesVarargs(value: ExtensionAuditLogEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setExtensionName(value: String): Self = StObject.set(x, "extensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
  }
}
