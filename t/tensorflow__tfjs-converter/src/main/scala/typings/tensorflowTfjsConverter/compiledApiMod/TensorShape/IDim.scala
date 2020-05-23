package typings.tensorflowTfjsConverter.compiledApiMod.TensorShape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Dim. */
trait IDim extends js.Object {
  /** Dim name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** Dim size */
  var size: js.UndefOr[Double | String | Null] = js.undefined
}

object IDim {
  @scala.inline
  def apply(
    name: js.UndefOr[Null | String] = js.undefined,
    size: js.UndefOr[Null | Double | String] = js.undefined
  ): IDim = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDim]
  }
}

