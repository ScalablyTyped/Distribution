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
  
  val custom1: custom1 with java.lang.String = js.native
  val custom2: custom2 with java.lang.String = js.native
  val custom3: custom3 with java.lang.String = js.native
  val custom4: custom4 with java.lang.String = js.native
  val custom5: custom5 with java.lang.String = js.native
  val custom6: custom6 with java.lang.String = js.native
  val cyan: cyan with java.lang.String = js.native
  val full: full with java.lang.String = js.native
  val magenta: magenta with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val primary: primary with java.lang.String = js.native
  val yellow: yellow with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCapabilities with java.lang.String
  ] = js.native
}

