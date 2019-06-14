package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintHolePunch extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintHolePunch")
@js.native
object PrintHolePunch extends js.Object {
  @js.native
  sealed trait bottomEdge
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch
  
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch
  
  @js.native
  sealed trait leftEdge
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch
  
  @js.native
  sealed trait notAvailable
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch
  
  @js.native
  sealed trait printerCustom
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch
  
  @js.native
  sealed trait rightEdge
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch
  
  @js.native
  sealed trait topEdge
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch
  
  /* 7 */ val bottomEdge: bottomEdge with scala.Double = js.native
  /* 0 */ val default: default with scala.Double = js.native
  /* 4 */ val leftEdge: leftEdge with scala.Double = js.native
  /* 3 */ val none: none with scala.Double = js.native
  /* 1 */ val notAvailable: notAvailable with scala.Double = js.native
  /* 2 */ val printerCustom: printerCustom with scala.Double = js.native
  /* 5 */ val rightEdge: rightEdge with scala.Double = js.native
  /* 6 */ val topEdge: topEdge with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch with scala.Double] = js.native
}

