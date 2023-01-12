package typings.twilio.libJwtAccessTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackGrantOptions extends StObject {
  
  var grant: js.UndefOr[js.Object] = js.undefined
}
object PlaybackGrantOptions {
  
  inline def apply(): PlaybackGrantOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaybackGrantOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaybackGrantOptions] (val x: Self) extends AnyVal {
    
    inline def setGrant(value: js.Object): Self = StObject.set(x, "grant", value.asInstanceOf[js.Any])
    
    inline def setGrantUndefined: Self = StObject.set(x, "grant", js.undefined)
  }
}
