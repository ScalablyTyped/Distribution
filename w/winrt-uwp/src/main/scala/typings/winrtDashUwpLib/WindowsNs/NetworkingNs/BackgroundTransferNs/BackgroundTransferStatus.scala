package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackgroundTransferStatus extends js.Object

/** Defines transfer operation status values. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferStatus")
@js.native
object BackgroundTransferStatus extends js.Object {
  /** The transfer operation has been cancelled. */
  @js.native
  sealed trait canceled
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus
  
  /** The transfer operation has completed. */
  @js.native
  sealed trait completed
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus
  
  /** An error was encountered during the transfer operation. */
  @js.native
  sealed trait error
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus
  
  /** The application is idle. */
  @js.native
  sealed trait idle
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus
  
  /** The application has paused the transfer operation. */
  @js.native
  sealed trait pausedByApplication
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus
  
  /** The transfer operation is paused due to cost policy (e.g. transitioned to a costed network). */
  @js.native
  sealed trait pausedCostedNetwork
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus
  
  /** The transfer operation is paused due to a lack of network connectivity. */
  @js.native
  sealed trait pausedNoNetwork
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus
  
  /** Windows Phone only. The transfer is paused by the system due to resource constraints. Transfers will have this status if Battery Saver is activated, if the background task can't get enough memory, CPU, power resources to run, or if the network condition is 2G and the app is not in the foreground */
  @js.native
  sealed trait pausedSystemPolicy
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus
  
  /** The transfer is currently in progress. */
  @js.native
  sealed trait running
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus
  
  /* 6 */ val canceled: canceled with scala.Double = js.native
  /* 5 */ val completed: completed with scala.Double = js.native
  /* 7 */ val error: error with scala.Double = js.native
  /* 0 */ val idle: idle with scala.Double = js.native
  /* 2 */ val pausedByApplication: pausedByApplication with scala.Double = js.native
  /* 3 */ val pausedCostedNetwork: pausedCostedNetwork with scala.Double = js.native
  /* 4 */ val pausedNoNetwork: pausedNoNetwork with scala.Double = js.native
  /* 8 */ val pausedSystemPolicy: pausedSystemPolicy with scala.Double = js.native
  /* 1 */ val running: running with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus with scala.Double
  ] = js.native
}

