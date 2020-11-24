package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriptionStatus extends js.Object
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionStatus")
@js.native
object SubscriptionStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionStatus with Double] = js.native
  
  /**
    * Subscription is disabled, typically by the owner of the subscription, and will not produce any notifications.
    */
  @js.native
  sealed trait Disabled extends SubscriptionStatus
  /* -1 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  /**
    * Subscription is disabled because it is a duplicate of a default subscription.
    */
  @js.native
  sealed trait DisabledAsDuplicateOfDefault extends SubscriptionStatus
  /* -3 */ @js.native
  object DisabledAsDuplicateOfDefault extends TopLevel[DisabledAsDuplicateOfDefault with Double]
  
  /**
    * Subscription is disabled by an administrator, not the subscription's subscriber.
    */
  @js.native
  sealed trait DisabledByAdmin extends SubscriptionStatus
  /* -2 */ @js.native
  object DisabledByAdmin extends TopLevel[DisabledByAdmin with Double]
  
  /**
    * Subscription is disabled service due to failures.
    */
  @js.native
  sealed trait DisabledBySystem extends SubscriptionStatus
  /* -9 */ @js.native
  object DisabledBySystem extends TopLevel[DisabledBySystem with Double]
  
  /**
    * Subscription is disabled because the identity is no longer active
    */
  @js.native
  sealed trait DisabledInactiveIdentity extends SubscriptionStatus
  /* -8 */ @js.native
  object DisabledInactiveIdentity extends TopLevel[DisabledInactiveIdentity with Double]
  
  /**
    * Subscription is disabled because it has an invalid filter expression.
    */
  @js.native
  sealed trait DisabledInvalidPathClause extends SubscriptionStatus
  /* -4 */ @js.native
  object DisabledInvalidPathClause extends TopLevel[DisabledInvalidPathClause with Double]
  
  /**
    * Subscription is disabled because it has an invalid role expression.
    */
  @js.native
  sealed trait DisabledInvalidRoleExpression extends SubscriptionStatus
  /* -5 */ @js.native
  object DisabledInvalidRoleExpression extends TopLevel[DisabledInvalidRoleExpression with Double]
  
  /**
    * Subscription is disabled because message queue is not supported.
    */
  @js.native
  sealed trait DisabledMessageQueueNotSupported extends SubscriptionStatus
  /* -7 */ @js.native
  object DisabledMessageQueueNotSupported extends TopLevel[DisabledMessageQueueNotSupported with Double]
  
  /**
    * Subscription is disabled because its subscriber is unknown.
    */
  @js.native
  sealed trait DisabledMissingIdentity extends SubscriptionStatus
  /* -6 */ @js.native
  object DisabledMissingIdentity extends TopLevel[DisabledMissingIdentity with Double]
  
  /**
    * Subscription is active.
    */
  @js.native
  sealed trait Enabled extends SubscriptionStatus
  /* 0 */ @js.native
  object Enabled extends TopLevel[Enabled with Double]
  
  /**
    * Subscription is active, but is on probation due to failed deliveries or other issues with the subscription.
    */
  @js.native
  sealed trait EnabledOnProbation extends SubscriptionStatus
  /* 1 */ @js.native
  object EnabledOnProbation extends TopLevel[EnabledOnProbation with Double]
  
  /**
    * Subscription is disabled because it generated a high volume of notifications.
    */
  @js.native
  sealed trait JailedByNotificationsVolume extends SubscriptionStatus
  /* -200 */ @js.native
  object JailedByNotificationsVolume extends TopLevel[JailedByNotificationsVolume with Double]
  
  /**
    * Subscription is disabled and will be deleted.
    */
  @js.native
  sealed trait PendingDeletion extends SubscriptionStatus
  /* -100 */ @js.native
  object PendingDeletion extends TopLevel[PendingDeletion with Double]
}
