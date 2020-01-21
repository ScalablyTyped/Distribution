package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterColorCartridge with Double] = js.native
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
  
  /* 9 */ @js.native
  object magenta extends TopLevel[magenta with Double]
  
  /* 1 */ @js.native
  object primary extends TopLevel[primary with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 10 */ @js.native
  object yellow extends TopLevel[yellow with Double]
  
}

