package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StoreConsumableStatus extends js.Object

/** Defines values that represent the status of an request that is related to a consumable add-on. */
@JSGlobal("Windows.Services.Store.StoreConsumableStatus")
@js.native
object StoreConsumableStatus extends js.Object {
  /** The request did not succeed because the remaining balance of the consumable add-on is too low. */
  @js.native
  sealed trait insufficentQuantity
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StoreConsumableStatus
  
  /** The request did not succeed because of a network connectivity error. */
  @js.native
  sealed trait networkError
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StoreConsumableStatus
  
  /** The request did not succeed because of a server error returned by the Windows Store. */
  @js.native
  sealed trait serverError
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StoreConsumableStatus
  
  /** The request succeeded. */
  @js.native
  sealed trait succeeded
    extends winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StoreConsumableStatus
  
  /* 1 */ val insufficentQuantity: insufficentQuantity with scala.Double = js.native
  /* 2 */ val networkError: networkError with scala.Double = js.native
  /* 3 */ val serverError: serverError with scala.Double = js.native
  /* 0 */ val succeeded: succeeded with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs.StoreConsumableStatus with scala.Double
  ] = js.native
}

