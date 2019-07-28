package typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs

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
  sealed trait bale extends PrintBinding
  
  /** The option to bind the pages along their bottom edge. */
  @js.native
  sealed trait bindBottom extends PrintBinding
  
  /** The option to bind the pages along their left edge. */
  @js.native
  sealed trait bindLeft extends PrintBinding
  
  /** The option to bind the pages along their right edge. */
  @js.native
  sealed trait bindRight extends PrintBinding
  
  /** The option to bind the pages along their top edge. */
  @js.native
  sealed trait bindTop extends PrintBinding
  
  /** The option to bind the pages in booklet form. */
  @js.native
  sealed trait booklet extends PrintBinding
  
  /** The default binding option. */
  @js.native
  sealed trait default extends PrintBinding
  
  /** The option to bind the pages along their bottom edge, with stiches. */
  @js.native
  sealed trait edgeStitchBottom extends PrintBinding
  
  /** The option to bind the pages along their left edge, with stiches. */
  @js.native
  sealed trait edgeStitchLeft extends PrintBinding
  
  /** The option to bind the pages along their right edge, with stiches. */
  @js.native
  sealed trait edgeStitchRight extends PrintBinding
  
  /** The option to bind the pages along their top edge, with stiches. */
  @js.native
  sealed trait edgeStitchTop extends PrintBinding
  
  /** The option to fold the pages. */
  @js.native
  sealed trait fold extends PrintBinding
  
  /** The option to offset the positioning of the pages in the output tray. */
  @js.native
  sealed trait jogOffset extends PrintBinding
  
  /** No binding required. */
  @js.native
  sealed trait none extends PrintBinding
  
  /** An unsupported binding option. */
  @js.native
  sealed trait notAvailable extends PrintBinding
  
  /** A custom option that is specific to the print device. */
  @js.native
  sealed trait printerCustom extends PrintBinding
  
  /** The option to trim the printed sheets. */
  @js.native
  sealed trait trim extends PrintBinding
  
  /* 4 */ val bale: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintBinding.bale with Double = js.native
  /* 5 */ val bindBottom: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintBinding.bindBottom with Double = js.native
  /* 6 */ val bindLeft: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintBinding.bindLeft with Double = js.native
  /* 7 */ val bindRight: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintBinding.bindRight with Double = js.native
  /* 8 */ val bindTop: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintBinding.bindTop with Double = js.native
  /* 9 */ val booklet: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintBinding.booklet with Double = js.native
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintBinding.default with Double = js.native
  /* 10 */ val edgeStitchBottom: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintBinding.edgeStitchBottom with Double = js.native
  /* 11 */ val edgeStitchLeft: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintBinding.edgeStitchLeft with Double = js.native
  /* 12 */ val edgeStitchRight: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintBinding.edgeStitchRight with Double = js.native
  /* 13 */ val edgeStitchTop: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintBinding.edgeStitchTop with Double = js.native
  /* 14 */ val fold: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintBinding.fold with Double = js.native
  /* 15 */ val jogOffset: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintBinding.jogOffset with Double = js.native
  /* 3 */ val none: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintBinding.none with Double = js.native
  /* 1 */ val notAvailable: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintBinding.notAvailable with Double = js.native
  /* 2 */ val printerCustom: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintBinding.printerCustom with Double = js.native
  /* 16 */ val trim: typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs.PrintBinding.trim with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintBinding with Double] = js.native
}

