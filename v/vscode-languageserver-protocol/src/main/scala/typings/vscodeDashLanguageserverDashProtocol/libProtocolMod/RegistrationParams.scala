package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistrationParams extends js.Object {
  var registrations: js.Array[Registration]
}

object RegistrationParams {
  @scala.inline
  def apply(registrations: js.Array[Registration]): RegistrationParams = {
    val __obj = js.Dynamic.literal(registrations = registrations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RegistrationParams]
  }
}

