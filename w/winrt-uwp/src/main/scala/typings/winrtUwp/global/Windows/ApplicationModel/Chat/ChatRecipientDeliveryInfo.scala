package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represent the delivery info about a chat recipient. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatRecipientDeliveryInfo")
@js.native
/** Initializes a new instance of the ChatRecipientDeliveryInfo class. */
open class ChatRecipientDeliveryInfo ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Chat.ChatRecipientDeliveryInfo {
  
  /** Gets or sets the time the message was sent to the recipient. */
  /* CompleteClass */
  var deliveryTime: js.Date = js.native
  
  /** Gets a Boolean value indicating whether the error for the message that was sent to the recipient is permanent. */
  /* CompleteClass */
  var isErrorPermanent: Boolean = js.native
  
  /** Gets or sets the time the recipient read the message. */
  /* CompleteClass */
  var readTime: js.Date = js.native
  
  /** Gets the status of the message. */
  /* CompleteClass */
  var status: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageStatus = js.native
  
  /** Gets or sets the transport address of the recipient. */
  /* CompleteClass */
  var transportAddress: String = js.native
  
  /** Get the transport error code. */
  /* CompleteClass */
  var transportErrorCode: Double = js.native
  
  /** Gets the category for the TransportErrorCode . */
  /* CompleteClass */
  var transportErrorCodeCategory: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatTransportErrorCodeCategory = js.native
  
  /** Gets the interpreted error code for the transport. */
  /* CompleteClass */
  var transportInterpretedErrorCode: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatTransportInterpretedErrorCode = js.native
}
