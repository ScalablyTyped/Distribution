package typings.trtcCallingJs.mod

import typings.trtcCallingJs.trtcCallingJsInts.`1`
import typings.trtcCallingJs.trtcCallingJsInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 接受当前的邀请参数类型 */
trait AcceptOptions extends StObject {
  
  var callType: `1` | `2`
  
  var inviteID: String
  
  var roomID: Double
}
object AcceptOptions {
  
  inline def apply(callType: `1` | `2`, inviteID: String, roomID: Double): AcceptOptions = {
    val __obj = js.Dynamic.literal(callType = callType.asInstanceOf[js.Any], inviteID = inviteID.asInstanceOf[js.Any], roomID = roomID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AcceptOptions] (val x: Self) extends AnyVal {
    
    inline def setCallType(value: `1` | `2`): Self = StObject.set(x, "callType", value.asInstanceOf[js.Any])
    
    inline def setInviteID(value: String): Self = StObject.set(x, "inviteID", value.asInstanceOf[js.Any])
    
    inline def setRoomID(value: Double): Self = StObject.set(x, "roomID", value.asInstanceOf[js.Any])
  }
}
