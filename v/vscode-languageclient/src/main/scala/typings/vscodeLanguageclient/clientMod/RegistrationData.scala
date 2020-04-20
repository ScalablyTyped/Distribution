package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistrationData[T] extends js.Object {
  var id: String
  var registerOptions: T
}

object RegistrationData {
  @scala.inline
  def apply[T](id: String, registerOptions: T): RegistrationData[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], registerOptions = registerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistrationData[T]]
  }
}

