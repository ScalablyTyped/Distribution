package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstalledExtensionStateIssue extends js.Object {
  /**
    * The error message
    */
  var message: String
  /**
    * Source of the installation issue, for example  "Demands"
    */
  var source: String
  /**
    * Installation issue type (Warning, Error)
    */
  var `type`: InstalledExtensionStateIssueType
}

object InstalledExtensionStateIssue {
  @scala.inline
  def apply(message: String, source: String, `type`: InstalledExtensionStateIssueType): InstalledExtensionStateIssue = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledExtensionStateIssue]
  }
}

