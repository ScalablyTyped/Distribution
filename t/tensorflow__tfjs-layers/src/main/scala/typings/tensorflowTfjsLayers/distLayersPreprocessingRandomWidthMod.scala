package typings.tensorflowTfjsLayers

import typings.std.Set
import typings.tensorflowTfjsLayers.distEngineBaseRandomLayerMod.BaseRandomLayer
import typings.tensorflowTfjsLayers.distEngineBaseRandomLayerMod.BaseRandomLayerArgs
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bilinear
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.nearest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLayersPreprocessingRandomWidthMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/random_width", "INTERPOLATION_METHODS")
  @js.native
  val INTERPOLATION_METHODS: Set[nearest | bilinear] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/random_width", "RandomWidth")
  @js.native
  open class RandomWidth protected () extends BaseRandomLayer {
    def this(args: RandomWidthArgs) = this()
    
    /* private */ val factor: Any = js.native
    
    /* private */ var imgHeight: Any = js.native
    
    /* private */ val interpolation: Any = js.native
    
    /* private */ var widthFactor: Any = js.native
    
    /* private */ var widthLower: Any = js.native
    
    /* private */ var widthUpper: Any = js.native
  }
  /* static members */
  object RandomWidth {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/random_width", "RandomWidth")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/random_width", "RandomWidth.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bilinear
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.nearest
  */
  trait InterpolationType extends StObject
  
  trait RandomWidthArgs
    extends StObject
       with BaseRandomLayerArgs {
    
    var autoVectorize: js.UndefOr[Boolean] = js.undefined
    
    var factor: Double | (js.Tuple2[Double, Double])
    
    var interpolation: js.UndefOr[InterpolationType] = js.undefined
  }
  object RandomWidthArgs {
    
    inline def apply(factor: Double | (js.Tuple2[Double, Double])): RandomWidthArgs = {
      val __obj = js.Dynamic.literal(factor = factor.asInstanceOf[js.Any])
      __obj.asInstanceOf[RandomWidthArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RandomWidthArgs] (val x: Self) extends AnyVal {
      
      inline def setAutoVectorize(value: Boolean): Self = StObject.set(x, "autoVectorize", value.asInstanceOf[js.Any])
      
      inline def setAutoVectorizeUndefined: Self = StObject.set(x, "autoVectorize", js.undefined)
      
      inline def setFactor(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setInterpolation(value: InterpolationType): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
      
      inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    }
  }
}
