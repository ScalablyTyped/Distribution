package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PosPrinterLineStyle extends js.Object

/** Describes the line styles that a receipt or slip printer station can use to print a ruled line. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinterLineStyle")
@js.native
object PosPrinterLineStyle extends js.Object {
  /** Prints a sequence of short lines separated by spaces. */
  @js.native
  sealed trait broken extends PosPrinterLineStyle
  
  /** Prints a sequence of short lines separated by a space, then followed by a very short line, followed by a space, then followed by a short line again. */
  @js.native
  sealed trait chain extends PosPrinterLineStyle
  
  /** Prints a continuous solid line of double the normal thickness. */
  @js.native
  sealed trait doubleSolid extends PosPrinterLineStyle
  
  /** Prints a continuous solid line. */
  @js.native
  sealed trait singleSolid extends PosPrinterLineStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PosPrinterLineStyle with Double] = js.native
  /* 2 */ @js.native
  object broken extends TopLevel[broken with Double]
  
  /* 3 */ @js.native
  object chain extends TopLevel[chain with Double]
  
  /* 1 */ @js.native
  object doubleSolid extends TopLevel[doubleSolid with Double]
  
  /* 0 */ @js.native
  object singleSolid extends TopLevel[singleSolid with Double]
  
}

