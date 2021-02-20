package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriberFlags extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriberFlags")
@js.native
object SubscriberFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriberFlags with Double] = js.native
  
  /**
    * Subscriber's delivery preferences could be updated
    */
  @js.native
  sealed trait DeliveryPreferencesEditable extends SubscriberFlags
  /* 2 */ val DeliveryPreferencesEditable: typings.vsoNodeApi.notificationInterfacesMod.SubscriberFlags.DeliveryPreferencesEditable with Double = js.native
  
  /**
    * Subscriber is a group
    */
  @js.native
  sealed trait IsGroup extends SubscriberFlags
  /* 64 */ val IsGroup: typings.vsoNodeApi.notificationInterfacesMod.SubscriberFlags.IsGroup with Double = js.native
  
  /**
    * Subscriber is a team
    */
  @js.native
  sealed trait IsTeam extends SubscriberFlags
  /* 128 */ val IsTeam: typings.vsoNodeApi.notificationInterfacesMod.SubscriberFlags.IsTeam with Double = js.native
  
  /**
    * Subscriber is a user
    */
  @js.native
  sealed trait IsUser extends SubscriberFlags
  /* 32 */ val IsUser: typings.vsoNodeApi.notificationInterfacesMod.SubscriberFlags.IsUser with Double = js.native
  
  @js.native
  sealed trait None extends SubscriberFlags
  /* 0 */ val None: typings.vsoNodeApi.notificationInterfacesMod.SubscriberFlags.None with Double = js.native
  
  /**
    * Subscriber's delivery preferences supports individual members delivery(group expansion)
    */
  @js.native
  sealed trait SupportsEachMemberDelivery extends SubscriberFlags
  /* 8 */ val SupportsEachMemberDelivery: typings.vsoNodeApi.notificationInterfacesMod.SubscriberFlags.SupportsEachMemberDelivery with Double = js.native
  
  /**
    * Subscriber's delivery preferences supports no delivery
    */
  @js.native
  sealed trait SupportsNoDelivery extends SubscriberFlags
  /* 16 */ val SupportsNoDelivery: typings.vsoNodeApi.notificationInterfacesMod.SubscriberFlags.SupportsNoDelivery with Double = js.native
  
  /**
    * Subscriber's delivery preferences supports email delivery
    */
  @js.native
  sealed trait SupportsPreferredEmailAddressDelivery extends SubscriberFlags
  /* 4 */ val SupportsPreferredEmailAddressDelivery: typings.vsoNodeApi.notificationInterfacesMod.SubscriberFlags.SupportsPreferredEmailAddressDelivery with Double = js.native
}
