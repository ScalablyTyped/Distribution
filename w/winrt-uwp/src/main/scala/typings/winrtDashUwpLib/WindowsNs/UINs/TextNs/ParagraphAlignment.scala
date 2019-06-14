package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

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
  sealed trait center
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.ParagraphAlignment
  
  /** Text is equally distributed between the margins so that each line of the paragraph, other than the last, is identical in length. */
  @js.native
  sealed trait justify
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.ParagraphAlignment
  
  /** Text aligns with the left margin. */
  @js.native
  sealed trait left
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.ParagraphAlignment
  
  /** Text aligns with the right margin. */
  @js.native
  sealed trait right
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.ParagraphAlignment
  
  /** No paragraph alignment is defined. */
  @js.native
  sealed trait undefined
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.ParagraphAlignment
  
  /* 2 */ val center: center with scala.Double = js.native
  /* 4 */ val justify: justify with scala.Double = js.native
  /* 1 */ val left: left with scala.Double = js.native
  /* 3 */ val right: right with scala.Double = js.native
  /* 0 */ val undefined: undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.ParagraphAlignment with scala.Double] = js.native
}

