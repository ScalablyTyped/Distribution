package typings.winrtUwp.Windows.Services.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StorePurchaseStatus extends js.Object

/** Defines values that represent the status of a request to purchase an app or add-on. */
@JSGlobal("Windows.Services.Store.StorePurchaseStatus")
@js.native
object StorePurchaseStatus extends js.Object {
  /** The current user has already purchased the specified app or add-on. */
  @js.native
  sealed trait alreadyPurchased extends StorePurchaseStatus
  
  /** The purchase request did not succeed because of a network connectivity error. */
  @js.native
  sealed trait networkError extends StorePurchaseStatus
  
  /** The purchase request did not succeed. */
  @js.native
  sealed trait notPurchased extends StorePurchaseStatus
  
  /** The purchase request did not succeed because of a server error returned by the Windows Store. */
  @js.native
  sealed trait serverError extends StorePurchaseStatus
  
  /** The purchase request succeeded. */
  @js.native
  sealed trait succeeded extends StorePurchaseStatus
  
}

