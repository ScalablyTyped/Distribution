package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.AnonValueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishDiagnosticsClientCapabilities extends js.Object {
  /**
    * Whether the clients accepts diagnostics with related information.
    */
  var relatedInformation: js.UndefOr[Boolean] = js.undefined
  /**
    * Client supports the tag property to provide meta data about a diagnostic.
    * Clients supporting tags have to handle unknown tags gracefully.
    *
    * @since 3.15.0
    */
  var tagSupport: js.UndefOr[AnonValueSet] = js.undefined
  /**
    * Whether the client interprets the version property of the
    * `textDocument/publishDiagnostics` notification`s parameter.
    *
    * @since 3.15.0
    */
  var versionSupport: js.UndefOr[Boolean] = js.undefined
}

object PublishDiagnosticsClientCapabilities {
  @scala.inline
  def apply(
    relatedInformation: js.UndefOr[Boolean] = js.undefined,
    tagSupport: AnonValueSet = null,
    versionSupport: js.UndefOr[Boolean] = js.undefined
  ): PublishDiagnosticsClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(relatedInformation)) __obj.updateDynamic("relatedInformation")(relatedInformation.asInstanceOf[js.Any])
    if (tagSupport != null) __obj.updateDynamic("tagSupport")(tagSupport.asInstanceOf[js.Any])
    if (!js.isUndefined(versionSupport)) __obj.updateDynamic("versionSupport")(versionSupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishDiagnosticsClientCapabilities]
  }
}

