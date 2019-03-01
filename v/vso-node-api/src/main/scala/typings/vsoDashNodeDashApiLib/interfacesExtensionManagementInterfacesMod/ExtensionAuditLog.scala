package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

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
  var extensionName: java.lang.String
  /**
    * Publisher that the extension is part of
    */
  var publisherName: java.lang.String
}

object ExtensionAuditLog {
  @scala.inline
  def apply(
    entries: js.Array[ExtensionAuditLogEntry],
    extensionName: java.lang.String,
    publisherName: java.lang.String
  ): ExtensionAuditLog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entries")(entries)
    __obj.updateDynamic("extensionName")(extensionName)
    __obj.updateDynamic("publisherName")(publisherName)
    __obj.asInstanceOf[ExtensionAuditLog]
  }
}

