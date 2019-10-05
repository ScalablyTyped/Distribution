package typings.winrtDashUwp.Windows.Graphics.Printing

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
  
  /* 0 */ val default: typings.winrtDashUwp.Windows.Graphics.Printing.PrintStaple.default with Double = js.native
  /* 3 */ val none: typings.winrtDashUwp.Windows.Graphics.Printing.PrintStaple.none with Double = js.native
  /* 1 */ val notAvailable: typings.winrtDashUwp.Windows.Graphics.Printing.PrintStaple.notAvailable with Double = js.native
  /* 2 */ val printerCustom: typings.winrtDashUwp.Windows.Graphics.Printing.PrintStaple.printerCustom with Double = js.native
  /* 12 */ val saddleStitch: typings.winrtDashUwp.Windows.Graphics.Printing.PrintStaple.saddleStitch with Double = js.native
  /* 6 */ val stapleBottomLeft: typings.winrtDashUwp.Windows.Graphics.Printing.PrintStaple.stapleBottomLeft with Double = js.native
  /* 7 */ val stapleBottomRight: typings.winrtDashUwp.Windows.Graphics.Printing.PrintStaple.stapleBottomRight with Double = js.native
  /* 11 */ val stapleDualBottom: typings.winrtDashUwp.Windows.Graphics.Printing.PrintStaple.stapleDualBottom with Double = js.native
  /* 8 */ val stapleDualLeft: typings.winrtDashUwp.Windows.Graphics.Printing.PrintStaple.stapleDualLeft with Double = js.native
  /* 9 */ val stapleDualRight: typings.winrtDashUwp.Windows.Graphics.Printing.PrintStaple.stapleDualRight with Double = js.native
  /* 10 */ val stapleDualTop: typings.winrtDashUwp.Windows.Graphics.Printing.PrintStaple.stapleDualTop with Double = js.native
  /* 4 */ val stapleTopLeft: typings.winrtDashUwp.Windows.Graphics.Printing.PrintStaple.stapleTopLeft with Double = js.native
  /* 5 */ val stapleTopRight: typings.winrtDashUwp.Windows.Graphics.Printing.PrintStaple.stapleTopRight with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintStaple with Double] = js.native
}

