package typings.winrtUwp.global.Windows.Services.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines values that represent the status of an request that is related to a consumable add-on. */
@JSGlobal("Windows.Services.Store.StoreConsumableStatus")
@js.native
object StoreConsumableStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Services.Store.StoreConsumableStatus with Double] = js.native
  
  /* 1 */ val insufficentQuantity: typings.winrtUwp.Windows.Services.Store.StoreConsumableStatus.insufficentQuantity with Double = js.native
  
  /* 2 */ val networkError: typings.winrtUwp.Windows.Services.Store.StoreConsumableStatus.networkError with Double = js.native
  
  /* 3 */ val serverError: typings.winrtUwp.Windows.Services.Store.StoreConsumableStatus.serverError with Double = js.native
  
  /* 0 */ val succeeded: typings.winrtUwp.Windows.Services.Store.StoreConsumableStatus.succeeded with Double = js.native
}
