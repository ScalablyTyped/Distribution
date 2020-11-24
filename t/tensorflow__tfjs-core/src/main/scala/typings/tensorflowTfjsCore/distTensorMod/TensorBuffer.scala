package typings.tensorflowTfjsCore.distTensorMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/tensor", "TensorBuffer")
@js.native
class TensorBuffer[R /* <: Rank */, D /* <: DataType */] protected () extends js.Object {
  def this(
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: D
  ) = this()
  def this(
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: D,
    values: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any
  ) = this()
  
  var dtype: D = js.native
  
  /**
    * Returns the value in the buffer at the provided location.
    *
    * @param locs The location indices.
    *
    * @doc {heading: 'Tensors', subheading: 'Creation'}
    */
  def get(locs: Double*): /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.SingleValueMap[D] */ js.Any = js.native
  
  def indexToLoc(index: Double): js.Array[Double] = js.native
  
  def locToIndex(locs: js.Array[Double]): Double = js.native
  
  val rank: Double = js.native
  
  /**
    * Sets a value in the buffer at a given location.
    *
    * @param value The value to set.
    * @param locs  The location indices.
    *
    * @doc {heading: 'Tensors', subheading: 'Creation'}
    */
  def set(
    value: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.SingleValueMap[D] */ js.Any,
    locs: Double*
  ): Unit = js.native
  
  var shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any = js.native
  
  var size: Double = js.native
  
  var strides: js.Array[Double] = js.native
  
  /**
    * Creates an immutable `tf.Tensor` object from the buffer.
    *
    * @doc {heading: 'Tensors', subheading: 'Creation'}
    */
  def toTensor(): Tensor[R] = js.native
  
  var values: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any = js.native
}
