package typings.webscopeioReactTextareaAutocomplete.mod

import typings.react.mod.Component
import typings.webscopeioReactTextareaAutocomplete.anon.SelectionEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactTextareaAutocomplete[TItem /* <: String | js.Object */]
  extends Component[TextareaProps[TItem], TextareaState[TItem], js.Any] {
  
  /**
    * Gets the current caret position in the textarea.
    */
  def getCaretPosition(): Double = js.native
  
  /**
    *     Returns currently selected word.
    */
  def getSelectedText(): js.UndefOr[String] = js.native
  
  /**
    * Returns selectionStart and selectionEnd of the textarea.
    */
  def getSelectionPosition(): SelectionEnd = js.native
  
  /**
    * Sets the caret position to the integer value passed as the argument.
    * @param position caret position to set.
    */
  def setCaretPosition(position: Double): Unit = js.native
}
