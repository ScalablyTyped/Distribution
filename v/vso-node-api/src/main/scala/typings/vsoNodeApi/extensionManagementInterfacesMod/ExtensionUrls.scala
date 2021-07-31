package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionUrls extends StObject {
  
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
  
  @scala.inline
  implicit class ExtensionUrlsMutableBuilder[Self <: ExtensionUrls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtensionIcon(value: String): Self = StObject.set(x, "extensionIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionPage(value: String): Self = StObject.set(x, "extensionPage", value.asInstanceOf[js.Any])
  }
}
