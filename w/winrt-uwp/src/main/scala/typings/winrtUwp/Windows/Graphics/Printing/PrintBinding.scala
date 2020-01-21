package typings.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintBinding with Double] = js.native
  /* 4 */ @js.native
  object bale extends TopLevel[bale with Double]
  
  /* 5 */ @js.native
  object bindBottom extends TopLevel[bindBottom with Double]
  
  /* 6 */ @js.native
  object bindLeft extends TopLevel[bindLeft with Double]
  
  /* 7 */ @js.native
  object bindRight extends TopLevel[bindRight with Double]
  
  /* 8 */ @js.native
  object bindTop extends TopLevel[bindTop with Double]
  
  /* 9 */ @js.native
  object booklet extends TopLevel[booklet with Double]
  
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 10 */ @js.native
  object edgeStitchBottom extends TopLevel[edgeStitchBottom with Double]
  
  /* 11 */ @js.native
  object edgeStitchLeft extends TopLevel[edgeStitchLeft with Double]
  
  /* 12 */ @js.native
  object edgeStitchRight extends TopLevel[edgeStitchRight with Double]
  
  /* 13 */ @js.native
  object edgeStitchTop extends TopLevel[edgeStitchTop with Double]
  
  /* 14 */ @js.native
  object fold extends TopLevel[fold with Double]
  
  /* 15 */ @js.native
  object jogOffset extends TopLevel[jogOffset with Double]
  
  /* 3 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object notAvailable extends TopLevel[notAvailable with Double]
  
  /* 2 */ @js.native
  object printerCustom extends TopLevel[printerCustom with Double]
  
  /* 16 */ @js.native
  object trim extends TopLevel[trim with Double]
  
}

