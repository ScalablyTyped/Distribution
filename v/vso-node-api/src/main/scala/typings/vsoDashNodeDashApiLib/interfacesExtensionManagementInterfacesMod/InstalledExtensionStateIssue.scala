package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InstalledExtensionStateIssue extends js.Object {
  /**
       * The error message
       */
  var message: java.lang.String
  /**
       * Source of the installation issue, for example  "Demands"
       */
  var source: java.lang.String
  /**
       * Installation issue type (Warning, Error)
       */
  var `type`: InstalledExtensionStateIssueType
}

