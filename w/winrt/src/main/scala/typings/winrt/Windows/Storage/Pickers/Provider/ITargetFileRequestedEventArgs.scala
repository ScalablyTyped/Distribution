package typings.winrt.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITargetFileRequestedEventArgs extends js.Object {
  var request: TargetFileRequest = js.native
}

object ITargetFileRequestedEventArgs {
  @scala.inline
  def apply(request: TargetFileRequest): ITargetFileRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITargetFileRequestedEventArgs]
  }
  @scala.inline
  implicit class ITargetFileRequestedEventArgsOps[Self <: ITargetFileRequestedEventArgs] (val x: Self) extends AnyVal {
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
    def setRequest(value: TargetFileRequest): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

