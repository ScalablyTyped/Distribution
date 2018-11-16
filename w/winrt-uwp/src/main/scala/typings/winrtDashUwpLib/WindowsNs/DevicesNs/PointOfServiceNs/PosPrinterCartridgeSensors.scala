package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

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
  sealed trait empty
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterCartridgeSensors
  
  /** The printer station has a sensor that detects if the head of the printer cartridge is being cleaned. */
  @js.native
  sealed trait headCleaning
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterCartridgeSensors
  
  /** The printer station has a sensor that detects if the printer cartridge is almost out of ink or toner. */
  @js.native
  sealed trait nearEnd
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterCartridgeSensors
  
  /** The printer station does not have any sensors available to report the status of the station. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterCartridgeSensors
  
  /** The printer station has a sensor that detects if the cartridge is removed. */
  @js.native
  sealed trait removed
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterCartridgeSensors
  
  val empty: empty with java.lang.String = js.native
  val headCleaning: headCleaning with java.lang.String = js.native
  val nearEnd: nearEnd with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val removed: removed with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterCartridgeSensors with java.lang.String
  ] = js.native
}

