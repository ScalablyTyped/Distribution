package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionEventUrls extends ExtensionUrls {
  
  /**
    * Url of the extension management page
    */
  var manageExtensionsPage: String = js.native
}
object ExtensionEventUrls {
  
  @scala.inline
  def apply(extensionIcon: String, extensionPage: String, manageExtensionsPage: String): ExtensionEventUrls = {
    val __obj = js.Dynamic.literal(extensionIcon = extensionIcon.asInstanceOf[js.Any], extensionPage = extensionPage.asInstanceOf[js.Any], manageExtensionsPage = manageExtensionsPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionEventUrls]
  }
  
  @scala.inline
  implicit class ExtensionEventUrlsMutableBuilder[Self <: ExtensionEventUrls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManageExtensionsPage(value: String): Self = StObject.set(x, "manageExtensionsPage", value.asInstanceOf[js.Any])
  }
}
