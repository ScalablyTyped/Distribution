package typings.winrtDashUwp.Windows.Services.Store

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
  
  /* 1 */ val alreadyPurchased: typings.winrtDashUwp.Windows.Services.Store.StorePurchaseStatus.alreadyPurchased with Double = js.native
  /* 3 */ val networkError: typings.winrtDashUwp.Windows.Services.Store.StorePurchaseStatus.networkError with Double = js.native
  /* 2 */ val notPurchased: typings.winrtDashUwp.Windows.Services.Store.StorePurchaseStatus.notPurchased with Double = js.native
  /* 4 */ val serverError: typings.winrtDashUwp.Windows.Services.Store.StorePurchaseStatus.serverError with Double = js.native
  /* 0 */ val succeeded: typings.winrtDashUwp.Windows.Services.Store.StorePurchaseStatus.succeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StorePurchaseStatus with Double] = js.native
}

