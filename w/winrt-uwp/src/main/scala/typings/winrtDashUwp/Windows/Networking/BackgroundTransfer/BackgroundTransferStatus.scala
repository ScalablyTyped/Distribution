package typings.winrtDashUwp.Windows.Networking.BackgroundTransfer

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
  sealed trait canceled extends BackgroundTransferStatus
  
  /** The transfer operation has completed. */
  @js.native
  sealed trait completed extends BackgroundTransferStatus
  
  /** An error was encountered during the transfer operation. */
  @js.native
  sealed trait error extends BackgroundTransferStatus
  
  /** The application is idle. */
  @js.native
  sealed trait idle extends BackgroundTransferStatus
  
  /** The application has paused the transfer operation. */
  @js.native
  sealed trait pausedByApplication extends BackgroundTransferStatus
  
  /** The transfer operation is paused due to cost policy (e.g. transitioned to a costed network). */
  @js.native
  sealed trait pausedCostedNetwork extends BackgroundTransferStatus
  
  /** The transfer operation is paused due to a lack of network connectivity. */
  @js.native
  sealed trait pausedNoNetwork extends BackgroundTransferStatus
  
  /** Windows Phone only. The transfer is paused by the system due to resource constraints. Transfers will have this status if Battery Saver is activated, if the background task can't get enough memory, CPU, power resources to run, or if the network condition is 2G and the app is not in the foreground */
  @js.native
  sealed trait pausedSystemPolicy extends BackgroundTransferStatus
  
  /** The transfer is currently in progress. */
  @js.native
  sealed trait running extends BackgroundTransferStatus
  
  /* 6 */ val canceled: typings.winrtDashUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.canceled with Double = js.native
  /* 5 */ val completed: typings.winrtDashUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.completed with Double = js.native
  /* 7 */ val error: typings.winrtDashUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.error with Double = js.native
  /* 0 */ val idle: typings.winrtDashUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.idle with Double = js.native
  /* 2 */ val pausedByApplication: typings.winrtDashUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedByApplication with Double = js.native
  /* 3 */ val pausedCostedNetwork: typings.winrtDashUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedCostedNetwork with Double = js.native
  /* 4 */ val pausedNoNetwork: typings.winrtDashUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedNoNetwork with Double = js.native
  /* 8 */ val pausedSystemPolicy: typings.winrtDashUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedSystemPolicy with Double = js.native
  /* 1 */ val running: typings.winrtDashUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.running with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundTransferStatus with Double] = js.native
}

