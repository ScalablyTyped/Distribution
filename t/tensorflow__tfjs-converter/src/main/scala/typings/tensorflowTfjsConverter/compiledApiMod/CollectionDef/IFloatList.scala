package typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FloatList. */
trait IFloatList extends js.Object {
  /** FloatList value */
  var value: js.UndefOr[js.Array[Double] | Null] = js.undefined
}

object IFloatList {
  @scala.inline
  def apply(value: js.UndefOr[Null | js.Array[Double]] = js.undefined): IFloatList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFloatList]
  }
}

