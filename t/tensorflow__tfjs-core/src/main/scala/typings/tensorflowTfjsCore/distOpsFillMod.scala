package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsFillMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/fill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(shape.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: String,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(shape.asInstanceOf[js.Any], value.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  /**
    * Creates a `tf.Tensor` filled with a scalar value.
    *
    * ```js
    * tf.fill([2, 2], 4).print();
    * ```
    *
    * @param shape An array of integers defining the output tensor shape.
    * @param value The scalar value to fill the tensor with.
    * @param dtype The type of an element in the resulting tensor. Defaults to
    * 'float'.
    *
    * @doc {heading: 'Tensors', subheading: 'Creation'}
    */
  inline def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(shape.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: Double,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(shape.asInstanceOf[js.Any], value.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
}
