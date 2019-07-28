package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionEventUrls extends ExtensionUrls {
  /**
    * Url of the extension management page
    */
  var manageExtensionsPage: String
}

object ExtensionEventUrls {
  @scala.inline
  def apply(extensionIcon: String, extensionPage: String, manageExtensionsPage: String): ExtensionEventUrls = {
    val __obj = js.Dynamic.literal(extensionIcon = extensionIcon, extensionPage = extensionPage, manageExtensionsPage = manageExtensionsPage)
  
    __obj.asInstanceOf[ExtensionEventUrls]
  }
}

