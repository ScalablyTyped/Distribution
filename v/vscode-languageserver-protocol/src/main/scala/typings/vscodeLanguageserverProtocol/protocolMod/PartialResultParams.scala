package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeJsonrpc.mod.ProgressToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialResultParams extends js.Object {
  /**
    * An optional token that a server can use to report partial results (e.g. streaming) to
    * the client.
    */
  var partialResultToken: js.UndefOr[ProgressToken] = js.native
}

object PartialResultParams {
  @scala.inline
  def apply(): PartialResultParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialResultParams]
  }
  @scala.inline
  implicit class PartialResultParamsOps[Self <: PartialResultParams] (val x: Self) extends AnyVal {
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
    def setPartialResultToken(value: ProgressToken): Self = this.set("partialResultToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartialResultToken: Self = this.set("partialResultToken", js.undefined)
  }
  
}

