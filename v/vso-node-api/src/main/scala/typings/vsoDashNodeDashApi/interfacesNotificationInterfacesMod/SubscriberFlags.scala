package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

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
  sealed trait DeliveryPreferencesEditable extends SubscriberFlags
  
  /**
    * Subscriber is a group
    */
  @js.native
  sealed trait IsGroup extends SubscriberFlags
  
  /**
    * Subscriber is a team
    */
  @js.native
  sealed trait IsTeam extends SubscriberFlags
  
  /**
    * Subscriber is a user
    */
  @js.native
  sealed trait IsUser extends SubscriberFlags
  
  @js.native
  sealed trait None extends SubscriberFlags
  
  /**
    * Subscriber's delivery preferences supports individual members delivery(group expansion)
    */
  @js.native
  sealed trait SupportsEachMemberDelivery extends SubscriberFlags
  
  /**
    * Subscriber's delivery preferences supports no delivery
    */
  @js.native
  sealed trait SupportsNoDelivery extends SubscriberFlags
  
  /**
    * Subscriber's delivery preferences supports email delivery
    */
  @js.native
  sealed trait SupportsPreferredEmailAddressDelivery extends SubscriberFlags
  
  /* 2 */ val DeliveryPreferencesEditable: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriberFlags.DeliveryPreferencesEditable with Double = js.native
  /* 64 */ val IsGroup: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriberFlags.IsGroup with Double = js.native
  /* 128 */ val IsTeam: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriberFlags.IsTeam with Double = js.native
  /* 32 */ val IsUser: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriberFlags.IsUser with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriberFlags.None with Double = js.native
  /* 8 */ val SupportsEachMemberDelivery: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriberFlags.SupportsEachMemberDelivery with Double = js.native
  /* 16 */ val SupportsNoDelivery: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriberFlags.SupportsNoDelivery with Double = js.native
  /* 4 */ val SupportsPreferredEmailAddressDelivery: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriberFlags.SupportsPreferredEmailAddressDelivery with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriberFlags with Double] = js.native
}

