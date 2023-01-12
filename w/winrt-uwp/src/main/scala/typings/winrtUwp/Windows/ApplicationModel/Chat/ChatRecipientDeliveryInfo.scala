package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represent the delivery info about a chat recipient. */
trait ChatRecipientDeliveryInfo extends StObject {
  
  /** Gets or sets the time the message was sent to the recipient. */
  var deliveryTime: js.Date
  
  /** Gets a Boolean value indicating whether the error for the message that was sent to the recipient is permanent. */
  var isErrorPermanent: Boolean
  
  /** Gets or sets the time the recipient read the message. */
  var readTime: js.Date
  
  /** Gets the status of the message. */
  var status: ChatMessageStatus
  
  /** Gets or sets the transport address of the recipient. */
  var transportAddress: String
  
  /** Get the transport error code. */
  var transportErrorCode: Double
  
  /** Gets the category for the TransportErrorCode . */
  var transportErrorCodeCategory: ChatTransportErrorCodeCategory
  
  /** Gets the interpreted error code for the transport. */
  var transportInterpretedErrorCode: ChatTransportInterpretedErrorCode
}
object ChatRecipientDeliveryInfo {
  
  inline def apply(
    deliveryTime: js.Date,
    isErrorPermanent: Boolean,
    readTime: js.Date,
    status: ChatMessageStatus,
    transportAddress: String,
    transportErrorCode: Double,
    transportErrorCodeCategory: ChatTransportErrorCodeCategory,
    transportInterpretedErrorCode: ChatTransportInterpretedErrorCode
  ): ChatRecipientDeliveryInfo = {
    val __obj = js.Dynamic.literal(deliveryTime = deliveryTime.asInstanceOf[js.Any], isErrorPermanent = isErrorPermanent.asInstanceOf[js.Any], readTime = readTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transportAddress = transportAddress.asInstanceOf[js.Any], transportErrorCode = transportErrorCode.asInstanceOf[js.Any], transportErrorCodeCategory = transportErrorCodeCategory.asInstanceOf[js.Any], transportInterpretedErrorCode = transportInterpretedErrorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRecipientDeliveryInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatRecipientDeliveryInfo] (val x: Self) extends AnyVal {
    
    inline def setDeliveryTime(value: js.Date): Self = StObject.set(x, "deliveryTime", value.asInstanceOf[js.Any])
    
    inline def setIsErrorPermanent(value: Boolean): Self = StObject.set(x, "isErrorPermanent", value.asInstanceOf[js.Any])
    
    inline def setReadTime(value: js.Date): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ChatMessageStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTransportAddress(value: String): Self = StObject.set(x, "transportAddress", value.asInstanceOf[js.Any])
    
    inline def setTransportErrorCode(value: Double): Self = StObject.set(x, "transportErrorCode", value.asInstanceOf[js.Any])
    
    inline def setTransportErrorCodeCategory(value: ChatTransportErrorCodeCategory): Self = StObject.set(x, "transportErrorCodeCategory", value.asInstanceOf[js.Any])
    
    inline def setTransportInterpretedErrorCode(value: ChatTransportInterpretedErrorCode): Self = StObject.set(x, "transportInterpretedErrorCode", value.asInstanceOf[js.Any])
  }
}
