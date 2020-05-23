package typings.winrt.Windows.UI.Text

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
  
}

