package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriptionQueryFlags extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionQueryFlags")
@js.native
object SubscriptionQueryFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionQueryFlags with Double] = js.native
  
  /**
    * For a subscription the caller does not have permission to view, return basic (non-confidential) information.
    */
  @js.native
  sealed trait AlwaysReturnBasicInformation extends SubscriptionQueryFlags
  /* 16 */ val AlwaysReturnBasicInformation: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionQueryFlags.AlwaysReturnBasicInformation with Double = js.native
  
  /**
    * Include subscriptions marked for deletion.
    */
  @js.native
  sealed trait IncludeDeletedSubscriptions extends SubscriptionQueryFlags
  /* 4 */ val IncludeDeletedSubscriptions: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionQueryFlags.IncludeDeletedSubscriptions with Double = js.native
  
  /**
    * Include the full filter details with each subscription.
    */
  @js.native
  sealed trait IncludeFilterDetails extends SubscriptionQueryFlags
  /* 8 */ val IncludeFilterDetails: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionQueryFlags.IncludeFilterDetails with Double = js.native
  
  /**
    * Include subscriptions with invalid subscribers.
    */
  @js.native
  sealed trait IncludeInvalidSubscriptions extends SubscriptionQueryFlags
  /* 2 */ val IncludeInvalidSubscriptions: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionQueryFlags.IncludeInvalidSubscriptions with Double = js.native
  
  @js.native
  sealed trait None extends SubscriptionQueryFlags
  /* 0 */ val None: typings.vsoNodeApi.notificationInterfacesMod.SubscriptionQueryFlags.None with Double = js.native
}
