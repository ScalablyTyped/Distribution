package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs

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
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex
  
  /** An unsupported duplex option. */
  @js.native
  sealed trait notAvailable
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex
  
  /** The option to print on only one side of the sheet. */
  @js.native
  sealed trait oneSided
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex
  
  /** A custom duplex option that is specific to the print device. */
  @js.native
  sealed trait printerCustom
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex
  
  /** The option to print on both sides of the sheet, flipped along the long edge. */
  @js.native
  sealed trait twoSidedLongEdge
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex
  
  /** The option to print on both sides of the sheet, flipped along the short edge. */
  @js.native
  sealed trait twoSidedShortEdge
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex
  
  val default: default with java.lang.String = js.native
  val notAvailable: notAvailable with java.lang.String = js.native
  val oneSided: oneSided with java.lang.String = js.native
  val printerCustom: printerCustom with java.lang.String = js.native
  val twoSidedLongEdge: twoSidedLongEdge with java.lang.String = js.native
  val twoSidedShortEdge: twoSidedShortEdge with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex with java.lang.String
  ] = js.native
}

