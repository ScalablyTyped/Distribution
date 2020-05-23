package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverTypes.mod.SymbolKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  /**
    * The symbol kind values the client supports. When this
    * property exists the client also guarantees that it will
    * handle values outside its set gracefully and falls back
    * to a default value when unknown.
    *
    * If this property is not present the client only supports
    * the symbol kinds from `File` to `Array` as defined in
    * the initial version of the protocol.
    */
  var valueSet: js.UndefOr[js.Array[SymbolKind]] = js.undefined
}

object `1` {
  @scala.inline
  def apply(valueSet: js.Array[SymbolKind] = null): `1` = {
    val __obj = js.Dynamic.literal()
    if (valueSet != null) __obj.updateDynamic("valueSet")(valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

