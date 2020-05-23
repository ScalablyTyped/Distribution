package typings.winrtUwp.Windows.Devices.PointOfService

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
  
}

