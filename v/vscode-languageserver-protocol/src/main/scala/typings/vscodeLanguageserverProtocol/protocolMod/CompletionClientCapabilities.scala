package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.Anon0
import typings.vscodeLanguageserverProtocol.AnonCommitCharactersSupport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionClientCapabilities extends js.Object {
  /**
    * The client supports the following `CompletionItem` specific
    * capabilities.
    */
  var completionItem: js.UndefOr[AnonCommitCharactersSupport] = js.undefined
  var completionItemKind: js.UndefOr[Anon0] = js.undefined
  /**
    * The client supports to send additional context information for a
    * `textDocument/completion` requestion.
    */
  var contextSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether completion supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}

object CompletionClientCapabilities {
  @scala.inline
  def apply(
    completionItem: AnonCommitCharactersSupport = null,
    completionItemKind: Anon0 = null,
    contextSupport: js.UndefOr[Boolean] = js.undefined,
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  ): CompletionClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (completionItem != null) __obj.updateDynamic("completionItem")(completionItem.asInstanceOf[js.Any])
    if (completionItemKind != null) __obj.updateDynamic("completionItemKind")(completionItemKind.asInstanceOf[js.Any])
    if (!js.isUndefined(contextSupport)) __obj.updateDynamic("contextSupport")(contextSupport.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionClientCapabilities]
  }
}

