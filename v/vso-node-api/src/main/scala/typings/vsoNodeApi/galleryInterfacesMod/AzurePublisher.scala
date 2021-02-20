package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AzurePublisher extends StObject {
  
  var azurePublisherId: String = js.native
  
  var publisherName: String = js.native
}
object AzurePublisher {
  
  @scala.inline
  def apply(azurePublisherId: String, publisherName: String): AzurePublisher = {
    val __obj = js.Dynamic.literal(azurePublisherId = azurePublisherId.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzurePublisher]
  }
  
  @scala.inline
  implicit class AzurePublisherMutableBuilder[Self <: AzurePublisher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAzurePublisherId(value: String): Self = StObject.set(x, "azurePublisherId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
  }
}
