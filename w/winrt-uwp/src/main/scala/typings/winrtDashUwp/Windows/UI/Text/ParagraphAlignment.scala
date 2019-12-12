package typings.winrtDashUwp.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.UI.Text.ParagraphAlignment.center
import typings.winrtDashUwp.Windows.UI.Text.ParagraphAlignment.justify
import typings.winrtDashUwp.Windows.UI.Text.ParagraphAlignment.left
import typings.winrtDashUwp.Windows.UI.Text.ParagraphAlignment.right
import typings.winrtDashUwp.Windows.UI.Text.ParagraphAlignment.undefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphAlignment extends js.Object

/** Specifies values for aligning paragraphs. */
@JSGlobal("Windows.UI.Text.ParagraphAlignment")
@js.native
object ParagraphAlignment extends js.Object {
  /** Text is centered between the margins. */
  @js.native
  sealed trait center extends ParagraphAlignment
  
  /** Text is equally distributed between the margins so that each line of the paragraph, other than the last, is identical in length. */
  @js.native
  sealed trait justify extends ParagraphAlignment
  
  /** Text aligns with the left margin. */
  @js.native
  sealed trait left extends ParagraphAlignment
  
  /** Text aligns with the right margin. */
  @js.native
  sealed trait right extends ParagraphAlignment
  
  /** No paragraph alignment is defined. */
  @js.native
  sealed trait undefined extends ParagraphAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParagraphAlignment with Double] = js.native
  /* 2 */ @js.native
  object center extends TopLevel[center with Double]
  
  /* 4 */ @js.native
  object justify extends TopLevel[justify with Double]
  
  /* 1 */ @js.native
  object left extends TopLevel[left with Double]
  
  /* 3 */ @js.native
  object right extends TopLevel[right with Double]
  
  /* 0 */ @js.native
  object undefined extends TopLevel[undefined with Double]
  
}

