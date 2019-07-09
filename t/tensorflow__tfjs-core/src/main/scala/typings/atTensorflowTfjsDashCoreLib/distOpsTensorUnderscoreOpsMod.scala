package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/tensor_ops", JSImport.Namespace)
@js.native
object distOpsTensorUnderscoreOpsMod extends js.Object {
  def fill[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: java.lang.String
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def fill[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: java.lang.String,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
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
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def fill[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: scala.Double
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def fill[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  /**
    * Return an evenly spaced sequence of numbers over the given interval.
    *
    * ```js
    * tf.linspace(0, 9, 10).print();
    * ```
    * @param start The start value of the sequence.
    * @param stop The end value of the sequence.
    * @param num The number of values to generate.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def linspace(start: scala.Double, stop: scala.Double, num: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D = js.native
  /**
    * Creates a `tf.Tensor` with all elements set to 1.
    *
    * ```js
    * tf.ones([2, 2]).print();
    * ```
    *
    * @param shape An array of integers defining the output tensor shape.
    * @param dtype The type of an element in the resulting tensor. Defaults to
    *     'float'.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def ones[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def ones[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  /**
    * Creates a new `tf.Tensor1D` filled with the numbers in the range provided.
    *
    * The tensor is a is half-open interval meaning it includes start, but
    * excludes stop. Decrementing ranges and negative step values are also
    * supported.
    *
    * ```js
    * tf.range(0, 9, 2).print();
    * ```
    *
    * @param start An integer start value
    * @param stop An integer stop value
    * @param step An integer increment (will default to 1 or -1)
    * @param dtype The data type of the output tensor. Defaults to 'float32'.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def range(start: scala.Double, stop: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D = js.native
  def range(start: scala.Double, stop: scala.Double, step: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D = js.native
  @JSName("range")
  def range_float32(
    start: scala.Double,
    stop: scala.Double,
    step: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D = js.native
  @JSName("range")
  def range_int32(
    start: scala.Double,
    stop: scala.Double,
    step: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D = js.native
  def scalar(value: java.lang.String): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar = js.native
  def scalar(value: java.lang.String, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar = js.native
  def scalar(value: scala.Boolean): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar = js.native
  def scalar(value: scala.Boolean, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar = js.native
  /**
    * Creates rank-0 `tf.Tensor` (scalar) with the provided value and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.scalar` as it makes the code more readable.
    *
    * ```js
    * tf.scalar(3.14).print();
    * ```
    *
    * @param value The value of the scalar.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def scalar(value: scala.Double): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar = js.native
  def scalar(value: scala.Double, dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar = js.native
  /**
    * Creates a `tf.Tensor` with the provided values, shape and dtype.
    *
    * ```js
    * // Pass an array of values to create a vector.
    * tf.tensor([1, 2, 3, 4]).print();
    * ```
    *
    * ```js
    * // Pass a nested array of values to make a matrix or a higher
    * // dimensional tensor.
    * tf.tensor([[1, 2], [3, 4]]).print();
    * ```
    *
    * ```js
    * // Pass a flat array and specify a shape yourself.
    * tf.tensor([1, 2, 3, 4], [2, 2]).print();
    * ```
    *
    * @param values The values of the tensor. Can be nested array of numbers,
    *     or a flat array, or a `TypedArray`.
    * @param shape The shape of the tensor. Optional. If not provided,
    *   it is inferred from `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def tensor[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def tensor[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  /**
    * Creates rank-1 `tf.Tensor` with the provided values, shape and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.tensor1d` as it makes the code more readable.
    *
    * ```js
    * tf.tensor1d([1, 2, 3]).print();
    * ```
    *
    * @param values The values of the tensor. Can be array of numbers,
    *     or a `TypedArray`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor1d(values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike1D): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D = js.native
  def tensor1d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike1D,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor1D = js.native
  /**
    * Creates rank-2 `tf.Tensor` with the provided values, shape and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.tensor2d` as it makes the code more readable.
    *
    *  ```js
    * // Pass a nested array.
    * tf.tensor2d([[1, 2], [3, 4]]).print();
    * ```
    * ```js
    * // Pass a flat array and specify a shape.
    * tf.tensor2d([1, 2, 3, 4], [2, 2]).print();
    * ```
    *
    * @param values The values of the tensor. Can be nested array of numbers,
    *     or a flat array, or a `TypedArray`.
    * @param shape The shape of the tensor. If not provided, it is inferred from
    *     `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor2d(values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike2D): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D = js.native
  def tensor2d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike2D,
    shape: js.Tuple2[scala.Double, scala.Double]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D = js.native
  def tensor2d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike2D,
    shape: js.Tuple2[scala.Double, scala.Double],
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor2D = js.native
  /**
    * Creates rank-3 `tf.Tensor` with the provided values, shape and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.tensor3d` as it makes the code more readable.
    *
    *  ```js
    * // Pass a nested array.
    * tf.tensor3d([[[1], [2]], [[3], [4]]]).print();
    * ```
    * ```js
    * // Pass a flat array and specify a shape.
    * tf.tensor3d([1, 2, 3, 4], [2, 2, 1]).print();
    * ```
    *
    * @param values The values of the tensor. Can be nested array of numbers,
    *     or a flat array, or a `TypedArray`.
    * @param shape The shape of the tensor. If not provided,  it is inferred from
    *     `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor3d(values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike3D): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def tensor3d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike3D,
    shape: js.Tuple3[scala.Double, scala.Double, scala.Double]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  def tensor3d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike3D,
    shape: js.Tuple3[scala.Double, scala.Double, scala.Double],
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor3D = js.native
  /**
    * Creates rank-4 `tf.Tensor` with the provided values, shape and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.tensor4d` as it makes the code more readable.
    *
    *  ```js
    * // Pass a nested array.
    * tf.tensor4d([[[[1], [2]], [[3], [4]]]]).print();
    * ```
    * ```js
    * // Pass a flat array and specify a shape.
    * tf.tensor4d([1, 2, 3, 4], [1, 2, 2, 1]).print();
    * ```
    *
    * @param values The values of the tensor. Can be nested array of numbers,
    *     or a flat array, or a `TypedArray`.
    * @param shape The shape of the tensor. Optional. If not provided,
    *   it is inferred from `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor4d(values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def tensor4d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    shape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  def tensor4d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike4D,
    shape: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor4D = js.native
  /**
    * Creates rank-5 `tf.Tensor` with the provided values, shape and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.tensor5d` as it makes the code more readable.
    *
    *  ```js
    * // Pass a nested array.
    * tf.tensor5d([[[[[1], [2]], [[3], [4]]]]]).print();
    * ```
    * ```js
    * // Pass a flat array and specify a shape.
    * tf.tensor5d([1, 2, 3, 4, 5, 6, 7, 8], [1, 2, 2, 2, 1]).print();
    * ```
    *
    * @param values The values of the tensor. Can be nested array of numbers,
    *     or a flat array, or a `TypedArray`.
    * @param shape The shape of the tensor. Optional. If not provided,
    *   it is inferred from `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor5d(values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike5D): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D = js.native
  def tensor5d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike5D,
    shape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D = js.native
  def tensor5d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike5D,
    shape: js.Tuple5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor5D = js.native
  /**
    * Creates rank-6 `tf.Tensor` with the provided values, shape and dtype.
    *
    * The same functionality can be achieved with `tf.tensor`, but in general
    * we recommend using `tf.tensor6d` as it makes the code more readable.
    *
    *  ```js
    * // Pass a nested array.
    * tf.tensor6d([[[[[[1],[2]],[[3],[4]]],[[[5],[6]],[[7],[8]]]]]]).print();
    * ```
    * ```js
    * // Pass a flat array and specify a shape.
    * tf.tensor6d([1, 2, 3, 4, 5, 6, 7, 8], [1, 1, 2, 2, 2, 1]).print();
    * ```
    *
    * @param values The values of the tensor. Can be nested array of numbers,
    *     or a flat array, or a `TypedArray`.
    * @param shape The shape of the tensor. Optional. If not provided,
    *   it is inferred from `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor6d(values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike6D): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor6D = js.native
  def tensor6d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike6D,
    shape: js.Tuple6[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor6D = js.native
  def tensor6d(
    values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike6D,
    shape: js.Tuple6[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor6D = js.native
  /**
    * Creates a `tf.Tensor` with all elements set to 0.
    *
    * ```js
    * tf.zeros([2, 2]).print();
    * ```
    *
    * @param shape An array of integers defining the output tensor shape.
    * @param dtype The type of an element in the resulting tensor. Can
    *     be 'float32', 'int32' or 'bool'. Defaults to 'float'.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def zeros[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  def zeros[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[R] = js.native
  @js.native
  object onesLike extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  }
  
  @js.native
  object zerosLike extends js.Object {
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: T): T = js.native
    def apply[T /* <: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] */](x: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): T = js.native
  }
  
}

