package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptAttributes extends StObject {
  
  /** attempt - Current attempt count */
  var attempt: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** cardType - Type of the credit card */
  var cardType: js.UndefOr[js.Array[PromptCardType]] = js.undefined
  
  /** errorType - Type of error */
  var errorType: js.UndefOr[js.Array[PromptErrorType]] = js.undefined
  
  /** for - Name of the payment source data element */
  var `for`: js.UndefOr[PromptFor] = js.undefined
  
  /** requireMatchingInputs - Require customer to input requested information twice and verify matching. */
  var requireMatchingInputs: js.UndefOr[Boolean] = js.undefined
}
object PromptAttributes {
  
  inline def apply(): PromptAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromptAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PromptAttributes] (val x: Self) extends AnyVal {
    
    inline def setAttempt(value: js.Array[Double]): Self = StObject.set(x, "attempt", value.asInstanceOf[js.Any])
    
    inline def setAttemptUndefined: Self = StObject.set(x, "attempt", js.undefined)
    
    inline def setAttemptVarargs(value: Double*): Self = StObject.set(x, "attempt", js.Array(value*))
    
    inline def setCardType(value: js.Array[PromptCardType]): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    inline def setCardTypeUndefined: Self = StObject.set(x, "cardType", js.undefined)
    
    inline def setCardTypeVarargs(value: PromptCardType*): Self = StObject.set(x, "cardType", js.Array(value*))
    
    inline def setErrorType(value: js.Array[PromptErrorType]): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setErrorTypeVarargs(value: PromptErrorType*): Self = StObject.set(x, "errorType", js.Array(value*))
    
    inline def setFor(value: PromptFor): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
    
    inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
    
    inline def setRequireMatchingInputs(value: Boolean): Self = StObject.set(x, "requireMatchingInputs", value.asInstanceOf[js.Any])
    
    inline def setRequireMatchingInputsUndefined: Self = StObject.set(x, "requireMatchingInputs", js.undefined)
  }
}
