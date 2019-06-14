package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PosPrinterColorCartridge extends js.Object

/** Describes the color cartridges that the point-of-service printer can use for printing. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterColorCartridge")
@js.native
object PosPrinterColorCartridge extends js.Object {
  /** The first custom color cartridge, which provides a secondary color, usually red. */
  @js.native
  sealed trait custom1
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge
  
  /** The second custom color cartridge. */
  @js.native
  sealed trait custom2
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge
  
  /** The third custom color cartridge. */
  @js.native
  sealed trait custom3
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge
  
  /** The fourth custom color cartridge. */
  @js.native
  sealed trait custom4
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge
  
  /** The fifth custom color cartridge. */
  @js.native
  sealed trait custom5
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge
  
  /** The sixth custom color cartridge. */
  @js.native
  sealed trait custom6
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge
  
  /** The cyan cartridge for full color printing. */
  @js.native
  sealed trait cyan
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge
  
  /** The magenta cartridge for full color printing. */
  @js.native
  sealed trait magenta
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge
  
  /** The primary color cartridge. */
  @js.native
  sealed trait primary
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge
  
  /** An unknown color cartridge. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge
  
  /** The yellow cartridge for full color printing. */
  @js.native
  sealed trait yellow
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge
  
  /* 2 */ val custom1: custom1 with scala.Double = js.native
  /* 3 */ val custom2: custom2 with scala.Double = js.native
  /* 4 */ val custom3: custom3 with scala.Double = js.native
  /* 5 */ val custom4: custom4 with scala.Double = js.native
  /* 6 */ val custom5: custom5 with scala.Double = js.native
  /* 7 */ val custom6: custom6 with scala.Double = js.native
  /* 8 */ val cyan: cyan with scala.Double = js.native
  /* 9 */ val magenta: magenta with scala.Double = js.native
  /* 1 */ val primary: primary with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  /* 10 */ val yellow: yellow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge with scala.Double
  ] = js.native
}

