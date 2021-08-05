package typings.vsoNodeApi.notificationInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActorNotificationReason
  extends StObject
     with NotificationReason {
  
  var matchedRoles: js.Array[String]
}
object ActorNotificationReason {
  
  inline def apply(
    matchedRoles: js.Array[String],
    notificationReasonType: NotificationReasonType,
    targetIdentities: js.Array[IdentityRef]
  ): ActorNotificationReason = {
    val __obj = js.Dynamic.literal(matchedRoles = matchedRoles.asInstanceOf[js.Any], notificationReasonType = notificationReasonType.asInstanceOf[js.Any], targetIdentities = targetIdentities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActorNotificationReason]
  }
  
  extension [Self <: ActorNotificationReason](x: Self) {
    
    inline def setMatchedRoles(value: js.Array[String]): Self = StObject.set(x, "matchedRoles", value.asInstanceOf[js.Any])
    
    inline def setMatchedRolesVarargs(value: String*): Self = StObject.set(x, "matchedRoles", js.Array(value :_*))
  }
}
