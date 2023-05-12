package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.distEngineTopologyMod.Layer
import typings.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLayersPreprocessingCenterCropMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/center_crop", "CenterCrop")
  @js.native
  open class CenterCrop protected () extends Layer {
    def this(args: CenterCropArgs) = this()
    
    def centerCrop(
      inputs: Tensor3D | Tensor4D,
      hBuffer: Double,
      wBuffer: Double,
      height: Double,
      width: Double,
      inputHeight: Double,
      inputWidth: Double,
      dtype: DataType
    ): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    
    /* private */ val height: Any = js.native
    
    def upsize(inputs: Tensor3D | Tensor4D, height: Double, width: Double, dtype: DataType): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    
    /* private */ val width: Any = js.native
  }
  /* static members */
  object CenterCrop {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/center_crop", "CenterCrop")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/preprocessing/center_crop", "CenterCrop.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  trait CenterCropArgs
    extends StObject
       with LayerArgs {
    
    var height: Double
    
    var width: Double
  }
  object CenterCropArgs {
    
    inline def apply(height: Double, width: Double): CenterCropArgs = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CenterCropArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CenterCropArgs] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
