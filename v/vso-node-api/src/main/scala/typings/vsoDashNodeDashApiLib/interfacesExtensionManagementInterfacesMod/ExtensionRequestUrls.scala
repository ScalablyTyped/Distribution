package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionRequestUrls extends ExtensionUrls {
  /**
    * Link to view the extension request
    */
  var requestPage: java.lang.String
}

object ExtensionRequestUrls {
  @scala.inline
  def apply(extensionIcon: java.lang.String, extensionPage: java.lang.String, requestPage: java.lang.String): ExtensionRequestUrls = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extensionIcon")(extensionIcon)
    __obj.updateDynamic("extensionPage")(extensionPage)
    __obj.updateDynamic("requestPage")(requestPage)
    __obj.asInstanceOf[ExtensionRequestUrls]
  }
}

