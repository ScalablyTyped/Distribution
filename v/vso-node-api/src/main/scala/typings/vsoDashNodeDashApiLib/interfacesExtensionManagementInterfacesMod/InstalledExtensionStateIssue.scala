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

object InstalledExtensionStateIssue {
  @scala.inline
  def apply(message: java.lang.String, source: java.lang.String, `type`: InstalledExtensionStateIssueType): InstalledExtensionStateIssue = {
    val __obj = js.Dynamic.literal(message = message, source = source)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InstalledExtensionStateIssue]
  }
}

