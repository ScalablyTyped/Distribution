package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriberFlags extends js.Object
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriberFlags")
@js.native
object SubscriberFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriberFlags with Double] = js.native
  
  /**
    * Subscriber's delivery preferences could be updated
    */
  @js.native
  sealed trait DeliveryPreferencesEditable extends SubscriberFlags
  /* 2 */ @js.native
  object DeliveryPreferencesEditable extends TopLevel[DeliveryPreferencesEditable with Double]
  
  /**
    * Subscriber is a group
    */
  @js.native
  sealed trait IsGroup extends SubscriberFlags
  /* 64 */ @js.native
  object IsGroup extends TopLevel[IsGroup with Double]
  
  /**
    * Subscriber is a team
    */
  @js.native
  sealed trait IsTeam extends SubscriberFlags
  /* 128 */ @js.native
  object IsTeam extends TopLevel[IsTeam with Double]
  
  /**
    * Subscriber is a user
    */
  @js.native
  sealed trait IsUser extends SubscriberFlags
  /* 32 */ @js.native
  object IsUser extends TopLevel[IsUser with Double]
  
  @js.native
  sealed trait None extends SubscriberFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * Subscriber's delivery preferences supports individual members delivery(group expansion)
    */
  @js.native
  sealed trait SupportsEachMemberDelivery extends SubscriberFlags
  /* 8 */ @js.native
  object SupportsEachMemberDelivery extends TopLevel[SupportsEachMemberDelivery with Double]
  
  /**
    * Subscriber's delivery preferences supports no delivery
    */
  @js.native
  sealed trait SupportsNoDelivery extends SubscriberFlags
  /* 16 */ @js.native
  object SupportsNoDelivery extends TopLevel[SupportsNoDelivery with Double]
  
  /**
    * Subscriber's delivery preferences supports email delivery
    */
  @js.native
  sealed trait SupportsPreferredEmailAddressDelivery extends SubscriberFlags
  /* 4 */ @js.native
  object SupportsPreferredEmailAddressDelivery extends TopLevel[SupportsPreferredEmailAddressDelivery with Double]
}
