package typings.winrtDashUwp.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintDuplex extends js.Object

/** Specifies the duplex option. */
@JSGlobal("Windows.Graphics.Printing.PrintDuplex")
@js.native
object PrintDuplex extends js.Object {
  /** The default duplex option. */
  @js.native
  sealed trait default extends PrintDuplex
  
  /** An unsupported duplex option. */
  @js.native
  sealed trait notAvailable extends PrintDuplex
  
  /** The option to print on only one side of the sheet. */
  @js.native
  sealed trait oneSided extends PrintDuplex
  
  /** A custom duplex option that is specific to the print device. */
  @js.native
  sealed trait printerCustom extends PrintDuplex
  
  /** The option to print on both sides of the sheet, flipped along the long edge. */
  @js.native
  sealed trait twoSidedLongEdge extends PrintDuplex
  
  /** The option to print on both sides of the sheet, flipped along the short edge. */
  @js.native
  sealed trait twoSidedShortEdge extends PrintDuplex
  
  /* 0 */ val default: typings.winrtDashUwp.Windows.Graphics.Printing.PrintDuplex.default with Double = js.native
  /* 1 */ val notAvailable: typings.winrtDashUwp.Windows.Graphics.Printing.PrintDuplex.notAvailable with Double = js.native
  /* 3 */ val oneSided: typings.winrtDashUwp.Windows.Graphics.Printing.PrintDuplex.oneSided with Double = js.native
  /* 2 */ val printerCustom: typings.winrtDashUwp.Windows.Graphics.Printing.PrintDuplex.printerCustom with Double = js.native
  /* 5 */ val twoSidedLongEdge: typings.winrtDashUwp.Windows.Graphics.Printing.PrintDuplex.twoSidedLongEdge with Double = js.native
  /* 4 */ val twoSidedShortEdge: typings.winrtDashUwp.Windows.Graphics.Printing.PrintDuplex.twoSidedShortEdge with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintDuplex with Double] = js.native
}

