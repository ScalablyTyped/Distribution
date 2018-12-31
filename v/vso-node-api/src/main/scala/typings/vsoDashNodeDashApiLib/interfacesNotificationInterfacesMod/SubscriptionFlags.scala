package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

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
  sealed trait CanOptOut
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionFlags
  
  /**
    * Subscription is contributed and not persisted. This means certain fields of the subscription, like Filter, are read-only.
    */
  @js.native
  sealed trait ContributedSubscription
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionFlags
  
  /**
    * Subscription's subscriber is a group, not a user
    */
  @js.native
  sealed trait GroupSubscription
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionFlags
  
  /**
    * None
    */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionFlags
  
  /**
    * If the subscriber is a group, is it a team.
    */
  @js.native
  sealed trait TeamSubscription
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionFlags
  
  /* 4 */ val CanOptOut: CanOptOut with scala.Double = js.native
  /* 2 */ val ContributedSubscription: ContributedSubscription with scala.Double = js.native
  /* 1 */ val GroupSubscription: GroupSubscription with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 8 */ val TeamSubscription: TeamSubscription with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionFlags with scala.Double
  ] = js.native
}

