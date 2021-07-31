package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriptionTemplateType extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionTemplateType")
@js.native
object SubscriptionTemplateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionTemplateType & Double] = js.native
  
  @js.native
  sealed trait Both
    extends StObject
       with SubscriptionTemplateType
  /* 2 */ val Both: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionTemplateType.Both & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with SubscriptionTemplateType
  /* 3 */ val None: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionTemplateType.None & Double = js.native
  
  @js.native
  sealed trait Team
    extends StObject
       with SubscriptionTemplateType
  /* 1 */ val Team: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionTemplateType.Team & Double = js.native
  
  @js.native
  sealed trait User
    extends StObject
       with SubscriptionTemplateType
  /* 0 */ val User: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionTemplateType.User & Double = js.native
}
