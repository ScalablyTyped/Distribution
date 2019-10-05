package typings.winrtDashUwp.Windows.ApplicationModel.Chat

import typings.winrtDashUwp.Windows.Foundation.Collections.IMapView
import typings.winrtDashUwp.Windows.Media.MediaProperties.MediaEncodingProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data about the chat message transport. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageTransportConfiguration")
@js.native
abstract class ChatMessageTransportConfiguration () extends js.Object {
  /** Gets the extended properties of the transport. */
  var extendedProperties: IMapView[String, _] = js.native
  /** Gets the maximum attachment limit for a message on the transport. */
  var maxAttachmentCount: Double = js.native
  /** Gets the maximum size of an attachment for the transport. */
  var maxMessageSizeInKilobytes: Double = js.native
  /** Gets the maximum number of recipients for the transport. */
  var maxRecipientCount: Double = js.native
  /** Gets the supported video encoding format for the transport. */
  var supportedVideoFormat: MediaEncodingProfile = js.native
}

