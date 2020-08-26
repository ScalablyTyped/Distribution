package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkDoneProgressParams extends js.Object {
  /**
    * An optional token that a server can use to report work done progress.
    */
  var workDoneToken: js.UndefOr[ProgressToken] = js.native
}

object WorkDoneProgressParams {
  @scala.inline
  def apply(): WorkDoneProgressParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkDoneProgressParams]
  }
  @scala.inline
  implicit class WorkDoneProgressParamsOps[Self <: WorkDoneProgressParams] (val x: Self) extends AnyVal {
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
    def setWorkDoneToken(value: ProgressToken): Self = this.set("workDoneToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkDoneToken: Self = this.set("workDoneToken", js.undefined)
  }
  
}

