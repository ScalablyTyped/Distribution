package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data about the configuration of a Rich Communication Services (RCS) transport. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Chat.RcsTransportConfiguration")
@js.native
open class RcsTransportConfiguration ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Chat.RcsTransportConfiguration {
  
  /** Gets the maximum number of attachments supported by the transport. */
  /* CompleteClass */
  var maxAttachmentCount: Double = js.native
  
  /** Gets the maximum size of a file that can be sent using the transport. */
  /* CompleteClass */
  var maxFileSizeInKilobytes: Double = js.native
  
  /** Gets the maximum size of a group chat message supported by the transport. */
  /* CompleteClass */
  var maxGroupMessageSizeInKilobytes: Double = js.native
  
  /** Gets the maximum size of a chat message supported by the transport. */
  /* CompleteClass */
  var maxMessageSizeInKilobytes: Double = js.native
  
  /** Gets the maximum number of recipients supported for a group chat. */
  /* CompleteClass */
  var maxRecipientCount: Double = js.native
  
  /** Gets the size at which the user should be warned that they are attaching a large file for the transport. */
  /* CompleteClass */
  var warningFileSizeInKilobytes: Double = js.native
}
