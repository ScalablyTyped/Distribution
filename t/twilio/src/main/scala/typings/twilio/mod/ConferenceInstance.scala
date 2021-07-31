package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConferenceInstance
  extends StObject
     with Resource {
  
  var participants: ConferenceParticipantResource
}
object ConferenceInstance {
  
  @scala.inline
  def apply(get: RestMethod, participants: ConferenceParticipantResource): ConferenceInstance = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConferenceInstance]
  }
  
  @scala.inline
  implicit class ConferenceInstanceMutableBuilder[Self <: ConferenceInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParticipants(value: ConferenceParticipantResource): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
  }
}
