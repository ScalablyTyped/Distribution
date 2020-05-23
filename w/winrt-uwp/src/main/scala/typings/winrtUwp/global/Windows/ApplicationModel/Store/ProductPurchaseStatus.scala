package typings.winrtUwp.global.Windows.ApplicationModel.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines values used to indicate the transaction status when purchasing an in-app product. */
@JSGlobal("Windows.ApplicationModel.Store.ProductPurchaseStatus")
@js.native
object ProductPurchaseStatus extends js.Object {
  /* 1 */ val alreadyPurchased: typings.winrtUwp.Windows.ApplicationModel.Store.ProductPurchaseStatus.alreadyPurchased with Double = js.native
  /* 2 */ val notFulfilled: typings.winrtUwp.Windows.ApplicationModel.Store.ProductPurchaseStatus.notFulfilled with Double = js.native
  /* 3 */ val notPurchased: typings.winrtUwp.Windows.ApplicationModel.Store.ProductPurchaseStatus.notPurchased with Double = js.native
  /* 0 */ val succeeded: typings.winrtUwp.Windows.ApplicationModel.Store.ProductPurchaseStatus.succeeded with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Store.ProductPurchaseStatus with Double
  ] = js.native
}

