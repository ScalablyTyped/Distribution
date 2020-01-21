package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundTransferStatus with Double] = js.native
  /* 6 */ @js.native
  object canceled extends TopLevel[canceled with Double]
  
  /* 5 */ @js.native
  object completed extends TopLevel[completed with Double]
  
  /* 7 */ @js.native
  object error extends TopLevel[error with Double]
  
  /* 0 */ @js.native
  object idle extends TopLevel[idle with Double]
  
  /* 2 */ @js.native
  object pausedByApplication extends TopLevel[pausedByApplication with Double]
  
  /* 3 */ @js.native
  object pausedCostedNetwork extends TopLevel[pausedCostedNetwork with Double]
  
  /* 4 */ @js.native
  object pausedNoNetwork extends TopLevel[pausedNoNetwork with Double]
  
  /* 8 */ @js.native
  object pausedSystemPolicy extends TopLevel[pausedSystemPolicy with Double]
  
  /* 1 */ @js.native
  object running extends TopLevel[running with Double]
  
}

