package typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs

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
  sealed trait default extends PrintStaple
  
  /** The option to indicate that no stapling is required. */
  @js.native
  sealed trait none extends PrintStaple
  
  /** A staple option that is not available with the application or one that is not supported by the print device. */
  @js.native
  sealed trait notAvailable extends PrintStaple
  
  /** A custom staple option that is specific to the print device. */
  @js.native
  sealed trait printerCustom extends PrintStaple
  
  /** The option to saddle stitch the printed output. */
  @js.native
  sealed trait saddleStitch extends PrintStaple
  
  /** The option to staple the bottom left of the printed output. */
  @js.native
  sealed trait stapleBottomLeft extends PrintStaple
  
  /** The option to staple the bottom right of the printed output. */
  @js.native
  sealed trait stapleBottomRight extends PrintStaple
  
  /** The option to staple the printed output in two places along the bottom edge. */
  @js.native
  sealed trait stapleDualBottom extends PrintStaple
  
  /** The option to staple the printed output in two places along the left edge. */
  @js.native
  sealed trait stapleDualLeft extends PrintStaple
  
  /** The option to staple the printed output in two places along the right edge. */
  @js.native
  sealed trait stapleDualRight extends PrintStaple
  
  /** The option to staple the printed output in two places along the top edge. */
  @js.native
  sealed trait stapleDualTop extends PrintStaple
  
  /** The option to staple the top left of the printed output. */
  @js.native
  sealed trait stapleTopLeft extends PrintStaple
  
  /** The option to staple the top right of the printed output. */
  @js.native
  sealed trait stapleTopRight extends PrintStaple
  
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintStaple.default with Double = js.native
  /* 3 */ val none: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintStaple.none with Double = js.native
  /* 1 */ val notAvailable: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintStaple.notAvailable with Double = js.native
  /* 2 */ val printerCustom: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintStaple.printerCustom with Double = js.native
  /* 12 */ val saddleStitch: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintStaple.saddleStitch with Double = js.native
  /* 6 */ val stapleBottomLeft: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintStaple.stapleBottomLeft with Double = js.native
  /* 7 */ val stapleBottomRight: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintStaple.stapleBottomRight with Double = js.native
  /* 11 */ val stapleDualBottom: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintStaple.stapleDualBottom with Double = js.native
  /* 8 */ val stapleDualLeft: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintStaple.stapleDualLeft with Double = js.native
  /* 9 */ val stapleDualRight: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintStaple.stapleDualRight with Double = js.native
  /* 10 */ val stapleDualTop: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintStaple.stapleDualTop with Double = js.native
  /* 4 */ val stapleTopLeft: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintStaple.stapleTopLeft with Double = js.native
  /* 5 */ val stapleTopRight: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintStaple.stapleTopRight with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintStaple with Double] = js.native
}

