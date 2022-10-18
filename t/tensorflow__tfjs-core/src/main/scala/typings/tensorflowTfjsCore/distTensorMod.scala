package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.Instantiable4
import typings.std.WebGLTexture
import typings.tensorflowTfjsCore.anon.Indices
import typings.tensorflowTfjsCore.distOpsConvUtilMod.ExplicitPadding
import typings.tensorflowTfjsCore.distTypesMod.BackendValues
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.DataValues
import typings.tensorflowTfjsCore.distTypesMod.NumericDataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.Rank.R0
import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import typings.tensorflowTfjsCore.distTypesMod.Rank.R2
import typings.tensorflowTfjsCore.distTypesMod.Rank.R3
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.distTypesMod.Rank.R5
import typings.tensorflowTfjsCore.distTypesMod.Rank.R6
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.distTypesMod.TensorLike1D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike3D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike4D
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.avg
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.euclidean
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.fro
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.max
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reflect
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.symmetric
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import typings.webgpuTypes.GPUBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTensorMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor", "Tensor")
  @js.native
  open class Tensor[R /* <: Rank */] protected () extends StObject {
    def this(
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      dtype: DataType,
      dataId: DataId,
      id: Double
    ) = this()
    
    def abs[T /* <: Tensor[Rank] */](): T = js.native
    
    def acos[T /* <: Tensor[Rank] */](): T = js.native
    
    def acosh[T /* <: Tensor[Rank] */](): T = js.native
    
    def add[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def add[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def all[T /* <: Tensor[Rank] */](): T = js.native
    def all[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    def all[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
    def all[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    def all[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
    def all[T /* <: Tensor[Rank] */](axis: Unit, keepDims: Boolean): T = js.native
    
    def any[T /* <: Tensor[Rank] */](): T = js.native
    def any[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    def any[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
    def any[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    def any[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
    def any[T /* <: Tensor[Rank] */](axis: Unit, keepDims: Boolean): T = js.native
    
    def argMax[T /* <: Tensor[Rank] */](): T = js.native
    def argMax[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    
    def argMin[T /* <: Tensor[Rank] */](): T = js.native
    def argMin[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    
    /**
      * Returns the tensor data as a nested array. The transfer of data is done
      * asynchronously.
      *
      * @doc {heading: 'Tensors', subheading: 'Classes'}
      */
    def array(): js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ArrayMap[R] */ js.Any
      ] = js.native
    
    /**
      * Returns the tensor data as a nested array. The transfer of data is done
      * synchronously.
      *
      * @doc {heading: 'Tensors', subheading: 'Classes'}
      */
    def arraySync(): /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ArrayMap[R] */ js.Any = js.native
    
    def as1D[T /* <: Tensor[Rank] */](): Tensor1D = js.native
    
    def as2D[T /* <: Tensor[Rank] */](rows: Double, columns: Double): Tensor2D = js.native
    
    def as3D[T /* <: Tensor[Rank] */](rows: Double, columns: Double, depth: Double): Tensor3D = js.native
    
    def as4D[T /* <: Tensor[Rank] */](rows: Double, columns: Double, depth: Double, depth2: Double): Tensor4D = js.native
    
    def as5D[T /* <: Tensor[Rank] */](rows: Double, columns: Double, depth: Double, depth2: Double, depth3: Double): Tensor5D = js.native
    
    def asScalar[T /* <: Tensor[Rank] */](): Scalar = js.native
    
    def asType[T /* <: Tensor[Rank] */](dtype: DataType): T = js.native
    
    def asin[T /* <: Tensor[Rank] */](): T = js.native
    
    def asinh[T /* <: Tensor[Rank] */](): T = js.native
    
    def atan[T /* <: Tensor[Rank] */](): T = js.native
    
    def atan2[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def atan2[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def atanh[T /* <: Tensor[Rank] */](): T = js.native
    
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], pad: valid_ | same_): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], pad: Double): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], pad: ExplicitPadding): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: ExplicitPadding,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: valid_ | same_): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: Double,
      pad: valid_ | same_,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: Double,
      pad: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: ExplicitPadding): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: Double,
      pad: ExplicitPadding,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: valid_ | same_): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: Double,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: Double,
      strides: js.Tuple2[Double, Double],
      pad: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: ExplicitPadding): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: Double,
      strides: js.Tuple2[Double, Double],
      pad: ExplicitPadding,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: valid_ | same_): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: valid_ | same_, dimRoundingMode: floor | round | ceil): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: Double): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: Double, dimRoundingMode: floor | round | ceil): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: ExplicitPadding): T = js.native
    def avgPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: ExplicitPadding, dimRoundingMode: floor | round | ceil): T = js.native
    
    def batchNorm[T /* <: Tensor[Rank] */](
      mean: Tensor[R] | Tensor1D | TensorLike,
      variance: Tensor[R] | Tensor1D | TensorLike,
      offset: js.UndefOr[Tensor[R] | Tensor1D | TensorLike],
      scale: js.UndefOr[Tensor[R] | Tensor1D | TensorLike],
      varianceEpsilon: js.UndefOr[Double]
    ): Tensor[R] = js.native
    
    def batchToSpaceND[R /* <: Rank */](blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): Tensor[R] = js.native
    
    def broadcastTo[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
    ): Tensor[R] = js.native
    
    /**
      * Returns a promise of `tf.TensorBuffer` that holds the underlying data.
      *
      * @doc {heading: 'Tensors', subheading: 'Classes'}
      */
    def buffer(): js.Promise[TensorBuffer[R, float32]] = js.native
    
    /**
      * Returns a `tf.TensorBuffer` that holds the underlying data.
      * @doc {heading: 'Tensors', subheading: 'Classes'}
      */
    def bufferSync(): TensorBuffer[R, float32] = js.native
    
    /** Returns the underlying bytes of the tensor's data. */
    def bytes(): js.Promise[js.Array[js.typedarray.Uint8Array] | js.typedarray.Uint8Array] = js.native
    
    def cast[T /* <: Tensor[Rank] */](dtype: DataType): T = js.native
    
    def ceil[T /* <: Tensor[Rank] */](): T = js.native
    
    def clipByValue[T /* <: Tensor[Rank] */](min: Double, max: Double): Tensor[Rank] = js.native
    
    def concat[T /* <: Tensor[Rank] */](tensors: T): T = js.native
    def concat[T /* <: Tensor[Rank] */](tensors: T, axis: Double): T = js.native
    def concat[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): T = js.native
    def concat[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike], axis: Double): T = js.native
    
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: Tensor3D, stride: Double, pad: valid_ | same_): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: Tensor3D, stride: Double, pad: valid_ | same_, dataFormat: NWC | NCW): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: Tensor3D, stride: Double, pad: valid_ | same_, dataFormat: NWC | NCW, dilation: Double): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: Tensor3D,
      stride: Double,
      pad: valid_ | same_,
      dataFormat: NWC | NCW,
      dilation: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: Tensor3D,
      stride: Double,
      pad: valid_ | same_,
      dataFormat: NWC | NCW,
      dilation: Unit,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: Tensor3D, stride: Double, pad: valid_ | same_, dataFormat: Unit, dilation: Double): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: Tensor3D,
      stride: Double,
      pad: valid_ | same_,
      dataFormat: Unit,
      dilation: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: Tensor3D,
      stride: Double,
      pad: valid_ | same_,
      dataFormat: Unit,
      dilation: Unit,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: Tensor3D, stride: Double, pad: Double): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: Tensor3D, stride: Double, pad: Double, dataFormat: NWC | NCW): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: Tensor3D, stride: Double, pad: Double, dataFormat: NWC | NCW, dilation: Double): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: Tensor3D,
      stride: Double,
      pad: Double,
      dataFormat: NWC | NCW,
      dilation: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: Tensor3D,
      stride: Double,
      pad: Double,
      dataFormat: NWC | NCW,
      dilation: Unit,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: Tensor3D, stride: Double, pad: Double, dataFormat: Unit, dilation: Double): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: Tensor3D,
      stride: Double,
      pad: Double,
      dataFormat: Unit,
      dilation: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: Tensor3D,
      stride: Double,
      pad: Double,
      dataFormat: Unit,
      dilation: Unit,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: Tensor3D, stride: Double, pad: ExplicitPadding): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: Tensor3D, stride: Double, pad: ExplicitPadding, dataFormat: NWC | NCW): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: Tensor3D, stride: Double, pad: ExplicitPadding, dataFormat: NWC | NCW, dilation: Double): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: Tensor3D,
      stride: Double,
      pad: ExplicitPadding,
      dataFormat: NWC | NCW,
      dilation: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: Tensor3D,
      stride: Double,
      pad: ExplicitPadding,
      dataFormat: NWC | NCW,
      dilation: Unit,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: Tensor3D, stride: Double, pad: ExplicitPadding, dataFormat: Unit, dilation: Double): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: Tensor3D,
      stride: Double,
      pad: ExplicitPadding,
      dataFormat: Unit,
      dilation: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: Tensor3D,
      stride: Double,
      pad: ExplicitPadding,
      dataFormat: Unit,
      dilation: Unit,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: TensorLike3D, stride: Double, pad: valid_ | same_): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: TensorLike3D, stride: Double, pad: valid_ | same_, dataFormat: NWC | NCW): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: TensorLike3D, stride: Double, pad: valid_ | same_, dataFormat: NWC | NCW, dilation: Double): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: TensorLike3D,
      stride: Double,
      pad: valid_ | same_,
      dataFormat: NWC | NCW,
      dilation: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: TensorLike3D,
      stride: Double,
      pad: valid_ | same_,
      dataFormat: NWC | NCW,
      dilation: Unit,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: TensorLike3D, stride: Double, pad: valid_ | same_, dataFormat: Unit, dilation: Double): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: TensorLike3D,
      stride: Double,
      pad: valid_ | same_,
      dataFormat: Unit,
      dilation: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: TensorLike3D,
      stride: Double,
      pad: valid_ | same_,
      dataFormat: Unit,
      dilation: Unit,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: TensorLike3D, stride: Double, pad: Double): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: TensorLike3D, stride: Double, pad: Double, dataFormat: NWC | NCW): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: TensorLike3D, stride: Double, pad: Double, dataFormat: NWC | NCW, dilation: Double): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: TensorLike3D,
      stride: Double,
      pad: Double,
      dataFormat: NWC | NCW,
      dilation: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: TensorLike3D,
      stride: Double,
      pad: Double,
      dataFormat: NWC | NCW,
      dilation: Unit,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: TensorLike3D, stride: Double, pad: Double, dataFormat: Unit, dilation: Double): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: TensorLike3D,
      stride: Double,
      pad: Double,
      dataFormat: Unit,
      dilation: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: TensorLike3D,
      stride: Double,
      pad: Double,
      dataFormat: Unit,
      dilation: Unit,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: TensorLike3D, stride: Double, pad: ExplicitPadding): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: TensorLike3D, stride: Double, pad: ExplicitPadding, dataFormat: NWC | NCW): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: TensorLike3D,
      stride: Double,
      pad: ExplicitPadding,
      dataFormat: NWC | NCW,
      dilation: Double
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: TensorLike3D,
      stride: Double,
      pad: ExplicitPadding,
      dataFormat: NWC | NCW,
      dilation: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: TensorLike3D,
      stride: Double,
      pad: ExplicitPadding,
      dataFormat: NWC | NCW,
      dilation: Unit,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](filter: TensorLike3D, stride: Double, pad: ExplicitPadding, dataFormat: Unit, dilation: Double): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: TensorLike3D,
      stride: Double,
      pad: ExplicitPadding,
      dataFormat: Unit,
      dilation: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv1d[T /* <: Tensor2D | Tensor3D */](
      filter: TensorLike3D,
      stride: Double,
      pad: ExplicitPadding,
      dataFormat: Unit,
      dilation: Unit,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    
    def conv2d[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D | TensorLike4D,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dataFormat: js.UndefOr[NHWC | NCHW],
      dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
      dimRoundingMode: js.UndefOr[floor | round | ceil]
    ): T = js.native
    
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D,
      outputShape: js.Tuple3[Double, Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D,
      outputShape: js.Tuple3[Double, Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D,
      outputShape: js.Tuple3[Double, Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: Double
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D,
      outputShape: js.Tuple3[Double, Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D,
      outputShape: js.Tuple3[Double, Double, Double],
      strides: Double,
      pad: valid_ | same_
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D,
      outputShape: js.Tuple3[Double, Double, Double],
      strides: Double,
      pad: valid_ | same_,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](filter: Tensor4D, outputShape: js.Tuple3[Double, Double, Double], strides: Double, pad: Double): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D,
      outputShape: js.Tuple3[Double, Double, Double],
      strides: Double,
      pad: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D,
      outputShape: js.Tuple4[Double, Double, Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D,
      outputShape: js.Tuple4[Double, Double, Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D,
      outputShape: js.Tuple4[Double, Double, Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: Double
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D,
      outputShape: js.Tuple4[Double, Double, Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D,
      outputShape: js.Tuple4[Double, Double, Double, Double],
      strides: Double,
      pad: valid_ | same_
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D,
      outputShape: js.Tuple4[Double, Double, Double, Double],
      strides: Double,
      pad: valid_ | same_,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D,
      outputShape: js.Tuple4[Double, Double, Double, Double],
      strides: Double,
      pad: Double
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D,
      outputShape: js.Tuple4[Double, Double, Double, Double],
      strides: Double,
      pad: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike4D,
      outputShape: js.Tuple3[Double, Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike4D,
      outputShape: js.Tuple3[Double, Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike4D,
      outputShape: js.Tuple3[Double, Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: Double
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike4D,
      outputShape: js.Tuple3[Double, Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike4D,
      outputShape: js.Tuple3[Double, Double, Double],
      strides: Double,
      pad: valid_ | same_
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike4D,
      outputShape: js.Tuple3[Double, Double, Double],
      strides: Double,
      pad: valid_ | same_,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](filter: TensorLike4D, outputShape: js.Tuple3[Double, Double, Double], strides: Double, pad: Double): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike4D,
      outputShape: js.Tuple3[Double, Double, Double],
      strides: Double,
      pad: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike4D,
      outputShape: js.Tuple4[Double, Double, Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike4D,
      outputShape: js.Tuple4[Double, Double, Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike4D,
      outputShape: js.Tuple4[Double, Double, Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: Double
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike4D,
      outputShape: js.Tuple4[Double, Double, Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike4D,
      outputShape: js.Tuple4[Double, Double, Double, Double],
      strides: Double,
      pad: valid_ | same_
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike4D,
      outputShape: js.Tuple4[Double, Double, Double, Double],
      strides: Double,
      pad: valid_ | same_,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike4D,
      outputShape: js.Tuple4[Double, Double, Double, Double],
      strides: Double,
      pad: Double
    ): T = js.native
    def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike4D,
      outputShape: js.Tuple4[Double, Double, Double, Double],
      strides: Double,
      pad: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    
    def cos[T /* <: Tensor[Rank] */](): T = js.native
    
    def cosh[T /* <: Tensor[Rank] */](): T = js.native
    
    def cumprod[R /* <: Rank */](): Tensor[R] = js.native
    def cumprod[R /* <: Rank */](axis: Double): Tensor[R] = js.native
    def cumprod[R /* <: Rank */](axis: Double, exclusive: Boolean): Tensor[R] = js.native
    def cumprod[R /* <: Rank */](axis: Double, exclusive: Boolean, reverse: Boolean): Tensor[R] = js.native
    def cumprod[R /* <: Rank */](axis: Double, exclusive: Unit, reverse: Boolean): Tensor[R] = js.native
    def cumprod[R /* <: Rank */](axis: Unit, exclusive: Boolean): Tensor[R] = js.native
    def cumprod[R /* <: Rank */](axis: Unit, exclusive: Boolean, reverse: Boolean): Tensor[R] = js.native
    def cumprod[R /* <: Rank */](axis: Unit, exclusive: Unit, reverse: Boolean): Tensor[R] = js.native
    
    def cumsum[R /* <: Rank */](): Tensor[R] = js.native
    def cumsum[R /* <: Rank */](axis: Double): Tensor[R] = js.native
    def cumsum[R /* <: Rank */](axis: Double, exclusive: Boolean): Tensor[R] = js.native
    def cumsum[R /* <: Rank */](axis: Double, exclusive: Boolean, reverse: Boolean): Tensor[R] = js.native
    def cumsum[R /* <: Rank */](axis: Double, exclusive: Unit, reverse: Boolean): Tensor[R] = js.native
    def cumsum[R /* <: Rank */](axis: Unit, exclusive: Boolean): Tensor[R] = js.native
    def cumsum[R /* <: Rank */](axis: Unit, exclusive: Boolean, reverse: Boolean): Tensor[R] = js.native
    def cumsum[R /* <: Rank */](axis: Unit, exclusive: Unit, reverse: Boolean): Tensor[R] = js.native
    
    /**
      * Asynchronously downloads the values from the `tf.Tensor`. Returns a
      * promise of `TypedArray` that resolves when the computation has finished.
      *
      * @doc {heading: 'Tensors', subheading: 'Classes'}
      */
    def data(): js.Promise[js.typedarray.Float32Array] = js.native
    
    /**
      * Id of the bucket holding the data for this tensor. Multiple arrays can
      * point to the same bucket (e.g. when calling array.reshape()).
      */
    var dataId: DataId = js.native
    
    /**
      * Synchronously downloads the values from the `tf.Tensor`. This blocks the
      * UI thread until the values are ready, which can cause performance issues.
      *
      * @doc {heading: 'Tensors', subheading: 'Classes'}
      */
    def dataSync(): js.typedarray.Float32Array = js.native
    @JSName("dataSync")
    def dataSync_Array(): js.Array[String] = js.native
    @JSName("dataSync")
    def dataSync_Int32Array(): js.typedarray.Int32Array = js.native
    @JSName("dataSync")
    def dataSync_Uint8Array(): js.typedarray.Uint8Array = js.native
    
    /**
      * Copy the tensor's data to a new GPU resource. Comparing to the `dataSync()`
      * and `data()`, this method prevents data from being downloaded to CPU.
      *
      * For WebGL backend, the data will be stored on a densely packed texture.
      * This means that the texture will use the RGBA channels to store value.
      *
      * For WebGPU backend, the data will be stored on a buffer. There is no
      * parameter, so can not use a user-defined size to create the buffer.
      *
      * @param options:
      *     For WebGL,
      *         - customTexShape: Optional. If set, will use the user defined
      *     texture shape to create the texture.
      *
      * @returns For WebGL backend, a GPUData contains the new texture and
      *     its information.
      *     {
      *        tensorRef: The tensor that is associated with this texture,
      *        texture: WebGLTexture,
      *        texShape: [number, number] // [height, width]
      *     }
      *
      *     For WebGPU backend, a GPUData contains the new buffer and
      *     its information.
      *     {
      *        tensorRef: The tensor that is associated with this buffer,
      *        buffer: GPUBuffer,
      *        bufSize: number
      *     }
      *
      *     Remember to dispose the GPUData after it is used by
      *     `res.tensorRef.dispose()`.
      *
      * @doc {heading: 'Tensors', subheading: 'Classes'}
      */
    def dataToGPU(): GPUData = js.native
    def dataToGPU(options: DataToGPUOptions): GPUData = js.native
    
    def depthToSpace[T /* <: Tensor4D */](blockSize: Double, dataFormat: NHWC | NCHW): T = js.native
    
    def depthwiseConv2d[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor4D | TensorLike4D,
      strides: (js.Tuple2[Double, Double]) | Double,
      pad: valid_ | same_ | Double,
      dataFormat: js.UndefOr[NHWC | NCHW],
      dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
      dimRoundingMode: js.UndefOr[floor | round | ceil]
    ): T = js.native
    
    def dilation2d[T /* <: Tensor3D | Tensor4D */](filter: Tensor3D, strides: js.Tuple2[Double, Double], pad: valid_ | same_): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor3D,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilations: js.Tuple2[Double, Double]
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor3D,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilations: js.Tuple2[Double, Double],
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](filter: Tensor3D, strides: js.Tuple2[Double, Double], pad: valid_ | same_, dilations: Double): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor3D,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilations: Double,
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor3D,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilations: Unit,
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](filter: Tensor3D, strides: Double, pad: valid_ | same_): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](filter: Tensor3D, strides: Double, pad: valid_ | same_, dilations: js.Tuple2[Double, Double]): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: Tensor3D,
      strides: Double,
      pad: valid_ | same_,
      dilations: js.Tuple2[Double, Double],
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](filter: Tensor3D, strides: Double, pad: valid_ | same_, dilations: Double): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](filter: Tensor3D, strides: Double, pad: valid_ | same_, dilations: Double, dataFormat: NHWC): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](filter: Tensor3D, strides: Double, pad: valid_ | same_, dilations: Unit, dataFormat: NHWC): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](filter: TensorLike3D, strides: js.Tuple2[Double, Double], pad: valid_ | same_): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike3D,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilations: js.Tuple2[Double, Double]
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike3D,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilations: js.Tuple2[Double, Double],
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](filter: TensorLike3D, strides: js.Tuple2[Double, Double], pad: valid_ | same_, dilations: Double): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike3D,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilations: Double,
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike3D,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilations: Unit,
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](filter: TensorLike3D, strides: Double, pad: valid_ | same_): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](filter: TensorLike3D, strides: Double, pad: valid_ | same_, dilations: js.Tuple2[Double, Double]): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](
      filter: TensorLike3D,
      strides: Double,
      pad: valid_ | same_,
      dilations: js.Tuple2[Double, Double],
      dataFormat: NHWC
    ): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](filter: TensorLike3D, strides: Double, pad: valid_ | same_, dilations: Double): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](filter: TensorLike3D, strides: Double, pad: valid_ | same_, dilations: Double, dataFormat: NHWC): T = js.native
    def dilation2d[T /* <: Tensor3D | Tensor4D */](filter: TensorLike3D, strides: Double, pad: valid_ | same_, dilations: Unit, dataFormat: NHWC): T = js.native
    
    /**
      * Disposes `tf.Tensor` from memory.
      *
      * @doc {heading: 'Tensors', subheading: 'Classes'}
      */
    def dispose(): Unit = js.native
    
    def div[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def div[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def divNoNan[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def divNoNan[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def dot[T /* <: Tensor[Rank] */](b: Tensor[Rank]): Tensor[Rank] = js.native
    def dot[T /* <: Tensor[Rank] */](b: TensorLike): Tensor[Rank] = js.native
    
    /** The data type for the array. */
    val dtype: DataType = js.native
    
    def elu[T /* <: Tensor[Rank] */](): T = js.native
    
    def equal[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def equal[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def erf[T /* <: Tensor[Rank] */](): T = js.native
    
    def euclideanNorm[T /* <: Tensor[Rank] */](): T = js.native
    def euclideanNorm[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    def euclideanNorm[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
    def euclideanNorm[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    def euclideanNorm[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
    def euclideanNorm[T /* <: Tensor[Rank] */](axis: Unit, keepDims: Boolean): T = js.native
    
    def exp[T /* <: Tensor[Rank] */](): T = js.native
    
    def expandDims[T /* <: Tensor[Rank] */](): T = js.native
    def expandDims[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    
    def expm1[T /* <: Tensor[Rank] */](): T = js.native
    
    def fft[T /* <: Tensor[Rank] */](): Tensor[Rank] = js.native
    
    def flatten[T /* <: Tensor[Rank] */](): Tensor1D = js.native
    
    def floor[T /* <: Tensor[Rank] */](): T = js.native
    
    def floorDiv[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def floorDiv[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def gather[T /* <: Tensor[Rank] */](indices: Tensor[Rank]): T = js.native
    def gather[T /* <: Tensor[Rank] */](indices: Tensor[Rank], axis: Double): T = js.native
    def gather[T /* <: Tensor[Rank] */](indices: TensorLike): T = js.native
    def gather[T /* <: Tensor[Rank] */](indices: TensorLike, axis: Double): T = js.native
    
    def greater[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def greater[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def greaterEqual[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def greaterEqual[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    /** Unique id of this tensor. */
    val id: Double = js.native
    
    def ifft[T /* <: Tensor[Rank] */](): Tensor[Rank] = js.native
    
    def irfft[T /* <: Tensor[Rank] */](): Tensor[Rank] = js.native
    
    def isDisposed: Boolean = js.native
    
    /* protected */ var isDisposedInternal: Boolean = js.native
    
    def isFinite[T /* <: Tensor[Rank] */](): T = js.native
    
    def isInf[T /* <: Tensor[Rank] */](): T = js.native
    
    def isNaN[T /* <: Tensor[Rank] */](): T = js.native
    
    /** Whether this tensor has been globally kept. */
    var kept: Boolean = js.native
    
    def leakyRelu[T /* <: Tensor[Rank] */](alpha: Double): T = js.native
    
    def less[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def less[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def lessEqual[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def lessEqual[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def localResponseNormalization[T /* <: Tensor[Rank] */](): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Double, bias: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Double, bias: Double, alpha: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Double, bias: Double, alpha: Double, beta: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Double, bias: Double, alpha: Unit, beta: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Double, bias: Unit, alpha: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Double, bias: Unit, alpha: Double, beta: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Double, bias: Unit, alpha: Unit, beta: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Unit, bias: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Unit, bias: Double, alpha: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Unit, bias: Double, alpha: Double, beta: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Unit, bias: Double, alpha: Unit, beta: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Unit, bias: Unit, alpha: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Unit, bias: Unit, alpha: Double, beta: Double): T = js.native
    def localResponseNormalization[T /* <: Tensor[Rank] */](depthRadius: Unit, bias: Unit, alpha: Unit, beta: Double): T = js.native
    
    def log[T /* <: Tensor[Rank] */](): T = js.native
    
    def log1p[T /* <: Tensor[Rank] */](): T = js.native
    
    def logSigmoid[T /* <: Tensor[Rank] */](): T = js.native
    
    def logSoftmax[T /* <: Tensor[Rank] */](): T = js.native
    def logSoftmax[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    
    def logSumExp[T /* <: Tensor[Rank] */](): T = js.native
    def logSumExp[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    def logSumExp[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
    def logSumExp[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    def logSumExp[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
    def logSumExp[T /* <: Tensor[Rank] */](axis: Unit, keepDims: Boolean): T = js.native
    
    def logicalAnd[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def logicalAnd[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def logicalNot[T /* <: Tensor[Rank] */](): T = js.native
    
    def logicalOr[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def logicalOr[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def logicalXor[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def logicalXor[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def matMul[T /* <: Tensor[Rank] */](b: Tensor[Rank]): Tensor[Rank] = js.native
    def matMul[T /* <: Tensor[Rank] */](b: Tensor[Rank], transposeA: Boolean): Tensor[Rank] = js.native
    def matMul[T /* <: Tensor[Rank] */](b: Tensor[Rank], transposeA: Boolean, transposeB: Boolean): Tensor[Rank] = js.native
    def matMul[T /* <: Tensor[Rank] */](b: Tensor[Rank], transposeA: Unit, transposeB: Boolean): Tensor[Rank] = js.native
    def matMul[T /* <: Tensor[Rank] */](b: TensorLike): Tensor[Rank] = js.native
    def matMul[T /* <: Tensor[Rank] */](b: TensorLike, transposeA: Boolean): Tensor[Rank] = js.native
    def matMul[T /* <: Tensor[Rank] */](b: TensorLike, transposeA: Boolean, transposeB: Boolean): Tensor[Rank] = js.native
    def matMul[T /* <: Tensor[Rank] */](b: TensorLike, transposeA: Unit, transposeB: Boolean): Tensor[Rank] = js.native
    
    def max[T /* <: Tensor[Rank] */](): T = js.native
    def max[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    def max[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
    def max[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    def max[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
    def max[T /* <: Tensor[Rank] */](axis: Unit, keepDims: Boolean): T = js.native
    
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], pad: valid_ | same_): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], pad: Double): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: js.Tuple2[Double, Double], pad: ExplicitPadding): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: js.Tuple2[Double, Double],
      pad: ExplicitPadding,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: valid_ | same_): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: Double,
      pad: valid_ | same_,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: Double,
      pad: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: js.Tuple2[Double, Double], strides: Double, pad: ExplicitPadding): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: js.Tuple2[Double, Double],
      strides: Double,
      pad: ExplicitPadding,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: valid_ | same_): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: Double,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: Double,
      strides: js.Tuple2[Double, Double],
      pad: Double,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: js.Tuple2[Double, Double], pad: ExplicitPadding): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](
      filterSize: Double,
      strides: js.Tuple2[Double, Double],
      pad: ExplicitPadding,
      dimRoundingMode: floor | round | ceil
    ): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: valid_ | same_): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: valid_ | same_, dimRoundingMode: floor | round | ceil): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: Double): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: Double, dimRoundingMode: floor | round | ceil): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: ExplicitPadding): T = js.native
    def maxPool[T /* <: Tensor3D | Tensor4D */](filterSize: Double, strides: Double, pad: ExplicitPadding, dimRoundingMode: floor | round | ceil): T = js.native
    
    def maximum[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def maximum[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def mean[T /* <: Tensor[Rank] */](): T = js.native
    def mean[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    def mean[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
    def mean[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    def mean[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
    def mean[T /* <: Tensor[Rank] */](axis: Unit, keepDims: Boolean): T = js.native
    
    def min[T /* <: Tensor[Rank] */](): T = js.native
    def min[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    def min[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
    def min[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    def min[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
    def min[T /* <: Tensor[Rank] */](axis: Unit, keepDims: Boolean): T = js.native
    
    def minimum[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def minimum[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def mirrorPad[T /* <: Tensor[Rank] */](paddings: js.Array[js.Tuple2[Double, Double]], mode: reflect | symmetric): T = js.native
    
    def mod[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def mod[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def mul[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def mul[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def neg[T /* <: Tensor[Rank] */](): T = js.native
    
    def norm[T /* <: Tensor[Rank] */](): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: euclidean | fro): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: euclidean | fro, axis: js.Array[Double]): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: euclidean | fro, axis: js.Array[Double], keepDims: Boolean): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: euclidean | fro, axis: Double): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: euclidean | fro, axis: Double, keepDims: Boolean): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: euclidean | fro, axis: Unit, keepDims: Boolean): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: Double): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: Double, axis: js.Array[Double]): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: Double, axis: js.Array[Double], keepDims: Boolean): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: Double, axis: Double): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: Double, axis: Double, keepDims: Boolean): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: Double, axis: Unit, keepDims: Boolean): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: Unit, axis: js.Array[Double]): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: Unit, axis: js.Array[Double], keepDims: Boolean): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: Unit, axis: Double): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: Unit, axis: Double, keepDims: Boolean): Tensor[Rank] = js.native
    def norm[T /* <: Tensor[Rank] */](ord: Unit, axis: Unit, keepDims: Boolean): Tensor[Rank] = js.native
    
    def notEqual[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def notEqual[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def oneHot(depth: Double, onValue: Double, offValue: Double): Tensor[Rank] = js.native
    
    def onesLike[T /* <: Tensor[Rank] */](): T = js.native
    
    def pad[T /* <: Tensor[Rank] */](paddings: js.Array[js.Tuple2[Double, Double]]): T = js.native
    def pad[T /* <: Tensor[Rank] */](paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double): T = js.native
    
    def pool[T /* <: Tensor3D | Tensor4D */](
      windowShape: (js.Tuple2[Double, Double]) | Double,
      poolingType: avg | max,
      padding: valid_ | same_ | Double | ExplicitPadding,
      diationRate: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
      strides: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
      dimRoundingMode: js.UndefOr[floor | round | ceil]
    ): T = js.native
    
    def pow[T /* <: Tensor[Rank] */](exp: Tensor[Rank]): T = js.native
    def pow[T /* <: Tensor[Rank] */](exp: TensorLike): T = js.native
    
    def prelu[T /* <: Tensor[Rank] */](alpha: T | TensorLike): T = js.native
    
    /**
      * Prints the `tf.Tensor`. See `tf.print` for details.
      *
      * @param verbose Whether to print verbose information about the tensor,
      *    including dtype and size.
      *
      * @doc {heading: 'Tensors', subheading: 'Classes'}
      */
    def print(): Unit = js.native
    def print(verbose: Boolean): Unit = js.native
    
    def prod[T /* <: Tensor[Rank] */](): T = js.native
    def prod[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    def prod[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
    def prod[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    def prod[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
    def prod[T /* <: Tensor[Rank] */](axis: Unit, keepDims: Boolean): T = js.native
    
    def rank: Double = js.native
    
    /** The rank type for the array (see `Rank` enum). */
    val rankType: R = js.native
    
    def reciprocal[T /* <: Tensor[Rank] */](): T = js.native
    
    def relu[T /* <: Tensor[Rank] */](): T = js.native
    
    def relu6[T /* <: Tensor[Rank] */](): T = js.native
    
    def reshape[T /* <: Tensor[Rank] */](shape: js.Array[Double]): T = js.native
    
    def reshapeAs[T /* <: Tensor[Rank] */](x: T): T = js.native
    
    def resizeBilinear[T /* <: Tensor3D | Tensor4D */](newShape2D: js.Tuple2[Double, Double]): T = js.native
    def resizeBilinear[T /* <: Tensor3D | Tensor4D */](newShape2D: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    def resizeBilinear[T /* <: Tensor3D | Tensor4D */](newShape2D: js.Tuple2[Double, Double], alignCorners: Boolean, halfPixelCenters: Boolean): T = js.native
    def resizeBilinear[T /* <: Tensor3D | Tensor4D */](newShape2D: js.Tuple2[Double, Double], alignCorners: Unit, halfPixelCenters: Boolean): T = js.native
    
    def resizeNearestNeighbor[T /* <: Tensor3D | Tensor4D */](newShape2D: js.Tuple2[Double, Double]): T = js.native
    def resizeNearestNeighbor[T /* <: Tensor3D | Tensor4D */](newShape2D: js.Tuple2[Double, Double], alignCorners: Boolean): T = js.native
    def resizeNearestNeighbor[T /* <: Tensor3D | Tensor4D */](newShape2D: js.Tuple2[Double, Double], alignCorners: Boolean, halfFloatCenters: Boolean): T = js.native
    def resizeNearestNeighbor[T /* <: Tensor3D | Tensor4D */](newShape2D: js.Tuple2[Double, Double], alignCorners: Unit, halfFloatCenters: Boolean): T = js.native
    
    def reverse[T /* <: Tensor[Rank] */](): T = js.native
    def reverse[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    def reverse[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    
    def rfft[T /* <: Tensor[Rank] */](): Tensor[Rank] = js.native
    
    def round[T /* <: Tensor[Rank] */](): T = js.native
    
    def rsqrt[T /* <: Tensor[Rank] */](): T = js.native
    
    /** The id of the scope this tensor is being tracked in. */
    var scopeId: Double = js.native
    
    def selu[T /* <: Tensor[Rank] */](): T = js.native
    
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: Tensor4D,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: Tensor4D,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilation: js.Tuple2[Double, Double]
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: Tensor4D,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilation: js.Tuple2[Double, Double],
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: Tensor4D,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilation: Double
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: Tensor4D,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilation: Double,
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: Tensor4D,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilation: Unit,
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](depthwiseFilter: Tensor4D, pointwiseFilter: Tensor4D, strides: Double, pad: valid_ | same_): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: Tensor4D,
      strides: Double,
      pad: valid_ | same_,
      dilation: js.Tuple2[Double, Double]
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: Tensor4D,
      strides: Double,
      pad: valid_ | same_,
      dilation: js.Tuple2[Double, Double],
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: Tensor4D,
      strides: Double,
      pad: valid_ | same_,
      dilation: Double
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: Tensor4D,
      strides: Double,
      pad: valid_ | same_,
      dilation: Double,
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: Tensor4D,
      strides: Double,
      pad: valid_ | same_,
      dilation: Unit,
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: TensorLike,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: TensorLike,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilation: js.Tuple2[Double, Double]
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: TensorLike,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilation: js.Tuple2[Double, Double],
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: TensorLike,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilation: Double
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: TensorLike,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilation: Double,
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: TensorLike,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilation: Unit,
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](depthwiseFilter: Tensor4D, pointwiseFilter: TensorLike, strides: Double, pad: valid_ | same_): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: TensorLike,
      strides: Double,
      pad: valid_ | same_,
      dilation: js.Tuple2[Double, Double]
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: TensorLike,
      strides: Double,
      pad: valid_ | same_,
      dilation: js.Tuple2[Double, Double],
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: TensorLike,
      strides: Double,
      pad: valid_ | same_,
      dilation: Double
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: TensorLike,
      strides: Double,
      pad: valid_ | same_,
      dilation: Double,
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: Tensor4D,
      pointwiseFilter: TensorLike,
      strides: Double,
      pad: valid_ | same_,
      dilation: Unit,
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: Tensor4D,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: Tensor4D,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilation: js.Tuple2[Double, Double]
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: Tensor4D,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilation: js.Tuple2[Double, Double],
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: Tensor4D,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilation: Double
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: Tensor4D,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilation: Double,
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: Tensor4D,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilation: Unit,
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](depthwiseFilter: TensorLike4D, pointwiseFilter: Tensor4D, strides: Double, pad: valid_ | same_): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: Tensor4D,
      strides: Double,
      pad: valid_ | same_,
      dilation: js.Tuple2[Double, Double]
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: Tensor4D,
      strides: Double,
      pad: valid_ | same_,
      dilation: js.Tuple2[Double, Double],
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: Tensor4D,
      strides: Double,
      pad: valid_ | same_,
      dilation: Double
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: Tensor4D,
      strides: Double,
      pad: valid_ | same_,
      dilation: Double,
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: Tensor4D,
      strides: Double,
      pad: valid_ | same_,
      dilation: Unit,
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: TensorLike,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: TensorLike,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilation: js.Tuple2[Double, Double]
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: TensorLike,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilation: js.Tuple2[Double, Double],
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: TensorLike,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilation: Double
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: TensorLike,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilation: Double,
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: TensorLike,
      strides: js.Tuple2[Double, Double],
      pad: valid_ | same_,
      dilation: Unit,
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](depthwiseFilter: TensorLike4D, pointwiseFilter: TensorLike, strides: Double, pad: valid_ | same_): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: TensorLike,
      strides: Double,
      pad: valid_ | same_,
      dilation: js.Tuple2[Double, Double]
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: TensorLike,
      strides: Double,
      pad: valid_ | same_,
      dilation: js.Tuple2[Double, Double],
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: TensorLike,
      strides: Double,
      pad: valid_ | same_,
      dilation: Double
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: TensorLike,
      strides: Double,
      pad: valid_ | same_,
      dilation: Double,
      dataFormat: NHWC | NCHW
    ): T = js.native
    def separableConv2d[T /* <: Tensor3D | Tensor4D */](
      depthwiseFilter: TensorLike4D,
      pointwiseFilter: TensorLike,
      strides: Double,
      pad: valid_ | same_,
      dilation: Unit,
      dataFormat: NHWC | NCHW
    ): T = js.native
    
    /** The shape of the tensor. */
    val shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any = js.native
    
    def sigmoid[T /* <: Tensor[Rank] */](): T = js.native
    
    def sign[T /* <: Tensor[Rank] */](): T = js.native
    
    def sin[T /* <: Tensor[Rank] */](): T = js.native
    
    def sinh[T /* <: Tensor[Rank] */](): T = js.native
    
    /** Number of elements in the tensor. */
    val size: Double = js.native
    
    def slice[T /* <: Tensor[Rank] */](begin: js.Array[Double]): T = js.native
    def slice[T /* <: Tensor[Rank] */](begin: js.Array[Double], size: js.Array[Double]): T = js.native
    def slice[T /* <: Tensor[Rank] */](begin: js.Array[Double], size: Double): T = js.native
    def slice[T /* <: Tensor[Rank] */](begin: Double): T = js.native
    def slice[T /* <: Tensor[Rank] */](begin: Double, size: js.Array[Double]): T = js.native
    def slice[T /* <: Tensor[Rank] */](begin: Double, size: Double): T = js.native
    
    def softmax[T /* <: Tensor[Rank] */](): T = js.native
    def softmax[T /* <: Tensor[Rank] */](dim: Double): T = js.native
    
    def softplus[T /* <: Tensor[Rank] */](): T = js.native
    
    def spaceToBatchND[R /* <: Rank */](blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): Tensor[R] = js.native
    
    def split[T /* <: Tensor[Rank] */](numOrSizeSplits: js.Array[Double]): js.Array[T] = js.native
    def split[T /* <: Tensor[Rank] */](numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
    def split[T /* <: Tensor[Rank] */](numOrSizeSplits: Double): js.Array[T] = js.native
    def split[T /* <: Tensor[Rank] */](numOrSizeSplits: Double, axis: Double): js.Array[T] = js.native
    
    def sqrt[T /* <: Tensor[Rank] */](): T = js.native
    
    def square[T /* <: Tensor[Rank] */](): T = js.native
    
    def squaredDifference[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def squaredDifference[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def squeeze[T /* <: Tensor[Rank] */](): T = js.native
    def squeeze[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    
    def stack[T /* <: Tensor[Rank] */](x: js.Array[Tensor[Rank]]): T = js.native
    def stack[T /* <: Tensor[Rank] */](x: js.Array[Tensor[Rank]], axis: Double): T = js.native
    def stack[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = js.native
    def stack[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = js.native
    
    def step[T /* <: Tensor[Rank] */](): T = js.native
    def step[T /* <: Tensor[Rank] */](alpha: Double): T = js.native
    
    def stridedSlice[T /* <: Tensor[Rank] */](begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double]): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](begin: js.Array[Double], end: js.Array[Double], strides: js.Array[Double], beginMask: Double): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Double,
      ellipsisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Double,
      ellipsisMask: Double,
      newAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Double,
      ellipsisMask: Double,
      newAxisMask: Double,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Double,
      ellipsisMask: Double,
      newAxisMask: Unit,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Double,
      ellipsisMask: Unit,
      newAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Double,
      ellipsisMask: Unit,
      newAxisMask: Double,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Double,
      ellipsisMask: Unit,
      newAxisMask: Unit,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Unit,
      ellipsisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Unit,
      ellipsisMask: Double,
      newAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Unit,
      ellipsisMask: Double,
      newAxisMask: Double,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Unit,
      ellipsisMask: Double,
      newAxisMask: Unit,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Unit,
      ellipsisMask: Unit,
      newAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Unit,
      ellipsisMask: Unit,
      newAxisMask: Double,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Double,
      endMask: Unit,
      ellipsisMask: Unit,
      newAxisMask: Unit,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Unit,
      endMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Unit,
      endMask: Double,
      ellipsisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Unit,
      endMask: Double,
      ellipsisMask: Double,
      newAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Unit,
      endMask: Double,
      ellipsisMask: Double,
      newAxisMask: Double,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Unit,
      endMask: Double,
      ellipsisMask: Double,
      newAxisMask: Unit,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Unit,
      endMask: Double,
      ellipsisMask: Unit,
      newAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Unit,
      endMask: Double,
      ellipsisMask: Unit,
      newAxisMask: Double,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Unit,
      endMask: Double,
      ellipsisMask: Unit,
      newAxisMask: Unit,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Unit,
      endMask: Unit,
      ellipsisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Unit,
      endMask: Unit,
      ellipsisMask: Double,
      newAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Unit,
      endMask: Unit,
      ellipsisMask: Double,
      newAxisMask: Double,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Unit,
      endMask: Unit,
      ellipsisMask: Double,
      newAxisMask: Unit,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Unit,
      endMask: Unit,
      ellipsisMask: Unit,
      newAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Unit,
      endMask: Unit,
      ellipsisMask: Unit,
      newAxisMask: Double,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    def stridedSlice[T /* <: Tensor[Rank] */](
      begin: js.Array[Double],
      end: js.Array[Double],
      strides: js.Array[Double],
      beginMask: Unit,
      endMask: Unit,
      ellipsisMask: Unit,
      newAxisMask: Unit,
      shrinkAxisMask: Double
    ): Tensor[Rank] = js.native
    
    /**
      * Number of elements to skip in each dimension when indexing. See
      * https://docs.scipy.org/doc/numpy/reference/generated/\
      * numpy.ndarray.strides.html
      */
    val strides: js.Array[Double] = js.native
    
    def sub[T /* <: Tensor[Rank] */](b: Tensor[Rank]): T = js.native
    def sub[T /* <: Tensor[Rank] */](b: TensorLike): T = js.native
    
    def sum[T /* <: Tensor[Rank] */](): T = js.native
    def sum[T /* <: Tensor[Rank] */](axis: js.Array[Double]): T = js.native
    def sum[T /* <: Tensor[Rank] */](axis: js.Array[Double], keepDims: Boolean): T = js.native
    def sum[T /* <: Tensor[Rank] */](axis: Double): T = js.native
    def sum[T /* <: Tensor[Rank] */](axis: Double, keepDims: Boolean): T = js.native
    def sum[T /* <: Tensor[Rank] */](axis: Unit, keepDims: Boolean): T = js.native
    
    def tan[T /* <: Tensor[Rank] */](): T = js.native
    
    def tanh[T /* <: Tensor[Rank] */](): T = js.native
    
    def throwIfDisposed(): Unit = js.native
    
    def tile[T /* <: Tensor[Rank] */](b: js.Array[Double]): T = js.native
    
    def toBool[T /* <: Tensor[Rank] */](): T = js.native
    
    def toFloat[T /* <: Tensor[Rank] */](): T = js.native
    
    def toInt[T /* <: Tensor[Rank] */](): T = js.native
    
    def toString(verbose: Boolean): String = js.native
    
    def topk[T /* <: Tensor[Rank] */](): Indices[T] = js.native
    def topk[T /* <: Tensor[Rank] */](k: Double): Indices[T] = js.native
    def topk[T /* <: Tensor[Rank] */](k: Double, sorted: Boolean): Indices[T] = js.native
    def topk[T /* <: Tensor[Rank] */](k: Unit, sorted: Boolean): Indices[T] = js.native
    
    def transpose[T /* <: Tensor[Rank] */](): T = js.native
    def transpose[T /* <: Tensor[Rank] */](perm: js.Array[Double]): T = js.native
    
    def unique[T /* <: Tensor[Rank] */](): Indices[T] = js.native
    def unique[T /* <: Tensor[Rank] */](axis: Double): Indices[T] = js.native
    
    def unsortedSegmentSum[T /* <: Tensor[Rank] */](segmentIds: Tensor1D, numSegments: Double): T = js.native
    def unsortedSegmentSum[T /* <: Tensor[Rank] */](segmentIds: TensorLike1D, numSegments: Double): T = js.native
    
    def unstack[T /* <: Tensor[Rank] */](): js.Array[T] = js.native
    def unstack[T /* <: Tensor[Rank] */](axis: Double): js.Array[T] = js.native
    
    def variable(): Variable[R] = js.native
    def variable(trainable: Boolean): Variable[R] = js.native
    def variable(trainable: Boolean, name: String): Variable[R] = js.native
    def variable(trainable: Boolean, name: String, dtype: DataType): Variable[R] = js.native
    def variable(trainable: Boolean, name: Unit, dtype: DataType): Variable[R] = js.native
    def variable(trainable: Unit, name: String): Variable[R] = js.native
    def variable(trainable: Unit, name: String, dtype: DataType): Variable[R] = js.native
    def variable(trainable: Unit, name: Unit, dtype: DataType): Variable[R] = js.native
    
    def where[T /* <: Tensor[Rank] */](condition: Tensor[Rank], x: Tensor[Rank]): T = js.native
    def where[T /* <: Tensor[Rank] */](condition: Tensor[Rank], x: TensorLike): T = js.native
    def where[T /* <: Tensor[Rank] */](condition: TensorLike, x: Tensor[Rank]): T = js.native
    def where[T /* <: Tensor[Rank] */](condition: TensorLike, x: TensorLike): T = js.native
    
    def zerosLike[T /* <: Tensor[Rank] */](): T = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor", "TensorBuffer")
  @js.native
  open class TensorBuffer[R /* <: Rank */, D /* <: DataType */] protected () extends StObject {
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
    
    def rank: Double = js.native
    
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
  
  @JSImport("@tensorflow/tfjs-core/dist/tensor", "Variable")
  @js.native
  open class Variable[R /* <: Rank */] protected () extends Tensor[R] {
    def this(initialValue: Tensor[R], trainable: Boolean, name: String, tensorId: Double) = this()
    
    /**
      * Assign a new `tf.Tensor` to this variable. The new `tf.Tensor` must have
      * the same shape and dtype as the old `tf.Tensor`.
      *
      * @param newValue New tensor to be assigned to this variable.
      *
      * @doc {heading: 'Tensors', subheading: 'Classes'}
      */
    def assign(newValue: Tensor[R]): Unit = js.native
    
    var name: String = js.native
    
    var trainable: Boolean = js.native
  }
  
  inline def getGlobalTensorClass(): Instantiable4[
    /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[/ * import warning: RewrittenClass.unapply cls was tparam R * / any] */ /* shape */ js.Any, 
    /* dtype */ DataType, 
    /* dataId */ DataId, 
    /* id */ Double, 
    Tensor[Rank]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalTensorClass")().asInstanceOf[Instantiable4[
    /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[/ * import warning: RewrittenClass.unapply cls was tparam R * / any] */ /* shape */ js.Any, 
    /* dtype */ DataType, 
    /* dataId */ DataId, 
    /* id */ Double, 
    Tensor[Rank]
  ]]
  
  inline def setDeprecationWarningFn(fn: js.Function1[/* msg */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDeprecationWarningFn")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setOpHandler(handler: OpHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOpHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setTensorTracker(fn: js.Function0[TensorTracker]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTensorTracker")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Backend extends StObject
  
  type DataId = js.Object
  
  type DataToGPUOptions = DataToGPUWebGLOption
  
  trait DataToGPUWebGLOption extends StObject {
    
    var customTexShape: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  }
  object DataToGPUWebGLOption {
    
    inline def apply(): DataToGPUWebGLOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataToGPUWebGLOption]
    }
    
    extension [Self <: DataToGPUWebGLOption](x: Self) {
      
      inline def setCustomTexShape(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "customTexShape", value.asInstanceOf[js.Any])
      
      inline def setCustomTexShapeUndefined: Self = StObject.set(x, "customTexShape", js.undefined)
    }
  }
  
  trait GPUData extends StObject {
    
    var bufSize: js.UndefOr[Double] = js.undefined
    
    var buffer: js.UndefOr[GPUBuffer] = js.undefined
    
    var tensorRef: Tensor[Rank]
    
    var texShape: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var texture: js.UndefOr[WebGLTexture] = js.undefined
  }
  object GPUData {
    
    inline def apply(tensorRef: Tensor[Rank]): GPUData = {
      val __obj = js.Dynamic.literal(tensorRef = tensorRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[GPUData]
    }
    
    extension [Self <: GPUData](x: Self) {
      
      inline def setBufSize(value: Double): Self = StObject.set(x, "bufSize", value.asInstanceOf[js.Any])
      
      inline def setBufSizeUndefined: Self = StObject.set(x, "bufSize", js.undefined)
      
      inline def setBuffer(value: GPUBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setTensorRef(value: Tensor[Rank]): Self = StObject.set(x, "tensorRef", value.asInstanceOf[js.Any])
      
      inline def setTexShape(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "texShape", value.asInstanceOf[js.Any])
      
      inline def setTexShapeUndefined: Self = StObject.set(x, "texShape", js.undefined)
      
      inline def setTexture(value: WebGLTexture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
      
      inline def setTextureUndefined: Self = StObject.set(x, "texture", js.undefined)
    }
  }
  
  @js.native
  trait NumericTensor[R /* <: Rank */] extends Tensor[R] {
    
    @JSName("dtype")
    var dtype_NumericTensor: NumericDataType = js.native
  }
  
  @js.native
  trait OpHandler extends StObject {
    
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
      dtype: string
    ): TensorBuffer[R, string] = js.native
    @JSName("buffer")
    def buffer_string[R /* <: Rank */](
      shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
      dtype: string,
      values: js.Array[String]
    ): TensorBuffer[R, string] = js.native
    
    def cast[T /* <: Tensor[Rank] */](x: T, dtype: DataType): T = js.native
    
    def clone[T /* <: Tensor[Rank] */](x: T): T = js.native
    
    def print[T /* <: Tensor[Rank] */](x: T, verbose: Boolean): Unit = js.native
  }
  
  type Scalar = Tensor[R0]
  
  @js.native
  trait StringTensor[R /* <: Rank */] extends Tensor[R] {
    
    @JSName("dtype")
    var dtype_StringTensor: string = js.native
  }
  
  type Tensor1D = Tensor[R1]
  
  type Tensor2D = Tensor[R2]
  
  type Tensor3D = Tensor[R3]
  
  type Tensor4D = Tensor[R4]
  
  type Tensor5D = Tensor[R5]
  
  type Tensor6D = Tensor[R6]
  
  trait TensorData[D /* <: DataType */] extends StObject {
    
    var dataId: js.UndefOr[DataId] = js.undefined
    
    var values: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any
      ] = js.undefined
  }
  object TensorData {
    
    inline def apply[D /* <: DataType */](): TensorData[D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TensorData[D]]
    }
    
    extension [Self <: TensorData[?], D /* <: DataType */](x: Self & TensorData[D]) {
      
      inline def setDataId(value: DataId): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
      
      inline def setDataIdUndefined: Self = StObject.set(x, "dataId", js.undefined)
      
      inline def setValues(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any
      ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  @js.native
  trait TensorTracker extends StObject {
    
    def disposeTensor(t: Tensor[Rank]): Unit = js.native
    
    def disposeVariable(v: Variable[Rank]): Unit = js.native
    
    def incRef(a: Tensor[Rank], backend: Backend): Unit = js.native
    
    def makeTensor(values: DataValues, shape: js.Array[Double], dtype: DataType): Tensor[Rank] = js.native
    def makeTensor(values: DataValues, shape: js.Array[Double], dtype: DataType, backend: Backend): Tensor[Rank] = js.native
    
    def makeVariable(initialValue: Tensor[Rank]): Variable[Rank] = js.native
    def makeVariable(initialValue: Tensor[Rank], trainable: Boolean): Variable[Rank] = js.native
    def makeVariable(initialValue: Tensor[Rank], trainable: Boolean, name: String): Variable[Rank] = js.native
    def makeVariable(initialValue: Tensor[Rank], trainable: Boolean, name: String, dtype: DataType): Variable[Rank] = js.native
    def makeVariable(initialValue: Tensor[Rank], trainable: Boolean, name: Unit, dtype: DataType): Variable[Rank] = js.native
    def makeVariable(initialValue: Tensor[Rank], trainable: Unit, name: String): Variable[Rank] = js.native
    def makeVariable(initialValue: Tensor[Rank], trainable: Unit, name: String, dtype: DataType): Variable[Rank] = js.native
    def makeVariable(initialValue: Tensor[Rank], trainable: Unit, name: Unit, dtype: DataType): Variable[Rank] = js.native
    
    def read(dataId: DataId): js.Promise[BackendValues] = js.native
    
    def readSync(dataId: DataId): BackendValues = js.native
    
    def readToGPU(dataId: DataId): GPUData = js.native
    def readToGPU(dataId: DataId, options: DataToGPUOptions): GPUData = js.native
  }
}
