package typings.tmiJs.mod

import typings.tmiJs.tmiJsStrings.submysterygift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubMysteryGiftUserstate
  extends StObject
     with CommonSubUserstate
     with Userstate {
  
  var `message-type`: js.UndefOr[submysterygift] = js.undefined
  
  var `msg-param-sender-count`: js.UndefOr[String | Boolean] = js.undefined
}
object SubMysteryGiftUserstate {
  
  inline def apply(): SubMysteryGiftUserstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubMysteryGiftUserstate]
  }
  
  extension [Self <: SubMysteryGiftUserstate](x: Self) {
    
    inline def `setMessage-type`(value: submysterygift): Self = StObject.set(x, "message-type", value.asInstanceOf[js.Any])
    
    inline def `setMessage-typeUndefined`: Self = StObject.set(x, "message-type", js.undefined)
    
    inline def `setMsg-param-sender-count`(value: String | Boolean): Self = StObject.set(x, "msg-param-sender-count", value.asInstanceOf[js.Any])
    
    inline def `setMsg-param-sender-countUndefined`: Self = StObject.set(x, "msg-param-sender-count", js.undefined)
  }
}
