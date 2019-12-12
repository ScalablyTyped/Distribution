package typings.winrtDashUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.custom1
import typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.custom2
import typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.custom3
import typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.custom4
import typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.custom5
import typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.custom6
import typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.cyan
import typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.full
import typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.magenta
import typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.none
import typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.primary
import typings.winrtDashUwp.Windows.Devices.PointOfService.PosPrinterColorCapabilities.yellow
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterColorCapabilities with Double] = js.native
  /* 2 */ @js.native
  object custom1 extends TopLevel[custom1 with Double]
  
  /* 3 */ @js.native
  object custom2 extends TopLevel[custom2 with Double]
  
  /* 4 */ @js.native
  object custom3 extends TopLevel[custom3 with Double]
  
  /* 5 */ @js.native
  object custom4 extends TopLevel[custom4 with Double]
  
  /* 6 */ @js.native
  object custom5 extends TopLevel[custom5 with Double]
  
  /* 7 */ @js.native
  object custom6 extends TopLevel[custom6 with Double]
  
  /* 8 */ @js.native
  object cyan extends TopLevel[cyan with Double]
  
  /* 11 */ @js.native
  object full extends TopLevel[full with Double]
  
  /* 9 */ @js.native
  object magenta extends TopLevel[magenta with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object primary extends TopLevel[primary with Double]
  
  /* 10 */ @js.native
  object yellow extends TopLevel[yellow with Double]
  
}

