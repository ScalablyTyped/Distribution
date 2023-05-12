package typings.tmiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BanUserstate
  extends StObject
     with Userstate {
  
  var `room-id`: js.UndefOr[String] = js.undefined
  
  var `target-user-id`: js.UndefOr[String] = js.undefined
  
  var `tmi-sent-ts`: js.UndefOr[String] = js.undefined
}
object BanUserstate {
  
  inline def apply(): BanUserstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BanUserstate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BanUserstate] (val x: Self) extends AnyVal {
    
    inline def `setRoom-id`(value: String): Self = StObject.set(x, "room-id", value.asInstanceOf[js.Any])
    
    inline def `setRoom-idUndefined`: Self = StObject.set(x, "room-id", js.undefined)
    
    inline def `setTarget-user-id`(value: String): Self = StObject.set(x, "target-user-id", value.asInstanceOf[js.Any])
    
    inline def `setTarget-user-idUndefined`: Self = StObject.set(x, "target-user-id", js.undefined)
    
    inline def `setTmi-sent-ts`(value: String): Self = StObject.set(x, "tmi-sent-ts", value.asInstanceOf[js.Any])
    
    inline def `setTmi-sent-tsUndefined`: Self = StObject.set(x, "tmi-sent-ts", js.undefined)
  }
}
