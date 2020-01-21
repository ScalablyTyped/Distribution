package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionUrls extends js.Object {
  /**
    * Url of the extension icon
    */
  var extensionIcon: String
  /**
    * Link to view the extension details page
    */
  var extensionPage: String
}

object ExtensionUrls {
  @scala.inline
  def apply(extensionIcon: String, extensionPage: String): ExtensionUrls = {
    val __obj = js.Dynamic.literal(extensionIcon = extensionIcon.asInstanceOf[js.Any], extensionPage = extensionPage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionUrls]
  }
}

