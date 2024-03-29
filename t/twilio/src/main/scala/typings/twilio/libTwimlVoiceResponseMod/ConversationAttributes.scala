package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationAttributes extends StObject {
  
  /** inboundAutocreation - Inbound autocreation */
  var inboundAutocreation: js.UndefOr[Boolean] = js.undefined
  
  /** inboundTimeout - Inbound timeout */
  var inboundTimeout: js.UndefOr[Double] = js.undefined
  
  /** method - TwiML URL method */
  var method: js.UndefOr[String] = js.undefined
  
  /** record - Record */
  var record: js.UndefOr[ConversationRecord] = js.undefined
  
  /** recordingStatusCallback - Recording status callback URL */
  var recordingStatusCallback: js.UndefOr[String] = js.undefined
  
  /** recordingStatusCallbackEvent - Recording status callback events */
  var recordingStatusCallbackEvent: js.UndefOr[js.Array[ConversationRecordingEvent]] = js.undefined
  
  /** recordingStatusCallbackMethod - Recording status callback URL method */
  var recordingStatusCallbackMethod: js.UndefOr[String] = js.undefined
  
  /** routingAssignmentTimeout - Routing assignment timeout */
  var routingAssignmentTimeout: js.UndefOr[Double] = js.undefined
  
  /** serviceInstanceSid - Service instance Sid */
  var serviceInstanceSid: js.UndefOr[String] = js.undefined
  
  /** statusCallback - Status callback URL */
  var statusCallback: js.UndefOr[String] = js.undefined
  
  /** statusCallbackEvent - Events to call status callback URL */
  var statusCallbackEvent: js.UndefOr[js.Array[ConversationEvent]] = js.undefined
  
  /** statusCallbackMethod - Status callback URL method */
  var statusCallbackMethod: js.UndefOr[String] = js.undefined
  
  /** trim - Trim */
  var trim: js.UndefOr[ConversationTrim] = js.undefined
  
  /** url - TwiML URL */
  var url: js.UndefOr[String] = js.undefined
}
object ConversationAttributes {
  
  inline def apply(): ConversationAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConversationAttributes] (val x: Self) extends AnyVal {
    
    inline def setInboundAutocreation(value: Boolean): Self = StObject.set(x, "inboundAutocreation", value.asInstanceOf[js.Any])
    
    inline def setInboundAutocreationUndefined: Self = StObject.set(x, "inboundAutocreation", js.undefined)
    
    inline def setInboundTimeout(value: Double): Self = StObject.set(x, "inboundTimeout", value.asInstanceOf[js.Any])
    
    inline def setInboundTimeoutUndefined: Self = StObject.set(x, "inboundTimeout", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setRecord(value: ConversationRecord): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    
    inline def setRecordingStatusCallback(value: String): Self = StObject.set(x, "recordingStatusCallback", value.asInstanceOf[js.Any])
    
    inline def setRecordingStatusCallbackEvent(value: js.Array[ConversationRecordingEvent]): Self = StObject.set(x, "recordingStatusCallbackEvent", value.asInstanceOf[js.Any])
    
    inline def setRecordingStatusCallbackEventUndefined: Self = StObject.set(x, "recordingStatusCallbackEvent", js.undefined)
    
    inline def setRecordingStatusCallbackEventVarargs(value: ConversationRecordingEvent*): Self = StObject.set(x, "recordingStatusCallbackEvent", js.Array(value*))
    
    inline def setRecordingStatusCallbackMethod(value: String): Self = StObject.set(x, "recordingStatusCallbackMethod", value.asInstanceOf[js.Any])
    
    inline def setRecordingStatusCallbackMethodUndefined: Self = StObject.set(x, "recordingStatusCallbackMethod", js.undefined)
    
    inline def setRecordingStatusCallbackUndefined: Self = StObject.set(x, "recordingStatusCallback", js.undefined)
    
    inline def setRoutingAssignmentTimeout(value: Double): Self = StObject.set(x, "routingAssignmentTimeout", value.asInstanceOf[js.Any])
    
    inline def setRoutingAssignmentTimeoutUndefined: Self = StObject.set(x, "routingAssignmentTimeout", js.undefined)
    
    inline def setServiceInstanceSid(value: String): Self = StObject.set(x, "serviceInstanceSid", value.asInstanceOf[js.Any])
    
    inline def setServiceInstanceSidUndefined: Self = StObject.set(x, "serviceInstanceSid", js.undefined)
    
    inline def setStatusCallback(value: String): Self = StObject.set(x, "statusCallback", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackEvent(value: js.Array[ConversationEvent]): Self = StObject.set(x, "statusCallbackEvent", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackEventUndefined: Self = StObject.set(x, "statusCallbackEvent", js.undefined)
    
    inline def setStatusCallbackEventVarargs(value: ConversationEvent*): Self = StObject.set(x, "statusCallbackEvent", js.Array(value*))
    
    inline def setStatusCallbackMethod(value: String): Self = StObject.set(x, "statusCallbackMethod", value.asInstanceOf[js.Any])
    
    inline def setStatusCallbackMethodUndefined: Self = StObject.set(x, "statusCallbackMethod", js.undefined)
    
    inline def setStatusCallbackUndefined: Self = StObject.set(x, "statusCallback", js.undefined)
    
    inline def setTrim(value: ConversationTrim): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
