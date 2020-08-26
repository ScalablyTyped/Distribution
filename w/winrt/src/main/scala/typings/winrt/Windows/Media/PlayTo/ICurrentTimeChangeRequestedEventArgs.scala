package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICurrentTimeChangeRequestedEventArgs extends js.Object {
  var time: Double = js.native
}

object ICurrentTimeChangeRequestedEventArgs {
  @scala.inline
  def apply(time: Double): ICurrentTimeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICurrentTimeChangeRequestedEventArgs]
  }
  @scala.inline
  implicit class ICurrentTimeChangeRequestedEventArgsOps[Self <: ICurrentTimeChangeRequestedEventArgs] (val x: Self) extends AnyVal {
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

