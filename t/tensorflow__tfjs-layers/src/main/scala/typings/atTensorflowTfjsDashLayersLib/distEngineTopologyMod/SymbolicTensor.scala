package typings
package atTensorflowTfjsDashLayersLib.distEngineTopologyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def this(dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape, sourceLayer: Layer, inputs: js.Array[SymbolicTensor], callArgs: atTensorflowTfjsDashLayersLib.distTypesMod.Kwargs) = this()
  def this(dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape, sourceLayer: Layer, inputs: js.Array[SymbolicTensor], callArgs: atTensorflowTfjsDashLayersLib.distTypesMod.Kwargs, name: java.lang.String) = this()
  def this(dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape, sourceLayer: Layer, inputs: js.Array[SymbolicTensor], callArgs: atTensorflowTfjsDashLayersLib.distTypesMod.Kwargs, name: java.lang.String, outputTensorIndex: scala.Double) = this()
  val callArgs: atTensorflowTfjsDashLayersLib.distTypesMod.Kwargs = js.native
  val dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = js.native
  val id: scala.Double = js.native
  val inputs: js.Array[SymbolicTensor] = js.native
  val name: java.lang.String = js.native
  /**
    * Replacement for _keras_history.
    */
  var nodeIndex: scala.Double = js.native
  val originalName: js.UndefOr[java.lang.String] = js.native
  val outputTensorIndex: js.UndefOr[scala.Double] = js.native
  /**
    * Rank/dimensionality of the tensor.
    */
  val rank: scala.Double = js.native
  val shape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = js.native
  var sourceLayer: Layer = js.native
  /**
    * Replacement for _keras_history.
    */
  var tensorIndex: scala.Double = js.native
}

