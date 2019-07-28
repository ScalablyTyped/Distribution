package typings.winrt.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintHolePunch extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintHolePunch")
@js.native
object PrintHolePunch extends js.Object {
  @js.native
  sealed trait bottomEdge extends PrintHolePunch
  
  @js.native
  sealed trait default extends PrintHolePunch
  
  @js.native
  sealed trait leftEdge extends PrintHolePunch
  
  @js.native
  sealed trait none extends PrintHolePunch
  
  @js.native
  sealed trait notAvailable extends PrintHolePunch
  
  @js.native
  sealed trait printerCustom extends PrintHolePunch
  
  @js.native
  sealed trait rightEdge extends PrintHolePunch
  
  @js.native
  sealed trait topEdge extends PrintHolePunch
  
  /* 7 */ val bottomEdge: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch.bottomEdge with Double = js.native
  /* 0 */ val default: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch.default with Double = js.native
  /* 4 */ val leftEdge: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch.leftEdge with Double = js.native
  /* 3 */ val none: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch.none with Double = js.native
  /* 1 */ val notAvailable: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch.notAvailable with Double = js.native
  /* 2 */ val printerCustom: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch.printerCustom with Double = js.native
  /* 5 */ val rightEdge: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch.rightEdge with Double = js.native
  /* 6 */ val topEdge: typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintHolePunch.topEdge with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintHolePunch with Double] = js.native
}

