package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionAuditLog extends js.Object {
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
}

