package typings
package atWebscopeioReactDashTextareaDashAutocompleteLib.reactDashTextareaDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactTextareaAutocomplete[TItem /* <: java.lang.String | js.Object */]
  extends reactLib.reactMod.Component[TextareaProps[TItem], TextareaState[TItem], js.Any] {
  /**
    * Gets the current caret position in the textarea.
    */
  def getCaretPosition(): scala.Double = js.native
  /**
    * 	Returns currently selected word.
    */
  def getSelectedText(): js.UndefOr[java.lang.String] = js.native
  /**
    * Returns selectionStart and selectionEnd of the textarea.
    */
  def getSelectionPosition(): atWebscopeioReactDashTextareaDashAutocompleteLib.Anon_SelectionEnd = js.native
  /**
    * Sets the caret position to the integer value passed as the argument.
    * @param position caret position to set.
    */
  def setCaretPosition(position: scala.Double): scala.Unit = js.native
}

