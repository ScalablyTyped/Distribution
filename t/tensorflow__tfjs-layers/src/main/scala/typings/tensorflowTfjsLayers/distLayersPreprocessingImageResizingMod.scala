package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.distEngineTopologyMod.Layer
import typings.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLayersPreprocessingImageResizingMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/image_resizing", "Resizing")
  @js.native
  open class Resizing protected () extends Layer {
    def this(args: ResizingArgs) = this()
    
    /* private */ val cropToAspectRatio: Any = js.native
    
    /* private */ val height: Any = js.native
    
    /* private */ val interpolation: Any = js.native
    
    /* private */ val width: Any = js.native
  }
  /* static members */
  object Resizing {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/image_resizing", "Resizing")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/image_resizing", "Resizing.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.bilinear
    - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.nearest
  */
  trait InterpolationType extends StObject
  
  trait ResizingArgs
    extends StObject
       with LayerArgs {
    
    var cropToAspectRatio: js.UndefOr[Boolean] = js.undefined
    
    var height: Double
    
    var interpolation: js.UndefOr[InterpolationType] = js.undefined
    
    var width: Double
  }
  object ResizingArgs {
    
    inline def apply(height: Double, width: Double): ResizingArgs = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizingArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizingArgs] (val x: Self) extends AnyVal {
      
      inline def setCropToAspectRatio(value: Boolean): Self = StObject.set(x, "cropToAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setCropToAspectRatioUndefined: Self = StObject.set(x, "cropToAspectRatio", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setInterpolation(value: InterpolationType): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
      
      inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
