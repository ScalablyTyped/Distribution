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
  
  var `msg-param-origin-id`: String
  
  var `msg-param-sender-count`: js.UndefOr[String | Boolean] = js.undefined
}
object SubGiftUserstate {
  
  inline def apply(`msg-param-origin-id`: String): SubGiftUserstate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("msg-param-origin-id")(`msg-param-origin-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubGiftUserstate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubGiftUserstate] (val x: Self) extends AnyVal {
    
    inline def `setMessage-type`(value: subgift): Self = StObject.set(x, "message-type", value.asInstanceOf[js.Any])
    
    inline def `setMessage-typeUndefined`: Self = StObject.set(x, "message-type", js.undefined)
    
    inline def `setMsg-param-origin-id`(value: String): Self = StObject.set(x, "msg-param-origin-id", value.asInstanceOf[js.Any])
    
    inline def `setMsg-param-sender-count`(value: String | Boolean): Self = StObject.set(x, "msg-param-sender-count", value.asInstanceOf[js.Any])
    
    inline def `setMsg-param-sender-countUndefined`: Self = StObject.set(x, "msg-param-sender-count", js.undefined)
  }
}
