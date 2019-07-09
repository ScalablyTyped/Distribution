package typings
package atTensorflowTfjsLib.atTensorflowTfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "SymbolicTensor")
@js.native
class SymbolicTensor protected ()
  extends atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersMod.SymbolicTensor {
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
  def this(dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape, sourceLayer: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer, inputs: js.Array[atTensorflowTfjsDashLayersLib.distEngineTopologyMod.SymbolicTensor], callArgs: atTensorflowTfjsDashLayersLib.distTypesMod.Kwargs) = this()
  def this(dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape, sourceLayer: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer, inputs: js.Array[atTensorflowTfjsDashLayersLib.distEngineTopologyMod.SymbolicTensor], callArgs: atTensorflowTfjsDashLayersLib.distTypesMod.Kwargs, name: java.lang.String) = this()
  def this(dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape, sourceLayer: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer, inputs: js.Array[atTensorflowTfjsDashLayersLib.distEngineTopologyMod.SymbolicTensor], callArgs: atTensorflowTfjsDashLayersLib.distTypesMod.Kwargs, name: java.lang.String, outputTensorIndex: scala.Double) = this()
}

