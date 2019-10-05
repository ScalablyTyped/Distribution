package typings.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphAlignment extends js.Object

@JSGlobal("Windows.UI.Text.ParagraphAlignment")
@js.native
object ParagraphAlignment extends js.Object {
  @js.native
  sealed trait center extends ParagraphAlignment
  
  @js.native
  sealed trait justify extends ParagraphAlignment
  
  @js.native
  sealed trait left extends ParagraphAlignment
  
  @js.native
  sealed trait right extends ParagraphAlignment
  
  @js.native
  sealed trait undefined extends ParagraphAlignment
  
  /* 2 */ val center: typings.winrt.Windows.UI.Text.ParagraphAlignment.center with Double = js.native
  /* 4 */ val justify: typings.winrt.Windows.UI.Text.ParagraphAlignment.justify with Double = js.native
  /* 1 */ val left: typings.winrt.Windows.UI.Text.ParagraphAlignment.left with Double = js.native
  /* 3 */ val right: typings.winrt.Windows.UI.Text.ParagraphAlignment.right with Double = js.native
  /* 0 */ val undefined: typings.winrt.Windows.UI.Text.ParagraphAlignment.undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParagraphAlignment with Double] = js.native
}

