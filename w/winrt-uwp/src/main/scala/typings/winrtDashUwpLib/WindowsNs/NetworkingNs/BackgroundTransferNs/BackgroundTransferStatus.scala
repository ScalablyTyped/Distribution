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
  
  val canceled: canceled with java.lang.String = js.native
  val completed: completed with java.lang.String = js.native
  val error: error with java.lang.String = js.native
  val idle: idle with java.lang.String = js.native
  val pausedByApplication: pausedByApplication with java.lang.String = js.native
  val pausedCostedNetwork: pausedCostedNetwork with java.lang.String = js.native
  val pausedNoNetwork: pausedNoNetwork with java.lang.String = js.native
  val pausedSystemPolicy: pausedSystemPolicy with java.lang.String = js.native
  val running: running with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferStatus with java.lang.String
  ] = js.native
}

