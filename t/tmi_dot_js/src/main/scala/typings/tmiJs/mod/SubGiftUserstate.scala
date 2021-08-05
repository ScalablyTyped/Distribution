package typings.tmiJs.mod

import typings.tmiJs.tmiJsStrings.subgift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubGiftUserstate
  extends StObject
     with CommonGiftSubUserstate
     with Userstate {
  
  var `message-type`: js.UndefOr[subgift] = js.undefined
  
  var `msg-param-sender-count`: js.UndefOr[String | Boolean] = js.undefined
}
object SubGiftUserstate {
  
  inline def apply(): SubGiftUserstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubGiftUserstate]
  }
  
  extension [Self <: SubGiftUserstate](x: Self) {
    
    inline def `setMessage-type`(value: subgift): Self = StObject.set(x, "message-type", value.asInstanceOf[js.Any])
    
    inline def `setMessage-typeUndefined`: Self = StObject.set(x, "message-type", js.undefined)
    
    inline def `setMsg-param-sender-count`(value: String | Boolean): Self = StObject.set(x, "msg-param-sender-count", value.asInstanceOf[js.Any])
    
    inline def `setMsg-param-sender-countUndefined`: Self = StObject.set(x, "msg-param-sender-count", js.undefined)
  }
}
