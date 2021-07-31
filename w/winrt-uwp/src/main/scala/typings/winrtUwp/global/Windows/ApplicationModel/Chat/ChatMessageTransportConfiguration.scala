package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Media.MediaProperties.MediaEncodingProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents data about the chat message transport. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageTransportConfiguration")
@js.native
abstract class ChatMessageTransportConfiguration ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageTransportConfiguration {
  
  /** Gets the extended properties of the transport. */
  /* CompleteClass */
  var extendedProperties: IMapView[String, js.Any] = js.native
  
  /** Gets the maximum attachment limit for a message on the transport. */
  /* CompleteClass */
  var maxAttachmentCount: Double = js.native
  
  /** Gets the maximum size of an attachment for the transport. */
  /* CompleteClass */
  var maxMessageSizeInKilobytes: Double = js.native
  
  /** Gets the maximum number of recipients for the transport. */
  /* CompleteClass */
  var maxRecipientCount: Double = js.native
  
  /** Gets the supported video encoding format for the transport. */
  /* CompleteClass */
  var supportedVideoFormat: MediaEncodingProfile = js.native
}
