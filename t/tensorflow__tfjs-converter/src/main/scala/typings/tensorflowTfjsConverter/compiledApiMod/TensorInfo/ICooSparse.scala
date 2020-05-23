package typings.tensorflowTfjsConverter.compiledApiMod.TensorInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CooSparse. */
trait ICooSparse extends js.Object {
  /** CooSparse denseShapeTensorName */
  var denseShapeTensorName: js.UndefOr[String | Null] = js.undefined
  /** CooSparse indicesTensorName */
  var indicesTensorName: js.UndefOr[String | Null] = js.undefined
  /** CooSparse valuesTensorName */
  var valuesTensorName: js.UndefOr[String | Null] = js.undefined
}

object ICooSparse {
  @scala.inline
  def apply(
    denseShapeTensorName: js.UndefOr[Null | String] = js.undefined,
    indicesTensorName: js.UndefOr[Null | String] = js.undefined,
    valuesTensorName: js.UndefOr[Null | String] = js.undefined
  ): ICooSparse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(denseShapeTensorName)) __obj.updateDynamic("denseShapeTensorName")(denseShapeTensorName.asInstanceOf[js.Any])
    if (!js.isUndefined(indicesTensorName)) __obj.updateDynamic("indicesTensorName")(indicesTensorName.asInstanceOf[js.Any])
    if (!js.isUndefined(valuesTensorName)) __obj.updateDynamic("valuesTensorName")(valuesTensorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICooSparse]
  }
}

