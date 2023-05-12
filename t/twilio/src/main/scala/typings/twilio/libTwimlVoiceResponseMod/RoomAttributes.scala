package typings.twilio.libTwimlVoiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomAttributes extends StObject {
  
  /** participantIdentity - Participant identity when connecting to the Room */
  var participantIdentity: js.UndefOr[String] = js.undefined
}
object RoomAttributes {
  
  inline def apply(): RoomAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoomAttributes] (val x: Self) extends AnyVal {
    
    inline def setParticipantIdentity(value: String): Self = StObject.set(x, "participantIdentity", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdentityUndefined: Self = StObject.set(x, "participantIdentity", js.undefined)
  }
}
