package typings.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextGetOptions extends js.Object

@JSGlobal("Windows.UI.Text.TextGetOptions")
@js.native
object TextGetOptions extends js.Object {
  @js.native
  sealed trait adjustCrlf extends TextGetOptions
  
  @js.native
  sealed trait allowFinalEop extends TextGetOptions
  
  @js.native
  sealed trait formatRtf extends TextGetOptions
  
  @js.native
  sealed trait includeNumbering extends TextGetOptions
  
  @js.native
  sealed trait noHidden extends TextGetOptions
  
  @js.native
  sealed trait none extends TextGetOptions
  
  @js.native
  sealed trait useCrlf extends TextGetOptions
  
  @js.native
  sealed trait useObjectText extends TextGetOptions
  
  /* 1 */ val adjustCrlf: typings.winrt.Windows.UI.Text.TextGetOptions.adjustCrlf with Double = js.native
  /* 4 */ val allowFinalEop: typings.winrt.Windows.UI.Text.TextGetOptions.allowFinalEop with Double = js.native
  /* 7 */ val formatRtf: typings.winrt.Windows.UI.Text.TextGetOptions.formatRtf with Double = js.native
  /* 6 */ val includeNumbering: typings.winrt.Windows.UI.Text.TextGetOptions.includeNumbering with Double = js.native
  /* 5 */ val noHidden: typings.winrt.Windows.UI.Text.TextGetOptions.noHidden with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.UI.Text.TextGetOptions.none with Double = js.native
  /* 2 */ val useCrlf: typings.winrt.Windows.UI.Text.TextGetOptions.useCrlf with Double = js.native
  /* 3 */ val useObjectText: typings.winrt.Windows.UI.Text.TextGetOptions.useObjectText with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextGetOptions with Double] = js.native
}

