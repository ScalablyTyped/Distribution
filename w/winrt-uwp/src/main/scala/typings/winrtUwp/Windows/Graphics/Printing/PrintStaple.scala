package typings.winrtUwp.Windows.Graphics.Printing

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintStaple with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 3 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object notAvailable extends TopLevel[notAvailable with Double]
  
  /* 2 */ @js.native
  object printerCustom extends TopLevel[printerCustom with Double]
  
  /* 12 */ @js.native
  object saddleStitch extends TopLevel[saddleStitch with Double]
  
  /* 6 */ @js.native
  object stapleBottomLeft extends TopLevel[stapleBottomLeft with Double]
  
  /* 7 */ @js.native
  object stapleBottomRight extends TopLevel[stapleBottomRight with Double]
  
  /* 11 */ @js.native
  object stapleDualBottom extends TopLevel[stapleDualBottom with Double]
  
  /* 8 */ @js.native
  object stapleDualLeft extends TopLevel[stapleDualLeft with Double]
  
  /* 9 */ @js.native
  object stapleDualRight extends TopLevel[stapleDualRight with Double]
  
  /* 10 */ @js.native
  object stapleDualTop extends TopLevel[stapleDualTop with Double]
  
  /* 4 */ @js.native
  object stapleTopLeft extends TopLevel[stapleTopLeft with Double]
  
  /* 5 */ @js.native
  object stapleTopRight extends TopLevel[stapleTopRight with Double]
  
}

