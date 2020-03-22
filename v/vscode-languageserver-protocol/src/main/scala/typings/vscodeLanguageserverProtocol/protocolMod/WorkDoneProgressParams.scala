package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkDoneProgressParams extends js.Object {
  /**
    * An optional token that a server can use to report work done progress.
    */
  var workDoneToken: js.UndefOr[ProgressToken] = js.undefined
}

object WorkDoneProgressParams {
  @scala.inline
  def apply(workDoneToken: ProgressToken = null): WorkDoneProgressParams = {
    val __obj = js.Dynamic.literal()
    if (workDoneToken != null) __obj.updateDynamic("workDoneToken")(workDoneToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkDoneProgressParams]
  }
}

