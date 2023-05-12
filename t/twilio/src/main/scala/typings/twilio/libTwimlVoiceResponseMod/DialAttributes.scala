package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialAttributes extends StObject {
  
  /** action - Action URL */
  var action: js.UndefOr[String] = js.undefined
  
  /** answerOnBridge - Preserve the ringing behavior of the inbound call until the Dialed call picks up */
  var answerOnBridge: js.UndefOr[Boolean] = js.undefined
  
  /** callerId - Caller ID to display */
  var callerId: js.UndefOr[String] = js.undefined
  
  /** hangupOnStar - Hangup call on star press */
  var hangupOnStar: js.UndefOr[Boolean] = js.undefined
  
  /** method - Action URL method */
  var method: js.UndefOr[String] = js.undefined
  
  /** record - Record the call */
  var record: js.UndefOr[DialRecord] = js.undefined
  
  /** recordingStatusCallback - Recording status callback URL */
  var recordingStatusCallback: js.UndefOr[String] = js.undefined
  
  /** recordingStatusCallbackEvent - Recording status callback events */
  var recordingStatusCallbackEvent: js.UndefOr[js.Array[DialRecordingEvent]] = js.undefined
  
  /** recordingStatusCallbackMethod - Recording status callback URL method */
  var recordingStatusCallbackMethod: js.UndefOr[String] = js.undefined
  
  /** recordingTrack - To indicate which audio track should be recorded */
  var recordingTrack: js.UndefOr[DialRecordingTrack] = js.undefined
  
  /** referMethod - The HTTP method to use for the refer Webhook */
  var referMethod: js.UndefOr[String] = js.undefined
  
  /** referUrl - Webhook that will receive future SIP REFER requests */
  var referUrl: js.UndefOr[String] = js.undefined
  
  /** ringTone - Ringtone allows you to override the ringback tone that Twilio will play back to the caller while executing the Dial */
  var ringTone: js.UndefOr[DialRingTone] = js.undefined
  
  /** sequential - Used to determine if child TwiML nouns should be dialed in order, one after the other (sequential) or dial all at once (parallel). Default is false, parallel */
  var sequential: js.UndefOr[Boolean] = js.undefined
  
  /** timeLimit - Max time length */
  var timeLimit: js.UndefOr[Double] = js.undefined
  
  /** timeout - Time to wait for answer */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** trim - Trim the recording */
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
