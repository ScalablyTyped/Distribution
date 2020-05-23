package typings.winrtUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TaskRequested event. */
trait Print3DTaskRequestedEventArgs extends js.Object {
  /** Gets the 3D print job request associated with the Print3DManager . */
  var request: Print3DTaskRequest
}

object Print3DTaskRequestedEventArgs {
  @scala.inline
  def apply(request: Print3DTaskRequest): Print3DTaskRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print3DTaskRequestedEventArgs]
  }
}

