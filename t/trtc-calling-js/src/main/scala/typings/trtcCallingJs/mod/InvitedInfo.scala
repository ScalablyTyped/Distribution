package typings.trtcCallingJs.mod

import typings.trtcCallingJs.anon.CallEnd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 收到了邀请通知返回参数类型 */
trait InvitedInfo extends StObject {
  
  var inviteData: CallEnd
  
  var inviteID: String
  
  var isFromGroup: Boolean
  
  var sponsor: String
  
  var userIDList: js.Array[String]
}
object InvitedInfo {
  
  inline def apply(
    inviteData: CallEnd,
    inviteID: String,
    isFromGroup: Boolean,
    sponsor: String,
    userIDList: js.Array[String]
  ): InvitedInfo = {
    val __obj = js.Dynamic.literal(inviteData = inviteData.asInstanceOf[js.Any], inviteID = inviteID.asInstanceOf[js.Any], isFromGroup = isFromGroup.asInstanceOf[js.Any], sponsor = sponsor.asInstanceOf[js.Any], userIDList = userIDList.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvitedInfo]
  }
  
  extension [Self <: InvitedInfo](x: Self) {
    
    inline def setInviteData(value: CallEnd): Self = StObject.set(x, "inviteData", value.asInstanceOf[js.Any])
    
    inline def setInviteID(value: String): Self = StObject.set(x, "inviteID", value.asInstanceOf[js.Any])
    
    inline def setIsFromGroup(value: Boolean): Self = StObject.set(x, "isFromGroup", value.asInstanceOf[js.Any])
    
    inline def setSponsor(value: String): Self = StObject.set(x, "sponsor", value.asInstanceOf[js.Any])
    
    inline def setUserIDList(value: js.Array[String]): Self = StObject.set(x, "userIDList", value.asInstanceOf[js.Any])
    
    inline def setUserIDListVarargs(value: String*): Self = StObject.set(x, "userIDList", js.Array(value*))
  }
}
