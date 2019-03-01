package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistrationData[T] extends js.Object {
  var id: java.lang.String
  var registerOptions: T
}

object RegistrationData {
  @scala.inline
  def apply[T](id: java.lang.String, registerOptions: T): RegistrationData[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("registerOptions")(registerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistrationData[T]]
  }
}

