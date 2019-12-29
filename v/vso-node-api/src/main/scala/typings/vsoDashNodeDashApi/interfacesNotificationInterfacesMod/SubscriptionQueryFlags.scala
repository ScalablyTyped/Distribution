package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubscriptionQueryFlags with Double] = js.native
  /* 16 */ @js.native
  object AlwaysReturnBasicInformation extends TopLevel[AlwaysReturnBasicInformation with Double]
  
  /* 4 */ @js.native
  object IncludeDeletedSubscriptions extends TopLevel[IncludeDeletedSubscriptions with Double]
  
  /* 8 */ @js.native
  object IncludeFilterDetails extends TopLevel[IncludeFilterDetails with Double]
  
  /* 2 */ @js.native
  object IncludeInvalidSubscriptions extends TopLevel[IncludeInvalidSubscriptions with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

