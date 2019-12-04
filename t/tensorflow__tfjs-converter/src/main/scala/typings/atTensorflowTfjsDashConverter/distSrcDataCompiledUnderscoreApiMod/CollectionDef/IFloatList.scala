package typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.CollectionDef

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
  def apply(value: js.Array[Double] = null): IFloatList = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFloatList]
  }
}

