package typings.winrtDashUwp.Windows.Services.Store

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Services.Store.StoreConsumableStatus.insufficentQuantity
import typings.winrtDashUwp.Windows.Services.Store.StoreConsumableStatus.networkError
import typings.winrtDashUwp.Windows.Services.Store.StoreConsumableStatus.serverError
import typings.winrtDashUwp.Windows.Services.Store.StoreConsumableStatus.succeeded
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StoreConsumableStatus with Double] = js.native
  /* 1 */ @js.native
  object insufficentQuantity extends TopLevel[insufficentQuantity with Double]
  
  /* 2 */ @js.native
  object networkError extends TopLevel[networkError with Double]
  
  /* 3 */ @js.native
  object serverError extends TopLevel[serverError with Double]
  
  /* 0 */ @js.native
  object succeeded extends TopLevel[succeeded with Double]
  
}

