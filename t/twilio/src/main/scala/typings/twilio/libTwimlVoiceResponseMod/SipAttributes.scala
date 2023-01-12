package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SipAttributes extends StObject {
  
  var amdStatusCallback: js.UndefOr[String] = js.undefined
  
  var amdStatusCallbackMethod: js.UndefOr[String] = js.undefined
  
  var machineDetection: js.UndefOr[String] = js.undefined
  
  var machineDetectionSilenceTimeout: js.UndefOr[Double] = js.undefined
  
  var machineDetectionSpeechEndThreshold: js.UndefOr[Double] = js.undefined
  
  var machineDetectionSpeechThreshold: js.UndefOr[Double] = js.undefined
  
  var machineDetectionTimeout: js.UndefOr[Double] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var statusCallback: js.UndefOr[String] = js.undefined
  
  var statusCallbackEvent: js.UndefOr[js.Array[SipEvent]] = js.undefined
  
  var statusCallbackMethod: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object SipAttributes {
  
  inline def apply(): SipAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SipAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SipAttributes] (val x: Self) extends AnyVal {
    
    inline def setAmdStatusCallback(value: String): Self = StObject.set(x, "amdStatusCallback", value.asInstanceOf[js.Any])
    
    inline def setAmdStatusCallbackMethod(value: String): Self = StObject.set(x, "amdStatusCallbackMethod", value.asInstanceOf[js.Any])
    
    inline def setAmdStatusCallbackMethodUndefined: Self = StObject.set(x, "amdStatusCallbackMethod", js.undefined)
    
    inline def setAmdStatusCallbackUndefined: Self = StObject.set(x, "amdStatusCallback", js.undefined)
    
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
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackEvent(value: js.Array[SipEvent]): Self = StObject.set(x, "statusCallbackEvent", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackEventUndefined: Self = StObject.set(x, "statusCallbackEvent", js.undefined)
    
    inline def setStatusCallbackEventVarargs(value: SipEvent*): Self = StObject.set(x, "statusCallbackEvent", js.Array(value*))
    
    inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
    
    inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
