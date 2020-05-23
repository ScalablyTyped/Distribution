package typings.winrtUwp.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Deferral
import typings.winrtUwp.Windows.Globalization.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TextUpdating event. */
trait CoreTextTextUpdatingEventArgs extends js.Object {
  /** Gets a Language object representing the current input language. */
  var inputLanguage: Language
  /** Gets a value that indicates whether the text update operation is canceled. */
  var isCanceled: Boolean
  /** Gets a value that indicates the range of text that the text input server indicates should be selected. The server populates this property before raising the event. */
  var newSelection: CoreTextRange
  /** Gets a value that indicates the range of text that the text input server needs to modify. The server populates this property before raising the event. */
  var range: CoreTextRange
  /** Gets or sets a value that indicates the result of handling the TextUpdating event. The default value is Succeeded but if you can't action the operation as the text input server expects then before returning from the event handler set the property to the appropriate value to indicate what has happened. */
  var result: CoreTextTextUpdatingResult
  /** Gets the text that the text input server is requesting to be set into the modified range. The server populates this property before raising the event. */
  var text: String
  /**
    * Requests that the text update operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral deferral object.
    */
  def getDeferral(): Deferral
}

object CoreTextTextUpdatingEventArgs {
  @scala.inline
  def apply(
    getDeferral: () => Deferral,
    inputLanguage: Language,
    isCanceled: Boolean,
    newSelection: CoreTextRange,
    range: CoreTextRange,
    result: CoreTextTextUpdatingResult,
    text: String
  ): CoreTextTextUpdatingEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), inputLanguage = inputLanguage.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any], newSelection = newSelection.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextTextUpdatingEventArgs]
  }
}

