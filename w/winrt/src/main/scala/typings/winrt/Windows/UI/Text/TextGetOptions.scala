package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.UI.Text.TextGetOptions.adjustCrlf
import typings.winrt.Windows.UI.Text.TextGetOptions.allowFinalEop
import typings.winrt.Windows.UI.Text.TextGetOptions.formatRtf
import typings.winrt.Windows.UI.Text.TextGetOptions.includeNumbering
import typings.winrt.Windows.UI.Text.TextGetOptions.noHidden
import typings.winrt.Windows.UI.Text.TextGetOptions.none
import typings.winrt.Windows.UI.Text.TextGetOptions.useCrlf
import typings.winrt.Windows.UI.Text.TextGetOptions.useObjectText
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextGetOptions with Double] = js.native
  /* 1 */ @js.native
  object adjustCrlf extends TopLevel[adjustCrlf with Double]
  
  /* 4 */ @js.native
  object allowFinalEop extends TopLevel[allowFinalEop with Double]
  
  /* 7 */ @js.native
  object formatRtf extends TopLevel[formatRtf with Double]
  
  /* 6 */ @js.native
  object includeNumbering extends TopLevel[includeNumbering with Double]
  
  /* 5 */ @js.native
  object noHidden extends TopLevel[noHidden with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object useCrlf extends TopLevel[useCrlf with Double]
  
  /* 3 */ @js.native
  object useObjectText extends TopLevel[useObjectText with Double]
  
}

