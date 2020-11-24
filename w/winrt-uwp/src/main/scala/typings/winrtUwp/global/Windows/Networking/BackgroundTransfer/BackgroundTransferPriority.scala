package typings.winrtUwp.global.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the values used to indicate the priority of a download or upload operation when within a BackgroundTransferGroup . */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferPriority")
@js.native
object BackgroundTransferPriority extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferPriority with Double
  ] = js.native
  
  /* 0 */ val default: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferPriority.default with Double = js.native
  
  /* 1 */ val high: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferPriority.high with Double = js.native
}
