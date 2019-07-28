package typings.vscodeDashLanguageserverDashProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeActionLiteralSupport extends js.Object {
  /**
    * The client support code action literals as a valid
    * response of the `textDocument/codeAction` request.
    */
  var codeActionLiteralSupport: js.UndefOr[Anon_CodeActionKind] = js.undefined
  /**
    * Whether code action supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}

object Anon_CodeActionLiteralSupport {
  @scala.inline
  def apply(
    codeActionLiteralSupport: Anon_CodeActionKind = null,
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  ): Anon_CodeActionLiteralSupport = {
    val __obj = js.Dynamic.literal()
    if (codeActionLiteralSupport != null) __obj.updateDynamic("codeActionLiteralSupport")(codeActionLiteralSupport)
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration)
    __obj.asInstanceOf[Anon_CodeActionLiteralSupport]
  }
}

