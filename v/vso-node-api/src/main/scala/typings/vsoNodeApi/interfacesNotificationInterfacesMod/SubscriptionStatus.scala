package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriptionStatus extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionStatus")
@js.native
object SubscriptionStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionStatus & Double] = js.native
  
  /**
    * Subscription is disabled, typically by the owner of the subscription, and will not produce any notifications.
    */
  @js.native
  sealed trait Disabled
    extends StObject
       with SubscriptionStatus
  /* -1 */ val Disabled: typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionStatus.Disabled & Double = js.native
  
  /**
    * Subscription is disabled because it is a duplicate of a default subscription.
    */
  @js.native
  sealed trait DisabledAsDuplicateOfDefault
    extends StObject
       with SubscriptionStatus
  /* -3 */ val DisabledAsDuplicateOfDefault: typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionStatus.DisabledAsDuplicateOfDefault & Double = js.native
  
  /**
    * Subscription is disabled by an administrator, not the subscription's subscriber.
    */
  @js.native
  sealed trait DisabledByAdmin
    extends StObject
       with SubscriptionStatus
  /* -2 */ val DisabledByAdmin: typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionStatus.DisabledByAdmin & Double = js.native
  
  /**
    * Subscription is disabled service due to failures.
    */
  @js.native
  sealed trait DisabledBySystem
    extends StObject
       with SubscriptionStatus
  /* -9 */ val DisabledBySystem: typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionStatus.DisabledBySystem & Double = js.native
  
  /**
    * Subscription is disabled because the identity is no longer active
    */
  @js.native
  sealed trait DisabledInactiveIdentity
    extends StObject
       with SubscriptionStatus
  /* -8 */ val DisabledInactiveIdentity: typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionStatus.DisabledInactiveIdentity & Double = js.native
  
  /**
    * Subscription is disabled because it has an invalid filter expression.
    */
  @js.native
  sealed trait DisabledInvalidPathClause
    extends StObject
       with SubscriptionStatus
  /* -4 */ val DisabledInvalidPathClause: typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionStatus.DisabledInvalidPathClause & Double = js.native
  
  /**
    * Subscription is disabled because it has an invalid role expression.
    */
  @js.native
  sealed trait DisabledInvalidRoleExpression
    extends StObject
       with SubscriptionStatus
  /* -5 */ val DisabledInvalidRoleExpression: typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionStatus.DisabledInvalidRoleExpression & Double = js.native
  
  /**
    * Subscription is disabled because message queue is not supported.
    */
  @js.native
  sealed trait DisabledMessageQueueNotSupported
    extends StObject
       with SubscriptionStatus
  /* -7 */ val DisabledMessageQueueNotSupported: typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionStatus.DisabledMessageQueueNotSupported & Double = js.native
  
  /**
    * Subscription is disabled because its subscriber is unknown.
    */
  @js.native
  sealed trait DisabledMissingIdentity
    extends StObject
       with SubscriptionStatus
  /* -6 */ val DisabledMissingIdentity: typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionStatus.DisabledMissingIdentity & Double = js.native
  
  /**
    * Subscription is active.
    */
  @js.native
  sealed trait Enabled
    extends StObject
       with SubscriptionStatus
  /* 0 */ val Enabled: typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionStatus.Enabled & Double = js.native
  
  /**
    * Subscription is active, but is on probation due to failed deliveries or other issues with the subscription.
    */
  @js.native
  sealed trait EnabledOnProbation
    extends StObject
       with SubscriptionStatus
  /* 1 */ val EnabledOnProbation: typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionStatus.EnabledOnProbation & Double = js.native
  
  /**
    * Subscription is disabled because it generated a high volume of notifications.
    */
  @js.native
  sealed trait JailedByNotificationsVolume
    extends StObject
       with SubscriptionStatus
  /* -200 */ val JailedByNotificationsVolume: typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionStatus.JailedByNotificationsVolume & Double = js.native
  
  /**
    * Subscription is disabled and will be deleted.
    */
  @js.native
  sealed trait PendingDeletion
    extends StObject
       with SubscriptionStatus
  /* -100 */ val PendingDeletion: typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionStatus.PendingDeletion & Double = js.native
}
