package typings.winrtUwp.Windows.UI.StartScreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Passed to the SecondaryTile.VisualElementsRequested event handler to provide the visual elements details. */
@js.native
trait VisualElementsRequestedEventArgs extends js.Object {
  /** Gets the VisualElementsRequest object for the event. */
  var request: VisualElementsRequest = js.native
}

object VisualElementsRequestedEventArgs {
  @scala.inline
  def apply(request: VisualElementsRequest): VisualElementsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualElementsRequestedEventArgs]
  }
  @scala.inline
  implicit class VisualElementsRequestedEventArgsOps[Self <: VisualElementsRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRequest(value: VisualElementsRequest): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

