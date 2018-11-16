package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubscriberFlags extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriberFlags")
@js.native
object SubscriberFlags extends js.Object {
  /**
       * Subscriber's delivery preferences could be updated
       */
  @js.native
  sealed trait DeliveryPreferencesEditable
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriberFlags
  
  /**
       * Subscriber is a group
       */
  @js.native
  sealed trait IsGroup
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriberFlags
  
  /**
       * Subscriber is a team
       */
  @js.native
  sealed trait IsTeam
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriberFlags
  
  /**
       * Subscriber is a user
       */
  @js.native
  sealed trait IsUser
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriberFlags
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriberFlags
  
  /**
       * Subscriber's delivery preferences supports individual members delivery(group expansion)
       */
  @js.native
  sealed trait SupportsEachMemberDelivery
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriberFlags
  
  /**
       * Subscriber's delivery preferences supports no delivery
       */
  @js.native
  sealed trait SupportsNoDelivery
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriberFlags
  
  /**
       * Subscriber's delivery preferences supports email delivery
       */
  @js.native
  sealed trait SupportsPreferredEmailAddressDelivery
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriberFlags
  
  /* 2 */ val DeliveryPreferencesEditable: DeliveryPreferencesEditable with scala.Double = js.native
  /* 64 */ val IsGroup: IsGroup with scala.Double = js.native
  /* 128 */ val IsTeam: IsTeam with scala.Double = js.native
  /* 32 */ val IsUser: IsUser with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 8 */ val SupportsEachMemberDelivery: SupportsEachMemberDelivery with scala.Double = js.native
  /* 16 */ val SupportsNoDelivery: SupportsNoDelivery with scala.Double = js.native
  /* 4 */ val SupportsPreferredEmailAddressDelivery: SupportsPreferredEmailAddressDelivery with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriberFlags with scala.Double
  ] = js.native
}

