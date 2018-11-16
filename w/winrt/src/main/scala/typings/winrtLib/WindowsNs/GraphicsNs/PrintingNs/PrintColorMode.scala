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
  
  val color: color with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val grayscale: grayscale with java.lang.String = js.native
  val monochrome: monochrome with java.lang.String = js.native
  val notAvailable: notAvailable with java.lang.String = js.native
  val printerCustom: printerCustom with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode with java.lang.String] = js.native
}

