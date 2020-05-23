package typings.winrtUwp.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents information about a LayoutRequested event. */
trait CoreTextLayoutRequest extends js.Object {
  /** Gets a value that indicates whether the layout request operation is canceled. */
  var isCanceled: Boolean
  /** Gets an object that represents the layout bounds information requested by the text input server. The application should populate the properties of this object to the layout bounds being requested before returning from the event handler. */
  var layoutBounds: CoreTextLayoutBounds
  /** Gets a value that indicates the range of text whose bounding box is being requested by the text input server. The server populates this property before raising the event. */
  var range: CoreTextRange
  /**
    * Requests that the layout request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral
}

object CoreTextLayoutRequest {
  @scala.inline
  def apply(
    getDeferral: () => Deferral,
    isCanceled: Boolean,
    layoutBounds: CoreTextLayoutBounds,
    range: CoreTextRange
  ): CoreTextLayoutRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any], layoutBounds = layoutBounds.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextLayoutRequest]
  }
}

