package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionUrls extends js.Object {
  /**
    * Url of the extension icon
    */
  var extensionIcon: java.lang.String
  /**
    * Link to view the extension details page
    */
  var extensionPage: java.lang.String
}

object ExtensionUrls {
  @scala.inline
  def apply(extensionIcon: java.lang.String, extensionPage: java.lang.String): ExtensionUrls = {
    val __obj = js.Dynamic.literal(extensionIcon = extensionIcon, extensionPage = extensionPage)
  
    __obj.asInstanceOf[ExtensionUrls]
  }
}

