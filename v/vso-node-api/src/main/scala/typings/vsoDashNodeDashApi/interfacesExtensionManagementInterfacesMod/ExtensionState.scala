package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionState extends InstalledExtensionState {
  var extensionName: String
  /**
    * The time at which the version was last checked
    */
  var lastVersionCheck: Date
  var publisherName: String
  var version: String
}

object ExtensionState {
  @scala.inline
  def apply(
    extensionName: String,
    flags: ExtensionStateFlags,
    installationIssues: js.Array[InstalledExtensionStateIssue],
    lastUpdated: Date,
    lastVersionCheck: Date,
    publisherName: String,
    version: String
  ): ExtensionState = {
    val __obj = js.Dynamic.literal(extensionName = extensionName, flags = flags, installationIssues = installationIssues, lastUpdated = lastUpdated, lastVersionCheck = lastVersionCheck, publisherName = publisherName, version = version)
  
    __obj.asInstanceOf[ExtensionState]
  }
}

