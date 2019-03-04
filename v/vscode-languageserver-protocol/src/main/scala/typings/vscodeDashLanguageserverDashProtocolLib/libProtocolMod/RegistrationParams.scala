package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistrationParams extends js.Object {
  var registrations: js.Array[Registration]
}

object RegistrationParams {
  @scala.inline
  def apply(registrations: js.Array[Registration]): RegistrationParams = {
    val __obj = js.Dynamic.literal(registrations = registrations)
  
    __obj.asInstanceOf[RegistrationParams]
  }
}

