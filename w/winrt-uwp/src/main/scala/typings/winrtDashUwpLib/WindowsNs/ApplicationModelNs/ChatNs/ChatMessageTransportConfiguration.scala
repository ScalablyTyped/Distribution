package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data about the chat message transport. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageTransportConfiguration")
@js.native
abstract class ChatMessageTransportConfiguration () extends js.Object {
  /** Gets the extended properties of the transport. */
  var extendedProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _] = js.native
  /** Gets the maximum attachment limit for a message on the transport. */
  var maxAttachmentCount: scala.Double = js.native
  /** Gets the maximum size of an attachment for the transport. */
  var maxMessageSizeInKilobytes: scala.Double = js.native
  /** Gets the maximum number of recipients for the transport. */
  var maxRecipientCount: scala.Double = js.native
  /** Gets the supported video encoding format for the transport. */
  var supportedVideoFormat: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile = js.native
}

