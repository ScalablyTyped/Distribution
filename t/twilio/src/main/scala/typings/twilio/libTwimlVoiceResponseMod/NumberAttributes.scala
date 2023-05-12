package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberAttributes extends StObject {
  
  /** amdStatusCallback - The URL we should call to send amd status information to your application */
  var amdStatusCallback: js.UndefOr[String] = js.undefined
  
  /** amdStatusCallbackMethod - HTTP Method to use with amd_status_callback */
  var amdStatusCallbackMethod: js.UndefOr[String] = js.undefined
  
  /** byoc - BYOC trunk SID (Beta) */
  var byoc: js.UndefOr[String] = js.undefined
  
  /** machineDetection - Enable machine detection or end of greeting detection */
  var machineDetection: js.UndefOr[String] = js.undefined
  
  /** machineDetectionSilenceTimeout - Number of milliseconds of initial silence */
  var machineDetectionSilenceTimeout: js.UndefOr[Double] = js.undefined
  
  /** machineDetectionSpeechEndThreshold - Number of milliseconds of silence after speech activity */
  var machineDetectionSpeechEndThreshold: js.UndefOr[Double] = js.undefined
  
  /** machineDetectionSpeechThreshold - Number of milliseconds for measuring stick for the length of the speech activity */
  var machineDetectionSpeechThreshold: js.UndefOr[Double] = js.undefined
  
  /** machineDetectionTimeout - Number of seconds to wait for machine detection */
  var machineDetectionTimeout: js.UndefOr[Double] = js.undefined
  
  /** method - TwiML URL method */
  var method: js.UndefOr[String] = js.undefined
  
  /** sendDigits - DTMF tones to play when the call is answered */
  var sendDigits: js.UndefOr[String] = js.undefined
  
  /** statusCallback - Status callback URL */
  var statusCallback: js.UndefOr[String] = js.undefined
  
  /** statusCallbackEvent - Events to call status callback */
  var statusCallbackEvent: js.UndefOr[js.Array[NumberEvent]] = js.undefined
  
  /** statusCallbackMethod - Status callback URL method */
  var statusCallbackMethod: js.UndefOr[String] = js.undefined
  
  /** url - TwiML URL */
  var url: js.UndefOr[String] = js.undefined
}
object NumberAttributes {
  
  inline def apply(): NumberAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberAttributes] (val x: Self) extends AnyVal {
    
    inline def setAmdStatusCallback(value: String): Self = StObject.set(x, "amdStatusCallback", value.asInstanceOf[js.Any])
    
    inline def setAmdStatusCallbackMethod(value: String): Self = StObject.set(x, "amdStatusCallbackMethod", value.asInstanceOf[js.Any])
    
    inline def setAmdStatusCallbackMethodUndefined: Self = StObject.set(x, "amdStatusCallbackMethod", js.undefined)
    
    inline def setAmdStatusCallbackUndefined: Self = StObject.set(x, "amdStatusCallback", js.undefined)
    
    inline def setByoc(value: String): Self = StObject.set(x, "byoc", value.asInstanceOf[js.Any])
    
    inline def setByocUndefined: Self = StObject.set(x, "byoc", js.undefined)
    
    inline def setMachineDetection(value: String): Self = StObject.set(x, "machineDetection", value.asInstanceOf[js.Any])
    
    inline def setMachineDetectionSilenceTimeout(value: Double): Self = StObject.set(x, "machineDetectionSilenceTimeout", value.asInstanceOf[js.Any])
    
    inline def setMachineDetectionSilenceTimeoutUndefined: Self = StObject.set(x, "machineDetectionSilenceTimeout", js.undefined)
    
    inline def setMachineDetectionSpeechEndThreshold(value: Double): Self = StObject.set(x, "machineDetectionSpeechEndThreshold", value.asInstanceOf[js.Any])
    
    inline def setMachineDetectionSpeechEndThresholdUndefined: Self = StObject.set(x, "machineDetectionSpeechEndThreshold", js.undefined)
    
    inline def setMachineDetectionSpeechThreshold(value: Double): Self = StObject.set(x, "machineDetectionSpeechThreshold", value.asInstanceOf[js.Any])
    
    inline def setMachineDetectionSpeechThresholdUndefined: Self = StObject.set(x, "machineDetectionSpeechThreshold", js.undefined)
    
    inline def setMachineDetectionTimeout(value: Double): Self = StObject.set(x, "machineDetectionTimeout", value.asInstanceOf[js.Any])
    
    inline def setMachineDetectionTimeoutUndefined: Self = StObject.set(x, "machineDetectionTimeout", js.undefined)
    
    inline def setMachineDetectionUndefined: Self = StObject.set(x, "machineDetection", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setSendDigits(value: String): Self = StObject.set(x, "sendDigits", value.asInstanceOf[js.Any])
    
    inline def setSendDigitsUndefined: Self = StObject.set(x, "sendDigits", js.undefined)
    
    inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackEvent(value: js.Array[NumberEvent]): Self = StObject.set(x, "statusCallbackEvent", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackEventUndefined: Self = StObject.set(x, "statusCallbackEvent", js.undefined)
    
    inline def setStatusCallbackEventVarargs(value: NumberEvent*): Self = StObject.set(x, "statusCallbackEvent", js.Array(value*))
    
    inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
    
    inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
