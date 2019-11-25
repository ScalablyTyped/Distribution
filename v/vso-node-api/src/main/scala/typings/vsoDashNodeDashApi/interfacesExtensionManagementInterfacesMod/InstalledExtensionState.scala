package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstalledExtensionState extends js.Object {
  /**
    * States of an installed extension
    */
  var flags: ExtensionStateFlags
  /**
    * List of installation issues
    */
  var installationIssues: js.Array[InstalledExtensionStateIssue]
  /**
    * The time at which this installation was last updated
    */
  var lastUpdated: Date
}

object InstalledExtensionState {
  @scala.inline
  def apply(
    flags: ExtensionStateFlags,
    installationIssues: js.Array[InstalledExtensionStateIssue],
    lastUpdated: Date
  ): InstalledExtensionState = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], installationIssues = installationIssues.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InstalledExtensionState]
  }
}

