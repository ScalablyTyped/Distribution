package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.topologyMod.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Dropout")
@js.native
class Dropout protected () extends Layer {
  def this(args: DropoutLayerArgs) = this()
  
  /* protected */ def getNoiseShape(input: Tensor[Rank]): Shape = js.native
  
  /* private */ val noiseShape: js.Any = js.native
  
  /* private */ val rate: js.Any = js.native
  
  /* private */ val seed: js.Any = js.native
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
