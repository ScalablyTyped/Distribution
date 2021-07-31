package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PosPrinterColorCartridge extends StObject
/** Describes the color cartridges that the point-of-service printer can use for printing. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterColorCartridge")
@js.native
object PosPrinterColorCartridge extends StObject {
  
  /** The first custom color cartridge, which provides a secondary color, usually red. */
  @js.native
  sealed trait custom1
    extends StObject
       with PosPrinterColorCartridge
  
  /** The second custom color cartridge. */
  @js.native
  sealed trait custom2
    extends StObject
       with PosPrinterColorCartridge
  
  /** The third custom color cartridge. */
  @js.native
  sealed trait custom3
    extends StObject
       with PosPrinterColorCartridge
  
  /** The fourth custom color cartridge. */
  @js.native
  sealed trait custom4
    extends StObject
       with PosPrinterColorCartridge
  
  /** The fifth custom color cartridge. */
  @js.native
  sealed trait custom5
    extends StObject
       with PosPrinterColorCartridge
  
  /** The sixth custom color cartridge. */
  @js.native
  sealed trait custom6
    extends StObject
       with PosPrinterColorCartridge
  
  /** The cyan cartridge for full color printing. */
  @js.native
  sealed trait cyan
    extends StObject
       with PosPrinterColorCartridge
  
  /** The magenta cartridge for full color printing. */
  @js.native
  sealed trait magenta
    extends StObject
       with PosPrinterColorCartridge
  
  /** The primary color cartridge. */
  @js.native
  sealed trait primary
    extends StObject
       with PosPrinterColorCartridge
  
  /** An unknown color cartridge. */
  @js.native
  sealed trait unknown
    extends StObject
       with PosPrinterColorCartridge
  
  /** The yellow cartridge for full color printing. */
  @js.native
  sealed trait yellow
    extends StObject
       with PosPrinterColorCartridge
}
