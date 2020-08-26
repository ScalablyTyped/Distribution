package typings.tensorflowTfjsLayers.recurrentSerializationMod

import typings.tensorflowTfjsLayers.activationConfigMod.ActivationSerialization
import typings.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typings.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typings.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleRNNLayerConfig extends BaseRNNLayerConfig {
  var activation: js.UndefOr[ActivationSerialization] = js.native
  var bias_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var bias_initializer: js.UndefOr[InitializerSerialization] = js.native
  var bias_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var dropout: js.UndefOr[Double] = js.native
  var kernel_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var kernel_initializer: js.UndefOr[InitializerSerialization] = js.native
  var kernel_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var recurrent_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var recurrent_dropout: js.UndefOr[Double] = js.native
  var recurrent_initializer: js.UndefOr[InitializerSerialization] = js.native
  var recurrent_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var units: Double = js.native
  var use_bias: js.UndefOr[Boolean] = js.native
}

object SimpleRNNLayerConfig {
  @scala.inline
  def apply(units: Double): SimpleRNNLayerConfig = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleRNNLayerConfig]
  }
  @scala.inline
  implicit class SimpleRNNLayerConfigOps[Self <: SimpleRNNLayerConfig] (val x: Self) extends AnyVal {
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
    def setDropout(value: Double): Self = this.set("dropout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropout: Self = this.set("dropout", js.undefined)
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
    def setRecurrent_constraint(value: ConstraintSerialization): Self = this.set("recurrent_constraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurrent_constraint: Self = this.set("recurrent_constraint", js.undefined)
    @scala.inline
    def setRecurrent_dropout(value: Double): Self = this.set("recurrent_dropout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurrent_dropout: Self = this.set("recurrent_dropout", js.undefined)
    @scala.inline
    def setRecurrent_initializer(value: InitializerSerialization): Self = this.set("recurrent_initializer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurrent_initializer: Self = this.set("recurrent_initializer", js.undefined)
    @scala.inline
    def setRecurrent_regularizer(value: RegularizerSerialization): Self = this.set("recurrent_regularizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurrent_regularizer: Self = this.set("recurrent_regularizer", js.undefined)
    @scala.inline
    def setUse_bias(value: Boolean): Self = this.set("use_bias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse_bias: Self = this.set("use_bias", js.undefined)
  }
  
}

