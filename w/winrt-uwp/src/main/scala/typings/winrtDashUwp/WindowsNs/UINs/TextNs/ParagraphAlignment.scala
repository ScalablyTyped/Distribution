package typings.winrtDashUwp.WindowsNs.UINs.TextNs

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
  
  /* 2 */ val center: typings.winrtDashUwp.WindowsNs.UINs.TextNs.ParagraphAlignment.center with Double = js.native
  /* 4 */ val justify: typings.winrtDashUwp.WindowsNs.UINs.TextNs.ParagraphAlignment.justify with Double = js.native
  /* 1 */ val left: typings.winrtDashUwp.WindowsNs.UINs.TextNs.ParagraphAlignment.left with Double = js.native
  /* 3 */ val right: typings.winrtDashUwp.WindowsNs.UINs.TextNs.ParagraphAlignment.right with Double = js.native
  /* 0 */ val undefined: typings.winrtDashUwp.WindowsNs.UINs.TextNs.ParagraphAlignment.undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParagraphAlignment with Double] = js.native
}

