package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptAttributes extends StObject {
  
  var attempt: js.UndefOr[js.Array[Double]] = js.undefined
  
  var cardType: js.UndefOr[js.Array[PromptCardType]] = js.undefined
  
  var errorType: js.UndefOr[js.Array[PromptErrorType]] = js.undefined
  
  var for_ : js.UndefOr[PromptFor] = js.undefined
}
object PromptAttributes {
  
  inline def apply(): PromptAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromptAttributes]
  }
  
  extension [Self <: PromptAttributes](x: Self) {
    
    inline def setAttempt(value: js.Array[Double]): Self = StObject.set(x, "attempt", value.asInstanceOf[js.Any])
    
    inline def setAttemptUndefined: Self = StObject.set(x, "attempt", js.undefined)
    
    inline def setAttemptVarargs(value: Double*): Self = StObject.set(x, "attempt", js.Array(value*))
    
    inline def setCardType(value: js.Array[PromptCardType]): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    inline def setCardTypeUndefined: Self = StObject.set(x, "cardType", js.undefined)
    
    inline def setCardTypeVarargs(value: PromptCardType*): Self = StObject.set(x, "cardType", js.Array(value*))
    
    inline def setErrorType(value: js.Array[PromptErrorType]): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
    
    inline def setErrorTypeVarargs(value: PromptErrorType*): Self = StObject.set(x, "errorType", js.Array(value*))
    
    inline def setFor_(value: PromptFor): Self = StObject.set(x, "for_", value.asInstanceOf[js.Any])
    
    inline def setFor_Undefined: Self = StObject.set(x, "for_", js.undefined)
  }
}
