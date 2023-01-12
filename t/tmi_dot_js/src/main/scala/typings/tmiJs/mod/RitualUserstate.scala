package typings.tmiJs.mod

import typings.tmiJs.tmiJsStrings.new_chatter
import typings.tmiJs.tmiJsStrings.ritual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RitualUserstate
  extends StObject
     with UserNoticeState
     with Userstate {
  
  var `message-type`: js.UndefOr[ritual] = js.undefined
  
  var `msg-param-ritual-name`: js.UndefOr[new_chatter] = js.undefined
}
object RitualUserstate {
  
  inline def apply(): RitualUserstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RitualUserstate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RitualUserstate] (val x: Self) extends AnyVal {
    
    inline def `setMessage-type`(value: ritual): Self = StObject.set(x, "message-type", value.asInstanceOf[js.Any])
    
    inline def `setMessage-typeUndefined`: Self = StObject.set(x, "message-type", js.undefined)
    
    inline def `setMsg-param-ritual-name`(value: new_chatter): Self = StObject.set(x, "msg-param-ritual-name", value.asInstanceOf[js.Any])
    
    inline def `setMsg-param-ritual-nameUndefined`: Self = StObject.set(x, "msg-param-ritual-name", js.undefined)
  }
}
