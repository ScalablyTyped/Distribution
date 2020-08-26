package typings.vscodeLanguageserverProtocol.protocolProgressMod

import typings.vscodeJsonrpc.mod.ProgressToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkDoneProgressCreateParams extends js.Object {
  /**
    * The token to be used to report progress.
    */
  var token: ProgressToken = js.native
}

object WorkDoneProgressCreateParams {
  @scala.inline
  def apply(token: ProgressToken): WorkDoneProgressCreateParams = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkDoneProgressCreateParams]
  }
  @scala.inline
  implicit class WorkDoneProgressCreateParamsOps[Self <: WorkDoneProgressCreateParams] (val x: Self) extends AnyVal {
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
    def setToken(value: ProgressToken): Self = this.set("token", value.asInstanceOf[js.Any])
  }
  
}

