package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubscriptionTemplateQueryFlags extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionTemplateQueryFlags")
@js.native
object SubscriptionTemplateQueryFlags extends js.Object {
  /**
       * Include the event type details like the fields and operators
       */
  @js.native
  sealed trait IncludeEventTypeInformation
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionTemplateQueryFlags
  
  /**
       * Include group templates
       */
  @js.native
  sealed trait IncludeGroup
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionTemplateQueryFlags
  
  /**
       * Include user templates
       */
  @js.native
  sealed trait IncludeUser
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionTemplateQueryFlags
  
  /**
       * Include user and group templates
       */
  @js.native
  sealed trait IncludeUserAndGroup
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionTemplateQueryFlags
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionTemplateQueryFlags
  
  /* 22 */ val IncludeEventTypeInformation: IncludeEventTypeInformation with scala.Double = js.native
  /* 2 */ val IncludeGroup: IncludeGroup with scala.Double = js.native
  /* 1 */ val IncludeUser: IncludeUser with scala.Double = js.native
  /* 4 */ val IncludeUserAndGroup: IncludeUserAndGroup with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionTemplateQueryFlags with scala.Double
  ] = js.native
}

