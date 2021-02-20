package typings.tensorflowTfjsLayers.initializersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeedOnlyInitializerArgs extends StObject {
  
  /** Random number generator seed. */
  var seed: js.UndefOr[Double] = js.native
}
object SeedOnlyInitializerArgs {
  
  @scala.inline
  def apply(): SeedOnlyInitializerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeedOnlyInitializerArgs]
  }
  
  @scala.inline
  implicit class SeedOnlyInitializerArgsMutableBuilder[Self <: SeedOnlyInitializerArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
  }
}
