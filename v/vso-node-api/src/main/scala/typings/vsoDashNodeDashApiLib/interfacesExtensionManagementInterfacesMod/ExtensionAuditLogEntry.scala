package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExtensionAuditLogEntry extends js.Object {
  /**
       * Change that was made to extension
       */
  var auditAction: java.lang.String
  /**
       * Date at which the change was made
       */
  var auditDate: stdLib.Date
  /**
       * Extra information about the change
       */
  var comment: java.lang.String
  /**
       * Represents the user who made the change
       */
  var updatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
}

