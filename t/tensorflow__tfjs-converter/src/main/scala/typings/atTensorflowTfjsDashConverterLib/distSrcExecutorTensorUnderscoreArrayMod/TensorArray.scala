package typings
package atTensorflowTfjsDashConverterLib.distSrcExecutorTensorUnderscoreArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/executor/tensor_array", "TensorArray")
@js.native
class TensorArray protected () extends js.Object {
  def this(name: java.lang.String, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType, maxSize: scala.Double, elementShape: js.Array[scala.Double], identicalElementShapes: scala.Boolean, dynamicSize: scala.Boolean, clearAfterRead: scala.Boolean) = this()
  /**
    * This differs from util.assertShapesMatch in that it allows values of
    * negative one, an undefined size of a dimensinon, in a shape to match
    * anything.
    */
  var assertShapesMatchAllowUndefinedSize: js.Any = js.native
  val clearAfterRead: scala.Boolean = js.native
  val closed: scala.Boolean = js.native
  var closed_ : js.Any = js.native
  val dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = js.native
  val dynamicSize: scala.Boolean = js.native
  var elementShape: js.Any = js.native
  val id: scala.Double = js.native
  val identicalElementShapes: scala.Boolean = js.native
  var maxSize: js.Any = js.native
  val name: java.lang.String = js.native
  var shapesEqualAllowUndefinedSize: js.Any = js.native
  var tensors: js.Any = js.native
  /**
    * Close the current TensorArray.
    */
  def clearAndClose(): scala.Unit = js.native
  /**
    * Return the values in the TensorArray as a concatenated Tensor.
    */
  def concat(): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def concat(dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  /**
    * Return selected values in the TensorArray as a packed Tensor. All of
    * selected values must have been written and their shapes must all match.
    * @param [indices] number[] Optional. Taking values in [0, max_value). If the
    *    TensorArray is not dynamic, max_value=size(). If not specified returns
    *    all tensors in the original order.
    * @param [dtype]
    */
  def gather(): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def gather(indices: js.Array[scala.Double]): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  def gather(indices: js.Array[scala.Double], dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  /**
    * Read the value at location index in the TensorArray.
    * @param index Number the index to read from.
    */
  def read(index: scala.Double): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = js.native
  /**
    * Helper method to read multiple tensors from the specified indices.
    */
  def readMany(indices: js.Array[scala.Double]): js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  /**
    * Scatter the values of a Tensor in specific indices of a TensorArray.
    * @param indices nummber[] values in [0, max_value). If the
    *    TensorArray is not dynamic, max_value=size().
    * @param tensor Tensor input tensor.
    */
  def scatter(
    indices: js.Array[scala.Double],
    tensor: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): scala.Unit = js.native
  def size(): scala.Double = js.native
  /**
    * Split the values of a Tensor into the TensorArray.
    * @param length number[] with the lengths to use when splitting value along
    *    its first dimension.
    * @param tensor Tensor, the tensor to split.
    */
  def split(
    length: js.Array[scala.Double],
    tensor: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): scala.Unit = js.native
  /**
    * Write value into the index of the TensorArray.
    * @param index number the index to write to.
    * @param tensor
    */
  def write(
    index: scala.Double,
    tensor: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): scala.Unit = js.native
  /**
    * Helper method to write multiple tensors to the specified indices.
    */
  def writeMany(
    indices: js.Array[scala.Double],
    tensors: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): scala.Unit = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-converter/dist/src/executor/tensor_array", "TensorArray")
@js.native
object TensorArray extends js.Object {
  var nextId: js.Any = js.native
}

