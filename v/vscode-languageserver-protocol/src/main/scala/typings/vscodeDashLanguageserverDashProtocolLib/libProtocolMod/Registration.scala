package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registration extends js.Object {
  /**
    * The id used to register the request. The id can be used to deregister
    * the request again.
    */
  var id: java.lang.String
  /**
    * The method to register for.
    */
  var method: java.lang.String
  /**
    * Options necessary for the registration.
    */
  var registerOptions: js.UndefOr[js.Any] = js.undefined
}

object Registration {
  @scala.inline
  def apply(id: java.lang.String, method: java.lang.String, registerOptions: js.Any = null): Registration = {
    val __obj = js.Dynamic.literal(id = id, method = method)
    if (registerOptions != null) __obj.updateDynamic("registerOptions")(registerOptions)
    __obj.asInstanceOf[Registration]
  }
}

