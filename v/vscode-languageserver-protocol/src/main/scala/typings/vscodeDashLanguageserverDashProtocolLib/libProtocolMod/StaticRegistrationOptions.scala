package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticRegistrationOptions extends js.Object {
  /**
    * The id used to register the request. The id can be used to deregister
    * the request again. See also Registration#id.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object StaticRegistrationOptions {
  @scala.inline
  def apply(id: java.lang.String = null): StaticRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[StaticRegistrationOptions]
  }
}

