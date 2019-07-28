package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

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
  sealed trait Disabled extends SubscriptionStatus
  
  /**
    * Subscription is disabled because it is a duplicate of a default subscription.
    */
  @js.native
  sealed trait DisabledAsDuplicateOfDefault extends SubscriptionStatus
  
  /**
    * Subscription is disabled by an administrator, not the subscription's subscriber.
    */
  @js.native
  sealed trait DisabledByAdmin extends SubscriptionStatus
  
  /**
    * Subscription is disabled service due to failures.
    */
  @js.native
  sealed trait DisabledBySystem extends SubscriptionStatus
  
  /**
    * Subscription is disabled because the identity is no longer active
    */
  @js.native
  sealed trait DisabledInactiveIdentity extends SubscriptionStatus
  
  /**
    * Subscription is disabled because it has an invalid filter expression.
    */
  @js.native
  sealed trait DisabledInvalidPathClause extends SubscriptionStatus
  
  /**
    * Subscription is disabled because it has an invalid role expression.
    */
  @js.native
  sealed trait DisabledInvalidRoleExpression extends SubscriptionStatus
  
  /**
    * Subscription is disabled because message queue is not supported.
    */
  @js.native
  sealed trait DisabledMessageQueueNotSupported extends SubscriptionStatus
  
  /**
    * Subscription is disabled because its subscriber is unknown.
    */
  @js.native
  sealed trait DisabledMissingIdentity extends SubscriptionStatus
  
  /**
    * Subscription is active.
    */
  @js.native
  sealed trait Enabled extends SubscriptionStatus
  
  /**
    * Subscription is active, but is on probation due to failed deliveries or other issues with the subscription.
    */
  @js.native
  sealed trait EnabledOnProbation extends SubscriptionStatus
  
  /**
    * Subscription is disabled because it generated a high volume of notifications.
    */
  @js.native
  sealed trait JailedByNotificationsVolume extends SubscriptionStatus
  
  /**
    * Subscription is disabled and will be deleted.
    */
  @js.native
  sealed trait PendingDeletion extends SubscriptionStatus
  
  /* -1 */ val Disabled: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionStatus.Disabled with Double = js.native
  /* -3 */ val DisabledAsDuplicateOfDefault: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionStatus.DisabledAsDuplicateOfDefault with Double = js.native
  /* -2 */ val DisabledByAdmin: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionStatus.DisabledByAdmin with Double = js.native
  /* -9 */ val DisabledBySystem: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionStatus.DisabledBySystem with Double = js.native
  /* -8 */ val DisabledInactiveIdentity: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionStatus.DisabledInactiveIdentity with Double = js.native
  /* -4 */ val DisabledInvalidPathClause: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionStatus.DisabledInvalidPathClause with Double = js.native
  /* -5 */ val DisabledInvalidRoleExpression: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionStatus.DisabledInvalidRoleExpression with Double = js.native
  /* -7 */ val DisabledMessageQueueNotSupported: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionStatus.DisabledMessageQueueNotSupported with Double = js.native
  /* -6 */ val DisabledMissingIdentity: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionStatus.DisabledMissingIdentity with Double = js.native
  /* 0 */ val Enabled: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionStatus.Enabled with Double = js.native
  /* 1 */ val EnabledOnProbation: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionStatus.EnabledOnProbation with Double = js.native
  /* -200 */ val JailedByNotificationsVolume: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionStatus.JailedByNotificationsVolume with Double = js.native
  /* -100 */ val PendingDeletion: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionStatus.PendingDeletion with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionStatus with Double] = js.native
}

