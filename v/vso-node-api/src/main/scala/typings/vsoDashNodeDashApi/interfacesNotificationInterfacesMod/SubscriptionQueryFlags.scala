package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubscriptionQueryFlags extends js.Object

@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionQueryFlags")
@js.native
object SubscriptionQueryFlags extends js.Object {
  /**
    * For a subscription the caller does not have permission to view, return basic (non-confidential) information.
    */
  @js.native
  sealed trait AlwaysReturnBasicInformation extends SubscriptionQueryFlags
  
  /**
    * Include subscriptions marked for deletion.
    */
  @js.native
  sealed trait IncludeDeletedSubscriptions extends SubscriptionQueryFlags
  
  /**
    * Include the full filter details with each subscription.
    */
  @js.native
  sealed trait IncludeFilterDetails extends SubscriptionQueryFlags
  
  /**
    * Include subscriptions with invalid subscribers.
    */
  @js.native
  sealed trait IncludeInvalidSubscriptions extends SubscriptionQueryFlags
  
  @js.native
  sealed trait None extends SubscriptionQueryFlags
  
  /* 16 */ val AlwaysReturnBasicInformation: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionQueryFlags.AlwaysReturnBasicInformation with Double = js.native
  /* 4 */ val IncludeDeletedSubscriptions: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionQueryFlags.IncludeDeletedSubscriptions with Double = js.native
  /* 8 */ val IncludeFilterDetails: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionQueryFlags.IncludeFilterDetails with Double = js.native
  /* 2 */ val IncludeInvalidSubscriptions: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionQueryFlags.IncludeInvalidSubscriptions with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod.SubscriptionQueryFlags.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionQueryFlags with Double] = js.native
}

