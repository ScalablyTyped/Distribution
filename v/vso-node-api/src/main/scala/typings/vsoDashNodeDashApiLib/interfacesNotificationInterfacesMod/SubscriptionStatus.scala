package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubscriptionStatus extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionStatus")
@js.native
object SubscriptionStatus extends js.Object {
  /**
    * Subscription is disabled, typically by the owner of the subscription, and will not produce any notifications.
    */
  @js.native
  sealed trait Disabled
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionStatus
  
  /**
    * Subscription is disabled because it is a duplicate of a default subscription.
    */
  @js.native
  sealed trait DisabledAsDuplicateOfDefault
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionStatus
  
  /**
    * Subscription is disabled by an administrator, not the subscription's subscriber.
    */
  @js.native
  sealed trait DisabledByAdmin
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionStatus
  
  /**
    * Subscription is disabled service due to failures.
    */
  @js.native
  sealed trait DisabledBySystem
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionStatus
  
  /**
    * Subscription is disabled because the identity is no longer active
    */
  @js.native
  sealed trait DisabledInactiveIdentity
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionStatus
  
  /**
    * Subscription is disabled because it has an invalid filter expression.
    */
  @js.native
  sealed trait DisabledInvalidPathClause
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionStatus
  
  /**
    * Subscription is disabled because it has an invalid role expression.
    */
  @js.native
  sealed trait DisabledInvalidRoleExpression
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionStatus
  
  /**
    * Subscription is disabled because message queue is not supported.
    */
  @js.native
  sealed trait DisabledMessageQueueNotSupported
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionStatus
  
  /**
    * Subscription is disabled because its subscriber is unknown.
    */
  @js.native
  sealed trait DisabledMissingIdentity
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionStatus
  
  /**
    * Subscription is active.
    */
  @js.native
  sealed trait Enabled
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionStatus
  
  /**
    * Subscription is active, but is on probation due to failed deliveries or other issues with the subscription.
    */
  @js.native
  sealed trait EnabledOnProbation
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionStatus
  
  /**
    * Subscription is disabled because it generated a high volume of notifications.
    */
  @js.native
  sealed trait JailedByNotificationsVolume
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionStatus
  
  /**
    * Subscription is disabled and will be deleted.
    */
  @js.native
  sealed trait PendingDeletion
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionStatus
  
  /* -1 */ val Disabled: Disabled with scala.Double = js.native
  /* -3 */ val DisabledAsDuplicateOfDefault: DisabledAsDuplicateOfDefault with scala.Double = js.native
  /* -2 */ val DisabledByAdmin: DisabledByAdmin with scala.Double = js.native
  /* -9 */ val DisabledBySystem: DisabledBySystem with scala.Double = js.native
  /* -8 */ val DisabledInactiveIdentity: DisabledInactiveIdentity with scala.Double = js.native
  /* -4 */ val DisabledInvalidPathClause: DisabledInvalidPathClause with scala.Double = js.native
  /* -5 */ val DisabledInvalidRoleExpression: DisabledInvalidRoleExpression with scala.Double = js.native
  /* -7 */ val DisabledMessageQueueNotSupported: DisabledMessageQueueNotSupported with scala.Double = js.native
  /* -6 */ val DisabledMissingIdentity: DisabledMissingIdentity with scala.Double = js.native
  /* 0 */ val Enabled: Enabled with scala.Double = js.native
  /* 1 */ val EnabledOnProbation: EnabledOnProbation with scala.Double = js.native
  /* -200 */ val JailedByNotificationsVolume: JailedByNotificationsVolume with scala.Double = js.native
  /* -100 */ val PendingDeletion: PendingDeletion with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionStatus with scala.Double
  ] = js.native
}

