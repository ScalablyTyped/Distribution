package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatherAttributes extends StObject {
  
  /** action - Action URL */
  var action: js.UndefOr[String] = js.undefined
  
  /** actionOnEmptyResult - Force webhook to the action URL event if there is no input */
  var actionOnEmptyResult: js.UndefOr[Boolean] = js.undefined
  
  /** bargeIn - Stop playing media upon speech */
  var bargeIn: js.UndefOr[Boolean] = js.undefined
  
  /** debug - Allow debug for gather */
  var debug: js.UndefOr[Boolean] = js.undefined
  
  /** enhanced - Use enhanced speech model */
  var enhanced: js.UndefOr[Boolean] = js.undefined
  
  /** finishOnKey - Finish gather on key */
  var finishOnKey: js.UndefOr[String] = js.undefined
  
  /** hints - Speech recognition hints */
  var hints: js.UndefOr[String] = js.undefined
  
  /** input - Input type Twilio should accept */
  var input: js.UndefOr[js.Array[GatherInput]] = js.undefined
  
  /** language - Language to use */
  var language: js.UndefOr[GatherLanguage] = js.undefined
  
  /** maxSpeechTime - Max allowed time for speech input */
  var maxSpeechTime: js.UndefOr[Double] = js.undefined
  
  /** method - Action URL method */
  var method: js.UndefOr[String] = js.undefined
  
  /** numDigits - Number of digits to collect */
  var numDigits: js.UndefOr[Double] = js.undefined
  
  /** partialResultCallback - Partial result callback URL */
  var partialResultCallback: js.UndefOr[String] = js.undefined
  
  /** partialResultCallbackMethod - Partial result callback URL method */
  var partialResultCallbackMethod: js.UndefOr[String] = js.undefined
  
  /** profanityFilter - Profanity Filter on speech */
  var profanityFilter: js.UndefOr[Boolean] = js.undefined
  
  /** speechModel - Specify the model that is best suited for your use case */
  var speechModel: js.UndefOr[GatherSpeechModel] = js.undefined
  
  /** speechTimeout - Time to wait to gather speech input and it should be either auto or a positive integer. */
  var speechTimeout: js.UndefOr[String] = js.undefined
  
  /** timeout - Time to wait to gather input */
  var timeout: js.UndefOr[Double] = js.undefined
}
object GatherAttributes {
  
  inline def apply(): GatherAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatherAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GatherAttributes] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionOnEmptyResult(value: Boolean): Self = StObject.set(x, "actionOnEmptyResult", value.asInstanceOf[js.Any])
    
    inline def setActionOnEmptyResultUndefined: Self = StObject.set(x, "actionOnEmptyResult", js.undefined)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setBargeIn(value: Boolean): Self = StObject.set(x, "bargeIn", value.asInstanceOf[js.Any])
    
    inline def setBargeInUndefined: Self = StObject.set(x, "bargeIn", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setEnhanced(value: Boolean): Self = StObject.set(x, "enhanced", value.asInstanceOf[js.Any])
    
    inline def setEnhancedUndefined: Self = StObject.set(x, "enhanced", js.undefined)
    
    inline def setFinishOnKey(value: String): Self = StObject.set(x, "finishOnKey", value.asInstanceOf[js.Any])
    
    inline def setFinishOnKeyUndefined: Self = StObject.set(x, "finishOnKey", js.undefined)
    
    inline def setHints(value: String): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
    
    inline def setInput(value: js.Array[GatherInput]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setInputVarargs(value: GatherInput*): Self = StObject.set(x, "input", js.Array(value*))
    
    inline def setLanguage(value: GatherLanguage): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setMaxSpeechTime(value: Double): Self = StObject.set(x, "maxSpeechTime", value.asInstanceOf[js.Any])
    
    inline def setMaxSpeechTimeUndefined: Self = StObject.set(x, "maxSpeechTime", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNumDigits(value: Double): Self = StObject.set(x, "numDigits", value.asInstanceOf[js.Any])
    
    inline def setNumDigitsUndefined: Self = StObject.set(x, "numDigits", js.undefined)
    
    inline def setPartialResultCallback(value: String): Self = StObject.set(x, "partialResultCallback", value.asInstanceOf[js.Any])
    
    inline def setPartialResultCallbackMethod(value: String): Self = StObject.set(x, "partialResultCallbackMethod", value.asInstanceOf[js.Any])
    
    inline def setPartialResultCallbackMethodUndefined: Self = StObject.set(x, "partialResultCallbackMethod", js.undefined)
    
    inline def setPartialResultCallbackUndefined: Self = StObject.set(x, "partialResultCallback", js.undefined)
    
    inline def setProfanityFilter(value: Boolean): Self = StObject.set(x, "profanityFilter", value.asInstanceOf[js.Any])
    
    inline def setProfanityFilterUndefined: Self = StObject.set(x, "profanityFilter", js.undefined)
    
    inline def setSpeechModel(value: GatherSpeechModel): Self = StObject.set(x, "speechModel", value.asInstanceOf[js.Any])
    
    inline def setSpeechModelUndefined: Self = StObject.set(x, "speechModel", js.undefined)
    
    inline def setSpeechTimeout(value: String): Self = StObject.set(x, "speechTimeout", value.asInstanceOf[js.Any])
    
    inline def setSpeechTimeoutUndefined: Self = StObject.set(x, "speechTimeout", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
