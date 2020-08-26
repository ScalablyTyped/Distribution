package typings.tensorflowTfjsLayers.convolutionalSerializationMod

import typings.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typings.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormatSerialization
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typings.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseConvLayerConfig extends LayerConfig {
  var activation: js.UndefOr[String] = js.native
  var activity_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var bias_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var bias_initializer: js.UndefOr[InitializerSerialization] = js.native
  var bias_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var data_format: js.UndefOr[DataFormatSerialization] = js.native
  var dilation_rate: js.UndefOr[Double | js.Array[Double] | (js.Tuple2[Double, Double])] = js.native
  var kernel_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var kernel_initializer: js.UndefOr[InitializerSerialization] = js.native
  var kernel_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var kernel_size: Double | js.Array[Double] = js.native
  var padding: js.UndefOr[PaddingMode] = js.native
  var strides: js.UndefOr[Double | js.Array[Double]] = js.native
  var use_bias: js.UndefOr[Boolean] = js.native
}

object BaseConvLayerConfig {
  @scala.inline
  def apply(kernel_size: Double | js.Array[Double]): BaseConvLayerConfig = {
    val __obj = js.Dynamic.literal(kernel_size = kernel_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseConvLayerConfig]
  }
  @scala.inline
  implicit class BaseConvLayerConfigOps[Self <: BaseConvLayerConfig] (val x: Self) extends AnyVal {
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
    def setKernel_sizeVarargs(value: Double*): Self = this.set("kernel_size", js.Array(value :_*))
    @scala.inline
    def setKernel_size(value: Double | js.Array[Double]): Self = this.set("kernel_size", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivation(value: String): Self = this.set("activation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivation: Self = this.set("activation", js.undefined)
    @scala.inline
    def setActivity_regularizer(value: RegularizerSerialization): Self = this.set("activity_regularizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivity_regularizer: Self = this.set("activity_regularizer", js.undefined)
    @scala.inline
    def setBias_constraint(value: ConstraintSerialization): Self = this.set("bias_constraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBias_constraint: Self = this.set("bias_constraint", js.undefined)
    @scala.inline
    def setBias_initializer(value: InitializerSerialization): Self = this.set("bias_initializer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBias_initializer: Self = this.set("bias_initializer", js.undefined)
    @scala.inline
    def setBias_regularizer(value: RegularizerSerialization): Self = this.set("bias_regularizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBias_regularizer: Self = this.set("bias_regularizer", js.undefined)
    @scala.inline
    def setData_format(value: DataFormatSerialization): Self = this.set("data_format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData_format: Self = this.set("data_format", js.undefined)
    @scala.inline
    def setDilation_rateVarargs(value: Double*): Self = this.set("dilation_rate", js.Array(value :_*))
    @scala.inline
    def setDilation_rate(value: Double | js.Array[Double] | (js.Tuple2[Double, Double])): Self = this.set("dilation_rate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDilation_rate: Self = this.set("dilation_rate", js.undefined)
    @scala.inline
    def setKernel_constraint(value: ConstraintSerialization): Self = this.set("kernel_constraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKernel_constraint: Self = this.set("kernel_constraint", js.undefined)
    @scala.inline
    def setKernel_initializer(value: InitializerSerialization): Self = this.set("kernel_initializer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKernel_initializer: Self = this.set("kernel_initializer", js.undefined)
    @scala.inline
    def setKernel_regularizer(value: RegularizerSerialization): Self = this.set("kernel_regularizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKernel_regularizer: Self = this.set("kernel_regularizer", js.undefined)
    @scala.inline
    def setPadding(value: PaddingMode): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setStridesVarargs(value: Double*): Self = this.set("strides", js.Array(value :_*))
    @scala.inline
    def setStrides(value: Double | js.Array[Double]): Self = this.set("strides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrides: Self = this.set("strides", js.undefined)
    @scala.inline
    def setUse_bias(value: Boolean): Self = this.set("use_bias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse_bias: Self = this.set("use_bias", js.undefined)
  }
  
}

