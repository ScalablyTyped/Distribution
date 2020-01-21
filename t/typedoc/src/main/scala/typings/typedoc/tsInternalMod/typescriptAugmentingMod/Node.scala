package typings.typedoc.tsInternalMod.typescriptAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var localSymbol: js.UndefOr[typings.typescript.mod.Symbol] = js.undefined
  var symbol: js.UndefOr[typings.typescript.mod.Symbol] = js.undefined
}

object Node {
  @scala.inline
  def apply(localSymbol: typings.typescript.mod.Symbol = null, symbol: typings.typescript.mod.Symbol = null): Node = {
    val __obj = js.Dynamic.literal()
    if (localSymbol != null) __obj.updateDynamic("localSymbol")(localSymbol.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

