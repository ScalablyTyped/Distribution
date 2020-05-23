package typings.winrtUwp.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents information about a TextRequested event. */
trait CoreTextTextRequest extends js.Object {
  /** Gets a value that indicates whether the text request operation is canceled. */
  var isCanceled: Boolean
  /** Gets a value that indicates the range of text being requested by the text input server. The server populates this property before raising the event. */
  var range: CoreTextRange
  /** Gets or sets the text that the text input server is requesting. The application should set the text being requested before returning from the event handler. */
  var text: String
  /**
    * Requests that the text request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral
}

object CoreTextTextRequest {
  @scala.inline
  def apply(getDeferral: () => Deferral, isCanceled: Boolean, range: CoreTextRange, text: String): CoreTextTextRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextTextRequest]
  }
}

