package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.TensorInfo.ICooSparse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITensorInfo extends js.Object {
  /** TensorInfo cooSparse */
  var cooSparse: js.UndefOr[ICooSparse | Null] = js.undefined
  /** TensorInfo dtype */
  var dtype: js.UndefOr[DataType | Null] = js.undefined
  /** TensorInfo name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** TensorInfo tensorShape */
  var tensorShape: js.UndefOr[ITensorShape | Null] = js.undefined
}

object ITensorInfo {
  @scala.inline
  def apply(
    cooSparse: js.UndefOr[Null | ICooSparse] = js.undefined,
    dtype: js.UndefOr[Null | DataType] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    tensorShape: js.UndefOr[Null | ITensorShape] = js.undefined
  ): ITensorInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cooSparse)) __obj.updateDynamic("cooSparse")(cooSparse.asInstanceOf[js.Any])
    if (!js.isUndefined(dtype)) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(tensorShape)) __obj.updateDynamic("tensorShape")(tensorShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITensorInfo]
  }
}

