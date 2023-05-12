package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConferenceAttributes extends StObject {
  
  /** beep - Play beep when joining */
  var beep: js.UndefOr[ConferenceBeep] = js.undefined
  
  /** coach - Call coach */
  var coach: js.UndefOr[String] = js.undefined
  
  /** endConferenceOnExit - End the conferenceon exit */
  var endConferenceOnExit: js.UndefOr[Boolean] = js.undefined
  
  /** eventCallbackUrl - Event callback URL */
  var eventCallbackUrl: js.UndefOr[String] = js.undefined
  
  /** jitterBufferSize - Size of jitter buffer for participant */
  var jitterBufferSize: js.UndefOr[ConferenceJitterBufferSize] = js.undefined
  
  /** maxParticipants - Maximum number of participants */
  var maxParticipants: js.UndefOr[Double] = js.undefined
  
  /** muted - Join the conference muted */
  var muted: js.UndefOr[Boolean] = js.undefined
  
  /** participantLabel - A label for participant */
  var participantLabel: js.UndefOr[String] = js.undefined
  
  /** record - Record the conference */
  var record: js.UndefOr[ConferenceRecord] = js.undefined
  
  /** recordingStatusCallback - Recording status callback URL */
  var recordingStatusCallback: js.UndefOr[String] = js.undefined
  
  /** recordingStatusCallbackEvent - Recording status callback events */
  var recordingStatusCallbackEvent: js.UndefOr[js.Array[ConferenceRecordingEvent]] = js.undefined
  
  /** recordingStatusCallbackMethod - Recording status callback URL method */
  var recordingStatusCallbackMethod: js.UndefOr[String] = js.undefined
  
  /** region - Conference region */
  var region: js.UndefOr[ConferenceRegion] = js.undefined
  
  /** startConferenceOnEnter - Start the conference on enter */
  var startConferenceOnEnter: js.UndefOr[Boolean] = js.undefined
  
  /** statusCallback - Status callback URL */
  var statusCallback: js.UndefOr[String] = js.undefined
  
  /** statusCallbackEvent - Events to call status callback URL */
  var statusCallbackEvent: js.UndefOr[js.Array[ConferenceEvent]] = js.undefined
  
  /** statusCallbackMethod - Status callback URL method */
  var statusCallbackMethod: js.UndefOr[String] = js.undefined
  
  /** trim - Trim the conference recording */
  var trim: js.UndefOr[ConferenceTrim] = js.undefined
  
  /** waitMethod - Wait URL method */
  var waitMethod: js.UndefOr[String] = js.undefined
  
  /** waitUrl - Wait URL */
  var waitUrl: js.UndefOr[String] = js.undefined
}
object ConferenceAttributes {
  
  inline def apply(): ConferenceAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConferenceAttributes] (val x: Self) extends AnyVal {
    
    inline def setBeep(value: ConferenceBeep): Self = StObject.set(x, "beep", value.asInstanceOf[js.Any])
    
    inline def setBeepUndefined: Self = StObject.set(x, "beep", js.undefined)
    
    inline def setCoach(value: String): Self = StObject.set(x, "coach", value.asInstanceOf[js.Any])
    
    inline def setCoachUndefined: Self = StObject.set(x, "coach", js.undefined)
    
    inline def setEndConferenceOnExit(value: Boolean): Self = StObject.set(x, "endConferenceOnExit", value.asInstanceOf[js.Any])
    
    inline def setEndConferenceOnExitUndefined: Self = StObject.set(x, "endConferenceOnExit", js.undefined)
    
    inline def setEventCallbackUrl(value: String): Self = StObject.set(x, "eventCallbackUrl", value.asInstanceOf[js.Any])
    
    inline def setEventCallbackUrlUndefined: Self = StObject.set(x, "eventCallbackUrl", js.undefined)
    
    inline def setJitterBufferSize(value: ConferenceJitterBufferSize): Self = StObject.set(x, "jitterBufferSize", value.asInstanceOf[js.Any])
    
    inline def setJitterBufferSizeUndefined: Self = StObject.set(x, "jitterBufferSize", js.undefined)
    
    inline def setMaxParticipants(value: Double): Self = StObject.set(x, "maxParticipants", value.asInstanceOf[js.Any])
    
    inline def setMaxParticipantsUndefined: Self = StObject.set(x, "maxParticipants", js.undefined)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setParticipantLabel(value: String): Self = StObject.set(x, "participantLabel", value.asInstanceOf[js.Any])
    
    inline def setParticipantLabelUndefined: Self = StObject.set(x, "participantLabel", js.undefined)
    
    inline def setRecord(value: ConferenceRecord): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    
    inline def setRecordingStatusCallback(value: String): Self = StObject.set(x, "recordingStatusCallback", value.asInstanceOf[js.Any])
    
    inline def setRecordingStatusCallbackEvent(value: js.Array[ConferenceRecordingEvent]): Self = StObject.set(x, "recordingStatusCallbackEvent", value.asInstanceOf[js.Any])
    
    inline def setRecordingStatusCallbackEventUndefined: Self = StObject.set(x, "recordingStatusCallbackEvent", js.undefined)
    
    inline def setRecordingStatusCallbackEventVarargs(value: ConferenceRecordingEvent*): Self = StObject.set(x, "recordingStatusCallbackEvent", js.Array(value*))
    
    inline def setRecordingStatusCallbackMethod(value: String): Self = StObject.set(x, "recordingStatusCallbackMethod", value.asInstanceOf[js.Any])
    
    inline def setRecordingStatusCallbackMethodUndefined: Self = StObject.set(x, "recordingStatusCallbackMethod", js.undefined)
    
    inline def setRecordingStatusCallbackUndefined: Self = StObject.set(x, "recordingStatusCallback", js.undefined)
    
    inline def setRegion(value: ConferenceRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setStartConferenceOnEnter(value: Boolean): Self = StObject.set(x, "startConferenceOnEnter", value.asInstanceOf[js.Any])
    
    inline def setStartConferenceOnEnterUndefined: Self = StObject.set(x, "startConferenceOnEnter", js.undefined)
    
    inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackEvent(value: js.Array[ConferenceEvent]): Self = StObject.set(x, "statusCallbackEvent", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackEventUndefined: Self = StObject.set(x, "statusCallbackEvent", js.undefined)
    
    inline def setStatusCallbackEventVarargs(value: ConferenceEvent*): Self = StObject.set(x, "statusCallbackEvent", js.Array(value*))
    
    inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
    
    inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
    
    inline def setTrim(value: ConferenceTrim): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    
    inline def setWaitMethod(value: String): Self = StObject.set(x, "waitMethod", value.asInstanceOf[js.Any])
    
    inline def setWaitMethodUndefined: Self = StObject.set(x, "waitMethod", js.undefined)
    
    inline def setWaitUrl(value: String): Self = StObject.set(x, "waitUrl", value.asInstanceOf[js.Any])
    
    inline def setWaitUrlUndefined: Self = StObject.set(x, "waitUrl", js.undefined)
  }
}
