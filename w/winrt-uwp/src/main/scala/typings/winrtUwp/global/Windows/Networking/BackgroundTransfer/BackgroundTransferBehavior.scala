package typings.winrtUwp.global.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines values used to indicate if downloads and uploads within a BackgroundTransferGroup run in simultaneously or in serial. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferBehavior")
@js.native
object BackgroundTransferBehavior extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferBehavior with Double
  ] = js.native
  
  /* 0 */ val parallel: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferBehavior.parallel with Double = js.native
  
  /* 1 */ val serialized: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferBehavior.serialized with Double = js.native
}
