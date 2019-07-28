package typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersMod

import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import typings.atTensorflowTfjsDashLayers.distTypesMod.Kwargs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers", "SymbolicTensor")
@js.native
class SymbolicTensor protected ()
  extends typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.SymbolicTensor {
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
    inputs: js.Array[typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.SymbolicTensor],
    callArgs: Kwargs
  ) = this()
  def this(
    dtype: DataType,
    shape: Shape,
    sourceLayer: Layer,
    inputs: js.Array[typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.SymbolicTensor],
    callArgs: Kwargs,
    name: String
  ) = this()
  def this(
    dtype: DataType,
    shape: Shape,
    sourceLayer: Layer,
    inputs: js.Array[typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.SymbolicTensor],
    callArgs: Kwargs,
    name: String,
    outputTensorIndex: Double
  ) = this()
}

