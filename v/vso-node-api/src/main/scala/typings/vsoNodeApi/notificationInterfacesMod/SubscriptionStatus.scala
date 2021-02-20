package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriptionStatus extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionStatus")
@js.native
object SubscriptionStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionStatus with Double] = js.native
  
  /**
    * Subscription is disabled, typically by the owner of the subscription, and will not produce any notifications.
    */
  @js.native
  sealed trait Disabled extends SubscriptionStatus
  /* -1 */ val Disabled: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionStatus.Disabled with Double = js.native
  
  /**
    * Subscription is disabled because it is a duplicate of a default subscription.
    */
  @js.native
  sealed trait DisabledAsDuplicateOfDefault extends SubscriptionStatus
  /* -3 */ val DisabledAsDuplicateOfDefault: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionStatus.DisabledAsDuplicateOfDefault with Double = js.native
  
  /**
    * Subscription is disabled by an administrator, not the subscription's subscriber.
    */
  @js.native
  sealed trait DisabledByAdmin extends SubscriptionStatus
  /* -2 */ val DisabledByAdmin: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionStatus.DisabledByAdmin with Double = js.native
  
  /**
    * Subscription is disabled service due to failures.
    */
  @js.native
  sealed trait DisabledBySystem extends SubscriptionStatus
  /* -9 */ val DisabledBySystem: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionStatus.DisabledBySystem with Double = js.native
  
  /**
    * Subscription is disabled because the identity is no longer active
    */
  @js.native
  sealed trait DisabledInactiveIdentity extends SubscriptionStatus
  /* -8 */ val DisabledInactiveIdentity: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionStatus.DisabledInactiveIdentity with Double = js.native
  
  /**
    * Subscription is disabled because it has an invalid filter expression.
    */
  @js.native
  sealed trait DisabledInvalidPathClause extends SubscriptionStatus
  /* -4 */ val DisabledInvalidPathClause: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionStatus.DisabledInvalidPathClause with Double = js.native
  
  /**
    * Subscription is disabled because it has an invalid role expression.
    */
  @js.native
  sealed trait DisabledInvalidRoleExpression extends SubscriptionStatus
  /* -5 */ val DisabledInvalidRoleExpression: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionStatus.DisabledInvalidRoleExpression with Double = js.native
  
  /**
    * Subscription is disabled because message queue is not supported.
    */
  @js.native
  sealed trait DisabledMessageQueueNotSupported extends SubscriptionStatus
  /* -7 */ val DisabledMessageQueueNotSupported: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionStatus.DisabledMessageQueueNotSupported with Double = js.native
  
  /**
    * Subscription is disabled because its subscriber is unknown.
    */
  @js.native
  sealed trait DisabledMissingIdentity extends SubscriptionStatus
  /* -6 */ val DisabledMissingIdentity: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionStatus.DisabledMissingIdentity with Double = js.native
  
  /**
    * Subscription is active.
    */
  @js.native
  sealed trait Enabled extends SubscriptionStatus
  /* 0 */ val Enabled: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionStatus.Enabled with Double = js.native
  
  /**
    * Subscription is active, but is on probation due to failed deliveries or other issues with the subscription.
    */
  @js.native
  sealed trait EnabledOnProbation extends SubscriptionStatus
  /* 1 */ val EnabledOnProbation: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionStatus.EnabledOnProbation with Double = js.native
  
  /**
    * Subscription is disabled because it generated a high volume of notifications.
    */
  @js.native
  sealed trait JailedByNotificationsVolume extends SubscriptionStatus
  /* -200 */ val JailedByNotificationsVolume: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionStatus.JailedByNotificationsVolume with Double = js.native
  
  /**
    * Subscription is disabled and will be deleted.
    */
  @js.native
  sealed trait PendingDeletion extends SubscriptionStatus
  /* -100 */ val PendingDeletion: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionStatus.PendingDeletion with Double = js.native
}
