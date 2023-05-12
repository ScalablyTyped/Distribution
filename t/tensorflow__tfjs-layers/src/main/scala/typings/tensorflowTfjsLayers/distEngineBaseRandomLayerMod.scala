package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.distBackendRandomSeedMod.RandomSeed
import typings.tensorflowTfjsLayers.distEngineTopologyMod.Layer
import typings.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEngineBaseRandomLayerMod {
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-layers/dist/engine/base_random_layer", "BaseRandomLayer")
  @js.native
  open class BaseRandomLayer protected () extends Layer {
    def this(args: BaseRandomLayerArgs) = this()
    
    /* protected */ var randomGenerator: RandomSeed = js.native
  }
  /* static members */
  object BaseRandomLayer {
    
    @JSImport("@tensorflow/tfjs-layers/dist/engine/base_random_layer", "BaseRandomLayer")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/engine/base_random_layer", "BaseRandomLayer.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  trait BaseRandomLayerArgs
    extends StObject
       with LayerArgs {
    
    var seed: js.UndefOr[Double] = js.undefined
  }
  object BaseRandomLayerArgs {
    
    inline def apply(): BaseRandomLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseRandomLayerArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseRandomLayerArgs] (val x: Self) extends AnyVal {
      
      inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    }
  }
}
