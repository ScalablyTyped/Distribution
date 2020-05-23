package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkDoneProgressBoolean extends js.Object {
  /**
    * Whether client supports handling progress notifications. If set servers are allowed to
    * report in `workDoneProgress` property in the request specific server capabilities.
    *
    * Since 3.15.0
    */
  var workDoneProgress: js.UndefOr[Boolean] = js.undefined
}

object WorkDoneProgressBoolean {
  @scala.inline
  def apply(workDoneProgress: js.UndefOr[Boolean] = js.undefined): WorkDoneProgressBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(workDoneProgress)) __obj.updateDynamic("workDoneProgress")(workDoneProgress.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkDoneProgressBoolean]
  }
}

