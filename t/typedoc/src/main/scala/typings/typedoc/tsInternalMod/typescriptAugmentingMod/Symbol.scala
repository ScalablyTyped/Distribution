package typings.typedoc.tsInternalMod.typescriptAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Symbol extends js.Object {
  var parent: js.UndefOr[typings.typescript.mod.Symbol] = js.undefined
}

object Symbol {
  @scala.inline
  def apply(parent: typings.typescript.mod.Symbol = null): Symbol = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
}

