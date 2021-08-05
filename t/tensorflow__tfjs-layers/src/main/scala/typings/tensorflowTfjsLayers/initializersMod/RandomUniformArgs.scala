package typings.tensorflowTfjsLayers.initializersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RandomUniformArgs extends StObject {
  
  /** Upper bound of the range of random values to generate. */
  var maxval: js.UndefOr[Double] = js.undefined
  
  /** Lower bound of the range of random values to generate. */
  var minval: js.UndefOr[Double] = js.undefined
  
  /** Used to seed the random generator. */
  var seed: js.UndefOr[Double] = js.undefined
}
object RandomUniformArgs {
  
  inline def apply(): RandomUniformArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomUniformArgs]
  }
  
  extension [Self <: RandomUniformArgs](x: Self) {
    
    inline def setMaxval(value: Double): Self = StObject.set(x, "maxval", value.asInstanceOf[js.Any])
    
    inline def setMaxvalUndefined: Self = StObject.set(x, "maxval", js.undefined)
    
    inline def setMinval(value: Double): Self = StObject.set(x, "minval", value.asInstanceOf[js.Any])
    
    inline def setMinvalUndefined: Self = StObject.set(x, "minval", js.undefined)
    
    inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
  }
}
