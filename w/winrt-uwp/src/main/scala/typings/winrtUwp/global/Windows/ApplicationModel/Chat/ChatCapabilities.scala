package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the Rich Communication Services (RCS) chat capabilities of a phone number. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatCapabilities")
@js.native
abstract class ChatCapabilities ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Chat.ChatCapabilities {
  
  /** Gets a Boolean value indicating if a phone number supports Rich Communication Services (RCS) chat. */
  /* CompleteClass */
  var isChatCapable: Boolean = js.native
  
  /** Gets a Boolean value indicating if a phone number supports Rich Communication Services (RCS) file transfer. */
  /* CompleteClass */
  var isFileTransferCapable: Boolean = js.native
  
  /** Gets a Boolean value indicating if a phone number is capable of pushing Rich Communication Services (RCS) geolocation. */
  /* CompleteClass */
  var isGeoLocationPushCapable: Boolean = js.native
  
  /** Gets a Boolean value indicating if a phone number supports Rich Communication Services (RCS) integrated messaging. */
  /* CompleteClass */
  var isIntegratedMessagingCapable: Boolean = js.native
  
  /** Gets a Boolean value indicating if an Rich Communication Services (RCS) capable phone number is online. */
  /* CompleteClass */
  var isOnline: Boolean = js.native
}
