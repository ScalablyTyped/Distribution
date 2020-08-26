package typings.winrtUwp.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the CurrentTimeChangeRequested event. */
@js.native
trait CurrentTimeChangeRequestedEventArgs extends js.Object {
  /** Gets the new time that the Play To source audio or video stream has been changed to. */
  var time: Double = js.native
}

object CurrentTimeChangeRequestedEventArgs {
  @scala.inline
  def apply(time: Double): CurrentTimeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentTimeChangeRequestedEventArgs]
  }
  @scala.inline
  implicit class CurrentTimeChangeRequestedEventArgsOps[Self <: CurrentTimeChangeRequestedEventArgs] (val x: Self) extends AnyVal {
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
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
  }
  
}

