package typings.winrt.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackgroundTransferStatus extends js.Object

@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferStatus")
@js.native
object BackgroundTransferStatus extends js.Object {
  @js.native
  sealed trait canceled extends BackgroundTransferStatus
  
  @js.native
  sealed trait completed extends BackgroundTransferStatus
  
  @js.native
  sealed trait error extends BackgroundTransferStatus
  
  @js.native
  sealed trait idle extends BackgroundTransferStatus
  
  @js.native
  sealed trait pausedByApplication extends BackgroundTransferStatus
  
  @js.native
  sealed trait pausedCostedNetwork extends BackgroundTransferStatus
  
  @js.native
  sealed trait pausedNoNetwork extends BackgroundTransferStatus
  
  @js.native
  sealed trait running extends BackgroundTransferStatus
  
  /* 6 */ val canceled: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.canceled with Double = js.native
  /* 5 */ val completed: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.completed with Double = js.native
  /* 7 */ val error: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.error with Double = js.native
  /* 0 */ val idle: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.idle with Double = js.native
  /* 2 */ val pausedByApplication: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedByApplication with Double = js.native
  /* 3 */ val pausedCostedNetwork: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedCostedNetwork with Double = js.native
  /* 4 */ val pausedNoNetwork: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedNoNetwork with Double = js.native
  /* 1 */ val running: typings.winrt.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.running with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundTransferStatus with Double] = js.native
}

