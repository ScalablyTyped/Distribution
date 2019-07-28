package typings.winrtDashUwp.WindowsNs.ServicesNs.StoreNs

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
  sealed trait insufficentQuantity extends StoreConsumableStatus
  
  /** The request did not succeed because of a network connectivity error. */
  @js.native
  sealed trait networkError extends StoreConsumableStatus
  
  /** The request did not succeed because of a server error returned by the Windows Store. */
  @js.native
  sealed trait serverError extends StoreConsumableStatus
  
  /** The request succeeded. */
  @js.native
  sealed trait succeeded extends StoreConsumableStatus
  
  /* 1 */ val insufficentQuantity: typings.winrtDashUwp.WindowsNs.ServicesNs.StoreNs.StoreConsumableStatus.insufficentQuantity with Double = js.native
  /* 2 */ val networkError: typings.winrtDashUwp.WindowsNs.ServicesNs.StoreNs.StoreConsumableStatus.networkError with Double = js.native
  /* 3 */ val serverError: typings.winrtDashUwp.WindowsNs.ServicesNs.StoreNs.StoreConsumableStatus.serverError with Double = js.native
  /* 0 */ val succeeded: typings.winrtDashUwp.WindowsNs.ServicesNs.StoreNs.StoreConsumableStatus.succeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StoreConsumableStatus with Double] = js.native
}

