package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ValueSet extends js.Object {
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
  var valueSet: js.UndefOr[
    js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolKind
    ]
  ] = js.undefined
}

object Anon_ValueSet {
  @scala.inline
  def apply(
    valueSet: js.Array[
      vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod.SymbolKind
    ] = null
  ): Anon_ValueSet = {
    val __obj = js.Dynamic.literal()
    if (valueSet != null) __obj.updateDynamic("valueSet")(valueSet)
    __obj.asInstanceOf[Anon_ValueSet]
  }
}

