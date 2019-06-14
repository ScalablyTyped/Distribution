package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintDuplex extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintDuplex")
@js.native
object PrintDuplex extends js.Object {
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex
  
  @js.native
  sealed trait notAvailable
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex
  
  @js.native
  sealed trait oneSided
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex
  
  @js.native
  sealed trait printerCustom
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex
  
  @js.native
  sealed trait twoSidedLongEdge
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex
  
  @js.native
  sealed trait twoSidedShortEdge
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex
  
  /* 0 */ val default: default with scala.Double = js.native
  /* 1 */ val notAvailable: notAvailable with scala.Double = js.native
  /* 3 */ val oneSided: oneSided with scala.Double = js.native
  /* 2 */ val printerCustom: printerCustom with scala.Double = js.native
  /* 5 */ val twoSidedLongEdge: twoSidedLongEdge with scala.Double = js.native
  /* 4 */ val twoSidedShortEdge: twoSidedShortEdge with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintDuplex with scala.Double] = js.native
}

