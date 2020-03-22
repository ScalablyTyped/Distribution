package typings.vscodeLanguageserverProtocol.protocolSelectionRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionRangeClientCapabilities extends js.Object {
  /**
    * Whether implementation supports dynamic registration for selection range providers. If this is set to `true`
    * the client supports the new `SelectionRangeRegistrationOptions` return value for the corresponding server
    * capability as well.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}

object SelectionRangeClientCapabilities {
  @scala.inline
  def apply(dynamicRegistration: js.UndefOr[Boolean] = js.undefined): SelectionRangeClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionRangeClientCapabilities]
  }
}

