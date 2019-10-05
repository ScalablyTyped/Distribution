package typings.winrtDashUwp.Windows.Devices.PointOfService

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
  
  /* 4 */ val extended: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterStatusKind.extended with Double = js.native
  /* 1 */ val off: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterStatusKind.off with Double = js.native
  /* 3 */ val offOrOffline: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterStatusKind.offOrOffline with Double = js.native
  /* 2 */ val offline: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterStatusKind.offline with Double = js.native
  /* 0 */ val online: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterStatusKind.online with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterStatusKind with Double] = js.native
}

