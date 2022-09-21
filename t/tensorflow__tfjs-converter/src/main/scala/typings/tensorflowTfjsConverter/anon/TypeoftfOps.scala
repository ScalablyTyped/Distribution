package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.NCHW
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.NHWC
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.bool
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.complex64
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.euclidean
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.float32
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.fro
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.int32
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.left
import typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.right
import typings.tensorflowTfjsCore.anon.Indexing
import typings.tensorflowTfjsCore.anon.Mean
import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTensorMod.Tensor5D
import typings.tensorflowTfjsCore.distTensorMod.Tensor6D
import typings.tensorflowTfjsCore.distTensorMod.TensorBuffer
import typings.tensorflowTfjsCore.distTensorMod.Variable
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.distTypesMod.TensorLike1D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike2D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike3D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike5D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike6D
import typings.tensorflowTfjsCore.multiRnnCellMod.LSTMCellFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeoftfOps extends StObject {
  
  val OP_SCOPE_SUFFIX: /* "__op" */ String = js.native
  
  val abs: Typeofabs = js.native
  
  val acos: Typeofacos = js.native
  
  val acosh: Typeofacosh = js.native
  
  val add: Typeofadd = js.native
  
  val addN: TypeofaddN = js.native
  
  val all: Typeofall = js.native
  
  val any: Typeofany = js.native
  
  val argMax: TypeofargMax = js.native
  
  val argMin: TypeofargMin = js.native
  
  val asin: Typeofasin = js.native
  
  val asinh: Typeofasinh = js.native
  
  val atan: Typeofatan = js.native
  
  val atan2: Typeofatan2 = js.native
  
  val atanh: Typeofatanh = js.native
  
  val avgPool: TypeofavgPool = js.native
  
  val avgPool3d: TypeofavgPool3d = js.native
  
  def basicLSTMCell(
    forgetBias: Scalar | TensorLike,
    lstmKernel: Tensor2D | TensorLike,
    lstmBias: Tensor1D | TensorLike,
    data: Tensor2D | TensorLike,
    c: Tensor2D | TensorLike,
    h: Tensor2D | TensorLike
  ): js.Tuple2[Tensor2D, Tensor2D] = js.native
  
  val batchNorm: TypeofbatchNorm = js.native
  
  def batchNorm2d(
    x: Tensor2D | TensorLike,
    mean: Tensor2D | Tensor1D | TensorLike,
    variance: Tensor2D | Tensor1D | TensorLike,
    offset: js.UndefOr[Tensor2D | Tensor1D | TensorLike],
    scale: js.UndefOr[Tensor2D | Tensor1D | TensorLike],
    varianceEpsilon: js.UndefOr[Double]
  ): Tensor2D = js.native
  
  def batchNorm3d(
    x: Tensor3D | TensorLike,
    mean: Tensor3D | Tensor1D | TensorLike,
    variance: Tensor3D | Tensor1D | TensorLike,
    offset: js.UndefOr[Tensor3D | Tensor1D | TensorLike],
    scale: js.UndefOr[Tensor3D | Tensor1D | TensorLike],
    varianceEpsilon: js.UndefOr[Double]
  ): Tensor3D = js.native
  
  def batchNorm4d(
    x: Tensor4D | TensorLike,
    mean: Tensor4D | Tensor1D | TensorLike,
    variance: Tensor4D | Tensor1D | TensorLike,
    offset: js.UndefOr[Tensor4D | Tensor1D | TensorLike],
    scale: js.UndefOr[Tensor4D | Tensor1D | TensorLike],
    varianceEpsilon: js.UndefOr[Double]
  ): Tensor4D = js.native
  
  val batchToSpaceND: TypeofbatchToSpaceND = js.native
  
  val bincount: Typeofbincount = js.native
  
  def booleanMaskAsync(
    tensor: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): js.Promise[typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]] = js.native
  def booleanMaskAsync(
    tensor: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    axis: Double
  ): js.Promise[typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]] = js.native
  def booleanMaskAsync(tensor: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], mask: TensorLike): js.Promise[typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]] = js.native
  def booleanMaskAsync(tensor: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], mask: TensorLike, axis: Double): js.Promise[typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]] = js.native
  def booleanMaskAsync(tensor: TensorLike, mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): js.Promise[typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]] = js.native
  def booleanMaskAsync(tensor: TensorLike, mask: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], axis: Double): js.Promise[typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]] = js.native
  def booleanMaskAsync(tensor: TensorLike, mask: TensorLike): js.Promise[typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]] = js.native
  def booleanMaskAsync(tensor: TensorLike, mask: TensorLike, axis: Double): js.Promise[typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]] = js.native
  
  val broadcastArgs: TypeofbroadcastArgs = js.native
  
  val broadcastTo: TypeofbroadcastTo = js.native
  
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): TensorBuffer[R, float32] = js.native
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    values: js.Array[String]
  ): TensorBuffer[R, typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.string] = js.native
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    values: js.typedarray.Float32Array
  ): TensorBuffer[R, float32] = js.native
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    values: js.typedarray.Int32Array
  ): TensorBuffer[R, int32] = js.native
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    values: js.typedarray.Uint8Array
  ): TensorBuffer[R, bool] = js.native
  @JSName("buffer")
  def buffer_bool[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool
  ): TensorBuffer[R, bool] = js.native
  @JSName("buffer")
  def buffer_bool[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool,
    values: js.typedarray.Uint8Array
  ): TensorBuffer[R, bool] = js.native
  @JSName("buffer")
  def buffer_complex64[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64
  ): TensorBuffer[R, complex64] = js.native
  @JSName("buffer")
  def buffer_complex64[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64,
    values: js.typedarray.Float32Array
  ): TensorBuffer[R, complex64] = js.native
  @JSName("buffer")
  def buffer_float32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: float32
  ): TensorBuffer[R, float32] = js.native
  @JSName("buffer")
  def buffer_float32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: float32,
    values: js.typedarray.Float32Array
  ): TensorBuffer[R, float32] = js.native
  @JSName("buffer")
  def buffer_int32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32
  ): TensorBuffer[R, int32] = js.native
  @JSName("buffer")
  def buffer_int32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32,
    values: js.typedarray.Int32Array
  ): TensorBuffer[R, int32] = js.native
  @JSName("buffer")
  def buffer_string[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.string
  ): TensorBuffer[R, typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.string] = js.native
  @JSName("buffer")
  def buffer_string[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.string,
    values: js.Array[String]
  ): TensorBuffer[R, typings.tensorflowTfjsConverter.tensorflowTfjsConverterStrings.string] = js.native
  
  val cast: Typeofcast = js.native
  
  val ceil: Typeofceil = js.native
  
  val clipByValue: TypeofclipByValue = js.native
  
  @JSName("clone")
  val clone_FTypeoftfOps: Typeofclone = js.native
  
  val complex: Typeofcomplex = js.native
  
  val concat: Typeofconcat = js.native
  
  def concat1d(tensors: js.Array[Tensor1D | TensorLike]): Tensor1D = js.native
  
  def concat2d(tensors: js.Array[Tensor2D | TensorLike], axis: Double): Tensor2D = js.native
  
  def concat3d(tensors: js.Array[Tensor3D | TensorLike], axis: Double): Tensor3D = js.native
  
  def concat4d(tensors: js.Array[Tensor4D | TensorLike], axis: Double): Tensor4D = js.native
  
  val conv1d: Typeofconv1d = js.native
  
  val conv2d: Typeofconv2dApply = js.native
  
  val conv2dTranspose: Typeofconv2dTranspose = js.native
  
  val conv3d: Typeofconv3d = js.native
  
  val conv3dTranspose: Typeofconv3dTranspose = js.native
  
  val cos: Typeofcos = js.native
  
  val cosh: Typeofcosh = js.native
  
  def cosineWindow(windowLength: Double, a: Double, b: Double): Tensor1D = js.native
  
  val cumprod: Typeofcumprod = js.native
  
  val cumsum: Typeofcumsum = js.native
  
  val denseBincount: TypeofdenseBincount = js.native
  
  def depthToSpace(x: Tensor4D, blockSize: Double): Tensor4D = js.native
  def depthToSpace(x: Tensor4D, blockSize: Double, dataFormat: NHWC | NCHW): Tensor4D = js.native
  def depthToSpace(x: TensorLike4D, blockSize: Double): Tensor4D = js.native
  def depthToSpace(x: TensorLike4D, blockSize: Double, dataFormat: NHWC | NCHW): Tensor4D = js.native
  
  val depthwiseConv2d: TypeofdepthwiseConv2dApply = js.native
  
  def diag(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  val dilation2d: Typeofdilation2d = js.native
  
  val div: Typeofdiv = js.native
  
  val divNoNan: TypeofdivNoNan = js.native
  
  def dot(
    t1: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    t2: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def dot(t1: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], t2: TensorLike): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def dot(t1: TensorLike, t2: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def dot(t1: TensorLike, t2: TensorLike): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  def dropout(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], rate: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def dropout(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    rate: Double,
    noiseShape: js.Array[Double]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def dropout(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    rate: Double,
    noiseShape: js.Array[Double],
    seed: String
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def dropout(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    rate: Double,
    noiseShape: js.Array[Double],
    seed: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def dropout(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    rate: Double,
    noiseShape: Unit,
    seed: String
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def dropout(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    rate: Double,
    noiseShape: Unit,
    seed: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def dropout(x: TensorLike, rate: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def dropout(x: TensorLike, rate: Double, noiseShape: js.Array[Double]): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def dropout(x: TensorLike, rate: Double, noiseShape: js.Array[Double], seed: String): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def dropout(x: TensorLike, rate: Double, noiseShape: js.Array[Double], seed: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def dropout(x: TensorLike, rate: Double, noiseShape: Unit, seed: String): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def dropout(x: TensorLike, rate: Double, noiseShape: Unit, seed: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  def einsum(equation: String, tensors: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]*): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  val elu: Typeofelu = js.native
  
  def enclosingPowerOfTwo(value: Double): Double = js.native
  
  val equal: Typeofequal = js.native
  
  val erf: Typeoferf = js.native
  
  def euclideanNorm(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def euclideanNorm(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], axis: js.Array[Double]): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def euclideanNorm(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    axis: js.Array[Double],
    keepDims: Boolean
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def euclideanNorm(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], axis: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def euclideanNorm(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], axis: Double, keepDims: Boolean): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def euclideanNorm(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], axis: Unit, keepDims: Boolean): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def euclideanNorm(x: TensorLike): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def euclideanNorm(x: TensorLike, axis: js.Array[Double]): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def euclideanNorm(x: TensorLike, axis: js.Array[Double], keepDims: Boolean): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def euclideanNorm(x: TensorLike, axis: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def euclideanNorm(x: TensorLike, axis: Double, keepDims: Boolean): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def euclideanNorm(x: TensorLike, axis: Unit, keepDims: Boolean): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  val exp: Typeofexp = js.native
  
  val expandDims: TypeofexpandDims = js.native
  
  val expm1: Typeofexpm1 = js.native
  
  def eye(numRows: Double): Tensor2D = js.native
  def eye(numRows: Double, numColumns: Double): Tensor2D = js.native
  def eye(numRows: Double, numColumns: Double, batchShape: js.Array[Double]): Tensor2D = js.native
  def eye(numRows: Double, numColumns: Double, batchShape: js.Array[Double], dtype: DataType): Tensor2D = js.native
  def eye(numRows: Double, numColumns: Double, batchShape: js.Tuple2[Double, Double]): Tensor2D = js.native
  def eye(numRows: Double, numColumns: Double, batchShape: js.Tuple2[Double, Double], dtype: DataType): Tensor2D = js.native
  def eye(numRows: Double, numColumns: Double, batchShape: js.Tuple3[Double, Double, Double]): Tensor2D = js.native
  def eye(
    numRows: Double,
    numColumns: Double,
    batchShape: js.Tuple3[Double, Double, Double],
    dtype: DataType
  ): Tensor2D = js.native
  def eye(numRows: Double, numColumns: Double, batchShape: js.Tuple4[Double, Double, Double, Double]): Tensor2D = js.native
  def eye(
    numRows: Double,
    numColumns: Double,
    batchShape: js.Tuple4[Double, Double, Double, Double],
    dtype: DataType
  ): Tensor2D = js.native
  def eye(numRows: Double, numColumns: Double, batchShape: Unit, dtype: DataType): Tensor2D = js.native
  def eye(numRows: Double, numColumns: Unit, batchShape: js.Array[Double]): Tensor2D = js.native
  def eye(numRows: Double, numColumns: Unit, batchShape: js.Array[Double], dtype: DataType): Tensor2D = js.native
  def eye(numRows: Double, numColumns: Unit, batchShape: js.Tuple2[Double, Double]): Tensor2D = js.native
  def eye(numRows: Double, numColumns: Unit, batchShape: js.Tuple2[Double, Double], dtype: DataType): Tensor2D = js.native
  def eye(numRows: Double, numColumns: Unit, batchShape: js.Tuple3[Double, Double, Double]): Tensor2D = js.native
  def eye(numRows: Double, numColumns: Unit, batchShape: js.Tuple3[Double, Double, Double], dtype: DataType): Tensor2D = js.native
  def eye(numRows: Double, numColumns: Unit, batchShape: js.Tuple4[Double, Double, Double, Double]): Tensor2D = js.native
  def eye(
    numRows: Double,
    numColumns: Unit,
    batchShape: js.Tuple4[Double, Double, Double, Double],
    dtype: DataType
  ): Tensor2D = js.native
  def eye(numRows: Double, numColumns: Unit, batchShape: Unit, dtype: DataType): Tensor2D = js.native
  
  def fft(input: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: String
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: String,
    dtype: DataType
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
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
  def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: Double,
    dtype: DataType
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  
  val floor: Typeoffloor = js.native
  
  val floorDiv: TypeoffloorDiv = js.native
  
  val fused: Typeoffused = js.native
  
  val gather: Typeofgather = js.native
  
  def gatherND(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    indices: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def gatherND(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], indices: TensorLike): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def gatherND(x: TensorLike, indices: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def gatherND(x: TensorLike, indices: TensorLike): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  val greater: Typeofgreater = js.native
  
  val greaterEqual: TypeofgreaterEqual = js.native
  
  def ifft(input: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  val imag: Typeofimag = js.native
  
  val image: Typeofimage = js.native
  
  val inTopKAsync: TypeofinTopKAsync = js.native
  
  def irfft(input: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  val isFinite: TypeofisFinite = js.native
  
  val isInf: TypeofisInf = js.native
  
  val isNaN: TypeofisNaN = js.native
  
  val leakyRelu: TypeofleakyRelu = js.native
  
  val less: Typeofless = js.native
  
  val lessEqual: TypeoflessEqual = js.native
  
  val linalg: Typeoflinalg = js.native
  
  def linspace(start: Double, stop: Double, num: Double): Tensor1D = js.native
  
  val localResponseNormalization: TypeoflocalResponseNormal = js.native
  
  val log: Typeoflog = js.native
  
  val log1p: Typeoflog1p = js.native
  
  val logSigmoid: TypeoflogSigmoid = js.native
  
  val logSoftmax: TypeoflogSoftmax = js.native
  
  val logSumExp: TypeoflogSumExp = js.native
  
  val logicalAnd: TypeoflogicalAnd = js.native
  
  val logicalNot: TypeoflogicalNot = js.native
  
  val logicalOr: TypeoflogicalOr = js.native
  
  val logicalXor: TypeoflogicalXor = js.native
  
  val losses: Typeoflosses = js.native
  
  def lowerBound(
    sortedSequence: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    values: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def lowerBound(sortedSequence: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], values: TensorLike): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def lowerBound(sortedSequence: TensorLike, values: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def lowerBound(sortedSequence: TensorLike, values: TensorLike): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  val matMul: TypeofmatMul = js.native
  
  val max: Typeofmax = js.native
  
  val maxPool: TypeofmaxPool = js.native
  
  val maxPool3d: TypeofmaxPool3d = js.native
  
  val maxPoolWithArgmax: TypeofmaxPoolWithArgmax = js.native
  
  val maximum: Typeofmaximum = js.native
  
  val mean: Typeofmean = js.native
  
  def meshgrid[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](): js.Array[T] = js.native
  def meshgrid[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T | TensorLike): js.Array[T] = js.native
  def meshgrid[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T | TensorLike, y: T | TensorLike): js.Array[T] = js.native
  def meshgrid[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T | TensorLike, y: T | TensorLike, hasIndexing: Indexing): js.Array[T] = js.native
  def meshgrid[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T | TensorLike, y: Unit, hasIndexing: Indexing): js.Array[T] = js.native
  def meshgrid[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: Unit, y: T | TensorLike): js.Array[T] = js.native
  def meshgrid[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: Unit, y: T | TensorLike, hasIndexing: Indexing): js.Array[T] = js.native
  def meshgrid[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: Unit, y: Unit, hasIndexing: Indexing): js.Array[T] = js.native
  
  val min: Typeofmin = js.native
  
  val minimum: Typeofminimum = js.native
  
  val mirrorPad: TypeofmirrorPad = js.native
  
  val mod: Typeofmod = js.native
  
  def moments(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): Mean = js.native
  def moments(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], axis: js.Array[Double]): Mean = js.native
  def moments(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    axis: js.Array[Double],
    keepDims: Boolean
  ): Mean = js.native
  def moments(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], axis: Double): Mean = js.native
  def moments(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], axis: Double, keepDims: Boolean): Mean = js.native
  def moments(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], axis: Unit, keepDims: Boolean): Mean = js.native
  def moments(x: TensorLike): Mean = js.native
  def moments(x: TensorLike, axis: js.Array[Double]): Mean = js.native
  def moments(x: TensorLike, axis: js.Array[Double], keepDims: Boolean): Mean = js.native
  def moments(x: TensorLike, axis: Double): Mean = js.native
  def moments(x: TensorLike, axis: Double, keepDims: Boolean): Mean = js.native
  def moments(x: TensorLike, axis: Unit, keepDims: Boolean): Mean = js.native
  
  val movingAverage: TypeofmovingAverage = js.native
  
  val mul: Typeofmul = js.native
  
  def multiRNNCell(
    lstmCells: js.Array[LSTMCellFunc],
    data: Tensor2D,
    c: js.Array[Tensor2D | TensorLike],
    h: js.Array[Tensor2D | TensorLike]
  ): js.Tuple2[js.Array[Tensor2D], js.Array[Tensor2D]] = js.native
  def multiRNNCell(
    lstmCells: js.Array[LSTMCellFunc],
    data: TensorLike,
    c: js.Array[Tensor2D | TensorLike],
    h: js.Array[Tensor2D | TensorLike]
  ): js.Tuple2[js.Array[Tensor2D], js.Array[Tensor2D]] = js.native
  
  def multinomial(logits: Tensor1D | Tensor2D, numSamples: Double): Tensor1D | Tensor2D = js.native
  def multinomial(logits: Tensor1D | Tensor2D, numSamples: Double, seed: Double): Tensor1D | Tensor2D = js.native
  def multinomial(logits: Tensor1D | Tensor2D, numSamples: Double, seed: Double, normalized: Boolean): Tensor1D | Tensor2D = js.native
  def multinomial(logits: Tensor1D | Tensor2D, numSamples: Double, seed: Unit, normalized: Boolean): Tensor1D | Tensor2D = js.native
  def multinomial(logits: TensorLike, numSamples: Double): Tensor1D | Tensor2D = js.native
  def multinomial(logits: TensorLike, numSamples: Double, seed: Double): Tensor1D | Tensor2D = js.native
  def multinomial(logits: TensorLike, numSamples: Double, seed: Double, normalized: Boolean): Tensor1D | Tensor2D = js.native
  def multinomial(logits: TensorLike, numSamples: Double, seed: Unit, normalized: Boolean): Tensor1D | Tensor2D = js.native
  
  val neg: Typeofneg = js.native
  
  def norm(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], ord: euclidean | fro): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    ord: euclidean | fro,
    axis: js.Array[Double]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    ord: euclidean | fro,
    axis: js.Array[Double],
    keepDims: Boolean
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], ord: euclidean | fro, axis: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    ord: euclidean | fro,
    axis: Double,
    keepDims: Boolean
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    ord: euclidean | fro,
    axis: Unit,
    keepDims: Boolean
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], ord: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], ord: Double, axis: js.Array[Double]): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    ord: Double,
    axis: js.Array[Double],
    keepDims: Boolean
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], ord: Double, axis: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    ord: Double,
    axis: Double,
    keepDims: Boolean
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    ord: Double,
    axis: Unit,
    keepDims: Boolean
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], ord: Unit, axis: js.Array[Double]): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    ord: Unit,
    axis: js.Array[Double],
    keepDims: Boolean
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], ord: Unit, axis: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    ord: Unit,
    axis: Double,
    keepDims: Boolean
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], ord: Unit, axis: Unit, keepDims: Boolean): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: TensorLike): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: TensorLike, ord: euclidean | fro): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: TensorLike, ord: euclidean | fro, axis: js.Array[Double]): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: TensorLike, ord: euclidean | fro, axis: js.Array[Double], keepDims: Boolean): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: TensorLike, ord: euclidean | fro, axis: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: TensorLike, ord: euclidean | fro, axis: Double, keepDims: Boolean): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: TensorLike, ord: euclidean | fro, axis: Unit, keepDims: Boolean): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: TensorLike, ord: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: TensorLike, ord: Double, axis: js.Array[Double]): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: TensorLike, ord: Double, axis: js.Array[Double], keepDims: Boolean): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: TensorLike, ord: Double, axis: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: TensorLike, ord: Double, axis: Double, keepDims: Boolean): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: TensorLike, ord: Double, axis: Unit, keepDims: Boolean): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: TensorLike, ord: Unit, axis: js.Array[Double]): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: TensorLike, ord: Unit, axis: js.Array[Double], keepDims: Boolean): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: TensorLike, ord: Unit, axis: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: TensorLike, ord: Unit, axis: Double, keepDims: Boolean): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def norm(x: TensorLike, ord: Unit, axis: Unit, keepDims: Boolean): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  val notEqual: TypeofnotEqual = js.native
  
  def oneHot(indices: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], depth: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def oneHot(indices: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], depth: Double, onValue: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def oneHot(
    indices: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    depth: Double,
    onValue: Double,
    offValue: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def oneHot(
    indices: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    depth: Double,
    onValue: Double,
    offValue: Double,
    dtype: DataType
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def oneHot(
    indices: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    depth: Double,
    onValue: Double,
    offValue: Unit,
    dtype: DataType
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def oneHot(
    indices: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    depth: Double,
    onValue: Unit,
    offValue: Double
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def oneHot(
    indices: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    depth: Double,
    onValue: Unit,
    offValue: Double,
    dtype: DataType
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def oneHot(
    indices: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    depth: Double,
    onValue: Unit,
    offValue: Unit,
    dtype: DataType
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def oneHot(indices: TensorLike, depth: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def oneHot(indices: TensorLike, depth: Double, onValue: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def oneHot(indices: TensorLike, depth: Double, onValue: Double, offValue: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def oneHot(indices: TensorLike, depth: Double, onValue: Double, offValue: Double, dtype: DataType): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def oneHot(indices: TensorLike, depth: Double, onValue: Double, offValue: Unit, dtype: DataType): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def oneHot(indices: TensorLike, depth: Double, onValue: Unit, offValue: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def oneHot(indices: TensorLike, depth: Double, onValue: Unit, offValue: Double, dtype: DataType): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def oneHot(indices: TensorLike, depth: Double, onValue: Unit, offValue: Unit, dtype: DataType): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  def ones[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def ones[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  
  val onesLike: TypeofonesLike = js.native
  
  def op[T /* <: js.Function */](f: StringDictionary[T]): T = js.native
  
  def outerProduct(v1: Tensor1D, v2: Tensor1D): Tensor2D = js.native
  def outerProduct(v1: Tensor1D, v2: TensorLike): Tensor2D = js.native
  def outerProduct(v1: TensorLike, v2: Tensor1D): Tensor2D = js.native
  def outerProduct(v1: TensorLike, v2: TensorLike): Tensor2D = js.native
  
  val pad: Typeofpad = js.native
  
  def pad1d(x: Tensor1D, paddings: js.Tuple2[Double, Double]): Tensor1D = js.native
  def pad1d(x: Tensor1D, paddings: js.Tuple2[Double, Double], constantValue: Double): Tensor1D = js.native
  def pad1d(x: TensorLike, paddings: js.Tuple2[Double, Double]): Tensor1D = js.native
  def pad1d(x: TensorLike, paddings: js.Tuple2[Double, Double], constantValue: Double): Tensor1D = js.native
  
  def pad2d(x: Tensor2D, paddings: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Tensor2D = js.native
  def pad2d(
    x: Tensor2D,
    paddings: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
    constantValue: Double
  ): Tensor2D = js.native
  def pad2d(x: TensorLike, paddings: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Tensor2D = js.native
  def pad2d(
    x: TensorLike,
    paddings: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
    constantValue: Double
  ): Tensor2D = js.native
  
  def pad3d(
    x: Tensor3D,
    paddings: js.Tuple3[js.Tuple2[Double, Double], js.Tuple2[Double, Double], js.Tuple2[Double, Double]]
  ): Tensor3D = js.native
  def pad3d(
    x: Tensor3D,
    paddings: js.Tuple3[js.Tuple2[Double, Double], js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
    constantValue: Double
  ): Tensor3D = js.native
  def pad3d(
    x: TensorLike,
    paddings: js.Tuple3[js.Tuple2[Double, Double], js.Tuple2[Double, Double], js.Tuple2[Double, Double]]
  ): Tensor3D = js.native
  def pad3d(
    x: TensorLike,
    paddings: js.Tuple3[js.Tuple2[Double, Double], js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
    constantValue: Double
  ): Tensor3D = js.native
  
  def pad4d(
    x: Tensor4D,
    paddings: js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ]
  ): Tensor4D = js.native
  def pad4d(
    x: Tensor4D,
    paddings: js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ],
    constantValue: Double
  ): Tensor4D = js.native
  def pad4d(
    x: TensorLike,
    paddings: js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ]
  ): Tensor4D = js.native
  def pad4d(
    x: TensorLike,
    paddings: js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ],
    constantValue: Double
  ): Tensor4D = js.native
  
  val pool: Typeofpool = js.native
  
  val pow: Typeofpow = js.native
  
  val prelu: Typeofprelu = js.native
  
  def print[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T): Unit = js.native
  def print[T /* <: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] */](x: T, verbose: Boolean): Unit = js.native
  
  val prod: Typeofprod = js.native
  
  def raggedTensorToTensor(
    shape: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    values: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    defaultValue: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    rowPartitionTensors: js.Array[typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]],
    rowPartitionTypes: js.Array[String]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def raggedTensorToTensor(
    shape: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    values: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    defaultValue: TensorLike,
    rowPartitionTensors: js.Array[typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]],
    rowPartitionTypes: js.Array[String]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def raggedTensorToTensor(
    shape: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    values: TensorLike,
    defaultValue: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    rowPartitionTensors: js.Array[typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]],
    rowPartitionTypes: js.Array[String]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def raggedTensorToTensor(
    shape: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    values: TensorLike,
    defaultValue: TensorLike,
    rowPartitionTensors: js.Array[typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]],
    rowPartitionTypes: js.Array[String]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def raggedTensorToTensor(
    shape: TensorLike,
    values: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    defaultValue: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    rowPartitionTensors: js.Array[typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]],
    rowPartitionTypes: js.Array[String]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def raggedTensorToTensor(
    shape: TensorLike,
    values: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    defaultValue: TensorLike,
    rowPartitionTensors: js.Array[typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]],
    rowPartitionTypes: js.Array[String]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def raggedTensorToTensor(
    shape: TensorLike,
    values: TensorLike,
    defaultValue: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    rowPartitionTensors: js.Array[typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]],
    rowPartitionTypes: js.Array[String]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def raggedTensorToTensor(
    shape: TensorLike,
    values: TensorLike,
    defaultValue: TensorLike,
    rowPartitionTensors: js.Array[typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]],
    rowPartitionTypes: js.Array[String]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  val rand: Typeofrand = js.native
  
  val randomGamma: TypeofrandomGamma = js.native
  
  val randomNormal: TypeofrandomNormal = js.native
  
  val randomStandardNormal: TypeofrandomStandardNorma = js.native
  
  val randomUniform: TypeofrandomUniform = js.native
  
  def range(start: Double, stop: Double): Tensor1D = js.native
  def range(start: Double, stop: Double, step: Double): Tensor1D = js.native
  def range(start: Double, stop: Double, step: Double, dtype: float32 | int32): Tensor1D = js.native
  def range(start: Double, stop: Double, step: Unit, dtype: float32 | int32): Tensor1D = js.native
  
  val real: Typeofreal = js.native
  
  val reciprocal: Typeofreciprocal = js.native
  
  val relu: Typeofrelu = js.native
  
  val relu6: Typeofrelu6 = js.native
  
  val reshape: Typeofreshape = js.native
  
  val reverse: Typeofreverse = js.native
  
  def reverse1d(x: Tensor1D): Tensor1D = js.native
  def reverse1d(x: TensorLike): Tensor1D = js.native
  
  def reverse2d(x: Tensor2D): Tensor2D = js.native
  def reverse2d(x: Tensor2D, axis: js.Array[Double]): Tensor2D = js.native
  def reverse2d(x: Tensor2D, axis: Double): Tensor2D = js.native
  def reverse2d(x: TensorLike): Tensor2D = js.native
  def reverse2d(x: TensorLike, axis: js.Array[Double]): Tensor2D = js.native
  def reverse2d(x: TensorLike, axis: Double): Tensor2D = js.native
  
  def reverse3d(x: Tensor3D): Tensor3D = js.native
  def reverse3d(x: Tensor3D, axis: js.Array[Double]): Tensor3D = js.native
  def reverse3d(x: Tensor3D, axis: Double): Tensor3D = js.native
  def reverse3d(x: TensorLike): Tensor3D = js.native
  def reverse3d(x: TensorLike, axis: js.Array[Double]): Tensor3D = js.native
  def reverse3d(x: TensorLike, axis: Double): Tensor3D = js.native
  
  def reverse4d(x: Tensor4D): Tensor4D = js.native
  def reverse4d(x: Tensor4D, axis: js.Array[Double]): Tensor4D = js.native
  def reverse4d(x: Tensor4D, axis: Double): Tensor4D = js.native
  def reverse4d(x: TensorLike): Tensor4D = js.native
  def reverse4d(x: TensorLike, axis: js.Array[Double]): Tensor4D = js.native
  def reverse4d(x: TensorLike, axis: Double): Tensor4D = js.native
  
  def rfft(input: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def rfft(input: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], fftLength: Double): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  val round: Typeofround = js.native
  
  val rsqrt: Typeofrsqrt = js.native
  
  def scalar(value: String): Scalar = js.native
  def scalar(value: String, dtype: DataType): Scalar = js.native
  def scalar(value: js.typedarray.Uint8Array): Scalar = js.native
  def scalar(value: js.typedarray.Uint8Array, dtype: DataType): Scalar = js.native
  def scalar(value: Boolean): Scalar = js.native
  def scalar(value: Boolean, dtype: DataType): Scalar = js.native
  def scalar(value: Double): Scalar = js.native
  def scalar(value: Double, dtype: DataType): Scalar = js.native
  
  val scatterND: TypeofscatterND = js.native
  
  def searchSorted(
    sortedSequence: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    values: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def searchSorted(
    sortedSequence: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    values: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    side: left | right
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def searchSorted(sortedSequence: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], values: TensorLike): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def searchSorted(
    sortedSequence: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    values: TensorLike,
    side: left | right
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def searchSorted(sortedSequence: TensorLike, values: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def searchSorted(
    sortedSequence: TensorLike,
    values: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    side: left | right
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def searchSorted(sortedSequence: TensorLike, values: TensorLike): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def searchSorted(sortedSequence: TensorLike, values: TensorLike, side: left | right): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  val selu: Typeofselu = js.native
  
  val separableConv2d: TypeofseparableConv2d = js.native
  
  def setdiff1dAsync(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    y: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): js.Promise[
    js.Tuple2[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], 
      typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ]
  ] = js.native
  def setdiff1dAsync(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], y: TensorLike): js.Promise[
    js.Tuple2[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], 
      typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ]
  ] = js.native
  def setdiff1dAsync(x: TensorLike, y: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): js.Promise[
    js.Tuple2[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], 
      typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ]
  ] = js.native
  def setdiff1dAsync(x: TensorLike, y: TensorLike): js.Promise[
    js.Tuple2[
      typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], 
      typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
    ]
  ] = js.native
  
  val sigmoid: Typeofsigmoid = js.native
  
  val sign: Typeofsign = js.native
  
  val signal: Typeofsignal = js.native
  
  val sin: Typeofsin = js.native
  
  val sinh: Typeofsinh = js.native
  
  val slice: Typeofslice = js.native
  
  def slice1d(x: Tensor1D, begin: Double, size: Double): Tensor1D = js.native
  def slice1d(x: TensorLike, begin: Double, size: Double): Tensor1D = js.native
  
  def slice2d(x: Tensor2D, begin: js.Tuple2[Double, Double], size: js.Tuple2[Double, Double]): Tensor2D = js.native
  def slice2d(x: TensorLike, begin: js.Tuple2[Double, Double], size: js.Tuple2[Double, Double]): Tensor2D = js.native
  
  def slice3d(x: Tensor3D, begin: js.Tuple3[Double, Double, Double], size: js.Tuple3[Double, Double, Double]): Tensor3D = js.native
  def slice3d(x: TensorLike, begin: js.Tuple3[Double, Double, Double], size: js.Tuple3[Double, Double, Double]): Tensor3D = js.native
  
  def slice4d(
    x: Tensor4D,
    begin: js.Tuple4[Double, Double, Double, Double],
    size: js.Tuple4[Double, Double, Double, Double]
  ): Tensor4D = js.native
  def slice4d(
    x: TensorLike,
    begin: js.Tuple4[Double, Double, Double, Double],
    size: js.Tuple4[Double, Double, Double, Double]
  ): Tensor4D = js.native
  
  val softmax: Typeofsoftmax = js.native
  
  val softplus: Typeofsoftplus = js.native
  
  val spaceToBatchND: TypeofspaceToBatchND = js.native
  
  val sparse: Typeofsparse = js.native
  
  val sparseToDense: TypeofsparseToDense = js.native
  
  val spectral: Typeofspectral = js.native
  
  val split: Typeofsplit = js.native
  
  val sqrt: Typeofsqrt = js.native
  
  val square: Typeofsquare = js.native
  
  val squaredDifference: TypeofsquaredDifference = js.native
  
  val squeeze: Typeofsqueeze = js.native
  
  val stack: Typeofstack = js.native
  
  val step: Typeofstep = js.native
  
  def stridedSlice(
    x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] | TensorLike,
    begin: js.Array[Double],
    end: js.Array[Double],
    strides: js.UndefOr[js.Array[Double]],
    beginMask: js.UndefOr[Double],
    endMask: js.UndefOr[Double],
    ellipsisMask: js.UndefOr[Double],
    newAxisMask: js.UndefOr[Double],
    shrinkAxisMask: js.UndefOr[Double]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  val string: Typeofstring = js.native
  
  val sub: Typeofsub = js.native
  
  val sum: Typeofsum = js.native
  
  val tan: Typeoftan = js.native
  
  val tanh: Typeoftanh = js.native
  
  def tensor[R /* <: Rank */](values: TensorLike): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def tensor[R /* <: Rank */](
    values: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def tensor[R /* <: Rank */](
    values: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def tensor[R /* <: Rank */](values: TensorLike, shape: Unit, dtype: DataType): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  
  def tensor1d(values: TensorLike1D): Tensor1D = js.native
  def tensor1d(values: TensorLike1D, dtype: DataType): Tensor1D = js.native
  
  def tensor2d(values: TensorLike2D): Tensor2D = js.native
  def tensor2d(values: TensorLike2D, shape: js.Tuple2[Double, Double]): Tensor2D = js.native
  def tensor2d(values: TensorLike2D, shape: js.Tuple2[Double, Double], dtype: DataType): Tensor2D = js.native
  def tensor2d(values: TensorLike2D, shape: Unit, dtype: DataType): Tensor2D = js.native
  
  def tensor3d(values: TensorLike3D): Tensor3D = js.native
  def tensor3d(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double]): Tensor3D = js.native
  def tensor3d(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double], dtype: DataType): Tensor3D = js.native
  def tensor3d(values: TensorLike3D, shape: Unit, dtype: DataType): Tensor3D = js.native
  
  def tensor4d(values: TensorLike4D): Tensor4D = js.native
  def tensor4d(values: TensorLike4D, shape: js.Tuple4[Double, Double, Double, Double]): Tensor4D = js.native
  def tensor4d(values: TensorLike4D, shape: js.Tuple4[Double, Double, Double, Double], dtype: DataType): Tensor4D = js.native
  def tensor4d(values: TensorLike4D, shape: Unit, dtype: DataType): Tensor4D = js.native
  
  def tensor5d(values: TensorLike5D): Tensor5D = js.native
  def tensor5d(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double]): Tensor5D = js.native
  def tensor5d(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double], dtype: DataType): Tensor5D = js.native
  def tensor5d(values: TensorLike5D, shape: Unit, dtype: DataType): Tensor5D = js.native
  
  def tensor6d(values: TensorLike6D): Tensor6D = js.native
  def tensor6d(values: TensorLike6D, shape: js.Tuple6[Double, Double, Double, Double, Double, Double]): Tensor6D = js.native
  def tensor6d(
    values: TensorLike6D,
    shape: js.Tuple6[Double, Double, Double, Double, Double, Double],
    dtype: DataType
  ): Tensor6D = js.native
  def tensor6d(values: TensorLike6D, shape: Unit, dtype: DataType): Tensor6D = js.native
  
  val tile: Typeoftile = js.native
  
  val topk: Typeoftopk = js.native
  
  val transpose: Typeoftranspose = js.native
  
  val truncatedNormal: TypeoftruncatedNormal = js.native
  
  val unique: Typeofunique = js.native
  
  val unsortedSegmentSum: TypeofunsortedSegmentSum = js.native
  
  def unstack(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): js.Array[typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]] = js.native
  def unstack(x: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], axis: Double): js.Array[typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]] = js.native
  def unstack(x: TensorLike): js.Array[typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]] = js.native
  def unstack(x: TensorLike, axis: Double): js.Array[typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]] = js.native
  
  def upperBound(
    sortedSequence: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank],
    values: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def upperBound(sortedSequence: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank], values: TensorLike): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def upperBound(sortedSequence: TensorLike, values: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  def upperBound(sortedSequence: TensorLike, values: TensorLike): typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank] = js.native
  
  def variable[R /* <: Rank */](initialValue: typings.tensorflowTfjsCore.distTensorMod.Tensor[R]): Variable[R] = js.native
  def variable[R /* <: Rank */](initialValue: typings.tensorflowTfjsCore.distTensorMod.Tensor[R], trainable: Boolean): Variable[R] = js.native
  def variable[R /* <: Rank */](initialValue: typings.tensorflowTfjsCore.distTensorMod.Tensor[R], trainable: Boolean, name: String): Variable[R] = js.native
  def variable[R /* <: Rank */](
    initialValue: typings.tensorflowTfjsCore.distTensorMod.Tensor[R],
    trainable: Boolean,
    name: String,
    dtype: DataType
  ): Variable[R] = js.native
  def variable[R /* <: Rank */](
    initialValue: typings.tensorflowTfjsCore.distTensorMod.Tensor[R],
    trainable: Boolean,
    name: Unit,
    dtype: DataType
  ): Variable[R] = js.native
  def variable[R /* <: Rank */](initialValue: typings.tensorflowTfjsCore.distTensorMod.Tensor[R], trainable: Unit, name: String): Variable[R] = js.native
  def variable[R /* <: Rank */](
    initialValue: typings.tensorflowTfjsCore.distTensorMod.Tensor[R],
    trainable: Unit,
    name: String,
    dtype: DataType
  ): Variable[R] = js.native
  def variable[R /* <: Rank */](
    initialValue: typings.tensorflowTfjsCore.distTensorMod.Tensor[R],
    trainable: Unit,
    name: Unit,
    dtype: DataType
  ): Variable[R] = js.native
  
  val where: Typeofwhere = js.native
  
  def whereAsync(condition: typings.tensorflowTfjsCore.distTensorMod.Tensor[Rank]): js.Promise[Tensor2D] = js.native
  def whereAsync(condition: TensorLike): js.Promise[Tensor2D] = js.native
  
  def zeros[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  def zeros[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): typings.tensorflowTfjsCore.distTensorMod.Tensor[R] = js.native
  
  val zerosLike: TypeofzerosLike = js.native
}
