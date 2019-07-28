package typings.winrt.WindowsNs.UINs.TextNs

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
  
  /* 1 */ val adjustCrlf: typings.winrt.WindowsNs.UINs.TextNs.TextGetOptions.adjustCrlf with Double = js.native
  /* 4 */ val allowFinalEop: typings.winrt.WindowsNs.UINs.TextNs.TextGetOptions.allowFinalEop with Double = js.native
  /* 7 */ val formatRtf: typings.winrt.WindowsNs.UINs.TextNs.TextGetOptions.formatRtf with Double = js.native
  /* 6 */ val includeNumbering: typings.winrt.WindowsNs.UINs.TextNs.TextGetOptions.includeNumbering with Double = js.native
  /* 5 */ val noHidden: typings.winrt.WindowsNs.UINs.TextNs.TextGetOptions.noHidden with Double = js.native
  /* 0 */ val none: typings.winrt.WindowsNs.UINs.TextNs.TextGetOptions.none with Double = js.native
  /* 2 */ val useCrlf: typings.winrt.WindowsNs.UINs.TextNs.TextGetOptions.useCrlf with Double = js.native
  /* 3 */ val useObjectText: typings.winrt.WindowsNs.UINs.TextNs.TextGetOptions.useObjectText with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextGetOptions with Double] = js.native
}

