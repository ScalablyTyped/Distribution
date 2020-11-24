package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionRequestUrls extends ExtensionUrls {
  
  /**
    * Link to view the extension request
    */
  var requestPage: String = js.native
}
object ExtensionRequestUrls {
  
  @scala.inline
  def apply(extensionIcon: String, extensionPage: String, requestPage: String): ExtensionRequestUrls = {
    val __obj = js.Dynamic.literal(extensionIcon = extensionIcon.asInstanceOf[js.Any], extensionPage = extensionPage.asInstanceOf[js.Any], requestPage = requestPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionRequestUrls]
  }
  
  @scala.inline
  implicit class ExtensionRequestUrlsOps[Self <: ExtensionRequestUrls] (val x: Self) extends AnyVal {
    
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
    def setRequestPage(value: String): Self = this.set("requestPage", value.asInstanceOf[js.Any])
  }
}
