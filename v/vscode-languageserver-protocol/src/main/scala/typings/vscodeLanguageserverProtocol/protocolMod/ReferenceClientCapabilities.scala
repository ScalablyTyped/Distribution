package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceClientCapabilities extends js.Object {
  /**
    * Whether references supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}

object ReferenceClientCapabilities {
  @scala.inline
  def apply(dynamicRegistration: js.UndefOr[Boolean] = js.undefined): ReferenceClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceClientCapabilities]
  }
}

