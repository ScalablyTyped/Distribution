package typings.twilio.libJwtAccessTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoGrantOptions extends StObject {
  
  var room: js.UndefOr[String] = js.undefined
}
object VideoGrantOptions {
  
  inline def apply(): VideoGrantOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoGrantOptions]
  }
  
  extension [Self <: VideoGrantOptions](x: Self) {
    
    inline def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    inline def setRoomUndefined: Self = StObject.set(x, "room", js.undefined)
  }
}
