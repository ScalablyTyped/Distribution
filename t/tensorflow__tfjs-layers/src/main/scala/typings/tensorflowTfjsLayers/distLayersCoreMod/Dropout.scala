package typings.tensorflowTfjsLayers.distLayersCoreMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.distEngineTopologyMod.Layer
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Dropout")
@js.native
open class Dropout protected () extends Layer {
  def this(args: DropoutLayerArgs) = this()
  
  /* protected */ def getNoiseShape(input: Tensor[Rank]): Shape = js.native
  
  /* private */ val noiseShape: Any = js.native
  
  /* private */ val rate: Any = js.native
  
  /* private */ val seed: Any = js.native
}
/* static members */
object Dropout {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Dropout")
  @js.native
  val ^ : js.Any = js.native
  
  /** @nocollapse */
  @JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Dropout.className")
  @js.native
  def className: String = js.native
  inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
}
