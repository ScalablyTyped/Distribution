package typings.winrtUwp.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents information about a TextRequested event. */
@js.native
trait CoreTextTextRequest extends js.Object {
  /** Gets a value that indicates whether the text request operation is canceled. */
  var isCanceled: Boolean = js.native
  /** Gets a value that indicates the range of text being requested by the text input server. The server populates this property before raising the event. */
  var range: CoreTextRange = js.native
  /** Gets or sets the text that the text input server is requesting. The application should set the text being requested before returning from the event handler. */
  var text: String = js.native
  /**
    * Requests that the text request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral = js.native
}

object CoreTextTextRequest {
  @scala.inline
  def apply(getDeferral: () => Deferral, isCanceled: Boolean, range: CoreTextRange, text: String): CoreTextTextRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextTextRequest]
  }
  @scala.inline
  implicit class CoreTextTextRequestOps[Self <: CoreTextTextRequest] (val x: Self) extends AnyVal {
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
    def setGetDeferral(value: () => Deferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    @scala.inline
    def setIsCanceled(value: Boolean): Self = this.set("isCanceled", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: CoreTextRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

