package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionRequestUrls extends ExtensionUrls {
  /**
    * Link to view the extension request
    */
  var requestPage: String
}

object ExtensionRequestUrls {
  @scala.inline
  def apply(extensionIcon: String, extensionPage: String, requestPage: String): ExtensionRequestUrls = {
    val __obj = js.Dynamic.literal(extensionIcon = extensionIcon.asInstanceOf[js.Any], extensionPage = extensionPage.asInstanceOf[js.Any], requestPage = requestPage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionRequestUrls]
  }
}

