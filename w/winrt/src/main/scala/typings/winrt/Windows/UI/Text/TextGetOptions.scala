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
  
}

