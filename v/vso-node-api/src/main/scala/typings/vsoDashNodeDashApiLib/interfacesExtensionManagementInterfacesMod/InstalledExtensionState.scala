package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

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
  var lastUpdated: stdLib.Date
}

object InstalledExtensionState {
  @scala.inline
  def apply(
    flags: ExtensionStateFlags,
    installationIssues: js.Array[InstalledExtensionStateIssue],
    lastUpdated: stdLib.Date
  ): InstalledExtensionState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("installationIssues")(installationIssues)
    __obj.updateDynamic("lastUpdated")(lastUpdated)
    __obj.asInstanceOf[InstalledExtensionState]
  }
}

