package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

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
  sealed trait active
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.SelectionOptions
  
  /** For a degenerate selection (insertion point), the character position at the beginning of a line is the same as the character position at the end of the preceding line. As such, the character position is ambiguous. If this flag is 1, display the caret at the end of the preceding line; otherwise, display it at the beginning of the line. */
  @js.native
  sealed trait atEndOfLine
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.SelectionOptions
  
  /** Insert/overtype mode is set to overtype. */
  @js.native
  sealed trait overtype
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.SelectionOptions
  
  /** Typing and pasting replaces the selection. */
  @js.native
  sealed trait replace
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.SelectionOptions
  
  /** The start position of the selection is the active end; that is, the end that is changed by pressing Shift+Right Arrow and Shift+Left Arrow. */
  @js.native
  sealed trait startActive
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.SelectionOptions
  
  val active: active with java.lang.String = js.native
  val atEndOfLine: atEndOfLine with java.lang.String = js.native
  val overtype: overtype with java.lang.String = js.native
  val replace: replace with java.lang.String = js.native
  val startActive: startActive with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.SelectionOptions with java.lang.String] = js.native
}

