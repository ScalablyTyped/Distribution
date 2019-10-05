package typings.winrtDashUwp.Windows.Graphics.Printing

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
  
  /* 4 */ val bale: typings.winrtDashUwp.Windows.Graphics.Printing.PrintBinding.bale with Double = js.native
  /* 5 */ val bindBottom: typings.winrtDashUwp.Windows.Graphics.Printing.PrintBinding.bindBottom with Double = js.native
  /* 6 */ val bindLeft: typings.winrtDashUwp.Windows.Graphics.Printing.PrintBinding.bindLeft with Double = js.native
  /* 7 */ val bindRight: typings.winrtDashUwp.Windows.Graphics.Printing.PrintBinding.bindRight with Double = js.native
  /* 8 */ val bindTop: typings.winrtDashUwp.Windows.Graphics.Printing.PrintBinding.bindTop with Double = js.native
  /* 9 */ val booklet: typings.winrtDashUwp.Windows.Graphics.Printing.PrintBinding.booklet with Double = js.native
  /* 0 */ val default: typings.winrtDashUwp.Windows.Graphics.Printing.PrintBinding.default with Double = js.native
  /* 10 */ val edgeStitchBottom: typings.winrtDashUwp.Windows.Graphics.Printing.PrintBinding.edgeStitchBottom with Double = js.native
  /* 11 */ val edgeStitchLeft: typings.winrtDashUwp.Windows.Graphics.Printing.PrintBinding.edgeStitchLeft with Double = js.native
  /* 12 */ val edgeStitchRight: typings.winrtDashUwp.Windows.Graphics.Printing.PrintBinding.edgeStitchRight with Double = js.native
  /* 13 */ val edgeStitchTop: typings.winrtDashUwp.Windows.Graphics.Printing.PrintBinding.edgeStitchTop with Double = js.native
  /* 14 */ val fold: typings.winrtDashUwp.Windows.Graphics.Printing.PrintBinding.fold with Double = js.native
  /* 15 */ val jogOffset: typings.winrtDashUwp.Windows.Graphics.Printing.PrintBinding.jogOffset with Double = js.native
  /* 3 */ val none: typings.winrtDashUwp.Windows.Graphics.Printing.PrintBinding.none with Double = js.native
  /* 1 */ val notAvailable: typings.winrtDashUwp.Windows.Graphics.Printing.PrintBinding.notAvailable with Double = js.native
  /* 2 */ val printerCustom: typings.winrtDashUwp.Windows.Graphics.Printing.PrintBinding.printerCustom with Double = js.native
  /* 16 */ val trim: typings.winrtDashUwp.Windows.Graphics.Printing.PrintBinding.trim with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintBinding with Double] = js.native
}

