package typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.CollectionDef

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Int64List. */
trait IInt64List extends js.Object {
  /** Int64List value */
  var value: js.UndefOr[(js.Array[Double | String]) | Null] = js.undefined
}

object IInt64List {
  @scala.inline
  def apply(value: js.Array[Double | String] = null): IInt64List = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInt64List]
  }
}

