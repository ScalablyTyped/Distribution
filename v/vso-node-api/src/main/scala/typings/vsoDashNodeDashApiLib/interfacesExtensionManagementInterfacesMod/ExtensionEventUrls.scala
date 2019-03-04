package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionEventUrls extends ExtensionUrls {
  /**
    * Url of the extension management page
    */
  var manageExtensionsPage: java.lang.String
}

object ExtensionEventUrls {
  @scala.inline
  def apply(
    extensionIcon: java.lang.String,
    extensionPage: java.lang.String,
    manageExtensionsPage: java.lang.String
  ): ExtensionEventUrls = {
    val __obj = js.Dynamic.literal(extensionIcon = extensionIcon, extensionPage = extensionPage, manageExtensionsPage = manageExtensionsPage)
  
    __obj.asInstanceOf[ExtensionEventUrls]
  }
}

