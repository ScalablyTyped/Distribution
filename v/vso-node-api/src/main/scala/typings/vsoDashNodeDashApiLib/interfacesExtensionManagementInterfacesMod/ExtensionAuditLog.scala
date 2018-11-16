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

