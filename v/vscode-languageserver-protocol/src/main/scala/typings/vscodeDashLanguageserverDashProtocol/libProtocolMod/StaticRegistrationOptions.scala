package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticRegistrationOptions extends js.Object {
  /**
    * The id used to register the request. The id can be used to deregister
    * the request again. See also Registration#id.
    */
  var id: js.UndefOr[String] = js.undefined
}

object StaticRegistrationOptions {
  @scala.inline
  def apply(id: String = null): StaticRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticRegistrationOptions]
  }
}

