package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkDoneProgress extends js.Object {
  var workDoneProgress: Boolean
}

object WorkDoneProgress {
  @scala.inline
  def apply(workDoneProgress: Boolean): WorkDoneProgress = {
    val __obj = js.Dynamic.literal(workDoneProgress = workDoneProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkDoneProgress]
  }
}

