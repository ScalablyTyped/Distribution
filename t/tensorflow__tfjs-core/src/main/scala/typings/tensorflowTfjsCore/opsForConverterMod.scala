package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.anon.A
import typings.tensorflowTfjsCore.anon.Activation
import typings.tensorflowTfjsCore.anon.Bias
import typings.tensorflowTfjsCore.anon.Indices
import typings.tensorflowTfjsCore.anon.Mean
import typings.tensorflowTfjsCore.anon.Values
import typings.tensorflowTfjsCore.convUtilMod.ExplicitPadding
import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor
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
import typings.tensorflowTfjsCore.distTypesMod.Rank.R1
import typings.tensorflowTfjsCore.distTypesMod.Rank.R2
import typings.tensorflowTfjsCore.distTypesMod.Rank.R3
import typings.tensorflowTfjsCore.distTypesMod.Rank.R4
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typings.tensorflowTfjsCore.distTypesMod.ScalarLike
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.distTypesMod.TensorLike1D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike2D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike3D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike5D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike6D
import typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction
import typings.tensorflowTfjsCore.multiRnnCellMod.LSTMCellFunc
import typings.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCDHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NDHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.avg
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bilinear
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.euclidean
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.fro
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.max
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.nearest
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reflect
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.symmetric
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opsForConverterMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "OP_SCOPE_SUFFIX")
  @js.native
  val OP_SCOPE_SUFFIX: /* "__op" */ String = js.native
  
  @scala.inline
  def abs[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def acos[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("acos")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def acosh[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("acosh")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def add[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def add[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def add[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def add[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def addN[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("addN")(tensors.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def addStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def all[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def all[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def all[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def all[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def all[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def all[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def all[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def all[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def all[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def all[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def all[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def all[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def any[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def any[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def any[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def any[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def any[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def any[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def any[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def any[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def any[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def any[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def any[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def any[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def argMax[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("argMax")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def argMax[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("argMax")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def argMax[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("argMax")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def argMax[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("argMax")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def argMin[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("argMin")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def argMin[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("argMin")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def argMin[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("argMin")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def argMin[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("argMin")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def asin[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("asin")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def asinh[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("asinh")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def atan[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("atan")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def atan2[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def atan2[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def atan2[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def atan2[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def atanh[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("atanh")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def avgPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def avgPool3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dimRoundingMode: js.UndefOr[floor | round | ceil],
    dataFormat: js.UndefOr[NDHWC | NCDHW],
    dilations: js.UndefOr[(js.Tuple3[Double, Double, Double]) | Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool3d")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "basicLSTMCell")
  @js.native
  val basicLSTMCell: js.Function6[
    /* forgetBias */ Scalar | TensorLike, 
    /* lstmKernel */ Tensor2D | TensorLike, 
    /* lstmBias */ Tensor1D | TensorLike, 
    /* data */ Tensor2D | TensorLike, 
    /* c */ Tensor2D | TensorLike, 
    /* h */ Tensor2D | TensorLike, 
    js.Tuple2[Tensor2D, Tensor2D]
  ] = js.native
  
  @scala.inline
  def batchNorm[R /* <: Rank */](
    x: Tensor[R] | TensorLike,
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    offset: js.UndefOr[Tensor[R] | Tensor1D | TensorLike],
    scale: js.UndefOr[Tensor[R] | Tensor1D | TensorLike],
    varianceEpsilon: js.UndefOr[Double]
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("batchNorm")(x.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], variance.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], varianceEpsilon.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "batchNorm2d")
  @js.native
  val batchNorm2d: js.Function6[
    /* x */ Tensor2D | TensorLike, 
    /* mean */ Tensor2D | Tensor1D | TensorLike, 
    /* variance */ Tensor2D | Tensor1D | TensorLike, 
    /* offset */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
    /* scale */ js.UndefOr[Tensor2D | Tensor1D | TensorLike], 
    /* varianceEpsilon */ js.UndefOr[Double], 
    Tensor2D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "batchNorm3d")
  @js.native
  val batchNorm3d: js.Function6[
    /* x */ Tensor3D | TensorLike, 
    /* mean */ Tensor3D | Tensor1D | TensorLike, 
    /* variance */ Tensor3D | Tensor1D | TensorLike, 
    /* offset */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
    /* scale */ js.UndefOr[Tensor3D | Tensor1D | TensorLike], 
    /* varianceEpsilon */ js.UndefOr[Double], 
    Tensor3D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "batchNorm4d")
  @js.native
  val batchNorm4d: js.Function6[
    /* x */ Tensor4D | TensorLike, 
    /* mean */ Tensor4D | Tensor1D | TensorLike, 
    /* variance */ Tensor4D | Tensor1D | TensorLike, 
    /* offset */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
    /* scale */ js.UndefOr[Tensor4D | Tensor1D | TensorLike], 
    /* varianceEpsilon */ js.UndefOr[Double], 
    Tensor4D
  ] = js.native
  
  @scala.inline
  def batchToSpaceND[T /* <: Tensor[Rank] */](x: T | TensorLike, blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("batchToSpaceND")(x.asInstanceOf[js.Any], blockShape.asInstanceOf[js.Any], crops.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "booleanMaskAsync")
  @js.native
  val booleanMaskAsync: js.Function3[
    /* tensor */ Tensor[Rank] | TensorLike, 
    /* mask */ Tensor[Rank] | TensorLike, 
    /* axis */ js.UndefOr[Double], 
    js.Promise[Tensor[Rank]]
  ] = js.native
  
  @scala.inline
  def broadcastTo[R /* <: Rank */](
    x: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcastTo")(x.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def broadcastTo[R /* <: Rank */](
    x: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcastTo")(x.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  @scala.inline
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): TensorBuffer[R, float32] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any]).asInstanceOf[TensorBuffer[R, float32]]
  @scala.inline
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    values: js.Array[String]
  ): TensorBuffer[R, string] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, string]]
  @scala.inline
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    values: Float32Array
  ): TensorBuffer[R, float32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, float32]]
  @scala.inline
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    values: Int32Array
  ): TensorBuffer[R, int32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, int32]]
  @scala.inline
  def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    values: Uint8Array
  ): TensorBuffer[R, bool] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, bool]]
  
  @scala.inline
  def buffer_bool[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool
  ): TensorBuffer[R, bool] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, bool]]
  @scala.inline
  def buffer_bool[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool,
    values: Uint8Array
  ): TensorBuffer[R, bool] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, bool]]
  
  @scala.inline
  def buffer_complex64[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64
  ): TensorBuffer[R, complex64] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, complex64]]
  @scala.inline
  def buffer_complex64[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64,
    values: Float32Array
  ): TensorBuffer[R, complex64] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, complex64]]
  
  @scala.inline
  def buffer_float32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: float32
  ): TensorBuffer[R, float32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, float32]]
  @scala.inline
  def buffer_float32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: float32,
    values: Float32Array
  ): TensorBuffer[R, float32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, float32]]
  
  @scala.inline
  def buffer_int32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32
  ): TensorBuffer[R, int32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, int32]]
  @scala.inline
  def buffer_int32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32,
    values: Int32Array
  ): TensorBuffer[R, int32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, int32]]
  
  @scala.inline
  def buffer_string[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: string
  ): TensorBuffer[R, string] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, string]]
  @scala.inline
  def buffer_string[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: string,
    values: js.Array[String]
  ): TensorBuffer[R, string] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, string]]
  
  @scala.inline
  def cast[T /* <: Tensor[Rank] */](x: T | TensorLike, dtype: DataType): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cast")(x.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def ceil[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("ceil")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def clipByValue[T /* <: Tensor[Rank] */](x: T | TensorLike, clipValueMin: Double, clipValueMax: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clipByValue")(x.asInstanceOf[js.Any], clipValueMin.asInstanceOf[js.Any], clipValueMax.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def clone_[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def complex[T /* <: Tensor[Rank] */](real: T | TensorLike, imag: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("complex")(real.asInstanceOf[js.Any], imag.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def concat[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(tensors.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def concat[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(tensors.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "concat1d")
  @js.native
  val concat1d: js.Function1[/* tensors */ js.Array[Tensor1D | TensorLike], Tensor1D] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "concat2d")
  @js.native
  val concat2d: js.Function2[/* tensors */ js.Array[Tensor2D | TensorLike], /* axis */ Double, Tensor2D] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "concat3d")
  @js.native
  val concat3d: js.Function2[/* tensors */ js.Array[Tensor3D | TensorLike], /* axis */ Double, Tensor3D] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "concat4d")
  @js.native
  val concat4d: js.Function2[/* tensors */ js.Array[Tensor4D | TensorLike], /* axis */ Double, Tensor4D] = js.native
  
  @scala.inline
  def conv1d[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid_ | same_ | Double | ExplicitPadding,
    dataFormat: js.UndefOr[NWC | NCW],
    dilation: js.UndefOr[Double],
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilation.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def conv2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double | ExplicitPadding,
    dataFormat: js.UndefOr[NHWC | NCHW],
    dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    outputShape: (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple3[Double, Double, Double]),
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D | TensorLike,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_,
    dataFormat: js.UndefOr[NDHWC | NCDHW],
    dilations: js.UndefOr[(js.Tuple3[Double, Double, Double]) | Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: same_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: same_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def cos[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cos")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def cosh[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cosh")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def cosineWindow(windowLength: Double, a: Double, b: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineWindow")(windowLength.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  
  @scala.inline
  def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Boolean, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Unit, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, exclusive: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, exclusive: Boolean, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, exclusive: Unit, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def cumsum[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Boolean, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Unit, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, exclusive: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, exclusive: Boolean, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, exclusive: Unit, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "depthToSpace")
  @js.native
  val depthToSpace: js.Function3[
    /* x */ Tensor4D | TensorLike4D, 
    /* blockSize */ Double, 
    /* dataFormat */ js.UndefOr[NHWC | NCHW], 
    Tensor4D
  ] = js.native
  
  @scala.inline
  def depthwiseConv2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dataFormat: js.UndefOr[NHWC | NCHW],
    dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "diag")
  @js.native
  val diag: js.Function1[/* x */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @scala.inline
  def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_,
    dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    dataFormat: js.UndefOr[NHWC]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def div[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def div[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def div[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def div[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def divNoNan[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("divNoNan")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def divNoNan[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("divNoNan")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def divNoNan[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("divNoNan")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def divNoNan[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("divNoNan")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def divStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("divStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "dot")
  @js.native
  val dot: js.Function2[/* t1 */ Tensor[Rank] | TensorLike, /* t2 */ Tensor[Rank] | TensorLike, Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "dropout")
  @js.native
  val dropout: js.Function4[
    /* x */ Tensor[Rank] | TensorLike, 
    /* rate */ Double, 
    /* noiseShape */ js.UndefOr[js.Array[Double]], 
    /* seed */ js.UndefOr[Double | String], 
    Tensor[Rank]
  ] = js.native
  
  @scala.inline
  def elu[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("elu")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def enclosingPowerOfTwo(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("enclosingPowerOfTwo")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def equal[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def equal[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def equal[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def equal[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def equalStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("equalStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def erf[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("erf")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def exp[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("exp")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def expandDims[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("expandDims")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def expandDims[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("expandDims")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def expandDims[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("expandDims")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def expandDims[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("expandDims")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def expm1[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("expm1")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "eye")
  @js.native
  val eye: js.Function4[
    /* numRows */ Double, 
    /* numColumns */ js.UndefOr[Double], 
    /* batchShape */ js.UndefOr[
      js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
    ], 
    /* dtype */ js.UndefOr[DataType], 
    Tensor2D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "fft")
  @js.native
  val fft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @scala.inline
  def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(shape.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def fill[R /* <: Rank */](
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
  @scala.inline
  def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(shape.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def fill[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    value: Double,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(shape.asInstanceOf[js.Any], value.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  @scala.inline
  def floor[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("floor")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def floorDiv[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("floorDiv")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def floorDiv[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("floorDiv")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def floorDiv[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("floorDiv")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def floorDiv[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("floorDiv")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  object fused {
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "fused")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def conv2d[T /* <: Tensor3D | Tensor4D */](
      hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights: Activation[T]
    ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @scala.inline
    def depthwiseConv2d[T /* <: Tensor3D | Tensor4D */](
      hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights: Bias[T]
    ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @scala.inline
    def matMul[T /* <: Tensor[Rank] */](hasABTransposeATransposeBBiasActivationPreluActivationWeights: A[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(hasABTransposeATransposeBBiasActivationPreluActivationWeights.asInstanceOf[js.Any]).asInstanceOf[T]
  }
  
  @scala.inline
  def gather[T /* <: Tensor[Rank] */](x: T | TensorLike, indices: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("gather")(x.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def gather[T /* <: Tensor[Rank] */](x: T | TensorLike, indices: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("gather")(x.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def gather[T /* <: Tensor[Rank] */](x: T | TensorLike, indices: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("gather")(x.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def gather[T /* <: Tensor[Rank] */](x: T | TensorLike, indices: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("gather")(x.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "gatherND")
  @js.native
  val gatherND: js.Function2[
    /* x */ Tensor[Rank] | TensorLike, 
    /* indices */ Tensor[Rank] | TensorLike, 
    Tensor[Rank]
  ] = js.native
  
  @scala.inline
  def greater[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("greater")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def greater[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("greater")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def greater[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("greater")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def greater[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("greater")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def greaterEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def greaterEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def greaterEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def greaterEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def greaterEqualStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterEqualStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def greaterStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "ifft")
  @js.native
  val ifft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @scala.inline
  def imag[T /* <: Tensor[Rank] */](input: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("imag")(input.asInstanceOf[js.Any]).asInstanceOf[T]
  
  object image {
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "image")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def cropAndResize(
      image: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | Tensor[R4],
      boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | Tensor[R2],
      boxInd: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | Tensor[R1],
      cropSize: js.Tuple2[Double, Double],
      method: js.UndefOr[nearest | bilinear],
      extrapolationValue: js.UndefOr[Double]
    ): Tensor[R4] = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R4]]
    
    @scala.inline
    def flipLeftRight(image: String): Tensor[R4] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor[R4]]
    @scala.inline
    def flipLeftRight(image: js.Array[Uint8Array]): Tensor[R4] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor[R4]]
    @scala.inline
    def flipLeftRight(image: Boolean): Tensor[R4] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor[R4]]
    @scala.inline
    def flipLeftRight(image: Double): Tensor[R4] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor[R4]]
    @scala.inline
    def flipLeftRight(image: Float32Array): Tensor[R4] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor[R4]]
    @scala.inline
    def flipLeftRight(image: Int32Array): Tensor[R4] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor[R4]]
    @scala.inline
    def flipLeftRight(image: Uint8Array): Tensor[R4] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor[R4]]
    @scala.inline
    def flipLeftRight(image: Tensor[R4]): Tensor[R4] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor[R4]]
    @scala.inline
    def flipLeftRight(
      image: RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]
    ): Tensor[R4] = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor[R4]]
    
    @scala.inline
    def nonMaxSuppression(
      boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | Tensor[R2],
      scores: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | Tensor[R1],
      maxOutputSize: Double,
      iouThreshold: js.UndefOr[Double],
      scoreThreshold: js.UndefOr[Double]
    ): Tensor[R1] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor[R1]]
    
    @scala.inline
    def nonMaxSuppressionAsync(
      boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | Tensor[R2],
      scores: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | Tensor[R1],
      maxOutputSize: Double,
      iouThreshold: js.UndefOr[Double],
      scoreThreshold: js.UndefOr[Double]
    ): js.Promise[Tensor[R1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor[R1]]]
    
    @scala.inline
    def nonMaxSuppressionPadded(
      boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | Tensor[R2],
      scores: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | Tensor[R1],
      maxOutputSize: Double,
      iouThreshold: js.UndefOr[Double],
      scoreThreshold: js.UndefOr[Double],
      padToMaxOutputSize: js.UndefOr[Boolean]
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    
    @scala.inline
    def nonMaxSuppressionPaddedAsync(
      boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | Tensor[R2],
      scores: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | Tensor[R1],
      maxOutputSize: Double,
      iouThreshold: js.UndefOr[Double],
      scoreThreshold: js.UndefOr[Double],
      padToMaxOutputSize: js.UndefOr[Boolean]
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    
    @scala.inline
    def nonMaxSuppressionWithScore(
      boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | Tensor[R2],
      scores: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | Tensor[R1],
      maxOutputSize: Double,
      iouThreshold: js.UndefOr[Double],
      scoreThreshold: js.UndefOr[Double],
      softNmsSigma: js.UndefOr[Double]
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    
    @scala.inline
    def nonMaxSuppressionWithScoreAsync(
      boxes: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | Tensor[R2],
      scores: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | Tensor[R1],
      maxOutputSize: Double,
      iouThreshold: js.UndefOr[Double],
      scoreThreshold: js.UndefOr[Double],
      softNmsSigma: js.UndefOr[Double]
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    
    @scala.inline
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: T, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: T, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.Array[Uint8Array], size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: js.Array[Uint8Array], size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Float32Array, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Float32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Int32Array, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Int32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Uint8Array, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](images: Uint8Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](
      images: RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ],
      size: js.Tuple2[Double, Double]
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeBilinear[T /* <: Tensor[R3 | R4] */](
      images: RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ],
      size: js.Tuple2[Double, Double],
      alignCorners: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
    
    @scala.inline
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: T, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: T, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: String, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.Array[Uint8Array], size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: js.Array[Uint8Array], size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Boolean, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Double, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Float32Array, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Float32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Int32Array, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Int32Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Uint8Array, size: js.Tuple2[Double, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](images: Uint8Array, size: js.Tuple2[Double, Double], alignCorners: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](
      images: RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ],
      size: js.Tuple2[Double, Double]
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def resizeNearestNeighbor[T /* <: Tensor[R3 | R4] */](
      images: RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ],
      size: js.Tuple2[Double, Double],
      alignCorners: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T]
    
    @scala.inline
    def rotateWithOffset(
      image: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | Tensor[R4],
      radians: Double,
      fillValue: js.UndefOr[Double | (js.Tuple3[Double, Double, Double])],
      center: js.UndefOr[Double | (js.Tuple2[Double, Double])]
    ): Tensor[R4] = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor[R4]]
  }
  
  @scala.inline
  def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T | TensorLike, targets: TensorLike | U): js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("inTopKAsync")(predictions.asInstanceOf[js.Any], targets.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U]]
  @scala.inline
  def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T | TensorLike, targets: TensorLike | U, k: Double): js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("inTopKAsync")(predictions.asInstanceOf[js.Any], targets.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U]]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "irfft")
  @js.native
  val irfft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  
  @scala.inline
  def isFinite[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("isFinite")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def isInf[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("isInf")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def isNaN[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("isNaN")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def leakyRelu[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("leakyRelu")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def leakyRelu[T /* <: Tensor[Rank] */](x: T | TensorLike, alpha: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("leakyRelu")(x.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def less[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("less")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def less[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("less")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def less[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("less")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def less[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("less")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def lessEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("lessEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def lessEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("lessEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def lessEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("lessEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def lessEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("lessEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def lessEqualStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("lessEqualStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def lessStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("lessStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  object linalg {
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "linalg")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def bandPart[T /* <: Tensor[Rank] */](a: T, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def bandPart[T /* <: Tensor[Rank] */](a: String, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def bandPart[T /* <: Tensor[Rank] */](a: js.Array[Uint8Array], numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def bandPart[T /* <: Tensor[Rank] */](a: Boolean, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def bandPart[T /* <: Tensor[Rank] */](a: Double, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def bandPart[T /* <: Tensor[Rank] */](a: Float32Array, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def bandPart[T /* <: Tensor[Rank] */](a: Int32Array, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def bandPart[T /* <: Tensor[Rank] */](a: Uint8Array, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def bandPart[T /* <: Tensor[Rank] */](
      a: RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ],
      numLower: Double,
      numUpper: Double
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
    
    @scala.inline
    def gramSchmidt(xs: js.Array[Tensor[R1]]): Tensor[R2] | js.Array[Tensor[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("gramSchmidt")(xs.asInstanceOf[js.Any]).asInstanceOf[Tensor[R2] | js.Array[Tensor[R1]]]
    @scala.inline
    def gramSchmidt(xs: Tensor[R2]): Tensor[R2] | js.Array[Tensor[R1]] = ^.asInstanceOf[js.Dynamic].applyDynamic("gramSchmidt")(xs.asInstanceOf[js.Any]).asInstanceOf[Tensor[R2] | js.Array[Tensor[R1]]]
    
    @scala.inline
    def qr(x: Tensor[Rank]): js.Tuple2[Tensor[Rank], Tensor[Rank]] = ^.asInstanceOf[js.Dynamic].applyDynamic("qr")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Tensor[Rank], Tensor[Rank]]]
    @scala.inline
    def qr(x: Tensor[Rank], fullMatrices: Boolean): js.Tuple2[Tensor[Rank], Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("qr")(x.asInstanceOf[js.Any], fullMatrices.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Tensor[Rank], Tensor[Rank]]]
  }
  
  @scala.inline
  def linspace(start: Double, stop: Double, num: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("linspace")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  
  @scala.inline
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Double, alpha: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Double, alpha: Double, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Double, alpha: Unit, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Unit, alpha: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Unit, alpha: Double, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Unit, alpha: Unit, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Double, alpha: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Double, alpha: Double, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Double, alpha: Unit, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Unit, alpha: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Unit, alpha: Double, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Unit, alpha: Unit, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def log[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def log1p[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("log1p")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def logSigmoid[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("logSigmoid")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def logSoftmax[T /* <: Tensor[Rank] */](logits: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("logSoftmax")(logits.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def logSoftmax[T /* <: Tensor[Rank] */](logits: T | TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSoftmax")(logits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def logicalAnd[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalAnd")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logicalAnd[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalAnd")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logicalAnd[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalAnd")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logicalAnd[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalAnd")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def logicalNot[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("logicalNot")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def logicalOr[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalOr")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logicalOr[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalOr")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logicalOr[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalOr")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logicalOr[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalOr")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def logicalXor[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalXor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logicalXor[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalXor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logicalXor[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalXor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def logicalXor[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalXor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  object losses {
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "losses")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def absoluteDifference[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | T,
      predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | T,
      weights: js.UndefOr[
          String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
            js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
          ]) | js.Array[Uint8Array] | Tensor[Rank]
        ],
      reduction: js.UndefOr[Reduction]
    ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDifference")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
    
    @scala.inline
    def computeWeightedLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      losses: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | T,
      weights: js.UndefOr[
          String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
            js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
          ]) | js.Array[Uint8Array] | Tensor[Rank]
        ],
      reduction: js.UndefOr[Reduction]
    ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
    
    @scala.inline
    def cosineDistance[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | T,
      predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | T,
      axis: Double,
      weights: js.UndefOr[
          String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
            js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
          ]) | js.Array[Uint8Array] | Tensor[Rank]
        ],
      reduction: js.UndefOr[Reduction]
    ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineDistance")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
    
    @scala.inline
    def hingeLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | T,
      predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | T,
      weights: js.UndefOr[
          String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
            js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
          ]) | js.Array[Uint8Array] | Tensor[Rank]
        ],
      reduction: js.UndefOr[Reduction]
    ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("hingeLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
    
    @scala.inline
    def huberLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | T,
      predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | T,
      weights: js.UndefOr[
          String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
            js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
          ]) | js.Array[Uint8Array] | Tensor[Rank]
        ],
      delta: js.UndefOr[Double],
      reduction: js.UndefOr[Reduction]
    ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
    
    @scala.inline
    def logLoss[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | T,
      predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | T,
      weights: js.UndefOr[
          String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
            js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
          ]) | js.Array[Uint8Array] | Tensor[Rank]
        ],
      epsilon: js.UndefOr[Double],
      reduction: js.UndefOr[Reduction]
    ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
    
    @scala.inline
    def meanSquaredError[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      labels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | T,
      predictions: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | T,
      weights: js.UndefOr[
          String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
            js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
          ]) | js.Array[Uint8Array] | Tensor[Rank]
        ],
      reduction: js.UndefOr[Reduction]
    ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
    
    @scala.inline
    def sigmoidCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      multiClassLabels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | T,
      logits: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | T,
      weights: js.UndefOr[
          String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
            js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
          ]) | js.Array[Uint8Array] | Tensor[Rank]
        ],
      labelSmoothing: js.UndefOr[Double],
      reduction: js.UndefOr[Reduction]
    ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
    
    @scala.inline
    def softmaxCrossEntropy[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](
      onehotLabels: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | T,
      logits: String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
          js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
        ]) | js.Array[Uint8Array] | T,
      weights: js.UndefOr[
          String | Double | Boolean | Uint8Array | Int32Array | Float32Array | (RecursiveArray[
            js.Array[Double] | Boolean | Double | Float32Array | Int32Array | String | Uint8Array
          ]) | js.Array[Uint8Array] | Tensor[Rank]
        ],
      labelSmoothing: js.UndefOr[Double],
      reduction: js.UndefOr[Reduction]
    ): O = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
  }
  
  @scala.inline
  def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank], transposeA: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank], transposeA: Boolean, transposeB: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any], transposeB.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank], transposeA: Unit, transposeB: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any], transposeB.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike, transposeA: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike, transposeA: Boolean, transposeB: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any], transposeB.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike, transposeA: Unit, transposeB: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any], transposeB.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank], transposeA: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank], transposeA: Boolean, transposeB: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any], transposeB.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank], transposeA: Unit, transposeB: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any], transposeB.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: Boolean, transposeB: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any], transposeB.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: Unit, transposeB: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any], transposeB.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def max[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def max[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def max[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def max[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def max[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def max[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def max[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def max[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def max[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def max[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def max[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def max[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: (js.Tuple2[Double, Double]) | Double,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def maxPool3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dimRoundingMode: js.UndefOr[floor | round | ceil],
    dataFormat: js.UndefOr[NDHWC | NCDHW],
    dilations: js.UndefOr[(js.Tuple3[Double, Double, Double]) | Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool3d")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid_
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: valid_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: Double,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: same_): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: same_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: valid_): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: valid_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: Double,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: same_): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: same_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: valid_): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: valid_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: Double, includeBatchInIndex: Boolean): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: same_): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: same_, includeBatchInIndex: Boolean): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: valid_): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  @scala.inline
  def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: valid_, includeBatchInIndex: Boolean): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  
  @scala.inline
  def maximum[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maximum")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def maximum[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maximum")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def maximum[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maximum")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def maximum[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maximum")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def maximumStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maximumStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def mean[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def mean[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def mean[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def mean[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def mean[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def mean[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def min[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def min[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def min[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def min[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def min[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def min[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def min[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def min[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def min[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def min[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def min[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def min[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def minimum[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("minimum")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def minimum[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("minimum")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def minimum[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("minimum")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def minimum[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("minimum")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def minimumStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("minimumStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def mirrorPad[T /* <: Tensor[Rank] */](x: T | TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], mode: reflect): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mirrorPad")(x.asInstanceOf[js.Any], paddings.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def mirrorPad[T /* <: Tensor[Rank] */](x: T | TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], mode: symmetric): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mirrorPad")(x.asInstanceOf[js.Any], paddings.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def mod[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def mod[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def mod[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def mod[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def modStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("modStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "moments")
  @js.native
  val moments: js.Function3[
    /* x */ Tensor[Rank] | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    /* keepDims */ js.UndefOr[Boolean], 
    Mean
  ] = js.native
  
  @scala.inline
  def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Double, step: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Double, step: Double, zeroDebias: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any], zeroDebias.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Double, step: Unit, zeroDebias: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any], zeroDebias.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Double, step: Scalar): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Double, step: Scalar, zeroDebias: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any], zeroDebias.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Scalar): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Scalar, step: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Scalar, step: Double, zeroDebias: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any], zeroDebias.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Scalar, step: Unit, zeroDebias: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any], zeroDebias.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Scalar, step: Scalar): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Scalar, step: Scalar, zeroDebias: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any], zeroDebias.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def mul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def mul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def mul[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def mul[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def mulStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mulStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "multiRNNCell")
  @js.native
  val multiRNNCell: js.Function4[
    /* lstmCells */ js.Array[LSTMCellFunc], 
    /* data */ Tensor2D | TensorLike, 
    /* c */ js.Array[Tensor2D | TensorLike], 
    /* h */ js.Array[Tensor2D | TensorLike], 
    js.Tuple2[js.Array[Tensor2D], js.Array[Tensor2D]]
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "multinomial")
  @js.native
  val multinomial: js.Function4[
    /* logits */ Tensor1D | Tensor2D | TensorLike, 
    /* numSamples */ Double, 
    /* seed */ js.UndefOr[Double], 
    /* normalized */ js.UndefOr[Boolean], 
    Tensor1D | Tensor2D
  ] = js.native
  
  @scala.inline
  def neg[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("neg")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "norm")
  @js.native
  val norm: js.Function4[
    /* x */ Tensor[Rank] | TensorLike, 
    /* ord */ js.UndefOr[Double | euclidean | fro], 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    /* keepDims */ js.UndefOr[Boolean], 
    Tensor[Rank]
  ] = js.native
  
  @scala.inline
  def notEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def notEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def notEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def notEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def notEqualStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqualStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "oneHot")
  @js.native
  val oneHot: js.Function4[
    /* indices */ Tensor[Rank] | TensorLike, 
    /* depth */ Double, 
    /* onValue */ js.UndefOr[Double], 
    /* offValue */ js.UndefOr[Double], 
    Tensor[Rank]
  ] = js.native
  
  @scala.inline
  def ones[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("ones")(shape.asInstanceOf[js.Any]).asInstanceOf[Tensor[R]]
  @scala.inline
  def ones[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("ones")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  @scala.inline
  def onesLike[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("onesLike")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def op[T /* <: js.Function */](f: StringDictionary[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("op")(f.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "outerProduct")
  @js.native
  val outerProduct: js.Function2[/* v1 */ Tensor1D | TensorLike, /* v2 */ Tensor1D | TensorLike, Tensor2D] = js.native
  
  @scala.inline
  def pad[T /* <: Tensor[Rank] */](x: T | TensorLike, paddings: js.Array[js.Tuple2[Double, Double]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(x.asInstanceOf[js.Any], paddings.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def pad[T /* <: Tensor[Rank] */](x: T | TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(x.asInstanceOf[js.Any], paddings.asInstanceOf[js.Any], constantValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "pad1d")
  @js.native
  val pad1d: js.Function3[
    /* x */ Tensor1D | TensorLike, 
    /* paddings */ js.Tuple2[Double, Double], 
    /* constantValue */ js.UndefOr[Double], 
    Tensor1D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "pad2d")
  @js.native
  val pad2d: js.Function3[
    /* x */ Tensor2D | TensorLike, 
    /* paddings */ js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
    /* constantValue */ js.UndefOr[Double], 
    Tensor2D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "pad3d")
  @js.native
  val pad3d: js.Function3[
    /* x */ Tensor3D | TensorLike, 
    /* paddings */ js.Tuple3[js.Tuple2[Double, Double], js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
    /* constantValue */ js.UndefOr[Double], 
    Tensor3D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "pad4d")
  @js.native
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
  
  @scala.inline
  def pool[T /* <: Tensor3D | Tensor4D */](
    input: T | TensorLike,
    windowShape: (js.Tuple2[Double, Double]) | Double,
    poolingType: avg | max,
    pad: valid_ | same_ | Double,
    dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    strides: js.UndefOr[(js.Tuple2[Double, Double]) | Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pool")(input.asInstanceOf[js.Any], windowShape.asInstanceOf[js.Any], poolingType.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], strides.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def pow[T /* <: Tensor[Rank] */](base: Tensor[Rank], exp: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(base.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def pow[T /* <: Tensor[Rank] */](base: Tensor[Rank], exp: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(base.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def pow[T /* <: Tensor[Rank] */](base: TensorLike, exp: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(base.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def pow[T /* <: Tensor[Rank] */](base: TensorLike, exp: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(base.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def powStrict[T /* <: Tensor[Rank] */](base: T, exp: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("powStrict")(base.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def prelu[T /* <: Tensor[Rank] */](x: T | TensorLike, alpha: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prelu")(x.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def print[T /* <: Tensor[Rank] */](x: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def print[T /* <: Tensor[Rank] */](x: T, verbose: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(x.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def prod[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def prod[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def prod[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def prod[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def prod[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def prod[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def rand[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    randFunction: js.Function0[Double]
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("rand")(shape.asInstanceOf[js.Any], randFunction.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def rand[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    randFunction: js.Function0[Double],
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("rand")(shape.asInstanceOf[js.Any], randFunction.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  @scala.inline
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Double,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Double,
    dtype: float32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Double,
    dtype: float32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Double,
    dtype: int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Double,
    dtype: int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Unit,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Unit,
    dtype: float32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Unit,
    dtype: float32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Unit,
    dtype: int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Unit,
    dtype: int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any]).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: float32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: float32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Unit,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Unit,
    dtype: float32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Unit,
    dtype: float32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Unit,
    dtype: int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Unit,
    dtype: int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double,
    dtype: float32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double,
    dtype: float32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double,
    dtype: int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double,
    dtype: int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Unit,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Unit,
    dtype: float32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Unit,
    dtype: float32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Unit,
    dtype: int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Unit,
    dtype: int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any]).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    dtype: Unit,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    dtype: DataType,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    dtype: DataType,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Unit,
    dtype: Unit,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Unit,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Unit,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Unit,
    dtype: DataType,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Unit,
    dtype: DataType,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Double,
    dtype: Unit,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Double,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Double,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Double,
    dtype: DataType,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Double,
    dtype: DataType,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Unit,
    dtype: Unit,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Unit,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Unit,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Unit,
    dtype: DataType,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Unit,
    dtype: DataType,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  @scala.inline
  def range(start: Double, stop: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  @scala.inline
  def range(start: Double, stop: Double, step: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  
  @scala.inline
  def range_float32(start: Double, stop: Double, step: Double, dtype: float32): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  @scala.inline
  def range_float32(start: Double, stop: Double, step: Unit, dtype: float32): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  
  @scala.inline
  def range_int32(start: Double, stop: Double, step: Double, dtype: int32): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  @scala.inline
  def range_int32(start: Double, stop: Double, step: Unit, dtype: int32): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  
  @scala.inline
  def real[T /* <: Tensor[Rank] */](input: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("real")(input.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def reciprocal[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("reciprocal")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def relu[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("relu")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def relu6[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("relu6")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def reshape[R /* <: Rank */](
    x: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(x.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def reshape[R /* <: Rank */](
    x: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(x.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  @scala.inline
  def reverse[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def reverse[T /* <: Tensor[Rank] */](x: T | TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def reverse[T /* <: Tensor[Rank] */](x: T | TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "reverse1d")
  @js.native
  val reverse1d: js.Function1[/* x */ Tensor1D | TensorLike, Tensor1D] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "reverse2d")
  @js.native
  val reverse2d: js.Function2[
    /* x */ Tensor2D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor2D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "reverse3d")
  @js.native
  val reverse3d: js.Function2[
    /* x */ Tensor3D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor3D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "reverse4d")
  @js.native
  val reverse4d: js.Function2[
    /* x */ Tensor4D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor4D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "rfft")
  @js.native
  val rfft: js.Function2[/* input */ Tensor[Rank], /* fftLength */ js.UndefOr[Double], Tensor[Rank]] = js.native
  
  @scala.inline
  def round[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def rsqrt[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("rsqrt")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def scalar(value: String): Scalar = ^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any]).asInstanceOf[Scalar]
  @scala.inline
  def scalar(value: String, dtype: DataType): Scalar = (^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Scalar]
  @scala.inline
  def scalar(value: Boolean): Scalar = ^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any]).asInstanceOf[Scalar]
  @scala.inline
  def scalar(value: Boolean, dtype: DataType): Scalar = (^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Scalar]
  @scala.inline
  def scalar(value: Double): Scalar = ^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any]).asInstanceOf[Scalar]
  @scala.inline
  def scalar(value: Double, dtype: DataType): Scalar = (^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Scalar]
  @scala.inline
  def scalar(value: Uint8Array): Scalar = ^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any]).asInstanceOf[Scalar]
  @scala.inline
  def scalar(value: Uint8Array, dtype: DataType): Scalar = (^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Scalar]
  
  @scala.inline
  def scatterND[R /* <: Rank */](
    indices: Tensor[Rank],
    updates: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("scatterND")(indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def scatterND[R /* <: Rank */](
    indices: Tensor[Rank],
    updates: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("scatterND")(indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def scatterND[R /* <: Rank */](
    indices: TensorLike,
    updates: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("scatterND")(indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def scatterND[R /* <: Rank */](
    indices: TensorLike,
    updates: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("scatterND")(indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  @scala.inline
  def selu[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("selu")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def separableConv2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    depthwiseFilter: Tensor4D | TensorLike,
    pointwiseFilter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_,
    dilation: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    dataFormat: js.UndefOr[NHWC | NCHW]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("separableConv2d")(x.asInstanceOf[js.Any], depthwiseFilter.asInstanceOf[js.Any], pointwiseFilter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilation.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "setdiff1dAsync")
  @js.native
  val setdiff1dAsync: js.Function2[
    /* x */ Tensor[Rank] | TensorLike, 
    /* y */ Tensor[Rank] | TensorLike, 
    js.Promise[js.Tuple2[Tensor[Rank], Tensor[Rank]]]
  ] = js.native
  
  @scala.inline
  def sigmoid[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sigmoid")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def sign[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  object signal {
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "signal")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def frame(signal: Tensor[R1], frameLength: Double, frameStep: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("frame")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    @scala.inline
    def frame(signal: Tensor[R1], frameLength: Double, frameStep: Double, padEnd: Boolean): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("frame")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any], padEnd.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    @scala.inline
    def frame(signal: Tensor[R1], frameLength: Double, frameStep: Double, padEnd: Boolean, padValue: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("frame")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any], padEnd.asInstanceOf[js.Any], padValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    @scala.inline
    def frame(signal: Tensor[R1], frameLength: Double, frameStep: Double, padEnd: Unit, padValue: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("frame")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any], padEnd.asInstanceOf[js.Any], padValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    @scala.inline
    def hammingWindow(windowLength: Double): Tensor[R1] = ^.asInstanceOf[js.Dynamic].applyDynamic("hammingWindow")(windowLength.asInstanceOf[js.Any]).asInstanceOf[Tensor[R1]]
    
    @scala.inline
    def hannWindow(windowLength: Double): Tensor[R1] = ^.asInstanceOf[js.Dynamic].applyDynamic("hannWindow")(windowLength.asInstanceOf[js.Any]).asInstanceOf[Tensor[R1]]
    
    @scala.inline
    def stft(signal: Tensor[R1], frameLength: Double, frameStep: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stft")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    @scala.inline
    def stft(signal: Tensor[R1], frameLength: Double, frameStep: Double, fftLength: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stft")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any], fftLength.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    @scala.inline
    def stft(
      signal: Tensor[R1],
      frameLength: Double,
      frameStep: Double,
      fftLength: Double,
      windowFn: js.Function1[/* length */ Double, Tensor[R1]]
    ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stft")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any], fftLength.asInstanceOf[js.Any], windowFn.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    @scala.inline
    def stft(
      signal: Tensor[R1],
      frameLength: Double,
      frameStep: Double,
      fftLength: Unit,
      windowFn: js.Function1[/* length */ Double, Tensor[R1]]
    ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stft")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any], fftLength.asInstanceOf[js.Any], windowFn.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  }
  
  @scala.inline
  def sin[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sin")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def sinh[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sinh")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T | TensorLike, begin: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T | TensorLike, begin: js.Array[Double], size: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T | TensorLike, begin: js.Array[Double], size: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T | TensorLike, begin: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T | TensorLike, begin: Double, size: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T | TensorLike, begin: Double, size: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice1d")
  @js.native
  val slice1d: js.Function3[/* x */ Tensor1D | TensorLike, /* begin */ Double, /* size */ Double, Tensor1D] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice2d")
  @js.native
  val slice2d: js.Function3[
    /* x */ Tensor2D | TensorLike, 
    /* begin */ js.Tuple2[Double, Double], 
    /* size */ js.Tuple2[Double, Double], 
    Tensor2D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice3d")
  @js.native
  val slice3d: js.Function3[
    /* x */ Tensor3D | TensorLike, 
    /* begin */ js.Tuple3[Double, Double, Double], 
    /* size */ js.Tuple3[Double, Double, Double], 
    Tensor3D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "slice4d")
  @js.native
  val slice4d: js.Function3[
    /* x */ Tensor4D | TensorLike, 
    /* begin */ js.Tuple4[Double, Double, Double, Double], 
    /* size */ js.Tuple4[Double, Double, Double, Double], 
    Tensor4D
  ] = js.native
  
  @scala.inline
  def softmax[T /* <: Tensor[Rank] */](logits: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("softmax")(logits.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def softmax[T /* <: Tensor[Rank] */](logits: T | TensorLike, dim: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("softmax")(logits.asInstanceOf[js.Any], dim.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def softplus[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("softplus")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def spaceToBatchND[T /* <: Tensor[Rank] */](x: T | TensorLike, blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("spaceToBatchND")(x.asInstanceOf[js.Any], blockShape.asInstanceOf[js.Any], paddings.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  object spectral {
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "spectral")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def fft(input: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("fft")(input.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
    
    @scala.inline
    def ifft(input: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("ifft")(input.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
    
    @scala.inline
    def irfft(input: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("irfft")(input.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
    
    @scala.inline
    def rfft(input: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("rfft")(input.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
    @scala.inline
    def rfft(input: Tensor[Rank], fftLength: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("rfft")(input.asInstanceOf[js.Any], fftLength.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  }
  
  @scala.inline
  def split[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: js.Array[Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def split[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def split[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def split[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: Double, axis: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def split[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: js.Array[Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def split[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def split[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def split[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: Double, axis: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def sqrt[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrt")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def square[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("square")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def squaredDifference[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDifference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def squaredDifference[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDifference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def squaredDifference[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDifference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def squaredDifference[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDifference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def squaredDifferenceStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDifferenceStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def squeeze[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("squeeze")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def squeeze[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("squeeze")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def squeeze[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("squeeze")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def squeeze[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("squeeze")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def stack[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("stack")(tensors.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  @scala.inline
  def stack[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike], axis: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(tensors.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  @scala.inline
  def step[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("step")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def step[T /* <: Tensor[Rank] */](x: T | TensorLike, alpha: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("step")(x.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "stridedSlice")
  @js.native
  val stridedSlice: js.Function9[
    /* x */ Tensor[Rank] | TensorLike, 
    /* begin */ js.Array[Double], 
    /* end */ js.Array[Double], 
    /* strides */ js.UndefOr[js.Array[Double]], 
    /* beginMask */ js.UndefOr[Double], 
    /* endMask */ js.UndefOr[Double], 
    /* ellipsisMask */ js.UndefOr[Double], 
    /* newAxisMask */ js.UndefOr[Double], 
    /* shrinkAxisMask */ js.UndefOr[Double], 
    Tensor[Rank]
  ] = js.native
  
  @scala.inline
  def sub[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def sub[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def sub[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def sub[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def subStrict[T /* <: Tensor[Rank] */](a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("subStrict")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def sum[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def sum[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def sum[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def sum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def sum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def sum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def tan[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tan")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def tanh[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tanh")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def tensor[R /* <: Rank */](values: TensorLike): Tensor[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor[R]]
  @scala.inline
  def tensor[R /* <: Rank */](
    values: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def tensor[R /* <: Rank */](
    values: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def tensor[R /* <: Rank */](values: TensorLike, shape: Unit, dtype: DataType): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  @scala.inline
  def tensor1d(values: TensorLike1D): Tensor1D = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor1d")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor1D]
  @scala.inline
  def tensor1d(values: TensorLike1D, dtype: DataType): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor1d")(values.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  
  @scala.inline
  def tensor2d(values: TensorLike2D): Tensor2D = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor2d")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor2D]
  @scala.inline
  def tensor2d(values: TensorLike2D, shape: js.Tuple2[Double, Double]): Tensor2D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor2d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor2D]
  @scala.inline
  def tensor2d(values: TensorLike2D, shape: js.Tuple2[Double, Double], dtype: DataType): Tensor2D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor2d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor2D]
  @scala.inline
  def tensor2d(values: TensorLike2D, shape: Unit, dtype: DataType): Tensor2D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor2d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor2D]
  
  @scala.inline
  def tensor3d(values: TensorLike3D): Tensor3D = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor3d")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor3D]
  @scala.inline
  def tensor3d(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double]): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor3d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  @scala.inline
  def tensor3d(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double], dtype: DataType): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor3d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  @scala.inline
  def tensor3d(values: TensorLike3D, shape: Unit, dtype: DataType): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor3d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  
  @scala.inline
  def tensor4d(values: TensorLike4D): Tensor4D = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor4d")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor4D]
  @scala.inline
  def tensor4d(values: TensorLike4D, shape: js.Tuple4[Double, Double, Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor4d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  @scala.inline
  def tensor4d(values: TensorLike4D, shape: js.Tuple4[Double, Double, Double, Double], dtype: DataType): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor4d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  @scala.inline
  def tensor4d(values: TensorLike4D, shape: Unit, dtype: DataType): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor4d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  
  @scala.inline
  def tensor5d(values: TensorLike5D): Tensor5D = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor5d")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor5D]
  @scala.inline
  def tensor5d(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double]): Tensor5D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor5d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor5D]
  @scala.inline
  def tensor5d(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double], dtype: DataType): Tensor5D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor5d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor5D]
  @scala.inline
  def tensor5d(values: TensorLike5D, shape: Unit, dtype: DataType): Tensor5D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor5d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor5D]
  
  @scala.inline
  def tensor6d(values: TensorLike6D): Tensor6D = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor6d")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor6D]
  @scala.inline
  def tensor6d(values: TensorLike6D, shape: js.Tuple6[Double, Double, Double, Double, Double, Double]): Tensor6D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor6d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor6D]
  @scala.inline
  def tensor6d(
    values: TensorLike6D,
    shape: js.Tuple6[Double, Double, Double, Double, Double, Double],
    dtype: DataType
  ): Tensor6D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor6d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor6D]
  @scala.inline
  def tensor6d(values: TensorLike6D, shape: Unit, dtype: DataType): Tensor6D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor6d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor6D]
  
  @scala.inline
  def tile[T /* <: Tensor[Rank] */](x: T | TensorLike, reps: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("tile")(x.asInstanceOf[js.Any], reps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def topk[T /* <: Tensor[Rank] */](x: T | TensorLike): Indices[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("topk")(x.asInstanceOf[js.Any]).asInstanceOf[Indices[T]]
  @scala.inline
  def topk[T /* <: Tensor[Rank] */](x: T | TensorLike, k: Double): Indices[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("topk")(x.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Indices[T]]
  @scala.inline
  def topk[T /* <: Tensor[Rank] */](x: T | TensorLike, k: Double, sorted: Boolean): Indices[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("topk")(x.asInstanceOf[js.Any], k.asInstanceOf[js.Any], sorted.asInstanceOf[js.Any])).asInstanceOf[Indices[T]]
  @scala.inline
  def topk[T /* <: Tensor[Rank] */](x: T | TensorLike, k: Unit, sorted: Boolean): Indices[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("topk")(x.asInstanceOf[js.Any], k.asInstanceOf[js.Any], sorted.asInstanceOf[js.Any])).asInstanceOf[Indices[T]]
  
  @scala.inline
  def transpose[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def transpose[T /* <: Tensor[Rank] */](x: T | TensorLike, perm: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(x.asInstanceOf[js.Any], perm.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any]).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: float32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: float32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Unit,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Unit,
    dtype: float32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Unit,
    dtype: float32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Unit,
    dtype: int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Unit,
    dtype: int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double,
    dtype: float32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double,
    dtype: float32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double,
    dtype: int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double,
    dtype: int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Unit,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Unit,
    dtype: float32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Unit,
    dtype: float32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Unit,
    dtype: int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  @scala.inline
  def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Unit,
    dtype: int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  @scala.inline
  def unique[T /* <: Tensor[Rank] */](x: T | TensorLike): Values[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(x.asInstanceOf[js.Any]).asInstanceOf[Values[T]]
  @scala.inline
  def unique[T /* <: Tensor[Rank] */](x: T | TensorLike, axis: Double): Values[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unique")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Values[T]]
  
  @scala.inline
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: T | TensorLike, segmentIds: Tensor1D, numSegments: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unsortedSegmentSum")(x.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any], numSegments.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: T | TensorLike, segmentIds: TensorLike, numSegments: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unsortedSegmentSum")(x.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any], numSegments.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "unstack")
  @js.native
  val unstack: js.Function2[
    /* x */ Tensor[Rank] | TensorLike, 
    /* axis */ js.UndefOr[Double], 
    js.Array[Tensor[Rank]]
  ] = js.native
  
  @scala.inline
  def variable[R /* <: Rank */](initialValue: Tensor[R]): Variable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any]).asInstanceOf[Variable[R]]
  @scala.inline
  def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
  @scala.inline
  def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean, name: String): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
  @scala.inline
  def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean, name: String, dtype: DataType): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
  @scala.inline
  def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean, name: Unit, dtype: DataType): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
  @scala.inline
  def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Unit, name: String): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
  @scala.inline
  def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Unit, name: String, dtype: DataType): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
  @scala.inline
  def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Unit, name: Unit, dtype: DataType): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
  
  @scala.inline
  def where[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(condition.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def where[T /* <: Tensor[Rank] */](condition: TensorLike, a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(condition.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops_for_converter", "whereAsync")
  @js.native
  val whereAsync: js.Function1[/* condition */ Tensor[Rank] | TensorLike, js.Promise[Tensor2D]] = js.native
  
  @scala.inline
  def zeros[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(shape.asInstanceOf[js.Any]).asInstanceOf[Tensor[R]]
  @scala.inline
  def zeros[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  @scala.inline
  def zerosLike[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("zerosLike")(x.asInstanceOf[js.Any]).asInstanceOf[T]
}
