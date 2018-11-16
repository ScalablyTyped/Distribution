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
  
  val bottomEdge: bottomEdge with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val leftEdge: leftEdge with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val notAvailable: notAvailable with java.lang.String = js.native
  val printerCustom: printerCustom with java.lang.String = js.native
  val rightEdge: rightEdge with java.lang.String = js.native
  val topEdge: topEdge with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch with java.lang.String] = js.native
}

