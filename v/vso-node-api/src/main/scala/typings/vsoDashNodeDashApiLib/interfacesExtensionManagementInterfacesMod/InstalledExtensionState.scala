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

