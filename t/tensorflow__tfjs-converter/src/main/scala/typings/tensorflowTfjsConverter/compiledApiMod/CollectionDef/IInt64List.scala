package typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef

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
  def apply(value: js.UndefOr[Null | (js.Array[Double | String])] = js.undefined): IInt64List = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInt64List]
  }
}

