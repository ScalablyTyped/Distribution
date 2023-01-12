package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialAttributes extends StObject {
  
  var action: js.UndefOr[String] = js.undefined
  
  var answerOnBridge: js.UndefOr[Boolean] = js.undefined
  
  var callerId: js.UndefOr[String] = js.undefined
  
  var hangupOnStar: js.UndefOr[Boolean] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var record: js.UndefOr[DialRecord] = js.undefined
  
  var recordingStatusCallback: js.UndefOr[String] = js.undefined
  
  var recordingStatusCallbackEvent: js.UndefOr[js.Array[DialRecordingEvent]] = js.undefined
  
  var recordingStatusCallbackMethod: js.UndefOr[String] = js.undefined
  
  var recordingTrack: js.UndefOr[DialRecordingTrack] = js.undefined
  
  var referMethod: js.UndefOr[String] = js.undefined
  
  var referUrl: js.UndefOr[String] = js.undefined
  
  var ringTone: js.UndefOr[DialRingTone] = js.undefined
  
  var sequential: js.UndefOr[Boolean] = js.undefined
  
  var timeLimit: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var trim: js.UndefOr[DialTrim] = js.undefined
}
object DialAttributes {
  
  inline def apply(): DialAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialAttributes] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAnswerOnBridge(value: Boolean): Self = StObject.set(x, "answerOnBridge", value.asInstanceOf[js.Any])
    
    inline def setAnswerOnBridgeUndefined: Self = StObject.set(x, "answerOnBridge", js.undefined)
    
    inline def setCallerId(value: String): Self = StObject.set(x, "callerId", value.asInstanceOf[js.Any])
    
    inline def setCallerIdUndefined: Self = StObject.set(x, "callerId", js.undefined)
    
    inline def setHangupOnStar(value: Boolean): Self = StObject.set(x, "hangupOnStar", value.asInstanceOf[js.Any])
    
    inline def setHangupOnStarUndefined: Self = StObject.set(x, "hangupOnStar", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setRecord(value: DialRecord): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    
    inline def setRecordingStatusCallback(value: String): Self = StObject.set(x, "recordingStatusCallback", value.asInstanceOf[js.Any])
    
    inline def setRecordingStatusCallbackEvent(value: js.Array[DialRecordingEvent]): Self = StObject.set(x, "recordingStatusCallbackEvent", value.asInstanceOf[js.Any])
    
    inline def setRecordingStatusCallbackEventUndefined: Self = StObject.set(x, "recordingStatusCallbackEvent", js.undefined)
    
    inline def setRecordingStatusCallbackEventVarargs(value: DialRecordingEvent*): Self = StObject.set(x, "recordingStatusCallbackEvent", js.Array(value*))
    
    inline def setRecordingStatusCallbackMethod(value: String): Self = StObject.set(x, "recordingStatusCallbackMethod", value.asInstanceOf[js.Any])
    
    inline def setRecordingStatusCallbackMethodUndefined: Self = StObject.set(x, "recordingStatusCallbackMethod", js.undefined)
    
    inline def setRecordingStatusCallbackUndefined: Self = StObject.set(x, "recordingStatusCallback", js.undefined)
    
    inline def setRecordingTrack(value: DialRecordingTrack): Self = StObject.set(x, "recordingTrack", value.asInstanceOf[js.Any])
    
    inline def setRecordingTrackUndefined: Self = StObject.set(x, "recordingTrack", js.undefined)
    
    inline def setReferMethod(value: String): Self = StObject.set(x, "referMethod", value.asInstanceOf[js.Any])
    
    inline def setReferMethodUndefined: Self = StObject.set(x, "referMethod", js.undefined)
    
    inline def setReferUrl(value: String): Self = StObject.set(x, "referUrl", value.asInstanceOf[js.Any])
    
    inline def setReferUrlUndefined: Self = StObject.set(x, "referUrl", js.undefined)
    
    inline def setRingTone(value: DialRingTone): Self = StObject.set(x, "ringTone", value.asInstanceOf[js.Any])
    
    inline def setRingToneUndefined: Self = StObject.set(x, "ringTone", js.undefined)
    
    inline def setSequential(value: Boolean): Self = StObject.set(x, "sequential", value.asInstanceOf[js.Any])
    
    inline def setSequentialUndefined: Self = StObject.set(x, "sequential", js.undefined)
    
    inline def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
    
    inline def setTimeLimitUndefined: Self = StObject.set(x, "timeLimit", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTrim(value: DialTrim): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
  }
}
