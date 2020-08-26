package typings.tensorflowTfjsLayers.coreSerializationMod

import typings.tensorflowTfjsLayers.activationConfigMod.ActivationSerialization
import typings.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typings.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typings.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DenseLayerConfig extends LayerConfig {
  var activation: js.UndefOr[ActivationSerialization] = js.native
  var activity_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var bias_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var bias_initializer: js.UndefOr[InitializerSerialization] = js.native
  var bias_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var input_dim: js.UndefOr[Double] = js.native
  var kernel_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var kernel_initializer: js.UndefOr[InitializerSerialization] = js.native
  var kernel_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var units: Double = js.native
  var use_bias: js.UndefOr[Boolean] = js.native
}

object DenseLayerConfig {
  @scala.inline
  def apply(units: Double): DenseLayerConfig = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[DenseLayerConfig]
  }
  @scala.inline
  implicit class DenseLayerConfigOps[Self <: DenseLayerConfig] (val x: Self) extends AnyVal {
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
    def setUnits(value: Double): Self = this.set("units", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivation(value: ActivationSerialization): Self = this.set("activation", value.asInstanceOf[js.Any])
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
    def setInput_dim(value: Double): Self = this.set("input_dim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput_dim: Self = this.set("input_dim", js.undefined)
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
    def setUse_bias(value: Boolean): Self = this.set("use_bias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse_bias: Self = this.set("use_bias", js.undefined)
  }
  
}

