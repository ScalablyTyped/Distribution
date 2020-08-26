package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistrationParams extends js.Object {
  var registrations: js.Array[Registration] = js.native
}

object RegistrationParams {
  @scala.inline
  def apply(registrations: js.Array[Registration]): RegistrationParams = {
    val __obj = js.Dynamic.literal(registrations = registrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistrationParams]
  }
  @scala.inline
  implicit class RegistrationParamsOps[Self <: RegistrationParams] (val x: Self) extends AnyVal {
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
    def setRegistrationsVarargs(value: Registration*): Self = this.set("registrations", js.Array(value :_*))
    @scala.inline
    def setRegistrations(value: js.Array[Registration]): Self = this.set("registrations", value.asInstanceOf[js.Any])
  }
  
}

