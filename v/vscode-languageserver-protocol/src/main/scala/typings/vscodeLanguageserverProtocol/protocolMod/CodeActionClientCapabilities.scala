package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.AnonCodeActionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeActionClientCapabilities extends js.Object {
  /**
    * The client support code action literals as a valid
    * response of the `textDocument/codeAction` request.
    *
    * @since 3.8.0
    */
  var codeActionLiteralSupport: js.UndefOr[AnonCodeActionKind] = js.undefined
  /**
    * Whether code action supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether code action supports the `isPreferred` property.
    * @since 3.15.0
    */
  var isPreferredSupport: js.UndefOr[Boolean] = js.undefined
}

object CodeActionClientCapabilities {
  @scala.inline
  def apply(
    codeActionLiteralSupport: AnonCodeActionKind = null,
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined,
    isPreferredSupport: js.UndefOr[Boolean] = js.undefined
  ): CodeActionClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (codeActionLiteralSupport != null) __obj.updateDynamic("codeActionLiteralSupport")(codeActionLiteralSupport.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.asInstanceOf[js.Any])
    if (!js.isUndefined(isPreferredSupport)) __obj.updateDynamic("isPreferredSupport")(isPreferredSupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeActionClientCapabilities]
  }
}

