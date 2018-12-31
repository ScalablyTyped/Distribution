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

