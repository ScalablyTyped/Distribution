package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

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
  sealed trait AlwaysReturnBasicInformation
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionQueryFlags
  
  /**
    * Include subscriptions marked for deletion.
    */
  @js.native
  sealed trait IncludeDeletedSubscriptions
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionQueryFlags
  
  /**
    * Include the full filter details with each subscription.
    */
  @js.native
  sealed trait IncludeFilterDetails
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionQueryFlags
  
  /**
    * Include subscriptions with invalid subscribers.
    */
  @js.native
  sealed trait IncludeInvalidSubscriptions
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionQueryFlags
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionQueryFlags
  
  /* 16 */ val AlwaysReturnBasicInformation: AlwaysReturnBasicInformation with scala.Double = js.native
  /* 4 */ val IncludeDeletedSubscriptions: IncludeDeletedSubscriptions with scala.Double = js.native
  /* 8 */ val IncludeFilterDetails: IncludeFilterDetails with scala.Double = js.native
  /* 2 */ val IncludeInvalidSubscriptions: IncludeInvalidSubscriptions with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod.SubscriptionQueryFlags with scala.Double
  ] = js.native
}

