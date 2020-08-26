package typings.winrt.Windows.Media.PlayTo

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlayToSourceRequest extends js.Object {
  var deadline: Date = js.native
  def displayErrorString(errorString: String): Unit = js.native
  def getDeferral(): PlayToSourceDeferral = js.native
  def setSource(value: PlayToSource): Unit = js.native
}

object IPlayToSourceRequest {
  @scala.inline
  def apply(
    deadline: Date,
    displayErrorString: String => Unit,
    getDeferral: () => PlayToSourceDeferral,
    setSource: PlayToSource => Unit
  ): IPlayToSourceRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], displayErrorString = js.Any.fromFunction1(displayErrorString), getDeferral = js.Any.fromFunction0(getDeferral), setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[IPlayToSourceRequest]
  }
  @scala.inline
  implicit class IPlayToSourceRequestOps[Self <: IPlayToSourceRequest] (val x: Self) extends AnyVal {
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

