package typings.winrtUwp.global.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines transfer operation status values. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferStatus")
@js.native
object BackgroundTransferStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus with Double
  ] = js.native
  
  /* 6 */ val canceled: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.canceled with Double = js.native
  
  /* 5 */ val completed: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.completed with Double = js.native
  
  /* 7 */ val error: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.error with Double = js.native
  
  /* 0 */ val idle: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.idle with Double = js.native
  
  /* 2 */ val pausedByApplication: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedByApplication with Double = js.native
  
  /* 3 */ val pausedCostedNetwork: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedCostedNetwork with Double = js.native
  
  /* 4 */ val pausedNoNetwork: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedNoNetwork with Double = js.native
  
  /* 8 */ val pausedSystemPolicy: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedSystemPolicy with Double = js.native
  
  /* 1 */ val running: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.running with Double = js.native
}
