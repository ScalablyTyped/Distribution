package typings.winrtDashUwp.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionOptions extends js.Object

/** Describes the options that apply to a selection. */
@JSGlobal("Windows.UI.Text.SelectionOptions")
@js.native
object SelectionOptions extends js.Object {
  /** The selection is active; that is, the text control has the input focus. */
  @js.native
  sealed trait active extends SelectionOptions
  
  /** For a degenerate selection (insertion point), the character position at the beginning of a line is the same as the character position at the end of the preceding line. As such, the character position is ambiguous. If this flag is 1, display the caret at the end of the preceding line; otherwise, display it at the beginning of the line. */
  @js.native
  sealed trait atEndOfLine extends SelectionOptions
  
  /** Insert/overtype mode is set to overtype. */
  @js.native
  sealed trait overtype extends SelectionOptions
  
  /** Typing and pasting replaces the selection. */
  @js.native
  sealed trait replace extends SelectionOptions
  
  /** The start position of the selection is the active end; that is, the end that is changed by pressing Shift+Right Arrow and Shift+Left Arrow. */
  @js.native
  sealed trait startActive extends SelectionOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionOptions with Double] = js.native
  /* 3 */ @js.native
  object active extends TopLevel[active with Double]
  
  /* 1 */ @js.native
  object atEndOfLine extends TopLevel[atEndOfLine with Double]
  
  /* 2 */ @js.native
  object overtype extends TopLevel[overtype with Double]
  
  /* 4 */ @js.native
  object replace extends TopLevel[replace with Double]
  
  /* 0 */ @js.native
  object startActive extends TopLevel[startActive with Double]
  
}

