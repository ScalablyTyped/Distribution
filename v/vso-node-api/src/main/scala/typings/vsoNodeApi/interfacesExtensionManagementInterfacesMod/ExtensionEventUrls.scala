package typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionEventUrls
  extends StObject
     with ExtensionUrls {
  
  /**
    * Url of the extension management page
    */
  var manageExtensionsPage: String
}
object ExtensionEventUrls {
  
  inline def apply(extensionIcon: String, extensionPage: String, manageExtensionsPage: String): ExtensionEventUrls = {
    val __obj = js.Dynamic.literal(extensionIcon = extensionIcon.asInstanceOf[js.Any], extensionPage = extensionPage.asInstanceOf[js.Any], manageExtensionsPage = manageExtensionsPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionEventUrls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionEventUrls] (val x: Self) extends AnyVal {
    
    inline def setManageExtensionsPage(value: String): Self = StObject.set(x, "manageExtensionsPage", value.asInstanceOf[js.Any])
  }
}
