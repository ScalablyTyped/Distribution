package typings.winrtUwp.Windows.UI.StartScreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Passed to the SecondaryTile.VisualElementsRequested event handler to provide the visual elements details. */
trait VisualElementsRequestedEventArgs extends js.Object {
  /** Gets the VisualElementsRequest object for the event. */
  var request: VisualElementsRequest
}

object VisualElementsRequestedEventArgs {
  @scala.inline
  def apply(request: VisualElementsRequest): VisualElementsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualElementsRequestedEventArgs]
  }
}

