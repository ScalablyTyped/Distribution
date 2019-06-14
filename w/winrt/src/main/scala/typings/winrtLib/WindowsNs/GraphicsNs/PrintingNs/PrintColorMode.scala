package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintColorMode extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintColorMode")
@js.native
object PrintColorMode extends js.Object {
  @js.native
  sealed trait color
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode
  
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode
  
  @js.native
  sealed trait grayscale
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode
  
  @js.native
  sealed trait monochrome
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode
  
  @js.native
  sealed trait notAvailable
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode
  
  @js.native
  sealed trait printerCustom
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode
  
  /* 3 */ val color: color with scala.Double = js.native
  /* 0 */ val default: default with scala.Double = js.native
  /* 4 */ val grayscale: grayscale with scala.Double = js.native
  /* 5 */ val monochrome: monochrome with scala.Double = js.native
  /* 1 */ val notAvailable: notAvailable with scala.Double = js.native
  /* 2 */ val printerCustom: printerCustom with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode with scala.Double] = js.native
}

