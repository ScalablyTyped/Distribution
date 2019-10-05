package typings.winrtDashUwp.Windows.Devices.PointOfService

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
  sealed trait custom1 extends PosPrinterColorCapabilities
  
  /** Supports a second custom color cartridge. */
  @js.native
  sealed trait custom2 extends PosPrinterColorCapabilities
  
  /** Supports a third custom color cartridge. */
  @js.native
  sealed trait custom3 extends PosPrinterColorCapabilities
  
  /** Supports a fourth custom color cartridge. */
  @js.native
  sealed trait custom4 extends PosPrinterColorCapabilities
  
  /** Supports a fifth custom color cartridge. */
  @js.native
  sealed trait custom5 extends PosPrinterColorCapabilities
  
  /** Supports a sixth custom color cartridge. */
  @js.native
  sealed trait custom6 extends PosPrinterColorCapabilities
  
  /** Supports a cyan cartridge for full color printing. */
  @js.native
  sealed trait cyan extends PosPrinterColorCapabilities
  
  /** Supports full color printing. */
  @js.native
  sealed trait full extends PosPrinterColorCapabilities
  
  /** Supports a magenta cartridge for full color printing. */
  @js.native
  sealed trait magenta extends PosPrinterColorCapabilities
  
  /** Supports no color cartridges. */
  @js.native
  sealed trait none extends PosPrinterColorCapabilities
  
  /** Supports a primary color cartridge. */
  @js.native
  sealed trait primary extends PosPrinterColorCapabilities
  
  /** Supports a yellow cartridge for full color printing. */
  @js.native
  sealed trait yellow extends PosPrinterColorCapabilities
  
  /* 2 */ val custom1: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.custom1 with Double = js.native
  /* 3 */ val custom2: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.custom2 with Double = js.native
  /* 4 */ val custom3: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.custom3 with Double = js.native
  /* 5 */ val custom4: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.custom4 with Double = js.native
  /* 6 */ val custom5: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.custom5 with Double = js.native
  /* 7 */ val custom6: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.custom6 with Double = js.native
  /* 8 */ val cyan: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.cyan with Double = js.native
  /* 11 */ val full: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.full with Double = js.native
  /* 9 */ val magenta: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.magenta with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.none with Double = js.native
  /* 1 */ val primary: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.primary with Double = js.native
  /* 10 */ val yellow: typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.yellow with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterColorCapabilities with Double] = js.native
}

