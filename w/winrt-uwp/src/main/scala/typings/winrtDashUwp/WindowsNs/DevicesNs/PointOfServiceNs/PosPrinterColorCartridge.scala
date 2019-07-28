package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

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
  sealed trait custom1 extends PosPrinterColorCartridge
  
  /** The second custom color cartridge. */
  @js.native
  sealed trait custom2 extends PosPrinterColorCartridge
  
  /** The third custom color cartridge. */
  @js.native
  sealed trait custom3 extends PosPrinterColorCartridge
  
  /** The fourth custom color cartridge. */
  @js.native
  sealed trait custom4 extends PosPrinterColorCartridge
  
  /** The fifth custom color cartridge. */
  @js.native
  sealed trait custom5 extends PosPrinterColorCartridge
  
  /** The sixth custom color cartridge. */
  @js.native
  sealed trait custom6 extends PosPrinterColorCartridge
  
  /** The cyan cartridge for full color printing. */
  @js.native
  sealed trait cyan extends PosPrinterColorCartridge
  
  /** The magenta cartridge for full color printing. */
  @js.native
  sealed trait magenta extends PosPrinterColorCartridge
  
  /** The primary color cartridge. */
  @js.native
  sealed trait primary extends PosPrinterColorCartridge
  
  /** An unknown color cartridge. */
  @js.native
  sealed trait unknown extends PosPrinterColorCartridge
  
  /** The yellow cartridge for full color printing. */
  @js.native
  sealed trait yellow extends PosPrinterColorCartridge
  
  /* 2 */ val custom1: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge.custom1 with Double = js.native
  /* 3 */ val custom2: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge.custom2 with Double = js.native
  /* 4 */ val custom3: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge.custom3 with Double = js.native
  /* 5 */ val custom4: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge.custom4 with Double = js.native
  /* 6 */ val custom5: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge.custom5 with Double = js.native
  /* 7 */ val custom6: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge.custom6 with Double = js.native
  /* 8 */ val cyan: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge.cyan with Double = js.native
  /* 9 */ val magenta: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge.magenta with Double = js.native
  /* 1 */ val primary: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge.primary with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge.unknown with Double = js.native
  /* 10 */ val yellow: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.PosPrinterColorCartridge.yellow with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterColorCartridge with Double] = js.native
}

