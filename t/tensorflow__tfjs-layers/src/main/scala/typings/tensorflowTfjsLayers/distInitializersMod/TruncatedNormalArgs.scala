package typings.tensorflowTfjsLayers.distInitializersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TruncatedNormalArgs extends StObject {
  
  /** Mean of the random values to generate. */
  var mean: js.UndefOr[Double] = js.undefined
  
  /** Used to seed the random generator. */
  var seed: js.UndefOr[Double] = js.undefined
  
  /** Standard deviation of the random values to generate. */
  var stddev: js.UndefOr[Double] = js.undefined
}
object TruncatedNormalArgs {
  
  inline def apply(): TruncatedNormalArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncatedNormalArgs]
  }
  
  extension [Self <: TruncatedNormalArgs](x: Self) {
    
    inline def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
    
    inline def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
    
    inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    
    inline def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
    
    inline def setStddevUndefined: Self = StObject.set(x, "stddev", js.undefined)
  }
}
