package typings.winrtUwp.Windows.UI.Text.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SelectionRequested event. */
trait CoreTextSelectionRequestedEventArgs extends js.Object {
  /** Gets information about a SelectionRequested event. */
  var request: CoreTextSelectionRequest
}

object CoreTextSelectionRequestedEventArgs {
  @scala.inline
  def apply(request: CoreTextSelectionRequest): CoreTextSelectionRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextSelectionRequestedEventArgs]
  }
}

