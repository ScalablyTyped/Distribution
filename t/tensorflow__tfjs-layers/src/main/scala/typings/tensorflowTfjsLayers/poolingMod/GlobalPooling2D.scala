package typings.tensorflowTfjsLayers.poolingMod

import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/pooling", "GlobalPooling2D")
@js.native
abstract class GlobalPooling2D protected () extends Layer {
  def this(args: GlobalPooling2DLayerArgs) = this()
  
  var dataFormat: DataFormat = js.native
}
