package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.distEngineTopologyMod.Layer
import typings.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import typings.tensorflowTfjsLayers.distLayersPreprocessingPreprocessingUtilsMod.OutputMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLayersPreprocessingCategoryEncodingMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/category_encoding", "CategoryEncoding")
  @js.native
  open class CategoryEncoding protected () extends Layer {
    def this(args: CategoryEncodingArgs) = this()
    
    /* private */ val numTokens: Any = js.native
    
    /* private */ val outputMode: Any = js.native
  }
  /* static members */
  object CategoryEncoding {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/category_encoding", "CategoryEncoding")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/category_encoding", "CategoryEncoding.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  trait CategoryEncodingArgs
    extends StObject
       with LayerArgs {
    
    var numTokens: Double
    
    var outputMode: js.UndefOr[OutputMode] = js.undefined
  }
  object CategoryEncodingArgs {
    
    inline def apply(numTokens: Double): CategoryEncodingArgs = {
      val __obj = js.Dynamic.literal(numTokens = numTokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[CategoryEncodingArgs]
    }
    
    extension [Self <: CategoryEncodingArgs](x: Self) {
      
      inline def setNumTokens(value: Double): Self = StObject.set(x, "numTokens", value.asInstanceOf[js.Any])
      
      inline def setOutputMode(value: OutputMode): Self = StObject.set(x, "outputMode", value.asInstanceOf[js.Any])
      
      inline def setOutputModeUndefined: Self = StObject.set(x, "outputMode", js.undefined)
    }
  }
}
