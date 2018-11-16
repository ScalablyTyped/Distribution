package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SelectionUpdating event. */
@JSGlobal("Windows.UI.Text.Core.CoreTextSelectionUpdatingEventArgs")
@js.native
abstract class CoreTextSelectionUpdatingEventArgs () extends js.Object {
  /** Gets a value that indicates whether the selection update operation is canceled. */
  var isCanceled: scala.Boolean = js.native
  /** Gets or sets a value that indicates the result of handling the SelectionUpdating event. The default value is Succeeded but if you can't action the operation as the text input server expects then before returning from the event handler set the property to the appropriate value to indicate what has happened. */
  var result: CoreTextSelectionUpdatingResult = js.native
  /** Gets a value that indicates the range of text that the text input server indicates should be selected. The server populates this property before raising the event. */
  var selection: CoreTextRange = js.native
  /**
                       * Requests that the selection update operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
                       * @return A Deferral object.
                       */
  def getDeferral(): winrtDashUwpLib.WindowsNs.FoundationNs.Deferral = js.native
}

