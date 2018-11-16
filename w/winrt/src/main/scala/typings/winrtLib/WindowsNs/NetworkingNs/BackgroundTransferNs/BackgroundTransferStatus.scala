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
  
  val canceled: canceled with java.lang.String = js.native
  val completed: completed with java.lang.String = js.native
  val error: error with java.lang.String = js.native
  val idle: idle with java.lang.String = js.native
  val pausedByApplication: pausedByApplication with java.lang.String = js.native
  val pausedCostedNetwork: pausedCostedNetwork with java.lang.String = js.native
  val pausedNoNetwork: pausedNoNetwork with java.lang.String = js.native
  val running: running with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus with java.lang.String
  ] = js.native
}

