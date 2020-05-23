package typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef

import typings.tensorflowTfjsConverter.compiledApiMod.IAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an AnyList. */
trait IAnyList extends js.Object {
  /** AnyList value */
  var value: js.UndefOr[js.Array[IAny] | Null] = js.undefined
}

object IAnyList {
  @scala.inline
  def apply(value: js.UndefOr[Null | js.Array[IAny]] = js.undefined): IAnyList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnyList]
  }
}

