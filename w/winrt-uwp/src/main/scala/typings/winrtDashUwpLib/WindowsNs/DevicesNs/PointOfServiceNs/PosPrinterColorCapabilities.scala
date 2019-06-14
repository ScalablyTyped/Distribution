package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PosPrinterColorCapabilities extends js.Object

/** Describes the possible color cartridges that a point-of-service printer can support. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterColorCapabilities")
@js.native
object PosPrinterColorCapabilities extends js.Object {
  /** Supports a first custom color cartridge, which provides a secondary color, usually red. */
  @js.native
  sealed trait custom1
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCapabilities
  
  /** Supports a second custom color cartridge. */
  @js.native
  sealed trait custom2
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCapabilities
  
  /** Supports a third custom color cartridge. */
  @js.native
  sealed trait custom3
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCapabilities
  
  /** Supports a fourth custom color cartridge. */
  @js.native
  sealed trait custom4
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCapabilities
  
  /** Supports a fifth custom color cartridge. */
  @js.native
  sealed trait custom5
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCapabilities
  
  /** Supports a sixth custom color cartridge. */
  @js.native
  sealed trait custom6
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCapabilities
  
  /** Supports a cyan cartridge for full color printing. */
  @js.native
  sealed trait cyan
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCapabilities
  
  /** Supports full color printing. */
  @js.native
  sealed trait full
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCapabilities
  
  /** Supports a magenta cartridge for full color printing. */
  @js.native
  sealed trait magenta
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCapabilities
  
  /** Supports no color cartridges. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCapabilities
  
  /** Supports a primary color cartridge. */
  @js.native
  sealed trait primary
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCapabilities
  
  /** Supports a yellow cartridge for full color printing. */
  @js.native
  sealed trait yellow
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCapabilities
  
  /* 2 */ val custom1: custom1 with scala.Double = js.native
  /* 3 */ val custom2: custom2 with scala.Double = js.native
  /* 4 */ val custom3: custom3 with scala.Double = js.native
  /* 5 */ val custom4: custom4 with scala.Double = js.native
  /* 6 */ val custom5: custom5 with scala.Double = js.native
  /* 7 */ val custom6: custom6 with scala.Double = js.native
  /* 8 */ val cyan: cyan with scala.Double = js.native
  /* 11 */ val full: full with scala.Double = js.native
  /* 9 */ val magenta: magenta with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val primary: primary with scala.Double = js.native
  /* 10 */ val yellow: yellow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCapabilities with scala.Double
  ] = js.native
}

