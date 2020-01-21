package typings.tensorflowTfjsConverter.tensorArrayMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/src/executor/tensor_array", "TensorArray")
@js.native
class TensorArray protected () extends js.Object {
  def this(
    name: String,
    dtype: DataType,
    maxSize: Double,
    elementShape: js.Array[Double],
    identicalElementShapes: Boolean,
    dynamicSize: Boolean,
    clearAfterRead: Boolean
  ) = this()
  /**
    * This differs from util.assertShapesMatch in that it allows values of
    * negative one, an undefined size of a dimensinon, in a shape to match
    * anything.
    */
  var assertShapesMatchAllowUndefinedSize: js.Any = js.native
  val clearAfterRead: Boolean = js.native
  val closed: Boolean = js.native
  var closed_ : js.Any = js.native
  val dtype: DataType = js.native
  val dynamicSize: Boolean = js.native
  var elementShape: js.Any = js.native
  val id: Double = js.native
  val identicalElementShapes: Boolean = js.native
  var maxSize: js.Any = js.native
  val name: String = js.native
  var shapesEqualAllowUndefinedSize: js.Any = js.native
  var tensors: js.Any = js.native
  /**
    * Close the current TensorArray.
    */
  def clearAndClose(): Unit = js.native
  /**
    * Return the values in the TensorArray as a concatenated Tensor.
    */
  def concat(): Tensor_[Rank] = js.native
  def concat(dtype: DataType): Tensor_[Rank] = js.native
  /**
    * Return selected values in the TensorArray as a packed Tensor. All of
    * selected values must have been written and their shapes must all match.
    * @param [indices] number[] Optional. Taking values in [0, max_value). If the
    *    TensorArray is not dynamic, max_value=size(). If not specified returns
    *    all tensors in the original order.
    * @param [dtype]
    */
  def gather(): Tensor_[Rank] = js.native
  def gather(indices: js.Array[Double]): Tensor_[Rank] = js.native
  def gather(indices: js.Array[Double], dtype: DataType): Tensor_[Rank] = js.native
  /**
    * Read the value at location index in the TensorArray.
    * @param index Number the index to read from.
    */
  def read(index: Double): Tensor_[Rank] = js.native
  /**
    * Helper method to read multiple tensors from the specified indices.
    */
  def readMany(indices: js.Array[Double]): js.Array[Tensor_[Rank]] = js.native
  /**
    * Scatter the values of a Tensor in specific indices of a TensorArray.
    * @param indices nummber[] values in [0, max_value). If the
    *    TensorArray is not dynamic, max_value=size().
    * @param tensor Tensor input tensor.
    */
  def scatter(indices: js.Array[Double], tensor: Tensor_[Rank]): Unit = js.native
  def size(): Double = js.native
  /**
    * Split the values of a Tensor into the TensorArray.
    * @param length number[] with the lengths to use when splitting value along
    *    its first dimension.
    * @param tensor Tensor, the tensor to split.
    */
  def split(length: js.Array[Double], tensor: Tensor_[Rank]): Unit = js.native
  /**
    * Write value into the index of the TensorArray.
    * @param index number the index to write to.
    * @param tensor
    */
  def write(index: Double, tensor: Tensor_[Rank]): Unit = js.native
  /**
    * Helper method to write multiple tensors to the specified indices.
    */
  def writeMany(indices: js.Array[Double], tensors: js.Array[Tensor_[Rank]]): Unit = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-converter/dist/src/executor/tensor_array", "TensorArray")
@js.native
object TensorArray extends js.Object {
  var nextId: js.Any = js.native
}

