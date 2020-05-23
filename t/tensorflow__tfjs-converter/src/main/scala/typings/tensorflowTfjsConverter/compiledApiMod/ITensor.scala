package typings.tensorflowTfjsConverter.compiledApiMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITensor extends js.Object {
  /** Tensor boolVal */
  var boolVal: js.UndefOr[js.Array[Boolean] | Null] = js.undefined
  /** Tensor doubleVal */
  var doubleVal: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** Tensor dtype */
  var dtype: js.UndefOr[DataType | Null] = js.undefined
  /** Tensor floatVal */
  var floatVal: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** Tensor int64Val */
  var int64Val: js.UndefOr[(js.Array[Double | String]) | Null] = js.undefined
  /** Tensor intVal */
  var intVal: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** Tensor scomplexVal */
  var scomplexVal: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** Tensor stringVal */
  var stringVal: js.UndefOr[js.Array[Uint8Array] | Null] = js.undefined
  /** Tensor tensorContent */
  var tensorContent: js.UndefOr[Uint8Array | Null] = js.undefined
  /** Tensor tensorShape */
  var tensorShape: js.UndefOr[ITensorShape | Null] = js.undefined
  /** Tensor uint32Val */
  var uint32Val: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** Tensor uint64Val */
  var uint64Val: js.UndefOr[(js.Array[Double | String]) | Null] = js.undefined
  /** Tensor versionNumber */
  var versionNumber: js.UndefOr[Double | Null] = js.undefined
}

object ITensor {
  @scala.inline
  def apply(
    boolVal: js.UndefOr[Null | js.Array[Boolean]] = js.undefined,
    doubleVal: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    dtype: js.UndefOr[Null | DataType] = js.undefined,
    floatVal: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    int64Val: js.UndefOr[Null | (js.Array[Double | String])] = js.undefined,
    intVal: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    scomplexVal: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    stringVal: js.UndefOr[Null | js.Array[Uint8Array]] = js.undefined,
    tensorContent: js.UndefOr[Null | Uint8Array] = js.undefined,
    tensorShape: js.UndefOr[Null | ITensorShape] = js.undefined,
    uint32Val: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    uint64Val: js.UndefOr[Null | (js.Array[Double | String])] = js.undefined,
    versionNumber: js.UndefOr[Null | Double] = js.undefined
  ): ITensor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolVal)) __obj.updateDynamic("boolVal")(boolVal.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleVal)) __obj.updateDynamic("doubleVal")(doubleVal.asInstanceOf[js.Any])
    if (!js.isUndefined(dtype)) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (!js.isUndefined(floatVal)) __obj.updateDynamic("floatVal")(floatVal.asInstanceOf[js.Any])
    if (!js.isUndefined(int64Val)) __obj.updateDynamic("int64Val")(int64Val.asInstanceOf[js.Any])
    if (!js.isUndefined(intVal)) __obj.updateDynamic("intVal")(intVal.asInstanceOf[js.Any])
    if (!js.isUndefined(scomplexVal)) __obj.updateDynamic("scomplexVal")(scomplexVal.asInstanceOf[js.Any])
    if (!js.isUndefined(stringVal)) __obj.updateDynamic("stringVal")(stringVal.asInstanceOf[js.Any])
    if (!js.isUndefined(tensorContent)) __obj.updateDynamic("tensorContent")(tensorContent.asInstanceOf[js.Any])
    if (!js.isUndefined(tensorShape)) __obj.updateDynamic("tensorShape")(tensorShape.asInstanceOf[js.Any])
    if (!js.isUndefined(uint32Val)) __obj.updateDynamic("uint32Val")(uint32Val.asInstanceOf[js.Any])
    if (!js.isUndefined(uint64Val)) __obj.updateDynamic("uint64Val")(uint64Val.asInstanceOf[js.Any])
    if (!js.isUndefined(versionNumber)) __obj.updateDynamic("versionNumber")(versionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITensor]
  }
}

