package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.Anon1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentSymbolClientCapabilities extends js.Object {
  /**
    * Whether document symbol supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  /**
    * The client support hierarchical document symbols.
    */
  var hierarchicalDocumentSymbolSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * Specific capabilities for the `SymbolKind`.
    */
  var symbolKind: js.UndefOr[Anon1] = js.undefined
}

object DocumentSymbolClientCapabilities {
  @scala.inline
  def apply(
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined,
    hierarchicalDocumentSymbolSupport: js.UndefOr[Boolean] = js.undefined,
    symbolKind: Anon1 = null
  ): DocumentSymbolClientCapabilities = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.asInstanceOf[js.Any])
    if (!js.isUndefined(hierarchicalDocumentSymbolSupport)) __obj.updateDynamic("hierarchicalDocumentSymbolSupport")(hierarchicalDocumentSymbolSupport.asInstanceOf[js.Any])
    if (symbolKind != null) __obj.updateDynamic("symbolKind")(symbolKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSymbolClientCapabilities]
  }
}

