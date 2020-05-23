package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.anon.DocumentationFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelpClientCapabilities extends js.Object {
  /**
    * The client supports to send additional context information for a
    * `textDocument/signatureHelp` request. A client that opts into
    * contextSupport will also support the `retriggerCharacters` on
    * `SignatureHelpOptions`.
    *
    * @since 3.15.0
    */
  var contextSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether signature help supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  /**
    * The client supports the following `SignatureInformation`
    * specific properties.
    */
  var signatureInformation: js.UndefOr[DocumentationFormat] = js.undefined
}

object SignatureHelpClientCapabilities {
  @scala.inline
  def apply(
    contextSupport: js.UndefOr[Boolean] = js.undefined,
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined,
    signatureInformation: DocumentationFormat = null
  ): SignatureHelpClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contextSupport)) __obj.updateDynamic("contextSupport")(contextSupport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.get.asInstanceOf[js.Any])
    if (signatureInformation != null) __obj.updateDynamic("signatureInformation")(signatureInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpClientCapabilities]
  }
}

