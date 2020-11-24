package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionUrls extends js.Object {
  
  /**
    * Url of the extension icon
    */
  var extensionIcon: String = js.native
  
  /**
    * Link to view the extension details page
    */
  var extensionPage: String = js.native
}
object ExtensionUrls {
  
  @scala.inline
  def apply(extensionIcon: String, extensionPage: String): ExtensionUrls = {
    val __obj = js.Dynamic.literal(extensionIcon = extensionIcon.asInstanceOf[js.Any], extensionPage = extensionPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionUrls]
  }
  
  @scala.inline
  implicit class ExtensionUrlsOps[Self <: ExtensionUrls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExtensionIcon(value: String): Self = this.set("extensionIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionPage(value: String): Self = this.set("extensionPage", value.asInstanceOf[js.Any])
  }
}
