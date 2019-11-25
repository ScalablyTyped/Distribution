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
    val __obj = js.Dynamic.literal(azurePublisherId = azurePublisherId.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AzurePublisher]
  }
}

