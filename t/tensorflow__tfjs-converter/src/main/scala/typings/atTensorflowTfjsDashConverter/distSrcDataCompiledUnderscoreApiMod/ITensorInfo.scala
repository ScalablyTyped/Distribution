package typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod

import typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod.TensorInfo.ICooSparse
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
    cooSparse: ICooSparse = null,
    dtype: DataType = null,
    name: String = null,
    tensorShape: ITensorShape = null
  ): ITensorInfo = {
    val __obj = js.Dynamic.literal()
    if (cooSparse != null) __obj.updateDynamic("cooSparse")(cooSparse.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tensorShape != null) __obj.updateDynamic("tensorShape")(tensorShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITensorInfo]
  }
}

