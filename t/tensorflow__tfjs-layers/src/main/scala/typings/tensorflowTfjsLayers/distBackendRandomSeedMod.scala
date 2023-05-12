package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBackendRandomSeedMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/backend/random_seed", "RandomSeed")
  @js.native
  open class RandomSeed () extends StObject {
    def this(seed: Double) = this()
    
    def next(): js.UndefOr[Double] = js.native
    
    var seed: js.UndefOr[Double] = js.native
  }
  /* static members */
  object RandomSeed {
    
    @JSImport("@tensorflow/tfjs-layers/dist/backend/random_seed", "RandomSeed")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-layers/dist/backend/random_seed", "RandomSeed.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
}
