package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionOptions extends StObject
/** Describes the options that apply to a selection. */
@JSGlobal("Windows.UI.Text.SelectionOptions")
@js.native
object SelectionOptions extends StObject {
  
  /** The selection is active; that is, the text control has the input focus. */
  @js.native
  sealed trait active
    extends StObject
       with SelectionOptions
  
  /** For a degenerate selection (insertion point), the character position at the beginning of a line is the same as the character position at the end of the preceding line. As such, the character position is ambiguous. If this flag is 1, display the caret at the end of the preceding line; otherwise, display it at the beginning of the line. */
  @js.native
  sealed trait atEndOfLine
    extends StObject
       with SelectionOptions
  
  /** Insert/overtype mode is set to overtype. */
  @js.native
  sealed trait overtype
    extends StObject
       with SelectionOptions
  
  /** Typing and pasting replaces the selection. */
  @js.native
  sealed trait replace
    extends StObject
       with SelectionOptions
  
  /** The start position of the selection is the active end; that is, the end that is changed by pressing Shift+Right Arrow and Shift+Left Arrow. */
  @js.native
  sealed trait startActive
    extends StObject
       with SelectionOptions
}
