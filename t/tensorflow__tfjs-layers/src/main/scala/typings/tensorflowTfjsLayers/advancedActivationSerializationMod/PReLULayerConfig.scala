package typings.tensorflowTfjsLayers.advancedActivationSerializationMod

import typings.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typings.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typings.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PReLULayerConfig extends LayerConfig {
  var alpha_constraint: js.UndefOr[ConstraintSerialization] = js.native
  var alpha_initializer: js.UndefOr[InitializerSerialization] = js.native
  var alpha_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  var shared_axes: js.UndefOr[Double | js.Array[Double]] = js.native
}

object PReLULayerConfig {
  @scala.inline
  def apply(): PReLULayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PReLULayerConfig]
  }
  @scala.inline
  implicit class PReLULayerConfigOps[Self <: PReLULayerConfig] (val x: Self) extends AnyVal {
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
    def setAlpha_constraint(value: ConstraintSerialization): Self = this.set("alpha_constraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha_constraint: Self = this.set("alpha_constraint", js.undefined)
    @scala.inline
    def setAlpha_initializer(value: InitializerSerialization): Self = this.set("alpha_initializer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha_initializer: Self = this.set("alpha_initializer", js.undefined)
    @scala.inline
    def setAlpha_regularizer(value: RegularizerSerialization): Self = this.set("alpha_regularizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha_regularizer: Self = this.set("alpha_regularizer", js.undefined)
    @scala.inline
    def setShared_axesVarargs(value: Double*): Self = this.set("shared_axes", js.Array(value :_*))
    @scala.inline
    def setShared_axes(value: Double | js.Array[Double]): Self = this.set("shared_axes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShared_axes: Self = this.set("shared_axes", js.undefined)
  }
  
}

