package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Registration extends js.Object {
  /**
    * The id used to register the request. The id can be used to deregister
    * the request again.
    */
  var id: String = js.native
  /**
    * The method to register for.
    */
  var method: String = js.native
  /**
    * Options necessary for the registration.
    */
  var registerOptions: js.UndefOr[js.Any] = js.native
}

object Registration {
  @scala.inline
  def apply(id: String, method: String): Registration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Registration]
  }
  @scala.inline
  implicit class RegistrationOps[Self <: Registration] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegisterOptions(value: js.Any): Self = this.set("registerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegisterOptions: Self = this.set("registerOptions", js.undefined)
  }
  
}

