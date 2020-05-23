package typings.winrtUwp.global.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Deferral
import typings.winrtUwp.Windows.UI.Text.Core.CoreTextRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SelectionUpdating event. */
@JSGlobal("Windows.UI.Text.Core.CoreTextSelectionUpdatingEventArgs")
@js.native
abstract class CoreTextSelectionUpdatingEventArgs ()
  extends typings.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionUpdatingEventArgs {
  /** Gets a value that indicates whether the selection update operation is canceled. */
  /* CompleteClass */
  override var isCanceled: Boolean = js.native
  /** Gets or sets a value that indicates the result of handling the SelectionUpdating event. The default value is Succeeded but if you can't action the operation as the text input server expects then before returning from the event handler set the property to the appropriate value to indicate what has happened. */
  /* CompleteClass */
  override var result: typings.winrtUwp.Windows.UI.Text.Core.CoreTextSelectionUpdatingResult = js.native
  /** Gets a value that indicates the range of text that the text input server indicates should be selected. The server populates this property before raising the event. */
  /* CompleteClass */
  override var selection: CoreTextRange = js.native
  /**
    * Requests that the selection update operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  /* CompleteClass */
  override def getDeferral(): Deferral = js.native
}

