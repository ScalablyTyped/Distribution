package typings.atTensorflowTfjsDashConverter.distSrcDataCompiledUnderscoreApiMod

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
    boolVal: js.Array[Boolean] = null,
    doubleVal: js.Array[Double] = null,
    dtype: DataType = null,
    floatVal: js.Array[Double] = null,
    int64Val: js.Array[Double | String] = null,
    intVal: js.Array[Double] = null,
    scomplexVal: js.Array[Double] = null,
    stringVal: js.Array[Uint8Array] = null,
    tensorContent: Uint8Array = null,
    tensorShape: ITensorShape = null,
    uint32Val: js.Array[Double] = null,
    uint64Val: js.Array[Double | String] = null,
    versionNumber: Int | Double = null
  ): ITensor = {
    val __obj = js.Dynamic.literal()
    if (boolVal != null) __obj.updateDynamic("boolVal")(boolVal.asInstanceOf[js.Any])
    if (doubleVal != null) __obj.updateDynamic("doubleVal")(doubleVal.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (floatVal != null) __obj.updateDynamic("floatVal")(floatVal.asInstanceOf[js.Any])
    if (int64Val != null) __obj.updateDynamic("int64Val")(int64Val.asInstanceOf[js.Any])
    if (intVal != null) __obj.updateDynamic("intVal")(intVal.asInstanceOf[js.Any])
    if (scomplexVal != null) __obj.updateDynamic("scomplexVal")(scomplexVal.asInstanceOf[js.Any])
    if (stringVal != null) __obj.updateDynamic("stringVal")(stringVal.asInstanceOf[js.Any])
    if (tensorContent != null) __obj.updateDynamic("tensorContent")(tensorContent.asInstanceOf[js.Any])
    if (tensorShape != null) __obj.updateDynamic("tensorShape")(tensorShape.asInstanceOf[js.Any])
    if (uint32Val != null) __obj.updateDynamic("uint32Val")(uint32Val.asInstanceOf[js.Any])
    if (uint64Val != null) __obj.updateDynamic("uint64Val")(uint64Val.asInstanceOf[js.Any])
    if (versionNumber != null) __obj.updateDynamic("versionNumber")(versionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITensor]
  }
}

