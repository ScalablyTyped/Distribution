package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzurePublisher extends js.Object {
  var azurePublisherId: String
  var publisherName: String
}

object AzurePublisher {
  @scala.inline
  def apply(azurePublisherId: String, publisherName: String): AzurePublisher = {
    val __obj = js.Dynamic.literal(azurePublisherId = azurePublisherId, publisherName = publisherName)
  
    __obj.asInstanceOf[AzurePublisher]
  }
}

