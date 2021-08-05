package typings.winrtUwp.Windows.ApplicationModel.Calls.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to provide the details about a new voice mail message on a phone line. */
trait PhoneNewVoicemailMessageTriggerDetails extends StObject {
  
  /** Gets the ID of the phone line for which the new voice mail arrived. */
  var lineId: String
  
  /** Gets the optional voice mail changed message set by an operator when they send a voice mail changed SMS. */
  var operatorMessage: String
  
  /** Gets the new count of voice mail messages for the phone line. */
  var voicemailCount: Double
}
object PhoneNewVoicemailMessageTriggerDetails {
  
  inline def apply(lineId: String, operatorMessage: String, voicemailCount: Double): PhoneNewVoicemailMessageTriggerDetails = {
    val __obj = js.Dynamic.literal(lineId = lineId.asInstanceOf[js.Any], operatorMessage = operatorMessage.asInstanceOf[js.Any], voicemailCount = voicemailCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNewVoicemailMessageTriggerDetails]
  }
  
  extension [Self <: PhoneNewVoicemailMessageTriggerDetails](x: Self) {
    
    inline def setLineId(value: String): Self = StObject.set(x, "lineId", value.asInstanceOf[js.Any])
    
    inline def setOperatorMessage(value: String): Self = StObject.set(x, "operatorMessage", value.asInstanceOf[js.Any])
    
    inline def setVoicemailCount(value: Double): Self = StObject.set(x, "voicemailCount", value.asInstanceOf[js.Any])
  }
}
