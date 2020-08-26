package typings.winrtUwp.Windows.Networking.Connectivity

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to property values containing information on current usage of the attributed network connection. */
@js.native
trait AttributedNetworkUsage extends js.Object {
  /** Gets the Id of the of the app. */
  var attributionId: String = js.native
  /** Gets the name of the app. */
  var attributionName: String = js.native
  /** Gets the thumbnail of the app. */
  var attributionThumbnail: IRandomAccessStreamReference = js.native
  /** Gets the number of bytes received by the app over the network. */
  var bytesReceived: Double = js.native
  /** Gets the number of bytes sent by the app over the network. */
  var bytesSent: Double = js.native
}

object AttributedNetworkUsage {
  @scala.inline
  def apply(
    attributionId: String,
    attributionName: String,
    attributionThumbnail: IRandomAccessStreamReference,
    bytesReceived: Double,
    bytesSent: Double
  ): AttributedNetworkUsage = {
    val __obj = js.Dynamic.literal(attributionId = attributionId.asInstanceOf[js.Any], attributionName = attributionName.asInstanceOf[js.Any], attributionThumbnail = attributionThumbnail.asInstanceOf[js.Any], bytesReceived = bytesReceived.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributedNetworkUsage]
  }
  @scala.inline
  implicit class AttributedNetworkUsageOps[Self <: AttributedNetworkUsage] (val x: Self) extends AnyVal {
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
    def setAttributionId(value: String): Self = this.set("attributionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributionName(value: String): Self = this.set("attributionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributionThumbnail(value: IRandomAccessStreamReference): Self = this.set("attributionThumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytesReceived(value: Double): Self = this.set("bytesReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytesSent(value: Double): Self = this.set("bytesSent", value.asInstanceOf[js.Any])
  }
  
}

