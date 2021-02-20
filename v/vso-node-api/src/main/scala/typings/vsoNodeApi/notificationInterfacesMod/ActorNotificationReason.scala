package typings.vsoNodeApi.notificationInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActorNotificationReason extends NotificationReason {
  
  var matchedRoles: js.Array[String] = js.native
}
object ActorNotificationReason {
  
  @scala.inline
  def apply(
    matchedRoles: js.Array[String],
    notificationReasonType: NotificationReasonType,
    targetIdentities: js.Array[IdentityRef]
  ): ActorNotificationReason = {
    val __obj = js.Dynamic.literal(matchedRoles = matchedRoles.asInstanceOf[js.Any], notificationReasonType = notificationReasonType.asInstanceOf[js.Any], targetIdentities = targetIdentities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActorNotificationReason]
  }
  
  @scala.inline
  implicit class ActorNotificationReasonMutableBuilder[Self <: ActorNotificationReason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatchedRoles(value: js.Array[String]): Self = StObject.set(x, "matchedRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedRolesVarargs(value: String*): Self = StObject.set(x, "matchedRoles", js.Array(value :_*))
  }
}
