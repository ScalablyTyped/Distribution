package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzurePublisher extends StObject {
  
  var azurePublisherId: String
  
  var publisherName: String
}
object AzurePublisher {
  
  inline def apply(azurePublisherId: String, publisherName: String): AzurePublisher = {
    val __obj = js.Dynamic.literal(azurePublisherId = azurePublisherId.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzurePublisher]
  }
  
  extension [Self <: AzurePublisher](x: Self) {
    
    inline def setAzurePublisherId(value: String): Self = StObject.set(x, "azurePublisherId", value.asInstanceOf[js.Any])
    
    inline def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
  }
}
