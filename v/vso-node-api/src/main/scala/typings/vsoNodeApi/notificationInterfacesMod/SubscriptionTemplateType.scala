package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriptionTemplateType extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionTemplateType")
@js.native
object SubscriptionTemplateType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionTemplateType with Double] = js.native
  
  @js.native
  sealed trait Both extends SubscriptionTemplateType
  /* 2 */ val Both: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionTemplateType.Both with Double = js.native
  
  @js.native
  sealed trait None extends SubscriptionTemplateType
  /* 3 */ val None: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionTemplateType.None with Double = js.native
  
  @js.native
  sealed trait Team extends SubscriptionTemplateType
  /* 1 */ val Team: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionTemplateType.Team with Double = js.native
  
  @js.native
  sealed trait User extends SubscriptionTemplateType
  /* 0 */ val User: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionTemplateType.User with Double = js.native
}
