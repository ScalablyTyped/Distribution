package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SubscriptionQueryFlags extends js.Object
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "SubscriptionQueryFlags")
@js.native
object SubscriptionQueryFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionQueryFlags with Double] = js.native
  
  /**
    * For a subscription the caller does not have permission to view, return basic (non-confidential) information.
    */
  @js.native
  sealed trait AlwaysReturnBasicInformation extends SubscriptionQueryFlags
  /* 16 */ @js.native
  object AlwaysReturnBasicInformation extends TopLevel[AlwaysReturnBasicInformation with Double]
  
  /**
    * Include subscriptions marked for deletion.
    */
  @js.native
  sealed trait IncludeDeletedSubscriptions extends SubscriptionQueryFlags
  /* 4 */ @js.native
  object IncludeDeletedSubscriptions extends TopLevel[IncludeDeletedSubscriptions with Double]
  
  /**
    * Include the full filter details with each subscription.
    */
  @js.native
  sealed trait IncludeFilterDetails extends SubscriptionQueryFlags
  /* 8 */ @js.native
  object IncludeFilterDetails extends TopLevel[IncludeFilterDetails with Double]
  
  /**
    * Include subscriptions with invalid subscribers.
    */
  @js.native
  sealed trait IncludeInvalidSubscriptions extends SubscriptionQueryFlags
  /* 2 */ @js.native
  object IncludeInvalidSubscriptions extends TopLevel[IncludeInvalidSubscriptions with Double]
  
  @js.native
  sealed trait None extends SubscriptionQueryFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
