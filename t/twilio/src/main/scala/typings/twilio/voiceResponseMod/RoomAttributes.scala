package typings.twilio.voiceResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomAttributes extends StObject {
  
  var participantIdentity: js.UndefOr[String] = js.undefined
}
object RoomAttributes {
  
  inline def apply(): RoomAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoomAttributes]
  }
  
  extension [Self <: RoomAttributes](x: Self) {
    
    inline def setParticipantIdentity(value: String): Self = StObject.set(x, "participantIdentity", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdentityUndefined: Self = StObject.set(x, "participantIdentity", js.undefined)
  }
}
