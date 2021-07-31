package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PosPrinterColorCapabilities extends StObject
/** Describes the possible color cartridges that a point-of-service printer can support. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterColorCapabilities")
@js.native
object PosPrinterColorCapabilities extends StObject {
  
  /** Supports a first custom color cartridge, which provides a secondary color, usually red. */
  @js.native
  sealed trait custom1
    extends StObject
       with PosPrinterColorCapabilities
  
  /** Supports a second custom color cartridge. */
  @js.native
  sealed trait custom2
    extends StObject
       with PosPrinterColorCapabilities
  
  /** Supports a third custom color cartridge. */
  @js.native
  sealed trait custom3
    extends StObject
       with PosPrinterColorCapabilities
  
  /** Supports a fourth custom color cartridge. */
  @js.native
  sealed trait custom4
    extends StObject
       with PosPrinterColorCapabilities
  
  /** Supports a fifth custom color cartridge. */
  @js.native
  sealed trait custom5
    extends StObject
       with PosPrinterColorCapabilities
  
  /** Supports a sixth custom color cartridge. */
  @js.native
  sealed trait custom6
    extends StObject
       with PosPrinterColorCapabilities
  
  /** Supports a cyan cartridge for full color printing. */
  @js.native
  sealed trait cyan
    extends StObject
       with PosPrinterColorCapabilities
  
  /** Supports full color printing. */
  @js.native
  sealed trait full
    extends StObject
       with PosPrinterColorCapabilities
  
  /** Supports a magenta cartridge for full color printing. */
  @js.native
  sealed trait magenta
    extends StObject
       with PosPrinterColorCapabilities
  
  /** Supports no color cartridges. */
  @js.native
  sealed trait none
    extends StObject
       with PosPrinterColorCapabilities
  
  /** Supports a primary color cartridge. */
  @js.native
  sealed trait primary
    extends StObject
       with PosPrinterColorCapabilities
  
  /** Supports a yellow cartridge for full color printing. */
  @js.native
  sealed trait yellow
    extends StObject
       with PosPrinterColorCapabilities
}
