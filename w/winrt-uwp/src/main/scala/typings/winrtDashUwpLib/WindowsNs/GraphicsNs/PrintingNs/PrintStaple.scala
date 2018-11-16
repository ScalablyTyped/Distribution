package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintStaple extends js.Object

/** Specifies the staple options. */
@JSGlobal("Windows.Graphics.Printing.PrintStaple")
@js.native
object PrintStaple extends js.Object {
  /** The default staple option. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintStaple
  
  /** The option to indicate that no stapling is required. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintStaple
  
  /** A staple option that is not available with the application or one that is not supported by the print device. */
  @js.native
  sealed trait notAvailable
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintStaple
  
  /** A custom staple option that is specific to the print device. */
  @js.native
  sealed trait printerCustom
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintStaple
  
  /** The option to saddle stitch the printed output. */
  @js.native
  sealed trait saddleStitch
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintStaple
  
  /** The option to staple the bottom left of the printed output. */
  @js.native
  sealed trait stapleBottomLeft
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintStaple
  
  /** The option to staple the bottom right of the printed output. */
  @js.native
  sealed trait stapleBottomRight
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintStaple
  
  /** The option to staple the printed output in two places along the bottom edge. */
  @js.native
  sealed trait stapleDualBottom
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintStaple
  
  /** The option to staple the printed output in two places along the left edge. */
  @js.native
  sealed trait stapleDualLeft
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintStaple
  
  /** The option to staple the printed output in two places along the right edge. */
  @js.native
  sealed trait stapleDualRight
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintStaple
  
  /** The option to staple the printed output in two places along the top edge. */
  @js.native
  sealed trait stapleDualTop
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintStaple
  
  /** The option to staple the top left of the printed output. */
  @js.native
  sealed trait stapleTopLeft
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintStaple
  
  /** The option to staple the top right of the printed output. */
  @js.native
  sealed trait stapleTopRight
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintStaple
  
  val default: default with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val notAvailable: notAvailable with java.lang.String = js.native
  val printerCustom: printerCustom with java.lang.String = js.native
  val saddleStitch: saddleStitch with java.lang.String = js.native
  val stapleBottomLeft: stapleBottomLeft with java.lang.String = js.native
  val stapleBottomRight: stapleBottomRight with java.lang.String = js.native
  val stapleDualBottom: stapleDualBottom with java.lang.String = js.native
  val stapleDualLeft: stapleDualLeft with java.lang.String = js.native
  val stapleDualRight: stapleDualRight with java.lang.String = js.native
  val stapleDualTop: stapleDualTop with java.lang.String = js.native
  val stapleTopLeft: stapleTopLeft with java.lang.String = js.native
  val stapleTopRight: stapleTopRight with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintStaple with java.lang.String
  ] = js.native
}

