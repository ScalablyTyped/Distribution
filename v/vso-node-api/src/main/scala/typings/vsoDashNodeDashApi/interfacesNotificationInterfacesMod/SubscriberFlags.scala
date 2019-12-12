package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriberFlags.DeliveryPreferencesEditable
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriberFlags.IsGroup
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriberFlags.IsTeam
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriberFlags.IsUser
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriberFlags.None
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriberFlags.SupportsEachMemberDelivery
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriberFlags.SupportsNoDelivery
import typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriberFlags.SupportsPreferredEmailAddressDelivery
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriberFlags with Double] = js.native
  /* 2 */ @js.native
  object DeliveryPreferencesEditable extends TopLevel[DeliveryPreferencesEditable with Double]
  
  /* 64 */ @js.native
  object IsGroup extends TopLevel[IsGroup with Double]
  
  /* 128 */ @js.native
  object IsTeam extends TopLevel[IsTeam with Double]
  
  /* 32 */ @js.native
  object IsUser extends TopLevel[IsUser with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 8 */ @js.native
  object SupportsEachMemberDelivery extends TopLevel[SupportsEachMemberDelivery with Double]
  
  /* 16 */ @js.native
  object SupportsNoDelivery extends TopLevel[SupportsNoDelivery with Double]
  
  /* 4 */ @js.native
  object SupportsPreferredEmailAddressDelivery extends TopLevel[SupportsPreferredEmailAddressDelivery with Double]
  
}

