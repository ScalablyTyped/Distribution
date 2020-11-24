package typings.tensorflowTfjsLayers.normalizationMod

import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerNormalizationLayerArgs extends LayerArgs {
  
  /**
    * The axis or axes that should be normalized (typically, the feature axis.)
    * Defaults to -1 (the last axis.)
    */
  var axis: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /**
    * Initializer for the beta weight.
    * Default: `'zeros'`.
    */
  var betaInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  
  /** Regularizer for the beta weight. */
  var betaRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  
  /**
    * If `true`, add offset of `beta` to normalized tensor.
    * If `false`, `beta` is ignored.
    * Default: `true`.
    */
  var center: js.UndefOr[Boolean] = js.native
  
  /**
    * A small positive float added to variance to avoid divison by zero.
    * Defaults to 1e-3.
    */
  var epsilon: js.UndefOr[Double] = js.native
  
  /**
    * Initializer for the gamma weight.
    * Default: `'ones'`.
    */
  var gammaInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
  
  /** Regularizer for the gamma weight. */
  var gammaRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  
  /**
    * If `true`, multiply output by `gamma`.
    * If `false`, `gamma` is not used.
    * When the next layer is linear, this can be disabled since scaling will
    * be done by the next layer.
    * Default: `true`.
    */
  var scale: js.UndefOr[Boolean] = js.native
}
object LayerNormalizationLayerArgs {
  
  @scala.inline
  def apply(): LayerNormalizationLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerNormalizationLayerArgs]
  }
  
  @scala.inline
  implicit class LayerNormalizationLayerArgsOps[Self <: LayerNormalizationLayerArgs] (val x: Self) extends AnyVal {
    
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
    def setAxisVarargs(value: Double*): Self = this.set("axis", js.Array(value :_*))
    
    @scala.inline
    def setAxis(value: Double | js.Array[Double]): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setBetaInitializer(value: InitializerIdentifier | Initializer): Self = this.set("betaInitializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBetaInitializer: Self = this.set("betaInitializer", js.undefined)
    
    @scala.inline
    def setBetaRegularizer(value: RegularizerIdentifier | Regularizer): Self = this.set("betaRegularizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBetaRegularizer: Self = this.set("betaRegularizer", js.undefined)
    
    @scala.inline
    def setCenter(value: Boolean): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setEpsilon(value: Double): Self = this.set("epsilon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEpsilon: Self = this.set("epsilon", js.undefined)
    
    @scala.inline
    def setGammaInitializer(value: InitializerIdentifier | Initializer): Self = this.set("gammaInitializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGammaInitializer: Self = this.set("gammaInitializer", js.undefined)
    
    @scala.inline
    def setGammaRegularizer(value: RegularizerIdentifier | Regularizer): Self = this.set("gammaRegularizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGammaRegularizer: Self = this.set("gammaRegularizer", js.undefined)
    
    @scala.inline
    def setScale(value: Boolean): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
}
