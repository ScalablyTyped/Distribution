package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registration extends js.Object {
  /**
    * The id used to register the request. The id can be used to deregister
    * the request again.
    */
  var id: String
  /**
    * The method to register for.
    */
  var method: String
  /**
    * Options necessary for the registration.
    */
  var registerOptions: js.UndefOr[js.Any] = js.undefined
}

object Registration {
  @scala.inline
  def apply(id: String, method: String, registerOptions: js.Any = null): Registration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    if (registerOptions != null) __obj.updateDynamic("registerOptions")(registerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Registration]
  }
}

