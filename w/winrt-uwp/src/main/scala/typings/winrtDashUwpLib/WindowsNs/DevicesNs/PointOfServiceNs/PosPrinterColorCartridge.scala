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
  
  val custom1: custom1 with java.lang.String = js.native
  val custom2: custom2 with java.lang.String = js.native
  val custom3: custom3 with java.lang.String = js.native
  val custom4: custom4 with java.lang.String = js.native
  val custom5: custom5 with java.lang.String = js.native
  val custom6: custom6 with java.lang.String = js.native
  val cyan: cyan with java.lang.String = js.native
  val magenta: magenta with java.lang.String = js.native
  val primary: primary with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val yellow: yellow with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge with java.lang.String
  ] = js.native
}

