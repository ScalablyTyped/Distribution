package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PosPrinterStatusKind extends js.Object

/** Describes the power state for a point-of-service printer. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterStatusKind")
@js.native
object PosPrinterStatusKind extends js.Object {
  /** The original equipment manufacturer (OEM) reports extended information about the power state of the printer in the PosPrinterStatus.ExtendedStatus property. */
  @js.native
  sealed trait extended extends PosPrinterStatusKind
  
  /** The printer is turned off or disconnected from the terminal. */
  @js.native
  sealed trait off extends PosPrinterStatusKind
  
  /** The printer is either turned off, or turned on but not ready or not able to respond to requests. */
  @js.native
  sealed trait offOrOffline extends PosPrinterStatusKind
  
  /** The printer is turned on, but it is not ready or not able to respond to requests. */
  @js.native
  sealed trait offline extends PosPrinterStatusKind
  
  /** The printer is online. */
  @js.native
  sealed trait online extends PosPrinterStatusKind
  
}

