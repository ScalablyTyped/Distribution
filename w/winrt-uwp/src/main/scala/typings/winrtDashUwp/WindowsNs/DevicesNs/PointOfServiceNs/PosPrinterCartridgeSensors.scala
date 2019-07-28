package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PosPrinterCartridgeSensors extends js.Object

/** Describes the possible sensors available for a printer station of a point-of-service printer to use to report the status of the printer. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterCartridgeSensors")
@js.native
object PosPrinterCartridgeSensors extends js.Object {
  /** The printer station has a sensor that detects if the cartridge is empty. */
  @js.native
  sealed trait empty extends PosPrinterCartridgeSensors
  
  /** The printer station has a sensor that detects if the head of the printer cartridge is being cleaned. */
  @js.native
  sealed trait headCleaning extends PosPrinterCartridgeSensors
  
  /** The printer station has a sensor that detects if the printer cartridge is almost out of ink or toner. */
  @js.native
  sealed trait nearEnd extends PosPrinterCartridgeSensors
  
  /** The printer station does not have any sensors available to report the status of the station. */
  @js.native
  sealed trait none extends PosPrinterCartridgeSensors
  
  /** The printer station has a sensor that detects if the cartridge is removed. */
  @js.native
  sealed trait removed extends PosPrinterCartridgeSensors
  
  /* 2 */ val empty: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterCartridgeSensors.empty with Double = js.native
  /* 3 */ val headCleaning: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterCartridgeSensors.headCleaning with Double = js.native
  /* 4 */ val nearEnd: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterCartridgeSensors.nearEnd with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterCartridgeSensors.none with Double = js.native
  /* 1 */ val removed: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterCartridgeSensors.removed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterCartridgeSensors with Double] = js.native
}

