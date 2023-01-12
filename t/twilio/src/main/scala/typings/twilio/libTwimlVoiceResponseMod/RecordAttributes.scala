package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordAttributes extends StObject {
  
  var action: js.UndefOr[String] = js.undefined
  
  var finishOnKey: js.UndefOr[String] = js.undefined
  
  var maxLength: js.UndefOr[Double] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var playBeep: js.UndefOr[Boolean] = js.undefined
  
  var recordingStatusCallback: js.UndefOr[String] = js.undefined
  
  var recordingStatusCallbackEvent: js.UndefOr[js.Array[RecordRecordingEvent]] = js.undefined
  
  var recordingStatusCallbackMethod: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var transcribe: js.UndefOr[Boolean] = js.undefined
  
  var transcribeCallback: js.UndefOr[String] = js.undefined
  
  var trim: js.UndefOr[RecordTrim] = js.undefined
}
object RecordAttributes {
  
  inline def apply(): RecordAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordAttributes] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setFinishOnKey(value: String): Self = StObject.set(x, "finishOnKey", value.asInstanceOf[js.Any])
    
    inline def setFinishOnKeyUndefined: Self = StObject.set(x, "finishOnKey", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPlayBeep(value: Boolean): Self = StObject.set(x, "playBeep", value.asInstanceOf[js.Any])
    
    inline def setPlayBeepUndefined: Self = StObject.set(x, "playBeep", js.undefined)
    
    inline def setRecordingStatusCallback(value: String): Self = StObject.set(x, "recordingStatusCallback", value.asInstanceOf[js.Any])
    
    inline def setRecordingStatusCallbackEvent(value: js.Array[RecordRecordingEvent]): Self = StObject.set(x, "recordingStatusCallbackEvent", value.asInstanceOf[js.Any])
    
    inline def setRecordingStatusCallbackEventUndefined: Self = StObject.set(x, "recordingStatusCallbackEvent", js.undefined)
    
    inline def setRecordingStatusCallbackEventVarargs(value: RecordRecordingEvent*): Self = StObject.set(x, "recordingStatusCallbackEvent", js.Array(value*))
    
    inline def setRecordingStatusCallbackMethod(value: String): Self = StObject.set(x, "recordingStatusCallbackMethod", value.asInstanceOf[js.Any])
    
    inline def setRecordingStatusCallbackMethodUndefined: Self = StObject.set(x, "recordingStatusCallbackMethod", js.undefined)
    
    inline def setRecordingStatusCallbackUndefined: Self = StObject.set(x, "recordingStatusCallback", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTranscribe(value: Boolean): Self = StObject.set(x, "transcribe", value.asInstanceOf[js.Any])
    
    inline def setTranscribeCallback(value: String): Self = StObject.set(x, "transcribeCallback", value.asInstanceOf[js.Any])
    
    inline def setTranscribeCallbackUndefined: Self = StObject.set(x, "transcribeCallback", js.undefined)
    
    inline def setTranscribeUndefined: Self = StObject.set(x, "transcribe", js.undefined)
    
    inline def setTrim(value: RecordTrim): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
  }
}
