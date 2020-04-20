package typings.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWorkDoneProgress extends js.Object {
  var workDoneProgress: Boolean
}

object AnonWorkDoneProgress {
  @scala.inline
  def apply(workDoneProgress: Boolean): AnonWorkDoneProgress = {
    val __obj = js.Dynamic.literal(workDoneProgress = workDoneProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWorkDoneProgress]
  }
}

