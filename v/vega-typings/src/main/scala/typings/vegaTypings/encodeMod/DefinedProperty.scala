package typings.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinedProperty extends js.Object {
  var defined: js.UndefOr[ProductionRule[BooleanValueRef]] = js.undefined
}

object DefinedProperty {
  @scala.inline
  def apply(defined: ProductionRule[BooleanValueRef] = null): DefinedProperty = {
    val __obj = js.Dynamic.literal()
    if (defined != null) __obj.updateDynamic("defined")(defined.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinedProperty]
  }
}

