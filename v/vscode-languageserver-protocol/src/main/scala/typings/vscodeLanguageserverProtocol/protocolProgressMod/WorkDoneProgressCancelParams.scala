package typings.vscodeLanguageserverProtocol.protocolProgressMod

import typings.vscodeJsonrpc.mod.ProgressToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkDoneProgressCancelParams extends js.Object {
  /**
    * The token to be used to report progress.
    */
  var token: ProgressToken
}

object WorkDoneProgressCancelParams {
  @scala.inline
  def apply(token: ProgressToken): WorkDoneProgressCancelParams = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkDoneProgressCancelParams]
  }
}

