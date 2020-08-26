package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundTaskProgressEventArgs extends js.Object {
  var instanceId: String = js.native
  var progress: Double = js.native
}

object IBackgroundTaskProgressEventArgs {
  @scala.inline
  def apply(instanceId: String, progress: Double): IBackgroundTaskProgressEventArgs = {
    val __obj = js.Dynamic.literal(instanceId = instanceId.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBackgroundTaskProgressEventArgs]
  }
  @scala.inline
  implicit class IBackgroundTaskProgressEventArgsOps[Self <: IBackgroundTaskProgressEventArgs] (val x: Self) extends AnyVal {
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
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
  }
  
}

