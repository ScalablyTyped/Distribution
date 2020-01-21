package typings.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCodeActionLiteralSupport extends js.Object {
  /**
    * The client support code action literals as a valid
    * response of the `textDocument/codeAction` request.
    */
  var codeActionLiteralSupport: js.UndefOr[AnonCodeActionKind] = js.undefined
  /**
    * Whether code action supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}

object AnonCodeActionLiteralSupport {
  @scala.inline
  def apply(
    codeActionLiteralSupport: AnonCodeActionKind = null,
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  ): AnonCodeActionLiteralSupport = {
    val __obj = js.Dynamic.literal()
    if (codeActionLiteralSupport != null) __obj.updateDynamic("codeActionLiteralSupport")(codeActionLiteralSupport.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCodeActionLiteralSupport]
  }
}

