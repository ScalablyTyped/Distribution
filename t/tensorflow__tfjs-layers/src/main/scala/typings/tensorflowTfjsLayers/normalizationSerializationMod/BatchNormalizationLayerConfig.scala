package typings.tensorflowTfjsLayers.normalizationSerializationMod

import typings.tensorflowTfjsLayers.constraintConfigMod.ConstraintSerialization
import typings.tensorflowTfjsLayers.initializerConfigMod.InitializerSerialization
import typings.tensorflowTfjsLayers.regularizerConfigMod.RegularizerSerialization
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchNormalizationLayerConfig extends LayerConfig {
  
  var axis: js.UndefOr[Double] = js.native
  
  var beta_constraint: js.UndefOr[ConstraintSerialization] = js.native
  
  var beta_initializer: js.UndefOr[InitializerSerialization] = js.native
  
  var beta_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  
  var center: js.UndefOr[Boolean] = js.native
  
  var epsilon: js.UndefOr[Double] = js.native
  
  var gamma_constraint: js.UndefOr[ConstraintSerialization] = js.native
  
  var gamma_initializer: js.UndefOr[InitializerSerialization] = js.native
  
  var gamma_regularizer: js.UndefOr[RegularizerSerialization] = js.native
  
  var momentum: js.UndefOr[Double] = js.native
  
  var moving_mean_initializer: js.UndefOr[InitializerSerialization] = js.native
  
  var moving_variance_initializer: js.UndefOr[InitializerSerialization] = js.native
  
  var scale: js.UndefOr[Boolean] = js.native
}
object BatchNormalizationLayerConfig {
  
  @scala.inline
  def apply(): BatchNormalizationLayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchNormalizationLayerConfig]
  }
  
  @scala.inline
  implicit class BatchNormalizationLayerConfigOps[Self <: BatchNormalizationLayerConfig] (val x: Self) extends AnyVal {
    
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
    def setAxis(value: Double): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setBeta_constraint(value: ConstraintSerialization): Self = this.set("beta_constraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeta_constraint: Self = this.set("beta_constraint", js.undefined)
    
    @scala.inline
    def setBeta_initializer(value: InitializerSerialization): Self = this.set("beta_initializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeta_initializer: Self = this.set("beta_initializer", js.undefined)
    
    @scala.inline
    def setBeta_regularizer(value: RegularizerSerialization): Self = this.set("beta_regularizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeta_regularizer: Self = this.set("beta_regularizer", js.undefined)
    
    @scala.inline
    def setCenter(value: Boolean): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setEpsilon(value: Double): Self = this.set("epsilon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEpsilon: Self = this.set("epsilon", js.undefined)
    
    @scala.inline
    def setGamma_constraint(value: ConstraintSerialization): Self = this.set("gamma_constraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGamma_constraint: Self = this.set("gamma_constraint", js.undefined)
    
    @scala.inline
    def setGamma_initializer(value: InitializerSerialization): Self = this.set("gamma_initializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGamma_initializer: Self = this.set("gamma_initializer", js.undefined)
    
    @scala.inline
    def setGamma_regularizer(value: RegularizerSerialization): Self = this.set("gamma_regularizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGamma_regularizer: Self = this.set("gamma_regularizer", js.undefined)
    
    @scala.inline
    def setMomentum(value: Double): Self = this.set("momentum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMomentum: Self = this.set("momentum", js.undefined)
    
    @scala.inline
    def setMoving_mean_initializer(value: InitializerSerialization): Self = this.set("moving_mean_initializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoving_mean_initializer: Self = this.set("moving_mean_initializer", js.undefined)
    
    @scala.inline
    def setMoving_variance_initializer(value: InitializerSerialization): Self = this.set("moving_variance_initializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoving_variance_initializer: Self = this.set("moving_variance_initializer", js.undefined)
    
    @scala.inline
    def setScale(value: Boolean): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
}
