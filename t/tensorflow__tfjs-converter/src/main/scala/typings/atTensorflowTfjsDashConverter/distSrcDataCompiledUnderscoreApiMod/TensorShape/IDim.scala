package typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.TensorShape

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
  def apply(name: String = null, size: Double | String = null): IDim = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDim]
  }
}

