package typings.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWorkDoneProgressBoolean extends js.Object {
  /**
    * Whether client supports handling progress notifications. If set servers are allowed to
    * report in `workDoneProgress` property in the request specific server capabilities.
    *
    * Since 3.15.0
    */
  var workDoneProgress: js.UndefOr[Boolean] = js.undefined
}

object AnonWorkDoneProgressBoolean {
  @scala.inline
  def apply(workDoneProgress: js.UndefOr[Boolean] = js.undefined): AnonWorkDoneProgressBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(workDoneProgress)) __obj.updateDynamic("workDoneProgress")(workDoneProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWorkDoneProgressBoolean]
  }
}

