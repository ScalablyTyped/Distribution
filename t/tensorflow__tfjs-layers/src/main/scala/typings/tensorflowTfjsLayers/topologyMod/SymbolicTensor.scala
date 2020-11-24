package typings.tensorflowTfjsLayers.topologyMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsLayers.distTypesMod.Kwargs
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/engine/topology", "SymbolicTensor")
@js.native
class SymbolicTensor protected () extends js.Object {
  /**
    *
    * @param dtype
    * @param shape
    * @param sourceLayer The Layer that produced this symbolic tensor.
    * @param inputs The inputs passed to sourceLayer's __call__() method.
    * @param nodeIndex
    * @param tensorIndex
    * @param callArgs The keyword arguments passed to the __call__() method.
    * @param name
    * @param outputTensorIndex The index of this tensor in the list of outputs
    *   returned by apply().
    */
  def this(
    dtype: DataType,
    shape: Shape,
    sourceLayer: Layer,
    inputs: js.Array[SymbolicTensor],
    callArgs: Kwargs
  ) = this()
  def this(
    dtype: DataType,
    shape: Shape,
    sourceLayer: Layer,
    inputs: js.Array[SymbolicTensor],
    callArgs: Kwargs,
    name: String
  ) = this()
  def this(
    dtype: DataType,
    shape: Shape,
    sourceLayer: Layer,
    inputs: js.Array[SymbolicTensor],
    callArgs: Kwargs,
    name: js.UndefOr[scala.Nothing],
    outputTensorIndex: Double
  ) = this()
  def this(
    dtype: DataType,
    shape: Shape,
    sourceLayer: Layer,
    inputs: js.Array[SymbolicTensor],
    callArgs: Kwargs,
    name: String,
    outputTensorIndex: Double
  ) = this()
  
  val callArgs: Kwargs = js.native
  
  val dtype: DataType = js.native
  
  val id: Double = js.native
  
  val inputs: js.Array[SymbolicTensor] = js.native
  
  val name: String = js.native
  
  /**
    * Replacement for _keras_history.
    */
  var nodeIndex: Double = js.native
  
  val originalName: js.UndefOr[String] = js.native
  
  val outputTensorIndex: js.UndefOr[Double] = js.native
  
  /**
    * Rank/dimensionality of the tensor.
    */
  val rank: Double = js.native
  
  val shape: Shape = js.native
  
  var sourceLayer: Layer = js.native
  
  /**
    * Replacement for _keras_history.
    */
  var tensorIndex: Double = js.native
}
