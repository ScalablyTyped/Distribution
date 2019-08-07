package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod.OpExecutor
import typings.atTensorflowTfjsDashCore.Anon_Grad
import typings.atTensorflowTfjsDashCore.Anon_GradsValue
import typings.atTensorflowTfjsDashCore.Anon_GradsValueArray
import typings.atTensorflowTfjsDashCore.Anon_Mean
import typings.atTensorflowTfjsDashCore.distEngineMod.CustomGradientFunc
import typings.atTensorflowTfjsDashCore.distEngineMod.MemoryInfo
import typings.atTensorflowTfjsDashCore.distEngineMod.ProfileInfo
import typings.atTensorflowTfjsDashCore.distEngineMod.ScopeFn
import typings.atTensorflowTfjsDashCore.distEngineMod.TimingInfo
import typings.atTensorflowTfjsDashCore.distIoTypesMod.IOHandler
import typings.atTensorflowTfjsDashCore.distIoTypesMod.LoadOptions
import typings.atTensorflowTfjsDashCore.distOpsLstmMod.LSTMCellFunc
import typings.atTensorflowTfjsDashCore.distPlatformsPlatformMod.Platform
import typings.atTensorflowTfjsDashCore.distTensorMod.Scalar
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor1D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor3D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor4D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor5D
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor6D
import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainer
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike1D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike2D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike3D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike4D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike5D
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike6D
import typings.atTensorflowTfjsDashLayers.distBaseUnderscoreCallbacksMod.BaseCallbackConstructor
import typings.atTensorflowTfjsDashLayers.distEngineContainerMod.ContainerArgs
import typings.atTensorflowTfjsDashLayers.distEngineInputUnderscoreLayerMod.InputConfig
import typings.atTensorflowTfjsDashLayers.distModelsMod.SequentialArgs
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.NCHW
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.NHWC
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.`1DOT2DOT7`
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.bool
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.complex64
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.euclidean
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.float32
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.fro
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.int32
import typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeStrings.string
import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var ENV: typings.atTensorflowTfjsDashCore.distEnvironmentMod.Environment = js.native
  val basicLSTMCell: js.Function6[
    /* forgetBias */ Scalar | TensorLike, 
    /* lstmKernel */ Tensor2D | TensorLike, 
    /* lstmBias */ Tensor1D | TensorLike, 
    /* data */ Tensor2D | TensorLike, 
    /* c */ Tensor2D | TensorLike, 
    /* h */ Tensor2D | TensorLike, 
    js.Tuple2[Tensor2D, Tensor2D]
  ] = js.native
  val batchNorm2d: js.Function6[
    /* x */ Tensor2D | TensorLike, 
    /* mean */ Tensor2D | Tensor1D | TensorLike, 
    /* variance */ Tensor2D | Tensor1D | TensorLike, 
    /* offset */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
    /* scale */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
    /* varianceEpsilon */ js.UndefOr[Double], 
    Tensor2D
  ] = js.native
  val batchNorm3d: js.Function6[
    /* x */ Tensor3D | TensorLike, 
    /* mean */ Tensor3D | Tensor1D | TensorLike, 
    /* variance */ Tensor3D | Tensor1D | TensorLike, 
    /* offset */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
    /* scale */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
    /* varianceEpsilon */ js.UndefOr[Double], 
    Tensor3D
  ] = js.native
  val batchNorm4d: js.Function6[
    /* x */ Tensor4D | TensorLike, 
    /* mean */ Tensor4D | Tensor1D | TensorLike, 
    /* variance */ Tensor4D | Tensor1D | TensorLike, 
    /* offset */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
    /* scale */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
    /* varianceEpsilon */ js.UndefOr[Double], 
    Tensor4D
  ] = js.native
  val batchNormalization2d: js.Function6[
    /* x */ Tensor2D | TensorLike, 
    /* mean */ Tensor2D | Tensor1D | TensorLike, 
    /* variance */ Tensor2D | Tensor1D | TensorLike, 
    /* varianceEpsilon */ js.UndefOr[Double], 
    /* scale */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
    /* offset */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
    Tensor2D
  ] = js.native
  val batchNormalization3d: js.Function6[
    /* x */ Tensor3D | TensorLike, 
    /* mean */ Tensor3D | Tensor1D | TensorLike, 
    /* variance */ Tensor3D | Tensor1D | TensorLike, 
    /* varianceEpsilon */ js.UndefOr[Double], 
    /* scale */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
    /* offset */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
    Tensor3D
  ] = js.native
  val batchNormalization4d: js.Function6[
    /* x */ Tensor4D | TensorLike, 
    /* mean */ Tensor4D | Tensor1D | TensorLike, 
    /* variance */ Tensor4D | Tensor1D | TensorLike, 
    /* varianceEpsilon */ js.UndefOr[Double], 
    /* scale */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
    /* offset */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
    Tensor4D
  ] = js.native
  val concat1d: js.Function1[/* tensors */ js.Array[Tensor1D | TensorLike], Tensor1D] = js.native
  val concat2d: js.Function2[/* tensors */ js.Array[Tensor2D | TensorLike], /* axis */ Double, Tensor2D] = js.native
  val concat3d: js.Function2[/* tensors */ js.Array[Tensor3D | TensorLike], /* axis */ Double, Tensor3D] = js.native
  val concat4d: js.Function2[/* tensors */ js.Array[Tensor4D | TensorLike], /* axis */ Double, Tensor4D] = js.native
  val depthToSpace: js.Function3[
    /* x */ Tensor4D | TensorLike4D, 
    /* blockSize */ Double, 
    /* dataFormat */ js.UndefOr[NHWC | NCHW], 
    Tensor4D
  ] = js.native
  val dot: js.Function2[
    /* t1 */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] | TensorLike, 
    /* t2 */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] | TensorLike, 
    typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
  ] = js.native
  val dropout: js.Function4[
    /* x */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank], 
    /* rate */ Scalar | Double, 
    /* noiseShape */ js.UndefOr[js.Array[Double]], 
    /* seed */ js.UndefOr[Double], 
    typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
  ] = js.native
  val eye: js.Function4[
    /* numRows */ Double, 
    /* numColumns */ js.UndefOr[Double], 
    /* batchShape */ js.UndefOr[
      js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
    ], 
    /* dtype */ js.UndefOr[DataType], 
    Tensor2D
  ] = js.native
  val fft: js.Function1[
    /* input */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank], 
    typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
  ] = js.native
  val frame: js.Function5[
    /* signal */ Tensor1D, 
    /* frameLength */ Double, 
    /* frameStep */ Double, 
    /* padEnd */ js.UndefOr[Boolean], 
    /* padValue */ js.UndefOr[Double], 
    typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
  ] = js.native
  val gatherND: js.Function2[
    /* x */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] | TensorLike, 
    /* indices */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] | TensorLike, 
    typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
  ] = js.native
  val hammingWindow: js.Function1[/* windowLength */ Double, Tensor1D] = js.native
  val hannWindow: js.Function1[/* windowLength */ Double, Tensor1D] = js.native
  val ifft: js.Function1[
    /* input */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank], 
    typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
  ] = js.native
  val irfft: js.Function1[
    /* input */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank], 
    typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
  ] = js.native
  val moments: js.Function3[
    /* x */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    /* keepDims */ js.UndefOr[Boolean], 
    Anon_Mean
  ] = js.native
  val multiRNNCell: js.Function4[
    /* lstmCells */ js.Array[LSTMCellFunc], 
    /* data */ Tensor2D | TensorLike, 
    /* c */ js.Array[Tensor2D | TensorLike], 
    /* h */ js.Array[Tensor2D | TensorLike], 
    js.Tuple2[js.Array[Tensor2D], js.Array[Tensor2D]]
  ] = js.native
  val multinomial: js.Function4[
    /* logits */ Tensor1D | Tensor2D | TensorLike, 
    /* numSamples */ Double, 
    /* seed */ js.UndefOr[Double], 
    /* normalized */ js.UndefOr[Boolean], 
    Tensor1D | Tensor2D
  ] = js.native
  val norm: js.Function4[
    /* x */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] | TensorLike, 
    /* ord */ js.UndefOr[Double | euclidean | fro], 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    /* keepDims */ js.UndefOr[Boolean], 
    typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
  ] = js.native
  val oneHot: js.Function4[
    /* indices */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] | TensorLike, 
    /* depth */ Double, 
    /* onValue */ js.UndefOr[Double], 
    /* offValue */ js.UndefOr[Double], 
    typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
  ] = js.native
  val outerProduct: js.Function2[/* v1 */ Tensor1D | TensorLike, /* v2 */ Tensor1D | TensorLike, Tensor2D] = js.native
  val pad1d: js.Function3[
    /* x */ Tensor1D | TensorLike, 
    /* paddings */ js.Tuple2[Double, Double], 
    /* constantValue */ js.UndefOr[Double], 
    Tensor1D
  ] = js.native
  val pad2d: js.Function3[
    /* x */ Tensor2D | TensorLike, 
    /* paddings */ js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
    /* constantValue */ js.UndefOr[Double], 
    Tensor2D
  ] = js.native
  val pad3d: js.Function3[
    /* x */ Tensor3D | TensorLike, 
    /* paddings */ js.Tuple3[js.Tuple2[Double, Double], js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
    /* constantValue */ js.UndefOr[Double], 
    Tensor3D
  ] = js.native
  val pad4d: js.Function3[
    /* x */ Tensor4D | TensorLike, 
    /* paddings */ js.Tuple4[
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double], 
      js.Tuple2[Double, Double]
    ], 
    /* constantValue */ js.UndefOr[Double], 
    Tensor4D
  ] = js.native
  val reverse1d: js.Function1[/* x */ Tensor1D | TensorLike, Tensor1D] = js.native
  val reverse2d: js.Function2[
    /* x */ Tensor2D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor2D
  ] = js.native
  val reverse3d: js.Function2[
    /* x */ Tensor3D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor3D
  ] = js.native
  val reverse4d: js.Function2[
    /* x */ Tensor4D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor4D
  ] = js.native
  val rfft: js.Function2[
    /* input */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank], 
    /* fftLength */ js.UndefOr[Double], 
    typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
  ] = js.native
  val setdiff1dAsync: js.Function2[
    /* x */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] | TensorLike, 
    /* y */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] | TensorLike, 
    js.Promise[
      js.Tuple2[
        typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank], 
        typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
      ]
    ]
  ] = js.native
  val slice1d: js.Function3[/* x */ Tensor1D | TensorLike, /* begin */ Double, /* size */ Double, Tensor1D] = js.native
  val slice2d: js.Function3[
    /* x */ Tensor2D | TensorLike, 
    /* begin */ js.Tuple2[Double, Double], 
    /* size */ js.Tuple2[Double, Double], 
    Tensor2D
  ] = js.native
  val slice3d: js.Function3[
    /* x */ Tensor3D | TensorLike, 
    /* begin */ js.Tuple3[Double, Double, Double], 
    /* size */ js.Tuple3[Double, Double, Double], 
    Tensor3D
  ] = js.native
  val slice4d: js.Function3[
    /* x */ Tensor4D | TensorLike, 
    /* begin */ js.Tuple4[Double, Double, Double, Double], 
    /* size */ js.Tuple4[Double, Double, Double, Double], 
    Tensor4D
  ] = js.native
  val stridedSlice: js.Function9[
    /* x */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] | TensorLike, 
    /* begin */ js.Array[Double], 
    /* end */ js.Array[Double], 
    /* strides */ js.Array[Double], 
    /* beginMask */ js.UndefOr[Double], 
    /* endMask */ js.UndefOr[Double], 
    /* ellipsisMask */ js.UndefOr[Double], 
    /* newAxisMask */ js.UndefOr[Double], 
    /* shrinkAxisMask */ js.UndefOr[Double], 
    typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
  ] = js.native
  val unstack: js.Function2[
    /* x */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] | TensorLike, 
    /* axis */ js.UndefOr[Double], 
    js.Array[
      typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
    ]
  ] = js.native
  val variable: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Variable.variable */ js.Any = js.native
  val version_converter: `1DOT2DOT7` = js.native
  val version_core: `1DOT2DOT7` = js.native
  val version_layers: `1DOT2DOT7` = js.native
  val whereAsync: js.Function1[
    /* condition */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] | TensorLike, 
    js.Promise[Tensor2D]
  ] = js.native
  def backend(): typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend = js.native
  /**
    * Creates an empty `tf.TensorBuffer` with the specified `shape` and `dtype`.
    *
    * The values are stored in CPU as `TypedArray`. Fill the buffer using
    * `buffer.set()`, or by modifying directly `buffer.values`.
    *
    * When done, call `buffer.toTensor()` to get an immutable `tf.Tensor` with
    * those values.
    *
    * ```js
    * // Create a buffer and set values at particular indices.
    * const buffer = tf.buffer([2, 2]);
    * buffer.set(3, 0, 0);
    * buffer.set(5, 1, 0);
    *
    * // Convert the buffer back to a tensor.
    * buffer.toTensor().print();
    * ```
    *
    * @param shape An array of integers defining the output tensor shape.
    * @param dtype The dtype of the buffer. Defaults to 'float32'.
    * @param values The values of the buffer as `TypedArray`. Defaults to
    * zeros.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def buffer[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): typings.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer[R, float32] = js.native
  @JSName("buffer")
  def buffer_bool[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool
  ): typings.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer[R, bool] = js.native
  @JSName("buffer")
  def buffer_bool[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool,
    values: Uint8Array
  ): typings.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer[R, bool] = js.native
  @JSName("buffer")
  def buffer_complex64[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64
  ): typings.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer[R, complex64] = js.native
  @JSName("buffer")
  def buffer_complex64[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64,
    values: Float32Array
  ): typings.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer[R, complex64] = js.native
  @JSName("buffer")
  def buffer_float32[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: float32
  ): typings.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer[R, float32] = js.native
  @JSName("buffer")
  def buffer_float32[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: float32,
    values: Float32Array
  ): typings.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer[R, float32] = js.native
  @JSName("buffer")
  def buffer_int32[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32
  ): typings.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer[R, int32] = js.native
  @JSName("buffer")
  def buffer_int32[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32,
    values: Int32Array
  ): typings.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer[R, int32] = js.native
  @JSName("buffer")
  def buffer_string[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: string
  ): typings.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer[R, string] = js.native
  @JSName("buffer")
  def buffer_string[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: string,
    values: js.Array[String]
  ): typings.atTensorflowTfjsDashCore.distTensorMod.TensorBuffer[R, string] = js.native
  /**
    * Overrides the gradient computation of a function `f`.
    *
    * Takes a function
    * `f(...inputs, save) => {value: Tensor, gradFunc: (dy, saved) => Tensor[]}`
    * and returns another function `g(...inputs)` which takes the same inputs as
    * `f`. When called, `g` returns `f().value`. In backward mode, custom gradients
    * with respect to each input of `f` are computed using `f().gradFunc`.
    *
    * The `save` function passsed to `f` should be used for saving tensors needed
    * in the gradient. And the `saved` passed to the `gradFunc` is a
    * `NamedTensorMap`, which contains those saved tensor.
    *
    * ```js
    * const customOp = tf.customGrad((x, save) => {
    *   // Save x to make sure it's available later for the gradient.
    *   save([x]);
    *   // Override gradient of our custom x ^ 2 op to be dy * abs(x);
    *   return {
    *     value: x.square(),
    *     // Note `saved.x` which points to the `x` we saved earlier.
    *     gradFunc: (dy, saved) => [dy.mul(saved[0].abs())]
    *   };
    * });
    *
    * const x = tf.tensor1d([-1, -2, 3]);
    * const dx = tf.grad(x => customOp(x));
    *
    * console.log(`f(x):`);
    * customOp(x).print();
    * console.log(`f'(x):`);
    * dx(x).print();
    * ```
    *
    * @param f The function to evaluate in forward mode, which should return
    *     `{value: Tensor, gradFunc: (dy, saved) => Tensor[]}`, where `gradFunc`
    *     returns the custom gradients of `f` with respect to its inputs.
    */
  /** @doc {heading: 'Training', subheading: 'Gradients'} */
  def customGrad[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] */](f: CustomGradientFunc[T]): js.Function1[
    /* repeated */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank], 
    T
  ] = js.native
  def deprecationWarn(msg: String): Unit = js.native
  def deregisterOp(name: String): Unit = js.native
  def disableDeprecationWarnings(): Unit = js.native
  def dispose(container: TensorContainer): Unit = js.native
  def disposeVariables(): Unit = js.native
  def enableDebugMode(): Unit = js.native
  def enableProdMode(): Unit = js.native
  def fill[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: String
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def fill[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: String,
    dtype: DataType
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
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
  def fill[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: Double
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def fill[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: Double,
    dtype: DataType
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def findBackend(name: String): typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend = js.native
  def findBackendFactory(name: String): js.Function0[
    typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend | js.Promise[typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend]
  ] = js.native
  def getBackend(): String = js.native
  /**
    * Provided `f(x)`, returns another function `g(x, dy?)`, which gives the
    * gradient of `f(x)` with respect to `x`.
    *
    * If `dy` is provided, the gradient of `f(x).mul(dy).sum()` with respect to
    * `x` is computed instead. `f(x)` must take a single tensor `x` and return a
    * single tensor `y`. If `f()` takes multiple inputs, use `tf.grads` instead.
    *
    * ```js
    * // f(x) = x ^ 2
    * const f = x => x.square();
    * // f'(x) = 2x
    * const g = tf.grad(f);
    *
    * const x = tf.tensor1d([2, 3]);
    * g(x).print();
    * ```
    *
    * ```js
    * // f(x) = x ^ 3
    * const f = x => x.pow(tf.scalar(3, 'int32'));
    * // f'(x) = 3x ^ 2
    * const g = tf.grad(f);
    * // f''(x) = 6x
    * const gg = tf.grad(g);
    *
    * const x = tf.tensor1d([2, 3]);
    * gg(x).print();
    * ```
    *
    * @param f The function f(x), to compute gradient for.
    */
  /** @doc {heading: 'Training', subheading: 'Gradients'} */
  def grad(
    f: js.Function1[
      /* x */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank], 
      typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
    ]
  ): js.Function2[
    /* x */ TensorLike | typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank], 
    /* dy */ js.UndefOr[
      TensorLike | typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
    ], 
    typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
  ] = js.native
  /**
    * Provided `f(x1, x2,...)`, returns another function `g([x1, x2,...], dy?)`,
    * which gives an array of gradients of `f()` with respect to each input
    * [`x1`,`x2`,...].
    *
    * If `dy` is passed when calling `g()`, the gradient of
    * `f(x1,...).mul(dy).sum()` with respect to each input is computed instead.
    * The provided `f` must take one or more tensors and return a single tensor
    * `y`. If `f()` takes a single input, we recommend using `tf.grad` instead.
    *
    * ```js
    * // f(a, b) = a * b
    * const f = (a, b) => a.mul(b);
    * // df / da = b, df / db = a
    * const g = tf.grads(f);
    *
    * const a = tf.tensor1d([2, 3]);
    * const b = tf.tensor1d([-2, -3]);
    * const [da, db] = g([a, b]);
    * console.log('da');
    * da.print();
    * console.log('db');
    * db.print();
    * ```
    *
    * @param f The function `f(x1, x2,...)` to compute gradients for.
    */
  /** @doc {heading: 'Training', subheading: 'Gradients'} */
  def grads(
    f: js.Function1[
      /* repeated */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank], 
      typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
    ]
  ): js.Function2[
    /* args */ js.Array[
      typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] | TensorLike
    ], 
    /* dy */ js.UndefOr[
      typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] | TensorLike
    ], 
    js.Array[
      typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
    ]
  ] = js.native
  def input(config: InputConfig): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.SymbolicTensor = js.native
  def keep[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] */](result: T): T = js.native
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
  def linspace(start: Double, stop: Double, num: Double): Tensor1D = js.native
  def loadGraphModel(modelUrl: String): js.Promise[
    typings.atTensorflowTfjsDashConverter.distSrcExecutorGraphUnderscoreModelMod.GraphModel
  ] = js.native
  def loadGraphModel(modelUrl: String, options: LoadOptions): js.Promise[
    typings.atTensorflowTfjsDashConverter.distSrcExecutorGraphUnderscoreModelMod.GraphModel
  ] = js.native
  def loadGraphModel(modelUrl: IOHandler): js.Promise[
    typings.atTensorflowTfjsDashConverter.distSrcExecutorGraphUnderscoreModelMod.GraphModel
  ] = js.native
  def loadGraphModel(modelUrl: IOHandler, options: LoadOptions): js.Promise[
    typings.atTensorflowTfjsDashConverter.distSrcExecutorGraphUnderscoreModelMod.GraphModel
  ] = js.native
  def loadLayersModel(pathOrIOHandler: String): js.Promise[typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel] = js.native
  def loadLayersModel(pathOrIOHandler: String, options: LoadOptions): js.Promise[typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel] = js.native
  def loadLayersModel(pathOrIOHandler: IOHandler): js.Promise[typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel] = js.native
  def loadLayersModel(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel] = js.native
  def memory(): MemoryInfo = js.native
  def model(args: ContainerArgs): typings.atTensorflowTfjsDashLayers.distEngineTrainingMod.LayersModel = js.native
  def nextFrame(): js.Promise[Unit] = js.native
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
  def ones[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def ones[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def op[T /* <: js.Function */](f: StringDictionary[T]): T = js.native
  /**
    * Prints information about the `tf.Tensor` including its data.
    *
    * ```js
    * const verbose = true;
    * tf.tensor2d([1, 2, 3, 4], [2, 2]).print(verbose);
    * ```
    * @param x The tensor to be printed.
    * @param verbose Whether to print verbose information about the ` Tensor`,
    * including dtype and size.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def print[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] */](x: T): Unit = js.native
  def print[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] */](x: T, verbose: Boolean): Unit = js.native
  def profile(f: js.Function0[TensorContainer]): js.Promise[ProfileInfo] = js.native
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
  def range(start: Double, stop: Double): Tensor1D = js.native
  def range(start: Double, stop: Double, step: Double): Tensor1D = js.native
  @JSName("range")
  def range_float32(start: Double, stop: Double, step: Double, dtype: float32): Tensor1D = js.native
  @JSName("range")
  def range_int32(start: Double, stop: Double, step: Double, dtype: int32): Tensor1D = js.native
  def ready(): js.Promise[Unit] = js.native
  def registerBackend(
    name: String,
    factory: js.Function0[
      typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend | js.Promise[typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend]
    ]
  ): Boolean = js.native
  def registerBackend(
    name: String,
    factory: js.Function0[
      typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend | js.Promise[typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend]
    ],
    priority: Double
  ): Boolean = js.native
  def registerCallbackConstructor(verbosityLevel: Double, callbackConstructor: BaseCallbackConstructor): Unit = js.native
  def registerOp(name: String, opFunc: OpExecutor): Unit = js.native
  def removeBackend(name: String): Unit = js.native
  def scalar(value: String): Scalar = js.native
  def scalar(value: String, dtype: DataType): Scalar = js.native
  def scalar(value: Boolean): Scalar = js.native
  def scalar(value: Boolean, dtype: DataType): Scalar = js.native
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
  def scalar(value: Double): Scalar = js.native
  def scalar(value: Double, dtype: DataType): Scalar = js.native
  def scalar(value: Uint8Array): Scalar = js.native
  def scalar(value: Uint8Array, dtype: DataType): Scalar = js.native
  def sequential(): typings.atTensorflowTfjsDashLayers.distModelsMod.Sequential = js.native
  def sequential(config: SequentialArgs): typings.atTensorflowTfjsDashLayers.distModelsMod.Sequential = js.native
  def setBackend(backendName: String): js.Promise[Boolean] = js.native
  def setPlatform(platformName: String, platform: Platform): Unit = js.native
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
    *     or a flat array, or a `TypedArray`. If the values are strings,
    *     they will be encoded as utf-8 and kept as `Uint8Array[]`.
    * @param shape The shape of the tensor. Optional. If not provided,
    *   it is inferred from `values`.
    * @param dtype The data type.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def tensor[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](values: TensorLike): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def tensor[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    values: TensorLike,
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def tensor[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    values: TensorLike,
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
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
  def tensor1d(values: TensorLike1D): Tensor1D = js.native
  def tensor1d(values: TensorLike1D, dtype: DataType): Tensor1D = js.native
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
  def tensor2d(values: TensorLike2D): Tensor2D = js.native
  def tensor2d(values: TensorLike2D, shape: js.Tuple2[Double, Double]): Tensor2D = js.native
  def tensor2d(values: TensorLike2D, shape: js.Tuple2[Double, Double], dtype: DataType): Tensor2D = js.native
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
  def tensor3d(values: TensorLike3D): Tensor3D = js.native
  def tensor3d(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double]): Tensor3D = js.native
  def tensor3d(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double], dtype: DataType): Tensor3D = js.native
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
  def tensor4d(values: TensorLike4D): Tensor4D = js.native
  def tensor4d(values: TensorLike4D, shape: js.Tuple4[Double, Double, Double, Double]): Tensor4D = js.native
  def tensor4d(values: TensorLike4D, shape: js.Tuple4[Double, Double, Double, Double], dtype: DataType): Tensor4D = js.native
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
  def tensor5d(values: TensorLike5D): Tensor5D = js.native
  def tensor5d(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double]): Tensor5D = js.native
  def tensor5d(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double], dtype: DataType): Tensor5D = js.native
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
  def tensor6d(values: TensorLike6D): Tensor6D = js.native
  def tensor6d(values: TensorLike6D, shape: js.Tuple6[Double, Double, Double, Double, Double, Double]): Tensor6D = js.native
  def tensor6d(
    values: TensorLike6D,
    shape: js.Tuple6[Double, Double, Double, Double, Double, Double],
    dtype: DataType
  ): Tensor6D = js.native
  def tidy[T /* <: TensorContainer */](nameOrFn: String): T = js.native
  def tidy[T /* <: TensorContainer */](nameOrFn: String, fn: ScopeFn[T]): T = js.native
  def tidy[T /* <: TensorContainer */](nameOrFn: ScopeFn[T]): T = js.native
  def tidy[T /* <: TensorContainer */](nameOrFn: ScopeFn[T], fn: ScopeFn[T]): T = js.native
  def time(f: js.Function0[Unit]): js.Promise[TimingInfo] = js.native
  /**
    * Like `tf.grad`, but also returns the value of `f()`. Useful when `f()`
    * returns a metric you want to show.
    *
    * The result is a rich object with the following properties:
    * - grad: The gradient of `f(x)` w.r.t `x` (result of `tf.grad`).
    * - value: The value returned by `f(x)`.
    *
    * ```js
    * // f(x) = x ^ 2
    * const f = x => x.square();
    * // f'(x) = 2x
    * const g = tf.valueAndGrad(f);
    *
    * const x = tf.tensor1d([2, 3]);
    * const {value, grad} = g(x);
    *
    * console.log('value');
    * value.print();
    * console.log('grad');
    * grad.print();
    * ```
    */
  /** @doc {heading: 'Training', subheading: 'Gradients'} */
  def valueAndGrad[I /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] */, O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] */](f: js.Function1[/* x */ I, O]): js.Function2[/* x */ I, /* dy */ js.UndefOr[O], Anon_Grad[O, I]] = js.native
  /**
    * Like `tf.grads`, but returns also the value of `f()`. Useful when `f()`
    * returns a metric you want to show.
    *
    * The result is a rich object with the following properties:
    * - grads: The gradients of `f()` w.r.t each input (result of `tf.grads`).
    * - value: The value returned by `f(x)`.
    *
    * ```js
    * // f(a, b) = a * b
    * const f = (a, b) => a.mul(b);
    * // df/da = b, df/db = a
    * const g = tf.valueAndGrads(f);
    *
    * const a = tf.tensor1d([2, 3]);
    * const b = tf.tensor1d([-2, -3]);
    * const {value, grads} = g([a, b]);
    *
    * const [da, db] = grads;
    *
    * console.log('value');
    * value.print();
    *
    * console.log('da');
    * da.print();
    * console.log('db');
    * db.print();
    * ```
    */
  /** @doc {heading: 'Training', subheading: 'Gradients'} */
  def valueAndGrads[O /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank] */](
    f: js.Function1[
      /* repeated */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank], 
      O
    ]
  ): js.Function2[
    /* args */ js.Array[
      typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
    ], 
    /* dy */ js.UndefOr[O], 
    Anon_GradsValueArray[O]
  ] = js.native
  /**
    * Computes and returns the gradient of f(x) with respect to the list of
    * trainable variables provided by `varList`. If no list is provided, it
    * defaults to all trainable variables.
    *
    * ```js
    * const a = tf.variable(tf.tensor1d([3, 4]));
    * const b = tf.variable(tf.tensor1d([5, 6]));
    * const x = tf.tensor1d([1, 2]);
    *
    * // f(a, b) = a * x ^ 2 + b * x
    * const f = () => a.mul(x.square()).add(b.mul(x)).sum();
    * // df/da = x ^ 2, df/db = x
    * const {value, grads} = tf.variableGrads(f);
    *
    * Object.keys(grads).forEach(varName => grads[varName].print());
    * ```
    *
    * @param f The function to execute. f() should return a scalar.
    * @param varList The list of variables to compute the gradients with respect
    *     to. Defaults to all trainable variables.
    * @returns An object with the following keys and values:
    *   - `value`: The value of the function `f`.
    *   - `grads`: A map from the names of the variables to the gradients.
    *     If the `varList` argument is provided explicitly and contains a subset of
    *     non-trainable variables, this map in the return value will contain keys
    *     that map the names of the non-trainable variables to `null`.
    */
  /** @doc {heading: 'Training', subheading: 'Gradients'} */
  def variableGrads(f: js.Function0[Scalar]): Anon_GradsValue = js.native
  def variableGrads(
    f: js.Function0[Scalar],
    varList: js.Array[
      typings.atTensorflowTfjsDashCore.distTensorMod.Variable[typings.atTensorflowTfjsDashCore.distTypesMod.Rank]
    ]
  ): Anon_GradsValue = js.native
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
  def zeros[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
  def zeros[R /* <: typings.atTensorflowTfjsDashCore.distTypesMod.Rank */](
    shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[R] = js.native
}

