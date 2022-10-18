package typings.twilio.libJwtAccessTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackGrantPayload extends StObject {
  
  var grant: js.UndefOr[js.Object] = js.undefined
}
object PlaybackGrantPayload {
  
  inline def apply(): PlaybackGrantPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaybackGrantPayload]
  }
  
  extension [Self <: PlaybackGrantPayload](x: Self) {
    
    inline def setGrant(value: js.Object): Self = StObject.set(x, "grant", value.asInstanceOf[js.Any])
    
    inline def setGrantUndefined: Self = StObject.set(x, "grant", js.undefined)
  }
}
