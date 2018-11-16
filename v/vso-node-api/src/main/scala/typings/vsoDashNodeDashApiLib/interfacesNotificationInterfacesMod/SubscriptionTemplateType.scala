package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubscriptionTemplateType extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionTemplateType")
@js.native
object SubscriptionTemplateType extends js.Object {
  @js.native
  sealed trait Both
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionTemplateType
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionTemplateType
  
  @js.native
  sealed trait Team
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionTemplateType
  
  @js.native
  sealed trait User
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionTemplateType
  
  /* 2 */ val Both: Both with scala.Double = js.native
  /* 3 */ val None: None with scala.Double = js.native
  /* 1 */ val Team: Team with scala.Double = js.native
  /* 0 */ val User: User with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionTemplateType with scala.Double
  ] = js.native
}

