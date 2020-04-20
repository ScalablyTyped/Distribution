package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportedIde extends js.Object {
  /**
    * The download URL for the IDE.
    */
  var downloadUrl: String
  /**
    * The type of the IDE.
    */
  var ideType: SupportedIdeType
  /**
    * The name of the IDE.
    */
  var name: String
  /**
    * The URL to open the protocol handler for the IDE.
    */
  var protocolHandlerUrl: String
  /**
    * A list of SupportedPlatforms.
    */
  var supportedPlatforms: js.Array[String]
}

object SupportedIde {
  @scala.inline
  def apply(
    downloadUrl: String,
    ideType: SupportedIdeType,
    name: String,
    protocolHandlerUrl: String,
    supportedPlatforms: js.Array[String]
  ): SupportedIde = {
    val __obj = js.Dynamic.literal(downloadUrl = downloadUrl.asInstanceOf[js.Any], ideType = ideType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protocolHandlerUrl = protocolHandlerUrl.asInstanceOf[js.Any], supportedPlatforms = supportedPlatforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedIde]
  }
}

