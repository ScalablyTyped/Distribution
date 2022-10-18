package typings.tensorflowTfjsLayers.distInitializersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeedOnlyInitializerArgs extends StObject {
  
  /** Random number generator seed. */
  var seed: js.UndefOr[Double] = js.undefined
}
object SeedOnlyInitializerArgs {
  
  inline def apply(): SeedOnlyInitializerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeedOnlyInitializerArgs]
  }
  
  extension [Self <: SeedOnlyInitializerArgs](x: Self) {
    
    inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
  }
}
