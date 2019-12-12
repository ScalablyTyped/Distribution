package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Graphics.Printing.PrintStaple.default
import typings.winrt.Windows.Graphics.Printing.PrintStaple.none
import typings.winrt.Windows.Graphics.Printing.PrintStaple.notAvailable
import typings.winrt.Windows.Graphics.Printing.PrintStaple.printerCustom
import typings.winrt.Windows.Graphics.Printing.PrintStaple.saddleStitch
import typings.winrt.Windows.Graphics.Printing.PrintStaple.stapleBottomLeft
import typings.winrt.Windows.Graphics.Printing.PrintStaple.stapleBottomRight
import typings.winrt.Windows.Graphics.Printing.PrintStaple.stapleDualBottom
import typings.winrt.Windows.Graphics.Printing.PrintStaple.stapleDualLeft
import typings.winrt.Windows.Graphics.Printing.PrintStaple.stapleDualRight
import typings.winrt.Windows.Graphics.Printing.PrintStaple.stapleDualTop
import typings.winrt.Windows.Graphics.Printing.PrintStaple.stapleTopLeft
import typings.winrt.Windows.Graphics.Printing.PrintStaple.stapleTopRight
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

