package typings.tensorflowTfjsLayers.poolingMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typings.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "Pooling3D")
@js.native
abstract class Pooling3D protected () extends Layer {
  def this(args: Pooling3DLayerArgs) = this()
  
  val dataFormat: DataFormat = js.native
  
  val padding: PaddingMode = js.native
  
  val poolSize: js.Tuple3[Double, Double, Double] = js.native
  
  /* protected */ def poolingFunction(
    inputs: Tensor[Rank],
    poolSize: js.Tuple3[Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    padding: PaddingMode,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  
  val strides: js.Tuple3[Double, Double, Double] = js.native
}
