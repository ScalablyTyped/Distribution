package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionIdentifier extends StObject {
  
  /**
    * The ExtensionName component part of the fully qualified ExtensionIdentifier
    */
  var extensionName: String
  
  /**
    * The PublisherName component part of the fully qualified ExtensionIdentifier
    */
  var publisherName: String
}
object ExtensionIdentifier {
  
  inline def apply(extensionName: String, publisherName: String): ExtensionIdentifier = {
    val __obj = js.Dynamic.literal(extensionName = extensionName.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionIdentifier]
  }
  
  extension [Self <: ExtensionIdentifier](x: Self) {
    
    inline def setExtensionName(value: String): Self = StObject.set(x, "extensionName", value.asInstanceOf[js.Any])
    
    inline def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
  }
}
