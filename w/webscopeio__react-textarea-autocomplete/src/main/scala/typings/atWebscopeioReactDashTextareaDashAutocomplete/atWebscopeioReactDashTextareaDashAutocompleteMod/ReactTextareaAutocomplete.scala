package typings.atWebscopeioReactDashTextareaDashAutocomplete.atWebscopeioReactDashTextareaDashAutocompleteMod

import typings.atWebscopeioReactDashTextareaDashAutocomplete.Anon_SelectionEnd
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactTextareaAutocomplete[TItem /* <: String | js.Object */]
  extends Component[TextareaProps[TItem], TextareaState[TItem], js.Any] {
  /**
    * Gets the current caret position in the textarea.
    */
  def getCaretPosition(): Double = js.native
  /**
    * 	Returns currently selected word.
    */
  def getSelectedText(): js.UndefOr[String] = js.native
  /**
    * Returns selectionStart and selectionEnd of the textarea.
    */
  def getSelectionPosition(): Anon_SelectionEnd = js.native
  /**
    * Sets the caret position to the integer value passed as the argument.
    * @param position caret position to set.
    */
  def setCaretPosition(position: Double): Unit = js.native
}

