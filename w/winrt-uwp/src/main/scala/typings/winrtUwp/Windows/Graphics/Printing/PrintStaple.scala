package typings.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintStaple extends StObject
/** Specifies the staple options. */
@JSGlobal("Windows.Graphics.Printing.PrintStaple")
@js.native
object PrintStaple extends StObject {
  
  /** The default staple option. */
  @js.native
  sealed trait default
    extends StObject
       with PrintStaple
  
  /** The option to indicate that no stapling is required. */
  @js.native
  sealed trait none
    extends StObject
       with PrintStaple
  
  /** A staple option that is not available with the application or one that is not supported by the print device. */
  @js.native
  sealed trait notAvailable
    extends StObject
       with PrintStaple
  
  /** A custom staple option that is specific to the print device. */
  @js.native
  sealed trait printerCustom
    extends StObject
       with PrintStaple
  
  /** The option to saddle stitch the printed output. */
  @js.native
  sealed trait saddleStitch
    extends StObject
       with PrintStaple
  
  /** The option to staple the bottom left of the printed output. */
  @js.native
  sealed trait stapleBottomLeft
    extends StObject
       with PrintStaple
  
  /** The option to staple the bottom right of the printed output. */
  @js.native
  sealed trait stapleBottomRight
    extends StObject
       with PrintStaple
  
  /** The option to staple the printed output in two places along the bottom edge. */
  @js.native
  sealed trait stapleDualBottom
    extends StObject
       with PrintStaple
  
  /** The option to staple the printed output in two places along the left edge. */
  @js.native
  sealed trait stapleDualLeft
    extends StObject
       with PrintStaple
  
  /** The option to staple the printed output in two places along the right edge. */
  @js.native
  sealed trait stapleDualRight
    extends StObject
       with PrintStaple
  
  /** The option to staple the printed output in two places along the top edge. */
  @js.native
  sealed trait stapleDualTop
    extends StObject
       with PrintStaple
  
  /** The option to staple the top left of the printed output. */
  @js.native
  sealed trait stapleTopLeft
    extends StObject
       with PrintStaple
  
  /** The option to staple the top right of the printed output. */
  @js.native
  sealed trait stapleTopRight
    extends StObject
       with PrintStaple
}
