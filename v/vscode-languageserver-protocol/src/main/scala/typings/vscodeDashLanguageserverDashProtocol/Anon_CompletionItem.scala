package typings.vscodeDashLanguageserverDashProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CompletionItem extends js.Object {
  /**
    * The client supports the following `CompletionItem` specific
    * capabilities.
    */
  var completionItem: js.UndefOr[Anon_CommitCharactersSupport] = js.undefined
  var completionItemKind: js.UndefOr[Anon_ValueSetArray] = js.undefined
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

object Anon_CompletionItem {
  @scala.inline
  def apply(
    completionItem: Anon_CommitCharactersSupport = null,
    completionItemKind: Anon_ValueSetArray = null,
    contextSupport: js.UndefOr[Boolean] = js.undefined,
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  ): Anon_CompletionItem = {
    val __obj = js.Dynamic.literal()
    if (completionItem != null) __obj.updateDynamic("completionItem")(completionItem)
    if (completionItemKind != null) __obj.updateDynamic("completionItemKind")(completionItemKind)
    if (!js.isUndefined(contextSupport)) __obj.updateDynamic("contextSupport")(contextSupport)
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration)
    __obj.asInstanceOf[Anon_CompletionItem]
  }
}

