package typings.trtcCallingJs

import typings.trtcCallingJs.trtcCallingJsInts.`1`
import typings.trtcCallingJs.trtcCallingJsInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CallEnd extends StObject {
    
    var callEnd: js.UndefOr[Boolean] = js.undefined
    
    var callType: `1` | `2`
    
    var roomID: js.UndefOr[Double] = js.undefined
    
    var version: String
  }
  object CallEnd {
    
    inline def apply(callType: `1` | `2`, version: String): CallEnd = {
      val __obj = js.Dynamic.literal(callType = callType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallEnd]
    }
    
    extension [Self <: CallEnd](x: Self) {
      
      inline def setCallEnd(value: Boolean): Self = StObject.set(x, "callEnd", value.asInstanceOf[js.Any])
      
      inline def setCallEndUndefined: Self = StObject.set(x, "callEnd", js.undefined)
      
      inline def setCallType(value: `1` | `2`): Self = StObject.set(x, "callType", value.asInstanceOf[js.Any])
      
      inline def setRoomID(value: Double): Self = StObject.set(x, "roomID", value.asInstanceOf[js.Any])
      
      inline def setRoomIDUndefined: Self = StObject.set(x, "roomID", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
