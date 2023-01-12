package typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionRequestUrls
  extends StObject
     with ExtensionUrls {
  
  /**
    * Link to view the extension request
    */
  var requestPage: String
}
object ExtensionRequestUrls {
  
  inline def apply(extensionIcon: String, extensionPage: String, requestPage: String): ExtensionRequestUrls = {
    val __obj = js.Dynamic.literal(extensionIcon = extensionIcon.asInstanceOf[js.Any], extensionPage = extensionPage.asInstanceOf[js.Any], requestPage = requestPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionRequestUrls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionRequestUrls] (val x: Self) extends AnyVal {
    
    inline def setRequestPage(value: String): Self = StObject.set(x, "requestPage", value.asInstanceOf[js.Any])
  }
}
