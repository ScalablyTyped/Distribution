package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialDropout1DLayerConfig
  extends StObject
     with LayerConfig {
  
  /** Float between 0 and 1. Fraction of the input units to drop. */
  var rate: Double
  
  /** An integer to use as random seed. */
  var seed: js.UndefOr[Double] = js.undefined
}
object SpatialDropout1DLayerConfig {
  
  inline def apply(rate: Double): SpatialDropout1DLayerConfig = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialDropout1DLayerConfig]
  }
  
  extension [Self <: SpatialDropout1DLayerConfig](x: Self) {
    
    inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
  }
}
