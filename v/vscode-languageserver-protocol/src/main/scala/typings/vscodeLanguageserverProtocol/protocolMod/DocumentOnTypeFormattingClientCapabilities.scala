package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentOnTypeFormattingClientCapabilities extends js.Object {
  /**
    * Whether on type formatting supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}

object DocumentOnTypeFormattingClientCapabilities {
  @scala.inline
  def apply(dynamicRegistration: js.UndefOr[Boolean] = js.undefined): DocumentOnTypeFormattingClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentOnTypeFormattingClientCapabilities]
  }
}

