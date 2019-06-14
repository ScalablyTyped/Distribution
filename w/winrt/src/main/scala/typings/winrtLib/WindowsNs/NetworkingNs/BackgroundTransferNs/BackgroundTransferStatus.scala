package typings
package winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackgroundTransferStatus extends js.Object

@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferStatus")
@js.native
object BackgroundTransferStatus extends js.Object {
  @js.native
  sealed trait canceled
    extends winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus
  
  @js.native
  sealed trait completed
    extends winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus
  
  @js.native
  sealed trait error
    extends winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus
  
  @js.native
  sealed trait idle
    extends winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus
  
  @js.native
  sealed trait pausedByApplication
    extends winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus
  
  @js.native
  sealed trait pausedCostedNetwork
    extends winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus
  
  @js.native
  sealed trait pausedNoNetwork
    extends winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus
  
  @js.native
  sealed trait running
    extends winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus
  
  /* 6 */ val canceled: canceled with scala.Double = js.native
  /* 5 */ val completed: completed with scala.Double = js.native
  /* 7 */ val error: error with scala.Double = js.native
  /* 0 */ val idle: idle with scala.Double = js.native
  /* 2 */ val pausedByApplication: pausedByApplication with scala.Double = js.native
  /* 3 */ val pausedCostedNetwork: pausedCostedNetwork with scala.Double = js.native
  /* 4 */ val pausedNoNetwork: pausedNoNetwork with scala.Double = js.native
  /* 1 */ val running: running with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus with scala.Double
  ] = js.native
}

