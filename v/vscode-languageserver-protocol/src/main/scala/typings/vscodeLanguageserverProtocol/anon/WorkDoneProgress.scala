package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkDoneProgress extends js.Object {
  var workDoneProgress: Boolean = js.native
}

object WorkDoneProgress {
  @scala.inline
  def apply(workDoneProgress: Boolean): WorkDoneProgress = {
    val __obj = js.Dynamic.literal(workDoneProgress = workDoneProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkDoneProgress]
  }
  @scala.inline
  implicit class WorkDoneProgressOps[Self <: WorkDoneProgress] (val x: Self) extends AnyVal {
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
    def setWorkDoneProgress(value: Boolean): Self = this.set("workDoneProgress", value.asInstanceOf[js.Any])
  }
  
}

