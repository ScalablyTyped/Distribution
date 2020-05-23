package typings.winrtUwp.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents information about a SelectionRequested event. */
trait CoreTextSelectionRequest extends js.Object {
  /** Gets a value that indicates whether the selection request operation is canceled. */
  var isCanceled: Boolean
  /** Gets or sets the selection range that the text input server is requesting. The application should set the current range of selection before returning from the event handler. */
  var selection: CoreTextRange
  /**
    * Requests that the selection request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral
}

object CoreTextSelectionRequest {
  @scala.inline
  def apply(getDeferral: () => Deferral, isCanceled: Boolean, selection: CoreTextRange): CoreTextSelectionRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextSelectionRequest]
  }
}

