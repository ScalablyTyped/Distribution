package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzurePublisher extends js.Object {
  var azurePublisherId: java.lang.String
  var publisherName: java.lang.String
}

object AzurePublisher {
  @scala.inline
  def apply(azurePublisherId: java.lang.String, publisherName: java.lang.String): AzurePublisher = {
    val __obj = js.Dynamic.literal(azurePublisherId = azurePublisherId, publisherName = publisherName)
  
    __obj.asInstanceOf[AzurePublisher]
  }
}

