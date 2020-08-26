package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnregistrationParams extends js.Object {
  var unregisterations: js.Array[Unregistration] = js.native
}

object UnregistrationParams {
  @scala.inline
  def apply(unregisterations: js.Array[Unregistration]): UnregistrationParams = {
    val __obj = js.Dynamic.literal(unregisterations = unregisterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnregistrationParams]
  }
  @scala.inline
  implicit class UnregistrationParamsOps[Self <: UnregistrationParams] (val x: Self) extends AnyVal {
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
    def setUnregisterationsVarargs(value: Unregistration*): Self = this.set("unregisterations", js.Array(value :_*))
    @scala.inline
    def setUnregisterations(value: js.Array[Unregistration]): Self = this.set("unregisterations", value.asInstanceOf[js.Any])
  }
  
}

