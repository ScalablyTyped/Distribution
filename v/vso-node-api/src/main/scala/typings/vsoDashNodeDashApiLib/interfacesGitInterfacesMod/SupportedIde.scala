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

object SupportedIde {
  @scala.inline
  def apply(
    downloadUrl: java.lang.String,
    ideType: SupportedIdeType,
    name: java.lang.String,
    protocolHandlerUrl: java.lang.String,
    supportedPlatforms: js.Array[java.lang.String]
  ): SupportedIde = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("downloadUrl")(downloadUrl)
    __obj.updateDynamic("ideType")(ideType)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("protocolHandlerUrl")(protocolHandlerUrl)
    __obj.updateDynamic("supportedPlatforms")(supportedPlatforms)
    __obj.asInstanceOf[SupportedIde]
  }
}

