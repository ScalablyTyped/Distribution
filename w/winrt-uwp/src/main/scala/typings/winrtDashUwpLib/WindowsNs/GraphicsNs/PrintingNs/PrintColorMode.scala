package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintColorMode extends js.Object

/** Specifies the color mode option. */
@JSGlobal("Windows.Graphics.Printing.PrintColorMode")
@js.native
object PrintColorMode extends js.Object {
  /** An option to indicate that the printed output will be in color. */
  @js.native
  sealed trait color
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode
  
  /** The default color mode option. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode
  
  /** An option to indicate that the printed output will be in shades of gray. */
  @js.native
  sealed trait grayscale
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode
  
  /** An option to indicate that the printed output will be in one shade of a single color. */
  @js.native
  sealed trait monochrome
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode
  
  /** An unsupported color mode option. */
  @js.native
  sealed trait notAvailable
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode
  
  /** A custom color mode option that is specific to the print device. */
  @js.native
  sealed trait printerCustom
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode
  
  val color: color with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val grayscale: grayscale with java.lang.String = js.native
  val monochrome: monochrome with java.lang.String = js.native
  val notAvailable: notAvailable with java.lang.String = js.native
  val printerCustom: printerCustom with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintColorMode with java.lang.String
  ] = js.native
}

