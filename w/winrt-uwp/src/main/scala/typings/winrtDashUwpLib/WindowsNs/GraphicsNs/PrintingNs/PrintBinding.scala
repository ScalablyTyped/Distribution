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
  
  val bale: bale with java.lang.String = js.native
  val bindBottom: bindBottom with java.lang.String = js.native
  val bindLeft: bindLeft with java.lang.String = js.native
  val bindRight: bindRight with java.lang.String = js.native
  val bindTop: bindTop with java.lang.String = js.native
  val booklet: booklet with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val edgeStitchBottom: edgeStitchBottom with java.lang.String = js.native
  val edgeStitchLeft: edgeStitchLeft with java.lang.String = js.native
  val edgeStitchRight: edgeStitchRight with java.lang.String = js.native
  val edgeStitchTop: edgeStitchTop with java.lang.String = js.native
  val fold: fold with java.lang.String = js.native
  val jogOffset: jogOffset with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val notAvailable: notAvailable with java.lang.String = js.native
  val printerCustom: printerCustom with java.lang.String = js.native
  val trim: trim with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintBinding with java.lang.String
  ] = js.native
}

