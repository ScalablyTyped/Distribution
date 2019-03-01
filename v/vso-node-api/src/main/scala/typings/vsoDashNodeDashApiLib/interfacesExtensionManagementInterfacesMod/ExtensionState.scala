package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionState extends InstalledExtensionState {
  var extensionName: java.lang.String
  /**
    * The time at which the version was last checked
    */
  var lastVersionCheck: stdLib.Date
  var publisherName: java.lang.String
  var version: java.lang.String
}

object ExtensionState {
  @scala.inline
  def apply(
    extensionName: java.lang.String,
    flags: ExtensionStateFlags,
    installationIssues: js.Array[InstalledExtensionStateIssue],
    lastUpdated: stdLib.Date,
    lastVersionCheck: stdLib.Date,
    publisherName: java.lang.String,
    version: java.lang.String
  ): ExtensionState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extensionName")(extensionName)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("installationIssues")(installationIssues)
    __obj.updateDynamic("lastUpdated")(lastUpdated)
    __obj.updateDynamic("lastVersionCheck")(lastVersionCheck)
    __obj.updateDynamic("publisherName")(publisherName)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ExtensionState]
  }
}

