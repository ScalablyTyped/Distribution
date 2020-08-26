package typings.tensorflowTfjsConverter.compiledApiMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITensor extends js.Object {
  /** Tensor boolVal */
  var boolVal: js.UndefOr[js.Array[Boolean] | Null] = js.native
  /** Tensor doubleVal */
  var doubleVal: js.UndefOr[js.Array[Double] | Null] = js.native
  /** Tensor dtype */
  var dtype: js.UndefOr[DataType | Null] = js.native
  /** Tensor floatVal */
  var floatVal: js.UndefOr[js.Array[Double] | Null] = js.native
  /** Tensor int64Val */
  var int64Val: js.UndefOr[(js.Array[Double | String]) | Null] = js.native
  /** Tensor intVal */
  var intVal: js.UndefOr[js.Array[Double] | Null] = js.native
  /** Tensor scomplexVal */
  var scomplexVal: js.UndefOr[js.Array[Double] | Null] = js.native
  /** Tensor stringVal */
  var stringVal: js.UndefOr[js.Array[Uint8Array] | Null] = js.native
  /** Tensor tensorContent */
  var tensorContent: js.UndefOr[Uint8Array | Null] = js.native
  /** Tensor tensorShape */
  var tensorShape: js.UndefOr[ITensorShape | Null] = js.native
  /** Tensor uint32Val */
  var uint32Val: js.UndefOr[js.Array[Double] | Null] = js.native
  /** Tensor uint64Val */
  var uint64Val: js.UndefOr[(js.Array[Double | String]) | Null] = js.native
  /** Tensor versionNumber */
  var versionNumber: js.UndefOr[Double | Null] = js.native
}

object ITensor {
  @scala.inline
  def apply(): ITensor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITensor]
  }
  @scala.inline
  implicit class ITensorOps[Self <: ITensor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBoolValVarargs(value: Boolean*): Self = this.set("boolVal", js.Array(value :_*))
    @scala.inline
    def setBoolVal(value: js.Array[Boolean]): Self = this.set("boolVal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoolVal: Self = this.set("boolVal", js.undefined)
    @scala.inline
    def setBoolValNull: Self = this.set("boolVal", null)
    @scala.inline
    def setDoubleValVarargs(value: Double*): Self = this.set("doubleVal", js.Array(value :_*))
    @scala.inline
    def setDoubleVal(value: js.Array[Double]): Self = this.set("doubleVal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleVal: Self = this.set("doubleVal", js.undefined)
    @scala.inline
    def setDoubleValNull: Self = this.set("doubleVal", null)
    @scala.inline
    def setDtype(value: DataType): Self = this.set("dtype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDtype: Self = this.set("dtype", js.undefined)
    @scala.inline
    def setDtypeNull: Self = this.set("dtype", null)
    @scala.inline
    def setFloatValVarargs(value: Double*): Self = this.set("floatVal", js.Array(value :_*))
    @scala.inline
    def setFloatVal(value: js.Array[Double]): Self = this.set("floatVal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatVal: Self = this.set("floatVal", js.undefined)
    @scala.inline
    def setFloatValNull: Self = this.set("floatVal", null)
    @scala.inline
    def setInt64ValVarargs(value: (Double | String)*): Self = this.set("int64Val", js.Array(value :_*))
    @scala.inline
    def setInt64Val(value: js.Array[Double | String]): Self = this.set("int64Val", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInt64Val: Self = this.set("int64Val", js.undefined)
    @scala.inline
    def setInt64ValNull: Self = this.set("int64Val", null)
    @scala.inline
    def setIntValVarargs(value: Double*): Self = this.set("intVal", js.Array(value :_*))
    @scala.inline
    def setIntVal(value: js.Array[Double]): Self = this.set("intVal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntVal: Self = this.set("intVal", js.undefined)
    @scala.inline
    def setIntValNull: Self = this.set("intVal", null)
    @scala.inline
    def setScomplexValVarargs(value: Double*): Self = this.set("scomplexVal", js.Array(value :_*))
    @scala.inline
    def setScomplexVal(value: js.Array[Double]): Self = this.set("scomplexVal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScomplexVal: Self = this.set("scomplexVal", js.undefined)
    @scala.inline
    def setScomplexValNull: Self = this.set("scomplexVal", null)
    @scala.inline
    def setStringValVarargs(value: Uint8Array*): Self = this.set("stringVal", js.Array(value :_*))
    @scala.inline
    def setStringVal(value: js.Array[Uint8Array]): Self = this.set("stringVal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringVal: Self = this.set("stringVal", js.undefined)
    @scala.inline
    def setStringValNull: Self = this.set("stringVal", null)
    @scala.inline
    def setTensorContent(value: Uint8Array): Self = this.set("tensorContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTensorContent: Self = this.set("tensorContent", js.undefined)
    @scala.inline
    def setTensorContentNull: Self = this.set("tensorContent", null)
    @scala.inline
    def setTensorShape(value: ITensorShape): Self = this.set("tensorShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTensorShape: Self = this.set("tensorShape", js.undefined)
    @scala.inline
    def setTensorShapeNull: Self = this.set("tensorShape", null)
    @scala.inline
    def setUint32ValVarargs(value: Double*): Self = this.set("uint32Val", js.Array(value :_*))
    @scala.inline
    def setUint32Val(value: js.Array[Double]): Self = this.set("uint32Val", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUint32Val: Self = this.set("uint32Val", js.undefined)
    @scala.inline
    def setUint32ValNull: Self = this.set("uint32Val", null)
    @scala.inline
    def setUint64ValVarargs(value: (Double | String)*): Self = this.set("uint64Val", js.Array(value :_*))
    @scala.inline
    def setUint64Val(value: js.Array[Double | String]): Self = this.set("uint64Val", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUint64Val: Self = this.set("uint64Val", js.undefined)
    @scala.inline
    def setUint64ValNull: Self = this.set("uint64Val", null)
    @scala.inline
    def setVersionNumber(value: Double): Self = this.set("versionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionNumber: Self = this.set("versionNumber", js.undefined)
    @scala.inline
    def setVersionNumberNull: Self = this.set("versionNumber", null)
  }
  
}

