package typings.tensorflowTfjsLayers

import typings.std.Set
import typings.tensorflowTfjsLayers.distEngineBaseRandomLayerMod.BaseRandomLayer
import typings.tensorflowTfjsLayers.distEngineBaseRandomLayerMod.BaseRandomLayerArgs
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bilinear
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.nearest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLayersPreprocessingRandomHeightMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/random_height", "INTERPOLATION_METHODS")
  @js.native
  val INTERPOLATION_METHODS: Set[nearest | bilinear] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/random_height", "RandomHeight")
  @js.native
  open class RandomHeight protected () extends BaseRandomLayer {
    def this(args: RandomHeightArgs) = this()
    
    /* private */ val factor: Any = js.native
    
    /* private */ var heightFactor: Any = js.native
    
    /* private */ var heightLower: Any = js.native
    
    /* private */ var heightUpper: Any = js.native
    
    /* private */ var imgWidth: Any = js.native
    
    /* private */ val interpolation: Any = js.native
  }
  /* static members */
  object RandomHeight {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/random_height", "RandomHeight")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/random_height", "RandomHeight.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bilinear
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.nearest
  */
  trait InterpolationType extends StObject
  
  trait RandomHeightArgs
    extends StObject
       with BaseRandomLayerArgs {
    
    var autoVectorize: js.UndefOr[Boolean] = js.undefined
    
    var factor: Double | (js.Tuple2[Double, Double])
    
    var interpolation: js.UndefOr[InterpolationType] = js.undefined
  }
  object RandomHeightArgs {
    
    inline def apply(factor: Double | (js.Tuple2[Double, Double])): RandomHeightArgs = {
      val __obj = js.Dynamic.literal(factor = factor.asInstanceOf[js.Any])
      __obj.asInstanceOf[RandomHeightArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RandomHeightArgs] (val x: Self) extends AnyVal {
      
      inline def setAutoVectorize(value: Boolean): Self = StObject.set(x, "autoVectorize", value.asInstanceOf[js.Any])
      
      inline def setAutoVectorizeUndefined: Self = StObject.set(x, "autoVectorize", js.undefined)
      
      inline def setFactor(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setInterpolation(value: InterpolationType): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
      
      inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    }
  }
}
