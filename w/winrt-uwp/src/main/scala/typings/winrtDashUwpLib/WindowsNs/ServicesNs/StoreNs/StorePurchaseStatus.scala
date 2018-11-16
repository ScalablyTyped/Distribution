package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

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
  sealed trait alreadyPurchased
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StorePurchaseStatus
  
  /** The purchase request did not succeed because of a network connectivity error. */
  @js.native
  sealed trait networkError
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StorePurchaseStatus
  
  /** The purchase request did not succeed. */
  @js.native
  sealed trait notPurchased
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StorePurchaseStatus
  
  /** The purchase request did not succeed because of a server error returned by the Windows Store. */
  @js.native
  sealed trait serverError
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StorePurchaseStatus
  
  /** The purchase request succeeded. */
  @js.native
  sealed trait succeeded
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StorePurchaseStatus
  
  /* 1 */ val alreadyPurchased: alreadyPurchased with scala.Double = js.native
  /* 3 */ val networkError: networkError with scala.Double = js.native
  /* 2 */ val notPurchased: notPurchased with scala.Double = js.native
  /* 4 */ val serverError: serverError with scala.Double = js.native
  /* 0 */ val succeeded: succeeded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StorePurchaseStatus with scala.Double
  ] = js.native
}

