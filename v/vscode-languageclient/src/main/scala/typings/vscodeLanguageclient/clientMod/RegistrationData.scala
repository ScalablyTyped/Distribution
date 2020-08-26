package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistrationData[T] extends js.Object {
  var id: String = js.native
  var registerOptions: T = js.native
}

object RegistrationData {
  @scala.inline
  def apply[T](id: String, registerOptions: T): RegistrationData[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], registerOptions = registerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistrationData[T]]
  }
  @scala.inline
  implicit class RegistrationDataOps[Self <: RegistrationData[_], T] (val x: Self with RegistrationData[T]) extends AnyVal {
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
    def setRegisterOptions(value: T): Self = this.set("registerOptions", value.asInstanceOf[js.Any])
  }
  
}

