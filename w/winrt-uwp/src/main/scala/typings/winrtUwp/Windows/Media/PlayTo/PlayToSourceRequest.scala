package typings.winrtUwp.Windows.Media.PlayTo

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a request to connect a media element with a Play To target. */
@js.native
trait PlayToSourceRequest extends js.Object {
  /** Gets the time limit to supply the Play To source element. */
  var deadline: Date = js.native
  /**
    * Displays an error message in the Play To UI.
    * @param errorString The error message to display in the Play To UI.
    */
  def displayErrorString(errorString: String): Unit = js.native
  /**
    * Defers connecting a media source to a Play To target.
    * @return A deferral object that you can use to identify when the deferral is complete.
    */
  def getDeferral(): PlayToSourceDeferral = js.native
  /**
    * Sets the source element to connect to the Play To target.
    * @param value The source element to connect to the Play To target.
    */
  def setSource(value: PlayToSource): Unit = js.native
}

object PlayToSourceRequest {
  @scala.inline
  def apply(
    deadline: Date,
    displayErrorString: String => Unit,
    getDeferral: () => PlayToSourceDeferral,
    setSource: PlayToSource => Unit
  ): PlayToSourceRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], displayErrorString = js.Any.fromFunction1(displayErrorString), getDeferral = js.Any.fromFunction0(getDeferral), setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[PlayToSourceRequest]
  }
  @scala.inline
  implicit class PlayToSourceRequestOps[Self <: PlayToSourceRequest] (val x: Self) extends AnyVal {
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
    def setDeadline(value: Date): Self = this.set("deadline", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayErrorString(value: String => Unit): Self = this.set("displayErrorString", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDeferral(value: () => PlayToSourceDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    @scala.inline
    def setSetSource(value: PlayToSource => Unit): Self = this.set("setSource", js.Any.fromFunction1(value))
  }
  
}

