package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides results for validation of chat messages. */
trait ChatMessageValidationResult extends StObject {
  
  /** Gets the maximum number of text fragments allowed for a message. This value has meaning when the SMS text portion of a message is validated. */
  var maxPartCount: Double
  
  /** Gets the total number of text fragments needed for this message. This value has meaning when the SMS text portion of a message is validated. */
  var partCount: Double
  
  /** Gets the number of characters not used in the final message fragments. This value has meaning when the SMS text portion of a message is validated. */
  var remainingCharacterCountInPart: Double
  
  /** Gets the message validation status code. */
  var status: ChatMessageValidationStatus
}
object ChatMessageValidationResult {
  
  inline def apply(
    maxPartCount: Double,
    partCount: Double,
    remainingCharacterCountInPart: Double,
    status: ChatMessageValidationStatus
  ): ChatMessageValidationResult = {
    val __obj = js.Dynamic.literal(maxPartCount = maxPartCount.asInstanceOf[js.Any], partCount = partCount.asInstanceOf[js.Any], remainingCharacterCountInPart = remainingCharacterCountInPart.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessageValidationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatMessageValidationResult] (val x: Self) extends AnyVal {
    
    inline def setMaxPartCount(value: Double): Self = StObject.set(x, "maxPartCount", value.asInstanceOf[js.Any])
    
    inline def setPartCount(value: Double): Self = StObject.set(x, "partCount", value.asInstanceOf[js.Any])
    
    inline def setRemainingCharacterCountInPart(value: Double): Self = StObject.set(x, "remainingCharacterCountInPart", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ChatMessageValidationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
