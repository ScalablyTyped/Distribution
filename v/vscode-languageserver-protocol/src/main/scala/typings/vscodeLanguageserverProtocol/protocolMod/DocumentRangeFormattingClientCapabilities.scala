package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentRangeFormattingClientCapabilities extends js.Object {
  /**
    * Whether range formatting supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}

object DocumentRangeFormattingClientCapabilities {
  @scala.inline
  def apply(dynamicRegistration: js.UndefOr[Boolean] = js.undefined): DocumentRangeFormattingClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentRangeFormattingClientCapabilities]
  }
}

