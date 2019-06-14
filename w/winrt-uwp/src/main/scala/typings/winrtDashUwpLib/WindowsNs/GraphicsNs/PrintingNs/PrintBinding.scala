package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintBinding extends js.Object

/** Specifies the print binding option. */
@JSGlobal("Windows.Graphics.Printing.PrintBinding")
@js.native
object PrintBinding extends js.Object {
  /** The bale binding option. */
  @js.native
  sealed trait bale
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintBinding
  
  /** The option to bind the pages along their bottom edge. */
  @js.native
  sealed trait bindBottom
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintBinding
  
  /** The option to bind the pages along their left edge. */
  @js.native
  sealed trait bindLeft
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintBinding
  
  /** The option to bind the pages along their right edge. */
  @js.native
  sealed trait bindRight
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintBinding
  
  /** The option to bind the pages along their top edge. */
  @js.native
  sealed trait bindTop
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintBinding
  
  /** The option to bind the pages in booklet form. */
  @js.native
  sealed trait booklet
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintBinding
  
  /** The default binding option. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintBinding
  
  /** The option to bind the pages along their bottom edge, with stiches. */
  @js.native
  sealed trait edgeStitchBottom
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintBinding
  
  /** The option to bind the pages along their left edge, with stiches. */
  @js.native
  sealed trait edgeStitchLeft
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintBinding
  
  /** The option to bind the pages along their right edge, with stiches. */
  @js.native
  sealed trait edgeStitchRight
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintBinding
  
  /** The option to bind the pages along their top edge, with stiches. */
  @js.native
  sealed trait edgeStitchTop
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintBinding
  
  /** The option to fold the pages. */
  @js.native
  sealed trait fold
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintBinding
  
  /** The option to offset the positioning of the pages in the output tray. */
  @js.native
  sealed trait jogOffset
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintBinding
  
  /** No binding required. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintBinding
  
  /** An unsupported binding option. */
  @js.native
  sealed trait notAvailable
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintBinding
  
  /** A custom option that is specific to the print device. */
  @js.native
  sealed trait printerCustom
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintBinding
  
  /** The option to trim the printed sheets. */
  @js.native
  sealed trait trim
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintBinding
  
  /* 4 */ val bale: bale with scala.Double = js.native
  /* 5 */ val bindBottom: bindBottom with scala.Double = js.native
  /* 6 */ val bindLeft: bindLeft with scala.Double = js.native
  /* 7 */ val bindRight: bindRight with scala.Double = js.native
  /* 8 */ val bindTop: bindTop with scala.Double = js.native
  /* 9 */ val booklet: booklet with scala.Double = js.native
  /* 0 */ val default: default with scala.Double = js.native
  /* 10 */ val edgeStitchBottom: edgeStitchBottom with scala.Double = js.native
  /* 11 */ val edgeStitchLeft: edgeStitchLeft with scala.Double = js.native
  /* 12 */ val edgeStitchRight: edgeStitchRight with scala.Double = js.native
  /* 13 */ val edgeStitchTop: edgeStitchTop with scala.Double = js.native
  /* 14 */ val fold: fold with scala.Double = js.native
  /* 15 */ val jogOffset: jogOffset with scala.Double = js.native
  /* 3 */ val none: none with scala.Double = js.native
  /* 1 */ val notAvailable: notAvailable with scala.Double = js.native
  /* 2 */ val printerCustom: printerCustom with scala.Double = js.native
  /* 16 */ val trim: trim with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintBinding with scala.Double] = js.native
}

