package typings.winrtDashUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintDuplex.default
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintDuplex.notAvailable
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintDuplex.oneSided
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintDuplex.printerCustom
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintDuplex.twoSidedLongEdge
import typings.winrtDashUwp.Windows.Graphics.Printing.PrintDuplex.twoSidedShortEdge
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintDuplex with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 1 */ @js.native
  object notAvailable extends TopLevel[notAvailable with Double]
  
  /* 3 */ @js.native
  object oneSided extends TopLevel[oneSided with Double]
  
  /* 2 */ @js.native
  object printerCustom extends TopLevel[printerCustom with Double]
  
  /* 5 */ @js.native
  object twoSidedLongEdge extends TopLevel[twoSidedLongEdge with Double]
  
  /* 4 */ @js.native
  object twoSidedShortEdge extends TopLevel[twoSidedShortEdge with Double]
  
}

