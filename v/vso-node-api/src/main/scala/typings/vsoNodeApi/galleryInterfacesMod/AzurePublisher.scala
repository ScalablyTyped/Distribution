package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzurePublisher extends js.Object {
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
  implicit class AzurePublisherOps[Self <: AzurePublisher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAzurePublisherId(value: String): Self = this.set("azurePublisherId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublisherName(value: String): Self = this.set("publisherName", value.asInstanceOf[js.Any])
  }
  
}

