package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubscriptionFlags extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionFlags")
@js.native
object SubscriptionFlags extends js.Object {
  /**
    * A user that is member of the subscription's subscriber group can opt in/out of the subscription.
    */
  @js.native
  sealed trait CanOptOut extends SubscriptionFlags
  
  /**
    * Subscription is contributed and not persisted. This means certain fields of the subscription, like Filter, are read-only.
    */
  @js.native
  sealed trait ContributedSubscription extends SubscriptionFlags
  
  /**
    * Subscription's subscriber is a group, not a user
    */
  @js.native
  sealed trait GroupSubscription extends SubscriptionFlags
  
  /**
    * None
    */
  @js.native
  sealed trait None extends SubscriptionFlags
  
  /**
    * If the subscriber is a group, is it a team.
    */
  @js.native
  sealed trait TeamSubscription extends SubscriptionFlags
  
  /* 4 */ val CanOptOut: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionFlags.CanOptOut with Double = js.native
  /* 2 */ val ContributedSubscription: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionFlags.ContributedSubscription with Double = js.native
  /* 1 */ val GroupSubscription: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionFlags.GroupSubscription with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionFlags.None with Double = js.native
  /* 8 */ val TeamSubscription: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionFlags.TeamSubscription with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionFlags with Double] = js.native
}

