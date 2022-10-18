package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriptionQueryFlags extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionQueryFlags")
@js.native
object SubscriptionQueryFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionQueryFlags & Double] = js.native
  
  /**
    * For a subscription the caller does not have permission to view, return basic (non-confidential) information.
    */
  @js.native
  sealed trait AlwaysReturnBasicInformation
    extends StObject
       with SubscriptionQueryFlags
  /* 16 */ val AlwaysReturnBasicInformation: typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionQueryFlags.AlwaysReturnBasicInformation & Double = js.native
  
  /**
    * Include subscriptions marked for deletion.
    */
  @js.native
  sealed trait IncludeDeletedSubscriptions
    extends StObject
       with SubscriptionQueryFlags
  /* 4 */ val IncludeDeletedSubscriptions: typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionQueryFlags.IncludeDeletedSubscriptions & Double = js.native
  
  /**
    * Include the full filter details with each subscription.
    */
  @js.native
  sealed trait IncludeFilterDetails
    extends StObject
       with SubscriptionQueryFlags
  /* 8 */ val IncludeFilterDetails: typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionQueryFlags.IncludeFilterDetails & Double = js.native
  
  /**
    * Include subscriptions with invalid subscribers.
    */
  @js.native
  sealed trait IncludeInvalidSubscriptions
    extends StObject
       with SubscriptionQueryFlags
  /* 2 */ val IncludeInvalidSubscriptions: typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionQueryFlags.IncludeInvalidSubscriptions & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with SubscriptionQueryFlags
  /* 0 */ val None: typings.vsoNodeApi.interfacesNotificationInterfacesMod.SubscriptionQueryFlags.None & Double = js.native
}
