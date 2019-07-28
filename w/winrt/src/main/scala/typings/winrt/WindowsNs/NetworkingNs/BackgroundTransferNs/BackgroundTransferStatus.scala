package typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs

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
  
  /* 6 */ val canceled: typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus.canceled with Double = js.native
  /* 5 */ val completed: typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus.completed with Double = js.native
  /* 7 */ val error: typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus.error with Double = js.native
  /* 0 */ val idle: typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus.idle with Double = js.native
  /* 2 */ val pausedByApplication: typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus.pausedByApplication with Double = js.native
  /* 3 */ val pausedCostedNetwork: typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus.pausedCostedNetwork with Double = js.native
  /* 4 */ val pausedNoNetwork: typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus.pausedNoNetwork with Double = js.native
  /* 1 */ val running: typings.winrt.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus.running with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundTransferStatus with Double] = js.native
}

