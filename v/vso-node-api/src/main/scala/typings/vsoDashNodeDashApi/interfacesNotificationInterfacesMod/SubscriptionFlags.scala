package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionFlags with Double] = js.native
  /* 4 */ @js.native
  object CanOptOut extends TopLevel[CanOptOut with Double]
  
  /* 2 */ @js.native
  object ContributedSubscription extends TopLevel[ContributedSubscription with Double]
  
  /* 1 */ @js.native
  object GroupSubscription extends TopLevel[GroupSubscription with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 8 */ @js.native
  object TeamSubscription extends TopLevel[TeamSubscription with Double]
  
}

