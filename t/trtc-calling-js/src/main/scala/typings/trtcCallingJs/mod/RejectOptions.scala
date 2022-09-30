package typings.trtcCallingJs.mod

import typings.trtcCallingJs.trtcCallingJsInts.`1`
import typings.trtcCallingJs.trtcCallingJsInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 拒绝当前的邀请参数类型 */
trait RejectOptions extends StObject {
  
  var callType: `1` | `2`
  
  var inviteID: String
  
  var isBusy: Boolean
}
object RejectOptions {
  
  inline def apply(callType: `1` | `2`, inviteID: String, isBusy: Boolean): RejectOptions = {
    val __obj = js.Dynamic.literal(callType = callType.asInstanceOf[js.Any], inviteID = inviteID.asInstanceOf[js.Any], isBusy = isBusy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectOptions]
  }
  
  extension [Self <: RejectOptions](x: Self) {
    
    inline def setCallType(value: `1` | `2`): Self = StObject.set(x, "callType", value.asInstanceOf[js.Any])
    
    inline def setInviteID(value: String): Self = StObject.set(x, "inviteID", value.asInstanceOf[js.Any])
    
    inline def setIsBusy(value: Boolean): Self = StObject.set(x, "isBusy", value.asInstanceOf[js.Any])
  }
}
