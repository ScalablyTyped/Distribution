package typings.winrtUwp.global.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Deferral
import typings.winrtUwp.Windows.Globalization.Language
import typings.winrtUwp.Windows.UI.Text.Core.CoreTextRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TextUpdating event. */
@JSGlobal("Windows.UI.Text.Core.CoreTextTextUpdatingEventArgs")
@js.native
abstract class CoreTextTextUpdatingEventArgs ()
  extends typings.winrtUwp.Windows.UI.Text.Core.CoreTextTextUpdatingEventArgs {
  /** Gets a Language object representing the current input language. */
  /* CompleteClass */
  override var inputLanguage: Language = js.native
  /** Gets a value that indicates whether the text update operation is canceled. */
  /* CompleteClass */
  override var isCanceled: Boolean = js.native
  /** Gets a value that indicates the range of text that the text input server indicates should be selected. The server populates this property before raising the event. */
  /* CompleteClass */
  override var newSelection: CoreTextRange = js.native
  /** Gets a value that indicates the range of text that the text input server needs to modify. The server populates this property before raising the event. */
  /* CompleteClass */
  override var range: CoreTextRange = js.native
  /** Gets or sets a value that indicates the result of handling the TextUpdating event. The default value is Succeeded but if you can't action the operation as the text input server expects then before returning from the event handler set the property to the appropriate value to indicate what has happened. */
  /* CompleteClass */
  override var result: typings.winrtUwp.Windows.UI.Text.Core.CoreTextTextUpdatingResult = js.native
  /** Gets the text that the text input server is requesting to be set into the modified range. The server populates this property before raising the event. */
  /* CompleteClass */
  override var text: String = js.native
  /**
    * Requests that the text update operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral deferral object.
    */
  /* CompleteClass */
  override def getDeferral(): Deferral = js.native
}

