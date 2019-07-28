package typings.atTensorflowTfjsDashLayers.distLayersPoolingMod

import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.LayerArgs
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalPooling1D")
@js.native
abstract class GlobalPooling1D protected () extends Layer {
  def this(args: LayerArgs) = this()
  def computeOutputShape(inputShape: Shape): Shape = js.native
}

