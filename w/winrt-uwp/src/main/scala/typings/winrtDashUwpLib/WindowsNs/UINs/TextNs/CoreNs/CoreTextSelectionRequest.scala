package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents information about a SelectionRequested event. */
@JSGlobal("Windows.UI.Text.Core.CoreTextSelectionRequest")
@js.native
abstract class CoreTextSelectionRequest () extends js.Object {
  /** Gets a value that indicates whether the selection request operation is canceled. */
  var isCanceled: scala.Boolean = js.native
  /** Gets or sets the selection range that the text input server is requesting. The application should set the current range of selection before returning from the event handler. */
  var selection: CoreTextRange = js.native
  /**
    * Requests that the selection request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): winrtDashUwpLib.WindowsNs.FoundationNs.Deferral = js.native
}

