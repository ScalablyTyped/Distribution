package typings.tensorflowTfjsLayers.initializersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrthogonalArgs
  extends StObject
     with SeedOnlyInitializerArgs {
  
  /**
    * Multiplicative factor to apply to the orthogonal matrix. Defaults to 1.
    */
  var gain: js.UndefOr[Double] = js.undefined
}
object OrthogonalArgs {
  
  inline def apply(): OrthogonalArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrthogonalArgs]
  }
  
  extension [Self <: OrthogonalArgs](x: Self) {
    
    inline def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
    
    inline def setGainUndefined: Self = StObject.set(x, "gain", js.undefined)
  }
}
