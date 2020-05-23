package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data about the chat message transport. */
trait ChatMessageTransportConfiguration extends js.Object {
  /** Gets the extended properties of the transport. */
  var extendedProperties: IMapView[String, _]
  /** Gets the maximum attachment limit for a message on the transport. */
  var maxAttachmentCount: Double
  /** Gets the maximum size of an attachment for the transport. */
  var maxMessageSizeInKilobytes: Double
  /** Gets the maximum number of recipients for the transport. */
  var maxRecipientCount: Double
  /** Gets the supported video encoding format for the transport. */
  var supportedVideoFormat: MediaEncodingProfile
}

object ChatMessageTransportConfiguration {
  @scala.inline
  def apply(
    extendedProperties: IMapView[String, _],
    maxAttachmentCount: Double,
    maxMessageSizeInKilobytes: Double,
    maxRecipientCount: Double,
    supportedVideoFormat: MediaEncodingProfile
  ): ChatMessageTransportConfiguration = {
    val __obj = js.Dynamic.literal(extendedProperties = extendedProperties.asInstanceOf[js.Any], maxAttachmentCount = maxAttachmentCount.asInstanceOf[js.Any], maxMessageSizeInKilobytes = maxMessageSizeInKilobytes.asInstanceOf[js.Any], maxRecipientCount = maxRecipientCount.asInstanceOf[js.Any], supportedVideoFormat = supportedVideoFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessageTransportConfiguration]
  }
}

