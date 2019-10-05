package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintStaple extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintStaple")
@js.native
object PrintStaple extends js.Object {
  @js.native
  sealed trait default extends PrintStaple
  
  @js.native
  sealed trait none extends PrintStaple
  
  @js.native
  sealed trait notAvailable extends PrintStaple
  
  @js.native
  sealed trait printerCustom extends PrintStaple
  
  @js.native
  sealed trait saddleStitch extends PrintStaple
  
  @js.native
  sealed trait stapleBottomLeft extends PrintStaple
  
  @js.native
  sealed trait stapleBottomRight extends PrintStaple
  
  @js.native
  sealed trait stapleDualBottom extends PrintStaple
  
  @js.native
  sealed trait stapleDualLeft extends PrintStaple
  
  @js.native
  sealed trait stapleDualRight extends PrintStaple
  
  @js.native
  sealed trait stapleDualTop extends PrintStaple
  
  @js.native
  sealed trait stapleTopLeft extends PrintStaple
  
  @js.native
  sealed trait stapleTopRight extends PrintStaple
  
  /* 0 */ val default: typings.winrt.Windows.Graphics.Printing.PrintStaple.default with Double = js.native
  /* 3 */ val none: typings.winrt.Windows.Graphics.Printing.PrintStaple.none with Double = js.native
  /* 1 */ val notAvailable: typings.winrt.Windows.Graphics.Printing.PrintStaple.notAvailable with Double = js.native
  /* 2 */ val printerCustom: typings.winrt.Windows.Graphics.Printing.PrintStaple.printerCustom with Double = js.native
  /* 12 */ val saddleStitch: typings.winrt.Windows.Graphics.Printing.PrintStaple.saddleStitch with Double = js.native
  /* 6 */ val stapleBottomLeft: typings.winrt.Windows.Graphics.Printing.PrintStaple.stapleBottomLeft with Double = js.native
  /* 7 */ val stapleBottomRight: typings.winrt.Windows.Graphics.Printing.PrintStaple.stapleBottomRight with Double = js.native
  /* 11 */ val stapleDualBottom: typings.winrt.Windows.Graphics.Printing.PrintStaple.stapleDualBottom with Double = js.native
  /* 8 */ val stapleDualLeft: typings.winrt.Windows.Graphics.Printing.PrintStaple.stapleDualLeft with Double = js.native
  /* 9 */ val stapleDualRight: typings.winrt.Windows.Graphics.Printing.PrintStaple.stapleDualRight with Double = js.native
  /* 10 */ val stapleDualTop: typings.winrt.Windows.Graphics.Printing.PrintStaple.stapleDualTop with Double = js.native
  /* 4 */ val stapleTopLeft: typings.winrt.Windows.Graphics.Printing.PrintStaple.stapleTopLeft with Double = js.native
  /* 5 */ val stapleTopRight: typings.winrt.Windows.Graphics.Printing.PrintStaple.stapleTopRight with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintStaple with Double] = js.native
}

