package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data about the chat message transport. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageTransportConfiguration")
@js.native
abstract class ChatMessageTransportConfiguration ()
  extends typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageTransportConfiguration {
  /** Gets the extended properties of the transport. */
  /* CompleteClass */
  override var extendedProperties: IMapView[String, _] = js.native
  /** Gets the maximum attachment limit for a message on the transport. */
  /* CompleteClass */
  override var maxAttachmentCount: Double = js.native
  /** Gets the maximum size of an attachment for the transport. */
  /* CompleteClass */
  override var maxMessageSizeInKilobytes: Double = js.native
  /** Gets the maximum number of recipients for the transport. */
  /* CompleteClass */
  override var maxRecipientCount: Double = js.native
  /** Gets the supported video encoding format for the transport. */
  /* CompleteClass */
  override var supportedVideoFormat: MediaEncodingProfile = js.native
}

