package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaStreamSource.Closed event. */
@js.native
trait MediaStreamSourceClosedEventArgs extends js.Object {
  /** Gets the object that represents the notification that the MediaStreamSource has been closed. */
  var request: MediaStreamSourceClosedRequest = js.native
}

object MediaStreamSourceClosedEventArgs {
  @scala.inline
  def apply(request: MediaStreamSourceClosedRequest): MediaStreamSourceClosedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceClosedEventArgs]
  }
  @scala.inline
  implicit class MediaStreamSourceClosedEventArgsOps[Self <: MediaStreamSourceClosedEventArgs] (val x: Self) extends AnyVal {
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
    def setRequest(value: MediaStreamSourceClosedRequest): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

