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
  
  /* 0 */ val default: default with scala.Double = js.native
  /* 3 */ val none: none with scala.Double = js.native
  /* 1 */ val notAvailable: notAvailable with scala.Double = js.native
  /* 2 */ val printerCustom: printerCustom with scala.Double = js.native
  /* 12 */ val saddleStitch: saddleStitch with scala.Double = js.native
  /* 6 */ val stapleBottomLeft: stapleBottomLeft with scala.Double = js.native
  /* 7 */ val stapleBottomRight: stapleBottomRight with scala.Double = js.native
  /* 11 */ val stapleDualBottom: stapleDualBottom with scala.Double = js.native
  /* 8 */ val stapleDualLeft: stapleDualLeft with scala.Double = js.native
  /* 9 */ val stapleDualRight: stapleDualRight with scala.Double = js.native
  /* 10 */ val stapleDualTop: stapleDualTop with scala.Double = js.native
  /* 4 */ val stapleTopLeft: stapleTopLeft with scala.Double = js.native
  /* 5 */ val stapleTopRight: stapleTopRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintStaple with scala.Double] = js.native
}

