package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.Anon1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceSymbolClientCapabilities extends js.Object {
  /**
    * Symbol request supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  /**
    * Specific capabilities for the `SymbolKind` in the `workspace/symbol` request.
    */
  var symbolKind: js.UndefOr[Anon1] = js.undefined
}

object WorkspaceSymbolClientCapabilities {
  @scala.inline
  def apply(dynamicRegistration: js.UndefOr[Boolean] = js.undefined, symbolKind: Anon1 = null): WorkspaceSymbolClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.asInstanceOf[js.Any])
    if (symbolKind != null) __obj.updateDynamic("symbolKind")(symbolKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceSymbolClientCapabilities]
  }
}

