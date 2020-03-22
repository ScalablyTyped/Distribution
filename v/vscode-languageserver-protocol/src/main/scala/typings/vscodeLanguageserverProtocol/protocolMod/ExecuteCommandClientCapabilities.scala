package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteCommandClientCapabilities extends js.Object {
  /**
    * Execute command supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}

object ExecuteCommandClientCapabilities {
  @scala.inline
  def apply(dynamicRegistration: js.UndefOr[Boolean] = js.undefined): ExecuteCommandClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteCommandClientCapabilities]
  }
}

