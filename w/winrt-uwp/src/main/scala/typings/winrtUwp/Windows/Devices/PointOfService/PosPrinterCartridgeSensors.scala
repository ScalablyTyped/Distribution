package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PosPrinterCartridgeSensors extends StObject
/** Describes the possible sensors available for a printer station of a point-of-service printer to use to report the status of the printer. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterCartridgeSensors")
@js.native
object PosPrinterCartridgeSensors extends StObject {
  
  /** The printer station has a sensor that detects if the cartridge is empty. */
  @js.native
  sealed trait empty
    extends StObject
       with PosPrinterCartridgeSensors
  
  /** The printer station has a sensor that detects if the head of the printer cartridge is being cleaned. */
  @js.native
  sealed trait headCleaning
    extends StObject
       with PosPrinterCartridgeSensors
  
  /** The printer station has a sensor that detects if the printer cartridge is almost out of ink or toner. */
  @js.native
  sealed trait nearEnd
    extends StObject
       with PosPrinterCartridgeSensors
  
  /** The printer station does not have any sensors available to report the status of the station. */
  @js.native
  sealed trait none
    extends StObject
       with PosPrinterCartridgeSensors
  
  /** The printer station has a sensor that detects if the cartridge is removed. */
  @js.native
  sealed trait removed
    extends StObject
       with PosPrinterCartridgeSensors
}
