package typings.winrtUwp.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
