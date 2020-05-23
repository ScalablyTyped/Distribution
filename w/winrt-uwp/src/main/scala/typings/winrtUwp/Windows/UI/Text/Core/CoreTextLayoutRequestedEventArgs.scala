package typings.winrtUwp.Windows.UI.Text.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the LayoutRequested event. */
trait CoreTextLayoutRequestedEventArgs extends js.Object {
  /** Gets information about a LayoutRequested event. */
  var request: CoreTextLayoutRequest
}

object CoreTextLayoutRequestedEventArgs {
  @scala.inline
  def apply(request: CoreTextLayoutRequest): CoreTextLayoutRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextLayoutRequestedEventArgs]
  }
}

