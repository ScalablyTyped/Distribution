package typings.twilio.accessTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoGrantPayload extends StObject {
  
  var room: js.UndefOr[String] = js.undefined
}
object VideoGrantPayload {
  
  inline def apply(): VideoGrantPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoGrantPayload]
  }
  
  extension [Self <: VideoGrantPayload](x: Self) {
    
    inline def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    inline def setRoomUndefined: Self = StObject.set(x, "room", js.undefined)
  }
}
