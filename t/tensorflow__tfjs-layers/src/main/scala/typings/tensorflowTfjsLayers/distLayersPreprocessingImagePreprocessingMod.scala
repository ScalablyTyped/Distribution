package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.distEngineTopologyMod.Layer
import typings.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLayersPreprocessingImagePreprocessingMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/image_preprocessing", "Rescaling")
  @js.native
  open class Rescaling protected () extends Layer {
    def this(args: RescalingArgs) = this()
    
    /* private */ val offset: Any = js.native
    
    /* private */ val scale: Any = js.native
  }
  /* static members */
  object Rescaling {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/image_preprocessing", "Rescaling")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/image_preprocessing", "Rescaling.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  trait RescalingArgs
    extends StObject
       with LayerArgs {
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var scale: Double
  }
  object RescalingArgs {
    
    inline def apply(scale: Double): RescalingArgs = {
      val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[RescalingArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RescalingArgs] (val x: Self) extends AnyVal {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
}
