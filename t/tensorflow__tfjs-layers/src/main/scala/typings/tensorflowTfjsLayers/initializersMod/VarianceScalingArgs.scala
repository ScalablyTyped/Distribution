package typings.tensorflowTfjsLayers.initializersMod

import typings.tensorflowTfjsLayers.initializerConfigMod.Distribution
import typings.tensorflowTfjsLayers.initializerConfigMod.FanMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VarianceScalingArgs extends StObject {
  
  /** Probabilistic distribution of the values. */
  var distribution: js.UndefOr[Distribution] = js.undefined
  
  /** Fanning mode for inputs and outputs. */
  var mode: js.UndefOr[FanMode] = js.undefined
  
  /** Scaling factor (positive float). */
  var scale: js.UndefOr[Double] = js.undefined
  
  /** Random number generator seed. */
  var seed: js.UndefOr[Double] = js.undefined
}
object VarianceScalingArgs {
  
  @scala.inline
  def apply(): VarianceScalingArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VarianceScalingArgs]
  }
  
  @scala.inline
  implicit class VarianceScalingArgsMutableBuilder[Self <: VarianceScalingArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistribution(value: Distribution): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    @scala.inline
    def setMode(value: FanMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
  }
}
