package typings.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintBinding extends StObject
/** Specifies the print binding option. */
@JSGlobal("Windows.Graphics.Printing.PrintBinding")
@js.native
object PrintBinding extends StObject {
  
  /** The default binding option. */
  @js.native
  sealed trait default
    extends StObject
       with PrintBinding
  
  /** The bale binding option. */
  @js.native
  sealed trait bale
    extends StObject
       with PrintBinding
  
  /** The option to bind the pages along their bottom edge. */
  @js.native
  sealed trait bindBottom
    extends StObject
       with PrintBinding
  
  /** The option to bind the pages along their left edge. */
  @js.native
  sealed trait bindLeft
    extends StObject
       with PrintBinding
  
  /** The option to bind the pages along their right edge. */
  @js.native
  sealed trait bindRight
    extends StObject
       with PrintBinding
  
  /** The option to bind the pages along their top edge. */
  @js.native
  sealed trait bindTop
    extends StObject
       with PrintBinding
  
  /** The option to bind the pages in booklet form. */
  @js.native
  sealed trait booklet
    extends StObject
       with PrintBinding
  
  /** The option to bind the pages along their bottom edge, with stiches. */
  @js.native
  sealed trait edgeStitchBottom
    extends StObject
       with PrintBinding
  
  /** The option to bind the pages along their left edge, with stiches. */
  @js.native
  sealed trait edgeStitchLeft
    extends StObject
       with PrintBinding
  
  /** The option to bind the pages along their right edge, with stiches. */
  @js.native
  sealed trait edgeStitchRight
    extends StObject
       with PrintBinding
  
  /** The option to bind the pages along their top edge, with stiches. */
  @js.native
  sealed trait edgeStitchTop
    extends StObject
       with PrintBinding
  
  /** The option to fold the pages. */
  @js.native
  sealed trait fold
    extends StObject
       with PrintBinding
  
  /** The option to offset the positioning of the pages in the output tray. */
  @js.native
  sealed trait jogOffset
    extends StObject
       with PrintBinding
  
  /** No binding required. */
  @js.native
  sealed trait none
    extends StObject
       with PrintBinding
  
  /** An unsupported binding option. */
  @js.native
  sealed trait notAvailable
    extends StObject
       with PrintBinding
  
  /** A custom option that is specific to the print device. */
  @js.native
  sealed trait printerCustom
    extends StObject
       with PrintBinding
  
  /** The option to trim the printed sheets. */
  @js.native
  sealed trait trim
    extends StObject
       with PrintBinding
}
