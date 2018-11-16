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
  
  val center: center with java.lang.String = js.native
  val justify: justify with java.lang.String = js.native
  val left: left with java.lang.String = js.native
  val right: right with java.lang.String = js.native
  val undefined: undefined with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.ParagraphAlignment with java.lang.String] = js.native
}

