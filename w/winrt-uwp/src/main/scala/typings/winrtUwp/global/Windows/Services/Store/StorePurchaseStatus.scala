package typings.winrtUwp.global.Windows.Services.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines values that represent the status of a request to purchase an app or add-on. */
@JSGlobal("Windows.Services.Store.StorePurchaseStatus")
@js.native
object StorePurchaseStatus extends js.Object {
  /* 1 */ val alreadyPurchased: typings.winrtUwp.Windows.Services.Store.StorePurchaseStatus.alreadyPurchased with Double = js.native
  /* 3 */ val networkError: typings.winrtUwp.Windows.Services.Store.StorePurchaseStatus.networkError with Double = js.native
  /* 2 */ val notPurchased: typings.winrtUwp.Windows.Services.Store.StorePurchaseStatus.notPurchased with Double = js.native
  /* 4 */ val serverError: typings.winrtUwp.Windows.Services.Store.StorePurchaseStatus.serverError with Double = js.native
  /* 0 */ val succeeded: typings.winrtUwp.Windows.Services.Store.StorePurchaseStatus.succeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Services.Store.StorePurchaseStatus with Double] = js.native
}

