package typings.tensorflowTfjsConverter.tensorArrayMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-converter/dist/executor/tensor_array", "TensorArray")
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
  var tensors: js.Any = js.native
  /**
    * Close the current TensorArray.
    */
  def clearAndClose(): Unit = js.native
  /**
    * Return the values in the TensorArray as a concatenated Tensor.
    */
  def concat(): Tensor[Rank] = js.native
  def concat(dtype: DataType): Tensor[Rank] = js.native
  /**
    * Return selected values in the TensorArray as a packed Tensor. All of
    * selected values must have been written and their shapes must all match.
    * @param [indices] number[] Optional. Taking values in [0, max_value). If the
    *    TensorArray is not dynamic, max_value=size(). If not specified returns
    *    all tensors in the original order.
    * @param [dtype]
    */
  def gather(): Tensor[Rank] = js.native
  def gather(indices: js.UndefOr[scala.Nothing], dtype: DataType): Tensor[Rank] = js.native
  def gather(indices: js.Array[Double]): Tensor[Rank] = js.native
  def gather(indices: js.Array[Double], dtype: DataType): Tensor[Rank] = js.native
  /**
    * Read the value at location index in the TensorArray.
    * @param index Number the index to read from.
    */
  def read(index: Double): Tensor[Rank] = js.native
  /**
    * Helper method to read multiple tensors from the specified indices.
    */
  def readMany(indices: js.Array[Double]): js.Array[Tensor[Rank]] = js.native
  /**
    * Scatter the values of a Tensor in specific indices of a TensorArray.
    * @param indices nummber[] values in [0, max_value). If the
    *    TensorArray is not dynamic, max_value=size().
    * @param tensor Tensor input tensor.
    */
  def scatter(indices: js.Array[Double], tensor: Tensor[Rank]): Unit = js.native
  def size(): Double = js.native
  /**
    * Split the values of a Tensor into the TensorArray.
    * @param length number[] with the lengths to use when splitting value along
    *    its first dimension.
    * @param tensor Tensor, the tensor to split.
    */
  def split(length: js.Array[Double], tensor: Tensor[Rank]): Unit = js.native
  /**
    * Write value into the index of the TensorArray.
    * @param index number the index to write to.
    * @param tensor
    */
  def write(index: Double, tensor: Tensor[Rank]): Unit = js.native
  /**
    * Helper method to write multiple tensors to the specified indices.
    */
  def writeMany(indices: js.Array[Double], tensors: js.Array[Tensor[Rank]]): Unit = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-converter/dist/executor/tensor_array", "TensorArray")
@js.native
object TensorArray extends js.Object {
  var nextId: js.Any = js.native
}

