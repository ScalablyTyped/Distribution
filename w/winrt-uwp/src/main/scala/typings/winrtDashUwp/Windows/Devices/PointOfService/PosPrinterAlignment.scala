package typings.winrtDashUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PosPrinterAlignment extends js.Object

/** Describes the possible horizontal alignments of the text that a point-of-service printer prints on the page. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterAlignment")
@js.native
object PosPrinterAlignment extends js.Object {
  /** Text is centered. */
  @js.native
  sealed trait center extends PosPrinterAlignment
  
  /** Text is left-aligned. */
  @js.native
  sealed trait left extends PosPrinterAlignment
  
  /** Text is right-aligned. */
  @js.native
  sealed trait right extends PosPrinterAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterAlignment with Double] = js.native
  /* 1 */ @js.native
  object center extends TopLevel[center with Double]
  
  /* 0 */ @js.native
  object left extends TopLevel[left with Double]
  
  /* 2 */ @js.native
  object right extends TopLevel[right with Double]
  
}

