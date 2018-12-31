package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportedIde extends js.Object {
  /**
    * The download URL for the IDE.
    */
  var downloadUrl: java.lang.String
  /**
    * The type of the IDE.
    */
  var ideType: SupportedIdeType
  /**
    * The name of the IDE.
    */
  var name: java.lang.String
  /**
    * The URL to open the protocol handler for the IDE.
    */
  var protocolHandlerUrl: java.lang.String
  /**
    * A list of SupportedPlatforms.
    */
  var supportedPlatforms: js.Array[java.lang.String]
}

