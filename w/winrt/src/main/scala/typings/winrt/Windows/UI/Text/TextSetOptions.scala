package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextSetOptions extends js.Object

@JSGlobal("Windows.UI.Text.TextSetOptions")
@js.native
object TextSetOptions extends js.Object {
  @js.native
  sealed trait applyRtfDocumentDefaults extends TextSetOptions
  
  @js.native
  sealed trait checkTextLimit extends TextSetOptions
  
  @js.native
  sealed trait formatRtf extends TextSetOptions
  
  @js.native
  sealed trait none extends TextSetOptions
  
  @js.native
  sealed trait unhide extends TextSetOptions
  
  @js.native
  sealed trait unicodeBidi extends TextSetOptions
  
  @js.native
  sealed trait unlink extends TextSetOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextSetOptions with Double] = js.native
  /* 6 */ @js.native
  object applyRtfDocumentDefaults extends TopLevel[applyRtfDocumentDefaults with Double]
  
  /* 4 */ @js.native
  object checkTextLimit extends TopLevel[checkTextLimit with Double]
  
  /* 5 */ @js.native
  object formatRtf extends TopLevel[formatRtf with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object unhide extends TopLevel[unhide with Double]
  
  /* 1 */ @js.native
  object unicodeBidi extends TopLevel[unicodeBidi with Double]
  
  /* 2 */ @js.native
  object unlink extends TopLevel[unlink with Double]
  
}

