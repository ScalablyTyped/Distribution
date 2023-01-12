package typings.tensorflowTfjsLayers.distLayersCoreMod

import typings.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropoutLayerArgs
  extends StObject
     with LayerArgs {
  
  /**
    * Integer array representing the shape of the binary dropout mask that will
    * be multiplied with the input.
    *
    * For instance, if your inputs have shape `(batchSize, timesteps, features)`
    * and you want the dropout mask to be the same for all timesteps, you can use
    * `noise_shape=(batch_size, 1, features)`.
    */
  var noiseShape: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Float between 0 and 1. Fraction of the input units to drop. */
  var rate: Double
  
  /** An integer to use as random seed. */
  var seed: js.UndefOr[Double] = js.undefined
}
object DropoutLayerArgs {
  
  inline def apply(rate: Double): DropoutLayerArgs = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropoutLayerArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropoutLayerArgs] (val x: Self) extends AnyVal {
    
    inline def setNoiseShape(value: js.Array[Double]): Self = StObject.set(x, "noiseShape", value.asInstanceOf[js.Any])
    
    inline def setNoiseShapeUndefined: Self = StObject.set(x, "noiseShape", js.undefined)
    
    inline def setNoiseShapeVarargs(value: Double*): Self = StObject.set(x, "noiseShape", js.Array(value*))
    
    inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
  }
}
