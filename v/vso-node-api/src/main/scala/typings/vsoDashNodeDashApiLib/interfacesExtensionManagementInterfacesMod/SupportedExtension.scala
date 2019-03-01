package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportedExtension extends js.Object {
  /**
    * Unique Identifier for this extension
    */
  var extension: java.lang.String
  /**
    * Unique Identifier for this publisher
    */
  var publisher: java.lang.String
  /**
    * Supported version for this extension
    */
  var version: java.lang.String
}

object SupportedExtension {
  @scala.inline
  def apply(extension: java.lang.String, publisher: java.lang.String, version: java.lang.String): SupportedExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extension")(extension)
    __obj.updateDynamic("publisher")(publisher)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[SupportedExtension]
  }
}

