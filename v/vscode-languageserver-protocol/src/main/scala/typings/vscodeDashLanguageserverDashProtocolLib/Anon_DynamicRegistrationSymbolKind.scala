package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DynamicRegistrationSymbolKind extends js.Object {
  /**
    * Symbol request supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specific capabilities for the `SymbolKind` in the `workspace/symbol` request.
    */
  var symbolKind: js.UndefOr[Anon_ValueSet] = js.undefined
}

object Anon_DynamicRegistrationSymbolKind {
  @scala.inline
  def apply(dynamicRegistration: js.UndefOr[scala.Boolean] = js.undefined, symbolKind: Anon_ValueSet = null): Anon_DynamicRegistrationSymbolKind = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration)
    if (symbolKind != null) __obj.updateDynamic("symbolKind")(symbolKind)
    __obj.asInstanceOf[Anon_DynamicRegistrationSymbolKind]
  }
}

