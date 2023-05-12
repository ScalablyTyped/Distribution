package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.anon.A
import typings.tensorflowTfjsCore.anon.Activation
import typings.tensorflowTfjsCore.anon.Bias
import typings.tensorflowTfjsCore.anon.Indexing
import typings.tensorflowTfjsCore.anon.Indices
import typings.tensorflowTfjsCore.anon.Mean
import typings.tensorflowTfjsCore.anon.Values
import typings.tensorflowTfjsCore.distOpsConvUtilMod.ExplicitPadding
import typings.tensorflowTfjsCore.distOpsLossOpsUtilsMod.Reduction
import typings.tensorflowTfjsCore.distOpsMultiRnnCellMod.LSTMCellFunc
import typings.tensorflowTfjsCore.distOpsRaggedGatherMod.RaggedGatherMap
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
import typings.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.ScalarLike
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.distTypesMod.TensorLike1D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike2D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike3D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike5D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike6D
import typings.tensorflowTfjsCore.distTypesMod.WebGLData
import typings.tensorflowTfjsCore.distTypesMod.WebGPUData
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
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.constant
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.euclidean
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.fro
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.left
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.max
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.nearest
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reflect
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.right
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.symmetric
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.wrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsOpsMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "OP_SCOPE_SUFFIX")
  @js.native
  val OP_SCOPE_SUFFIX: /* "__op" */ String = js.native
  
  inline def abs[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def acos[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("acos")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def acosh[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("acosh")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def add[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def add[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def add[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def add[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def addN[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("addN")(tensors.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def all[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def all[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def all[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def all[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def all[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def all[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def all[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def all[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def all[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def all[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def all[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def all[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def any[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def any[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def any[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def any[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def any[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def any[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def any[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def any[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def any[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def any[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def any[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def any[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def argMax[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("argMax")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def argMax[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("argMax")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def argMax[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("argMax")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def argMax[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("argMax")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def argMin[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("argMin")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def argMin[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("argMin")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def argMin[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("argMin")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def argMin[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("argMin")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def asin[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("asin")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def asinh[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("asinh")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def atan[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("atan")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def atan2[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def atan2[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def atan2[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def atan2[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("atan2")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def atanh[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("atanh")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: same_ | valid_,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: Double,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: ExplicitPadding): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: ExplicitPadding,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: ExplicitPadding): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: Double,
    pad: same_ | valid_,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: Double,
    pad: Double,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: ExplicitPadding): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def avgPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: Double,
    pad: ExplicitPadding,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def avgPool3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dimRoundingMode: js.UndefOr[floor | round | ceil],
    dataFormat: js.UndefOr[NDHWC | NCDHW]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("avgPool3d")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "basicLSTMCell")
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
  
  inline def batchNorm[R /* <: Rank */](
    x: Tensor[R] | TensorLike,
    mean: Tensor[R] | Tensor1D | TensorLike,
    variance: Tensor[R] | Tensor1D | TensorLike,
    offset: js.UndefOr[Tensor[R] | Tensor1D | TensorLike],
    scale: js.UndefOr[Tensor[R] | Tensor1D | TensorLike],
    varianceEpsilon: js.UndefOr[Double]
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("batchNorm")(x.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], variance.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], varianceEpsilon.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "batchNorm2d")
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
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "batchNorm3d")
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
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "batchNorm4d")
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
  
  inline def batchToSpaceND[T /* <: Tensor[Rank] */](x: T | TensorLike, blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("batchToSpaceND")(x.asInstanceOf[js.Any], blockShape.asInstanceOf[js.Any], crops.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def bincount[T /* <: Tensor1D */](x: T | TensorLike, weights: T | TensorLike, size: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bincount")(x.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def bitwiseAnd[R /* <: Rank */](x: Tensor[Rank], y: Tensor[Rank]): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("bitwiseAnd")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "booleanMaskAsync")
  @js.native
  val booleanMaskAsync: js.Function3[
    /* tensor */ Tensor[Rank] | TensorLike, 
    /* mask */ Tensor[Rank] | TensorLike, 
    /* axis */ js.UndefOr[Double], 
    js.Promise[Tensor[Rank]]
  ] = js.native
  
  inline def broadcastArgs[R /* <: Rank */](s0: Tensor[Rank], s1: Tensor[Rank]): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcastArgs")(s0.asInstanceOf[js.Any], s1.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def broadcastArgs[R /* <: Rank */](s0: Tensor[Rank], s1: TensorLike): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcastArgs")(s0.asInstanceOf[js.Any], s1.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def broadcastArgs[R /* <: Rank */](s0: TensorLike, s1: Tensor[Rank]): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcastArgs")(s0.asInstanceOf[js.Any], s1.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def broadcastArgs[R /* <: Rank */](s0: TensorLike, s1: TensorLike): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcastArgs")(s0.asInstanceOf[js.Any], s1.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  inline def broadcastTo[R /* <: Rank */](
    x: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcastTo")(x.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def broadcastTo[R /* <: Rank */](
    x: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcastTo")(x.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  inline def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): TensorBuffer[R, float32] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any]).asInstanceOf[TensorBuffer[R, float32]]
  inline def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    values: js.Array[String]
  ): TensorBuffer[R, string] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, string]]
  inline def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    values: js.typedarray.Float32Array
  ): TensorBuffer[R, float32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, float32]]
  inline def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    values: js.typedarray.Int32Array
  ): TensorBuffer[R, int32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, int32]]
  inline def buffer[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    values: js.typedarray.Uint8Array
  ): TensorBuffer[R, bool] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, bool]]
  
  inline def buffer_bool[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool
  ): TensorBuffer[R, bool] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, bool]]
  inline def buffer_bool[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: bool,
    values: js.typedarray.Uint8Array
  ): TensorBuffer[R, bool] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, bool]]
  
  inline def buffer_complex64[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64
  ): TensorBuffer[R, complex64] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, complex64]]
  inline def buffer_complex64[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: complex64,
    values: js.typedarray.Float32Array
  ): TensorBuffer[R, complex64] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, complex64]]
  
  inline def buffer_float32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: float32
  ): TensorBuffer[R, float32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, float32]]
  inline def buffer_float32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: float32,
    values: js.typedarray.Float32Array
  ): TensorBuffer[R, float32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, float32]]
  
  inline def buffer_int32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32
  ): TensorBuffer[R, int32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, int32]]
  inline def buffer_int32[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: int32,
    values: js.typedarray.Int32Array
  ): TensorBuffer[R, int32] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, int32]]
  
  inline def buffer_string[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: string
  ): TensorBuffer[R, string] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, string]]
  inline def buffer_string[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: string,
    values: js.Array[String]
  ): TensorBuffer[R, string] = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[TensorBuffer[R, string]]
  
  inline def cast[T /* <: Tensor[Rank] */](x: T | TensorLike, dtype: DataType): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cast")(x.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def ceil[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("ceil")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def clipByValue[T /* <: Tensor[Rank] */](x: T | TensorLike, clipValueMin: Double, clipValueMax: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clipByValue")(x.asInstanceOf[js.Any], clipValueMin.asInstanceOf[js.Any], clipValueMax.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def clone_[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def complex[T /* <: Tensor[Rank] */](real: T | TensorLike, imag: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("complex")(real.asInstanceOf[js.Any], imag.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def concat[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(tensors.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def concat[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(tensors.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "concat1d")
  @js.native
  val concat1d: js.Function1[/* tensors */ js.Array[Tensor1D | TensorLike], Tensor1D] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "concat2d")
  @js.native
  val concat2d: js.Function2[/* tensors */ js.Array[Tensor2D | TensorLike], /* axis */ Double, Tensor2D] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "concat3d")
  @js.native
  val concat3d: js.Function2[/* tensors */ js.Array[Tensor3D | TensorLike], /* axis */ Double, Tensor3D] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "concat4d")
  @js.native
  val concat4d: js.Function2[/* tensors */ js.Array[Tensor4D | TensorLike], /* axis */ Double, Tensor4D] = js.native
  
  inline def conv1d[T /* <: Tensor2D | Tensor3D */](
    x: T | TensorLike,
    filter: Tensor3D | TensorLike,
    stride: Double,
    pad: valid_ | same_ | Double | ExplicitPadding,
    dataFormat: js.UndefOr[NWC | NCW],
    dilation: js.UndefOr[Double],
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilation.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def conv2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double | ExplicitPadding,
    dataFormat: js.UndefOr[NHWC | NCHW],
    dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def conv2dTranspose[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    outputShape: (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple3[Double, Double, Double]),
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double | ExplicitPadding,
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC,
    dilations: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_,
    dataFormat: Unit,
    dilations: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](x: T | TensorLike, filter: Tensor5D, strides: Double, pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC,
    dilations: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: Unit,
    dilations: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC,
    dilations: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_,
    dataFormat: Unit,
    dilations: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](x: T | TensorLike, filter: TensorLike, strides: Double, pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: NCDHW | NDHWC,
    dilations: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: Unit,
    dilations: js.Tuple3[Double, Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: same_ | valid_,
    dataFormat: Unit,
    dilations: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same_ | valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: Tensor5D,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: same_ | valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple4[Double, Double, Double, Double],
    strides: Double,
    pad: same_ | valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: js.Tuple3[Double, Double, Double],
    pad: same_ | valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def conv3dTranspose[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filter: TensorLike,
    outputShape: js.Tuple5[Double, Double, Double, Double, Double],
    strides: Double,
    pad: same_ | valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def cos[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cos")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def cosh[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cosh")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def cosineWindow(windowLength: Double, a: Double, b: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineWindow")(windowLength.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  
  inline def cumprod[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cumprod")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def cumprod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumprod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumprod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumprod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumprod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Boolean, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumprod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumprod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Unit, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumprod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumprod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, exclusive: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumprod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumprod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, exclusive: Boolean, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumprod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumprod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, exclusive: Unit, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumprod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumprod[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cumprod")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def cumprod[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumprod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumprod[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumprod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumprod[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Boolean, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumprod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumprod[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Unit, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumprod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumprod[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, exclusive: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumprod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumprod[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, exclusive: Boolean, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumprod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumprod[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, exclusive: Unit, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumprod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Boolean, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, exclusive: Unit, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, exclusive: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, exclusive: Boolean, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, exclusive: Unit, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Boolean, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, exclusive: Unit, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, exclusive: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, exclusive: Boolean, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def cumsum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, exclusive: Unit, reverse: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cumsum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], exclusive.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def denseBincount[T /* <: Tensor1D | Tensor2D */](x: T | TensorLike, weights: T | TensorLike, size: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("denseBincount")(x.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def denseBincount[T /* <: Tensor1D | Tensor2D */](x: T | TensorLike, weights: T | TensorLike, size: Double, binaryOutput: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("denseBincount")(x.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], size.asInstanceOf[js.Any], binaryOutput.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "depthToSpace")
  @js.native
  val depthToSpace: js.Function3[
    /* x */ Tensor4D | TensorLike4D, 
    /* blockSize */ Double, 
    /* dataFormat */ js.UndefOr[NHWC | NCHW], 
    Tensor4D
  ] = js.native
  
  inline def depthwiseConv2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double | ExplicitPadding,
    dataFormat: js.UndefOr[NHWC | NCHW],
    dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "diag")
  @js.native
  val diag: js.Function1[/* x */ Tensor[Rank], Tensor[Rank]] = js.native
  
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filter: Tensor3D, strides: js.Tuple2[Double, Double], pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: js.Tuple2[Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: js.Tuple2[Double, Double],
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: Double,
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: Unit,
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filter: Tensor3D, strides: Double, pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D,
    strides: Double,
    pad: same_ | valid_,
    dilations: js.Tuple2[Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D,
    strides: Double,
    pad: same_ | valid_,
    dilations: js.Tuple2[Double, Double],
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filter: Tensor3D, strides: Double, pad: same_ | valid_, dilations: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D,
    strides: Double,
    pad: same_ | valid_,
    dilations: Double,
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: Tensor3D,
    strides: Double,
    pad: same_ | valid_,
    dilations: Unit,
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filter: TensorLike, strides: js.Tuple2[Double, Double], pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: js.Tuple2[Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: js.Tuple2[Double, Double],
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: Double,
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dilations: Unit,
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filter: TensorLike, strides: Double, pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: same_ | valid_,
    dilations: js.Tuple2[Double, Double]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: same_ | valid_,
    dilations: js.Tuple2[Double, Double],
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filter: TensorLike, strides: Double, pad: same_ | valid_, dilations: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: same_ | valid_,
    dilations: Double,
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def dilation2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filter: TensorLike,
    strides: Double,
    pad: same_ | valid_,
    dilations: Unit,
    dataFormat: NHWC
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dilation2d")(x.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def div[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def div[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def div[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def div[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("div")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def divNoNan[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("divNoNan")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def divNoNan[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("divNoNan")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def divNoNan[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("divNoNan")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def divNoNan[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("divNoNan")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "dot")
  @js.native
  val dot: js.Function2[/* t1 */ Tensor[Rank] | TensorLike, /* t2 */ Tensor[Rank] | TensorLike, Tensor[Rank]] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "dropout")
  @js.native
  val dropout: js.Function4[
    /* x */ Tensor[Rank] | TensorLike, 
    /* rate */ Double, 
    /* noiseShape */ js.UndefOr[js.Array[Double]], 
    /* seed */ js.UndefOr[Double | String], 
    Tensor[Rank]
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "einsum")
  @js.native
  val einsum: js.Function2[/* equation */ String, /* repeated */ Tensor[Rank], Tensor[Rank]] = js.native
  
  inline def elu[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("elu")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def enclosingPowerOfTwo(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("enclosingPowerOfTwo")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def ensureShape[R /* <: Rank */](
    x: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureShape")(x.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def equal[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def equal[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def equal[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def equal[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def erf[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("erf")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "euclideanNorm")
  @js.native
  val euclideanNorm: js.Function3[
    /* x */ Tensor[Rank] | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    /* keepDims */ js.UndefOr[Boolean], 
    Tensor[Rank]
  ] = js.native
  
  inline def exp[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("exp")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def expandDims[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("expandDims")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def expandDims[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("expandDims")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def expandDims[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("expandDims")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def expandDims[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("expandDims")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def expm1[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("expm1")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "eye")
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
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "fft")
  @js.native
  val fft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  
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
    *     'float32' if the given param value is a number, otherwise 'string'.
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
  
  inline def floor[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("floor")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def floorDiv[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("floorDiv")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def floorDiv[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("floorDiv")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def floorDiv[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("floorDiv")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def floorDiv[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("floorDiv")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  object fused {
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "fused")
    @js.native
    val ^ : js.Any = js.native
    
    inline def conv2d[T /* <: Tensor3D | Tensor4D */](param0: Activation[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(param0.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def depthwiseConv2d[T /* <: Tensor3D | Tensor4D */](param0: Bias[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(param0.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "fused.matMul")
    @js.native
    val matMul: js.Function1[/* param0 */ A, Tensor[Rank]] = js.native
  }
  
  inline def gather[T /* <: Tensor[Rank] */](x: T | TensorLike, indices: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("gather")(x.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def gather[T /* <: Tensor[Rank] */](x: T | TensorLike, indices: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("gather")(x.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def gather[T /* <: Tensor[Rank] */](x: T | TensorLike, indices: Tensor[Rank], axis: Double, batchDims: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("gather")(x.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], batchDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def gather[T /* <: Tensor[Rank] */](x: T | TensorLike, indices: Tensor[Rank], axis: Unit, batchDims: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("gather")(x.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], batchDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def gather[T /* <: Tensor[Rank] */](x: T | TensorLike, indices: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("gather")(x.asInstanceOf[js.Any], indices.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def gather[T /* <: Tensor[Rank] */](x: T | TensorLike, indices: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("gather")(x.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def gather[T /* <: Tensor[Rank] */](x: T | TensorLike, indices: TensorLike, axis: Double, batchDims: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("gather")(x.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], batchDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def gather[T /* <: Tensor[Rank] */](x: T | TensorLike, indices: TensorLike, axis: Unit, batchDims: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("gather")(x.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], batchDims.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "gatherND")
  @js.native
  val gatherND: js.Function2[
    /* x */ Tensor[Rank] | TensorLike, 
    /* indices */ Tensor[Rank] | TensorLike, 
    Tensor[Rank]
  ] = js.native
  
  inline def greater[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("greater")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def greater[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("greater")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def greater[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("greater")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def greater[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("greater")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def greaterEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def greaterEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def greaterEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def greaterEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "ifft")
  @js.native
  val ifft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  
  inline def imag[T /* <: Tensor[Rank] */](input: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("imag")(input.asInstanceOf[js.Any]).asInstanceOf[T]
  
  object image {
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "image")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cropAndResize(image: Tensor4D, boxes: Tensor2D, boxInd: Tensor1D, cropSize: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: Tensor4D,
      boxes: Tensor2D,
      boxInd: Tensor1D,
      cropSize: js.Tuple2[Double, Double],
      method: bilinear | nearest
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: Tensor4D,
      boxes: Tensor2D,
      boxInd: Tensor1D,
      cropSize: js.Tuple2[Double, Double],
      method: bilinear | nearest,
      extrapolationValue: Double
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: Tensor4D,
      boxes: Tensor2D,
      boxInd: Tensor1D,
      cropSize: js.Tuple2[Double, Double],
      method: Unit,
      extrapolationValue: Double
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(image: Tensor4D, boxes: Tensor2D, boxInd: TensorLike, cropSize: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: Tensor4D,
      boxes: Tensor2D,
      boxInd: TensorLike,
      cropSize: js.Tuple2[Double, Double],
      method: bilinear | nearest
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: Tensor4D,
      boxes: Tensor2D,
      boxInd: TensorLike,
      cropSize: js.Tuple2[Double, Double],
      method: bilinear | nearest,
      extrapolationValue: Double
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: Tensor4D,
      boxes: Tensor2D,
      boxInd: TensorLike,
      cropSize: js.Tuple2[Double, Double],
      method: Unit,
      extrapolationValue: Double
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(image: Tensor4D, boxes: TensorLike, boxInd: Tensor1D, cropSize: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: Tensor4D,
      boxes: TensorLike,
      boxInd: Tensor1D,
      cropSize: js.Tuple2[Double, Double],
      method: bilinear | nearest
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: Tensor4D,
      boxes: TensorLike,
      boxInd: Tensor1D,
      cropSize: js.Tuple2[Double, Double],
      method: bilinear | nearest,
      extrapolationValue: Double
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: Tensor4D,
      boxes: TensorLike,
      boxInd: Tensor1D,
      cropSize: js.Tuple2[Double, Double],
      method: Unit,
      extrapolationValue: Double
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(image: Tensor4D, boxes: TensorLike, boxInd: TensorLike, cropSize: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: Tensor4D,
      boxes: TensorLike,
      boxInd: TensorLike,
      cropSize: js.Tuple2[Double, Double],
      method: bilinear | nearest
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: Tensor4D,
      boxes: TensorLike,
      boxInd: TensorLike,
      cropSize: js.Tuple2[Double, Double],
      method: bilinear | nearest,
      extrapolationValue: Double
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: Tensor4D,
      boxes: TensorLike,
      boxInd: TensorLike,
      cropSize: js.Tuple2[Double, Double],
      method: Unit,
      extrapolationValue: Double
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(image: TensorLike, boxes: Tensor2D, boxInd: Tensor1D, cropSize: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: TensorLike,
      boxes: Tensor2D,
      boxInd: Tensor1D,
      cropSize: js.Tuple2[Double, Double],
      method: bilinear | nearest
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: TensorLike,
      boxes: Tensor2D,
      boxInd: Tensor1D,
      cropSize: js.Tuple2[Double, Double],
      method: bilinear | nearest,
      extrapolationValue: Double
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: TensorLike,
      boxes: Tensor2D,
      boxInd: Tensor1D,
      cropSize: js.Tuple2[Double, Double],
      method: Unit,
      extrapolationValue: Double
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(image: TensorLike, boxes: Tensor2D, boxInd: TensorLike, cropSize: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: TensorLike,
      boxes: Tensor2D,
      boxInd: TensorLike,
      cropSize: js.Tuple2[Double, Double],
      method: bilinear | nearest
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: TensorLike,
      boxes: Tensor2D,
      boxInd: TensorLike,
      cropSize: js.Tuple2[Double, Double],
      method: bilinear | nearest,
      extrapolationValue: Double
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: TensorLike,
      boxes: Tensor2D,
      boxInd: TensorLike,
      cropSize: js.Tuple2[Double, Double],
      method: Unit,
      extrapolationValue: Double
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(image: TensorLike, boxes: TensorLike, boxInd: Tensor1D, cropSize: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: TensorLike,
      boxes: TensorLike,
      boxInd: Tensor1D,
      cropSize: js.Tuple2[Double, Double],
      method: bilinear | nearest
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: TensorLike,
      boxes: TensorLike,
      boxInd: Tensor1D,
      cropSize: js.Tuple2[Double, Double],
      method: bilinear | nearest,
      extrapolationValue: Double
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: TensorLike,
      boxes: TensorLike,
      boxInd: Tensor1D,
      cropSize: js.Tuple2[Double, Double],
      method: Unit,
      extrapolationValue: Double
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(image: TensorLike, boxes: TensorLike, boxInd: TensorLike, cropSize: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: TensorLike,
      boxes: TensorLike,
      boxInd: TensorLike,
      cropSize: js.Tuple2[Double, Double],
      method: bilinear | nearest
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: TensorLike,
      boxes: TensorLike,
      boxInd: TensorLike,
      cropSize: js.Tuple2[Double, Double],
      method: bilinear | nearest,
      extrapolationValue: Double
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def cropAndResize(
      image: TensorLike,
      boxes: TensorLike,
      boxInd: TensorLike,
      cropSize: js.Tuple2[Double, Double],
      method: Unit,
      extrapolationValue: Double
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("cropAndResize")(image.asInstanceOf[js.Any], boxes.asInstanceOf[js.Any], boxInd.asInstanceOf[js.Any], cropSize.asInstanceOf[js.Any], method.asInstanceOf[js.Any], extrapolationValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    
    inline def flipLeftRight(image: Tensor4D): Tensor4D = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor4D]
    inline def flipLeftRight(image: TensorLike): Tensor4D = ^.asInstanceOf[js.Dynamic].applyDynamic("flipLeftRight")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor4D]
    
    inline def grayscaleToRGB[T /* <: Tensor2D | Tensor3D | Tensor4D | Tensor5D | Tensor6D */](image: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("grayscaleToRGB")(image.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def nonMaxSuppression(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
    inline def nonMaxSuppression(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
    inline def nonMaxSuppression(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
    inline def nonMaxSuppression(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
    inline def nonMaxSuppression(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
    inline def nonMaxSuppression(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
    inline def nonMaxSuppression(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
    inline def nonMaxSuppression(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
    inline def nonMaxSuppression(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
    inline def nonMaxSuppression(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
    inline def nonMaxSuppression(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
    inline def nonMaxSuppression(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
    inline def nonMaxSuppression(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
    inline def nonMaxSuppression(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
    inline def nonMaxSuppression(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
    inline def nonMaxSuppression(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppression")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
    
    inline def nonMaxSuppressionAsync(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
    inline def nonMaxSuppressionAsync(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
    inline def nonMaxSuppressionAsync(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
    inline def nonMaxSuppressionAsync(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
    inline def nonMaxSuppressionAsync(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
    inline def nonMaxSuppressionAsync(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
    inline def nonMaxSuppressionAsync(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
    inline def nonMaxSuppressionAsync(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
    inline def nonMaxSuppressionAsync(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
    inline def nonMaxSuppressionAsync(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
    inline def nonMaxSuppressionAsync(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
    inline def nonMaxSuppressionAsync(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
    inline def nonMaxSuppressionAsync(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
    inline def nonMaxSuppressionAsync(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
    inline def nonMaxSuppressionAsync(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
    inline def nonMaxSuppressionAsync(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): js.Promise[Tensor1D] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tensor1D]]
    
    inline def nonMaxSuppressionPadded(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double,
      padToMaxOutputSize: Boolean
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Unit,
      padToMaxOutputSize: Boolean
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double,
      padToMaxOutputSize: Boolean
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Unit,
      padToMaxOutputSize: Boolean
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double,
      padToMaxOutputSize: Boolean
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Unit,
      padToMaxOutputSize: Boolean
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double,
      padToMaxOutputSize: Boolean
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Unit,
      padToMaxOutputSize: Boolean
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double,
      padToMaxOutputSize: Boolean
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Unit,
      padToMaxOutputSize: Boolean
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double,
      padToMaxOutputSize: Boolean
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Unit,
      padToMaxOutputSize: Boolean
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double,
      padToMaxOutputSize: Boolean
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Unit,
      padToMaxOutputSize: Boolean
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double,
      padToMaxOutputSize: Boolean
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionPadded(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Unit,
      padToMaxOutputSize: Boolean
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPadded")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    
    inline def nonMaxSuppressionPaddedAsync(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double,
      padToMaxOutputSize: Boolean
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Unit,
      padToMaxOutputSize: Boolean
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double,
      padToMaxOutputSize: Boolean
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Unit,
      padToMaxOutputSize: Boolean
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double,
      padToMaxOutputSize: Boolean
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Unit,
      padToMaxOutputSize: Boolean
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double,
      padToMaxOutputSize: Boolean
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Unit,
      padToMaxOutputSize: Boolean
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double,
      padToMaxOutputSize: Boolean
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Unit,
      padToMaxOutputSize: Boolean
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double,
      padToMaxOutputSize: Boolean
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Unit,
      padToMaxOutputSize: Boolean
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double,
      padToMaxOutputSize: Boolean
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Unit,
      padToMaxOutputSize: Boolean
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double,
      padToMaxOutputSize: Boolean
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionPaddedAsync(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Unit,
      padToMaxOutputSize: Boolean
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionPaddedAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], padToMaxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    
    inline def nonMaxSuppressionWithScore(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double,
      softNmsSigma: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Unit,
      softNmsSigma: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double,
      softNmsSigma: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Unit,
      softNmsSigma: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double,
      softNmsSigma: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Unit,
      softNmsSigma: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double,
      softNmsSigma: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Unit,
      softNmsSigma: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double,
      softNmsSigma: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Unit,
      softNmsSigma: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double,
      softNmsSigma: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Unit,
      softNmsSigma: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double,
      softNmsSigma: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Unit,
      softNmsSigma: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double,
      softNmsSigma: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def nonMaxSuppressionWithScore(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Unit,
      softNmsSigma: Double
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScore")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    
    inline def nonMaxSuppressionWithScoreAsync(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(boxes: Tensor2D, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double,
      softNmsSigma: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Unit,
      softNmsSigma: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double,
      softNmsSigma: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: Tensor2D,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Unit,
      softNmsSigma: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(boxes: Tensor2D, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double,
      softNmsSigma: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Unit,
      softNmsSigma: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double,
      softNmsSigma: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: Tensor2D,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Unit,
      softNmsSigma: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(boxes: TensorLike, scores: Tensor1D, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double,
      softNmsSigma: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Unit,
      softNmsSigma: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double,
      softNmsSigma: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: TensorLike,
      scores: Tensor1D,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Unit,
      softNmsSigma: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(boxes: TensorLike, scores: TensorLike, maxOutputSize: Double, iouThreshold: Double): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Double,
      softNmsSigma: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Double,
      scoreThreshold: Unit,
      softNmsSigma: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Double,
      softNmsSigma: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    inline def nonMaxSuppressionWithScoreAsync(
      boxes: TensorLike,
      scores: TensorLike,
      maxOutputSize: Double,
      iouThreshold: Unit,
      scoreThreshold: Unit,
      softNmsSigma: Double
    ): js.Promise[NamedTensorMap] = (^.asInstanceOf[js.Dynamic].applyDynamic("nonMaxSuppressionWithScoreAsync")(boxes.asInstanceOf[js.Any], scores.asInstanceOf[js.Any], maxOutputSize.asInstanceOf[js.Any], iouThreshold.asInstanceOf[js.Any], scoreThreshold.asInstanceOf[js.Any], softNmsSigma.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NamedTensorMap]]
    
    inline def resizeBilinear[T_2 /* <: Tensor3D | Tensor4D */](images: T_2 | TensorLike, size: js.Tuple2[Double, Double]): T_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T_2]
    inline def resizeBilinear[T_2 /* <: Tensor3D | Tensor4D */](images: T_2 | TensorLike, size: js.Tuple2[Double, Double], alignCorners: Boolean): T_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T_2]
    inline def resizeBilinear[T_2 /* <: Tensor3D | Tensor4D */](
      images: T_2 | TensorLike,
      size: js.Tuple2[Double, Double],
      alignCorners: Boolean,
      halfPixelCenters: Boolean
    ): T_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any], halfPixelCenters.asInstanceOf[js.Any])).asInstanceOf[T_2]
    inline def resizeBilinear[T_2 /* <: Tensor3D | Tensor4D */](
      images: T_2 | TensorLike,
      size: js.Tuple2[Double, Double],
      alignCorners: Unit,
      halfPixelCenters: Boolean
    ): T_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeBilinear")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any], halfPixelCenters.asInstanceOf[js.Any])).asInstanceOf[T_2]
    
    inline def resizeNearestNeighbor[T_1 /* <: Tensor3D | Tensor4D */](images: T_1 | TensorLike, size: js.Tuple2[Double, Double]): T_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T_1]
    inline def resizeNearestNeighbor[T_1 /* <: Tensor3D | Tensor4D */](images: T_1 | TensorLike, size: js.Tuple2[Double, Double], alignCorners: Boolean): T_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any])).asInstanceOf[T_1]
    inline def resizeNearestNeighbor[T_1 /* <: Tensor3D | Tensor4D */](
      images: T_1 | TensorLike,
      size: js.Tuple2[Double, Double],
      alignCorners: Boolean,
      halfPixelCenters: Boolean
    ): T_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any], halfPixelCenters.asInstanceOf[js.Any])).asInstanceOf[T_1]
    inline def resizeNearestNeighbor[T_1 /* <: Tensor3D | Tensor4D */](
      images: T_1 | TensorLike,
      size: js.Tuple2[Double, Double],
      alignCorners: Unit,
      halfPixelCenters: Boolean
    ): T_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("resizeNearestNeighbor")(images.asInstanceOf[js.Any], size.asInstanceOf[js.Any], alignCorners.asInstanceOf[js.Any], halfPixelCenters.asInstanceOf[js.Any])).asInstanceOf[T_1]
    
    inline def rotateWithOffset(image: Tensor4D, radians: Double): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: js.Tuple3[Double, Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def rotateWithOffset(
      image: Tensor4D,
      radians: Double,
      fillValue: js.Tuple3[Double, Double, Double],
      center: js.Tuple2[Double, Double]
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: js.Tuple3[Double, Double, Double], center: Double): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: Double): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: Double, center: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: Double, center: Double): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: Unit, center: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def rotateWithOffset(image: Tensor4D, radians: Double, fillValue: Unit, center: Double): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def rotateWithOffset(image: TensorLike, radians: Double): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def rotateWithOffset(image: TensorLike, radians: Double, fillValue: js.Tuple3[Double, Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def rotateWithOffset(
      image: TensorLike,
      radians: Double,
      fillValue: js.Tuple3[Double, Double, Double],
      center: js.Tuple2[Double, Double]
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def rotateWithOffset(image: TensorLike, radians: Double, fillValue: js.Tuple3[Double, Double, Double], center: Double): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def rotateWithOffset(image: TensorLike, radians: Double, fillValue: Double): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def rotateWithOffset(image: TensorLike, radians: Double, fillValue: Double, center: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def rotateWithOffset(image: TensorLike, radians: Double, fillValue: Double, center: Double): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def rotateWithOffset(image: TensorLike, radians: Double, fillValue: Unit, center: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    inline def rotateWithOffset(image: TensorLike, radians: Double, fillValue: Unit, center: Double): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateWithOffset")(image.asInstanceOf[js.Any], radians.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
    
    inline def threshold(image: Tensor3D): Tensor3D = ^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor3D]
    inline def threshold(image: Tensor3D, method: String): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
    inline def threshold(image: Tensor3D, method: String, inverted: Boolean): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
    inline def threshold(image: Tensor3D, method: String, inverted: Boolean, threshValue: Double): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any], threshValue.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
    inline def threshold(image: Tensor3D, method: String, inverted: Unit, threshValue: Double): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any], threshValue.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
    inline def threshold(image: Tensor3D, method: Unit, inverted: Boolean): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
    inline def threshold(image: Tensor3D, method: Unit, inverted: Boolean, threshValue: Double): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any], threshValue.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
    inline def threshold(image: Tensor3D, method: Unit, inverted: Unit, threshValue: Double): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any], threshValue.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
    inline def threshold(image: TensorLike): Tensor3D = ^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any]).asInstanceOf[Tensor3D]
    inline def threshold(image: TensorLike, method: String): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
    inline def threshold(image: TensorLike, method: String, inverted: Boolean): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
    inline def threshold(image: TensorLike, method: String, inverted: Boolean, threshValue: Double): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any], threshValue.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
    inline def threshold(image: TensorLike, method: String, inverted: Unit, threshValue: Double): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any], threshValue.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
    inline def threshold(image: TensorLike, method: Unit, inverted: Boolean): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
    inline def threshold(image: TensorLike, method: Unit, inverted: Boolean, threshValue: Double): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any], threshValue.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
    inline def threshold(image: TensorLike, method: Unit, inverted: Unit, threshValue: Double): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(image.asInstanceOf[js.Any], method.asInstanceOf[js.Any], inverted.asInstanceOf[js.Any], threshValue.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
    
    inline def transform(
      image: TensorLike | Tensor4D,
      transforms: TensorLike | Tensor2D,
      interpolation: js.UndefOr[bilinear | nearest],
      fillMode: js.UndefOr[reflect | nearest | constant | wrap],
      fillValue: js.UndefOr[Double],
      outputShape: js.UndefOr[js.Tuple2[Double, Double]]
    ): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(image.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any], interpolation.asInstanceOf[js.Any], fillMode.asInstanceOf[js.Any], fillValue.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  }
  
  inline def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T | TensorLike, targets: TensorLike | U): js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("inTopKAsync")(predictions.asInstanceOf[js.Any], targets.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U]]
  inline def inTopKAsync[T /* <: Tensor[Rank] */, U /* <: Tensor[Rank] */](predictions: T | TensorLike, targets: TensorLike | U, k: Double): js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("inTopKAsync")(predictions.asInstanceOf[js.Any], targets.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U]]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "irfft")
  @js.native
  val irfft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  
  inline def isFinite[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("isFinite")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def isInf[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("isInf")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def isNaN[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("isNaN")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def leakyRelu[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("leakyRelu")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def leakyRelu[T /* <: Tensor[Rank] */](x: T | TensorLike, alpha: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("leakyRelu")(x.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def less[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("less")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def less[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("less")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def less[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("less")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def less[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("less")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def lessEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("lessEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def lessEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("lessEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def lessEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("lessEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def lessEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("lessEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  object linalg {
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "linalg")
    @js.native
    val ^ : js.Any = js.native
    
    inline def bandPart[T /* <: Tensor[Rank] */](a: T | TensorLike, numLower: Double, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def bandPart[T /* <: Tensor[Rank] */](a: T | TensorLike, numLower: Double, numUpper: Scalar): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def bandPart[T /* <: Tensor[Rank] */](a: T | TensorLike, numLower: Scalar, numUpper: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def bandPart[T /* <: Tensor[Rank] */](a: T | TensorLike, numLower: Scalar, numUpper: Scalar): T = (^.asInstanceOf[js.Dynamic].applyDynamic("bandPart")(a.asInstanceOf[js.Any], numLower.asInstanceOf[js.Any], numUpper.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def gramSchmidt(xs: js.Array[Tensor1D]): Tensor2D | js.Array[Tensor1D] = ^.asInstanceOf[js.Dynamic].applyDynamic("gramSchmidt")(xs.asInstanceOf[js.Any]).asInstanceOf[Tensor2D | js.Array[Tensor1D]]
    inline def gramSchmidt(xs: Tensor2D): Tensor2D | js.Array[Tensor1D] = ^.asInstanceOf[js.Dynamic].applyDynamic("gramSchmidt")(xs.asInstanceOf[js.Any]).asInstanceOf[Tensor2D | js.Array[Tensor1D]]
    
    inline def qr(x: Tensor[Rank]): js.Tuple2[Tensor[Rank], Tensor[Rank]] = ^.asInstanceOf[js.Dynamic].applyDynamic("qr")(x.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Tensor[Rank], Tensor[Rank]]]
    inline def qr(x: Tensor[Rank], fullMatrices: Boolean): js.Tuple2[Tensor[Rank], Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("qr")(x.asInstanceOf[js.Any], fullMatrices.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Tensor[Rank], Tensor[Rank]]]
  }
  
  inline def linspace(start: Double, stop: Double, num: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("linspace")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Double, alpha: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Double, alpha: Double, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Double, alpha: Unit, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Unit, alpha: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Unit, alpha: Double, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Double, bias: Unit, alpha: Unit, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Double, alpha: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Double, alpha: Double, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Double, alpha: Unit, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Unit, alpha: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Unit, alpha: Double, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def localResponseNormalization[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, depthRadius: Unit, bias: Unit, alpha: Unit, beta: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("localResponseNormalization")(x.asInstanceOf[js.Any], depthRadius.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def log[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def log1p[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("log1p")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def logSigmoid[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("logSigmoid")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def logSoftmax[T /* <: Tensor[Rank] */](logits: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("logSoftmax")(logits.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def logSoftmax[T /* <: Tensor[Rank] */](logits: T | TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSoftmax")(logits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def logSumExp[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def logSumExp[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logSumExp")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def logicalAnd[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalAnd")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def logicalAnd[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalAnd")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def logicalAnd[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalAnd")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def logicalAnd[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalAnd")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def logicalNot[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("logicalNot")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def logicalOr[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalOr")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def logicalOr[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalOr")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def logicalOr[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalOr")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def logicalOr[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalOr")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def logicalXor[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalXor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def logicalXor[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalXor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def logicalXor[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalXor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def logicalXor[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("logicalXor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  object losses {
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "losses")
    @js.native
    val ^ : js.Any = js.native
    
    inline def absoluteDifference[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike): O = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDifference")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def absoluteDifference[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: Unit, reduction: Reduction): O = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDifference")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def absoluteDifference[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: Tensor[Rank]): O = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDifference")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def absoluteDifference[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: Tensor[Rank], reduction: Reduction): O = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDifference")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def absoluteDifference[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: TensorLike): O = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDifference")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O]
    inline def absoluteDifference[T /* <: Tensor[Rank] */, O /* <: Tensor[Rank] */](labels: T | TensorLike, predictions: T | TensorLike, weights: TensorLike, reduction: Reduction): O = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteDifference")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O]
    
    inline def computeWeightedLoss[T_1 /* <: Tensor[Rank] */, O_1 /* <: Tensor[Rank] */](losses: T_1 | TensorLike): O_1 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any]).asInstanceOf[O_1]
    inline def computeWeightedLoss[T_1 /* <: Tensor[Rank] */, O_1 /* <: Tensor[Rank] */](losses: T_1 | TensorLike, weights: Unit, reduction: Reduction): O_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_1]
    inline def computeWeightedLoss[T_1 /* <: Tensor[Rank] */, O_1 /* <: Tensor[Rank] */](losses: T_1 | TensorLike, weights: Tensor[Rank]): O_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_1]
    inline def computeWeightedLoss[T_1 /* <: Tensor[Rank] */, O_1 /* <: Tensor[Rank] */](losses: T_1 | TensorLike, weights: Tensor[Rank], reduction: Reduction): O_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_1]
    inline def computeWeightedLoss[T_1 /* <: Tensor[Rank] */, O_1 /* <: Tensor[Rank] */](losses: T_1 | TensorLike, weights: TensorLike): O_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_1]
    inline def computeWeightedLoss[T_1 /* <: Tensor[Rank] */, O_1 /* <: Tensor[Rank] */](losses: T_1 | TensorLike, weights: TensorLike, reduction: Reduction): O_1 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeWeightedLoss")(losses.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_1]
    
    inline def cosineDistance[T_2 /* <: Tensor[Rank] */, O_2 /* <: Tensor[Rank] */](labels: T_2 | TensorLike, predictions: T_2 | TensorLike, axis: Double): O_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineDistance")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[O_2]
    inline def cosineDistance[T_2 /* <: Tensor[Rank] */, O_2 /* <: Tensor[Rank] */](
      labels: T_2 | TensorLike,
      predictions: T_2 | TensorLike,
      axis: Double,
      weights: Unit,
      reduction: Reduction
    ): O_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineDistance")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_2]
    inline def cosineDistance[T_2 /* <: Tensor[Rank] */, O_2 /* <: Tensor[Rank] */](labels: T_2 | TensorLike, predictions: T_2 | TensorLike, axis: Double, weights: Tensor[Rank]): O_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineDistance")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_2]
    inline def cosineDistance[T_2 /* <: Tensor[Rank] */, O_2 /* <: Tensor[Rank] */](
      labels: T_2 | TensorLike,
      predictions: T_2 | TensorLike,
      axis: Double,
      weights: Tensor[Rank],
      reduction: Reduction
    ): O_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineDistance")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_2]
    inline def cosineDistance[T_2 /* <: Tensor[Rank] */, O_2 /* <: Tensor[Rank] */](labels: T_2 | TensorLike, predictions: T_2 | TensorLike, axis: Double, weights: TensorLike): O_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineDistance")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_2]
    inline def cosineDistance[T_2 /* <: Tensor[Rank] */, O_2 /* <: Tensor[Rank] */](
      labels: T_2 | TensorLike,
      predictions: T_2 | TensorLike,
      axis: Double,
      weights: TensorLike,
      reduction: Reduction
    ): O_2 = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineDistance")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_2]
    
    inline def hingeLoss[T_3 /* <: Tensor[Rank] */, O_3 /* <: Tensor[Rank] */](labels: T_3 | TensorLike, predictions: T_3 | TensorLike): O_3 = (^.asInstanceOf[js.Dynamic].applyDynamic("hingeLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any])).asInstanceOf[O_3]
    inline def hingeLoss[T_3 /* <: Tensor[Rank] */, O_3 /* <: Tensor[Rank] */](labels: T_3 | TensorLike, predictions: T_3 | TensorLike, weights: Unit, reduction: Reduction): O_3 = (^.asInstanceOf[js.Dynamic].applyDynamic("hingeLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_3]
    inline def hingeLoss[T_3 /* <: Tensor[Rank] */, O_3 /* <: Tensor[Rank] */](labels: T_3 | TensorLike, predictions: T_3 | TensorLike, weights: Tensor[Rank]): O_3 = (^.asInstanceOf[js.Dynamic].applyDynamic("hingeLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_3]
    inline def hingeLoss[T_3 /* <: Tensor[Rank] */, O_3 /* <: Tensor[Rank] */](
      labels: T_3 | TensorLike,
      predictions: T_3 | TensorLike,
      weights: Tensor[Rank],
      reduction: Reduction
    ): O_3 = (^.asInstanceOf[js.Dynamic].applyDynamic("hingeLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_3]
    inline def hingeLoss[T_3 /* <: Tensor[Rank] */, O_3 /* <: Tensor[Rank] */](labels: T_3 | TensorLike, predictions: T_3 | TensorLike, weights: TensorLike): O_3 = (^.asInstanceOf[js.Dynamic].applyDynamic("hingeLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_3]
    inline def hingeLoss[T_3 /* <: Tensor[Rank] */, O_3 /* <: Tensor[Rank] */](labels: T_3 | TensorLike, predictions: T_3 | TensorLike, weights: TensorLike, reduction: Reduction): O_3 = (^.asInstanceOf[js.Dynamic].applyDynamic("hingeLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_3]
    
    inline def huberLoss[T_4 /* <: Tensor[Rank] */, O_4 /* <: Tensor[Rank] */](labels: T_4 | TensorLike, predictions: T_4 | TensorLike): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any])).asInstanceOf[O_4]
    inline def huberLoss[T_4 /* <: Tensor[Rank] */, O_4 /* <: Tensor[Rank] */](labels: T_4 | TensorLike, predictions: T_4 | TensorLike, weights: Unit, delta: Double): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[O_4]
    inline def huberLoss[T_4 /* <: Tensor[Rank] */, O_4 /* <: Tensor[Rank] */](
      labels: T_4 | TensorLike,
      predictions: T_4 | TensorLike,
      weights: Unit,
      delta: Double,
      reduction: Reduction
    ): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_4]
    inline def huberLoss[T_4 /* <: Tensor[Rank] */, O_4 /* <: Tensor[Rank] */](
      labels: T_4 | TensorLike,
      predictions: T_4 | TensorLike,
      weights: Unit,
      delta: Unit,
      reduction: Reduction
    ): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_4]
    inline def huberLoss[T_4 /* <: Tensor[Rank] */, O_4 /* <: Tensor[Rank] */](labels: T_4 | TensorLike, predictions: T_4 | TensorLike, weights: Tensor[Rank]): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_4]
    inline def huberLoss[T_4 /* <: Tensor[Rank] */, O_4 /* <: Tensor[Rank] */](labels: T_4 | TensorLike, predictions: T_4 | TensorLike, weights: Tensor[Rank], delta: Double): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[O_4]
    inline def huberLoss[T_4 /* <: Tensor[Rank] */, O_4 /* <: Tensor[Rank] */](
      labels: T_4 | TensorLike,
      predictions: T_4 | TensorLike,
      weights: Tensor[Rank],
      delta: Double,
      reduction: Reduction
    ): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_4]
    inline def huberLoss[T_4 /* <: Tensor[Rank] */, O_4 /* <: Tensor[Rank] */](
      labels: T_4 | TensorLike,
      predictions: T_4 | TensorLike,
      weights: Tensor[Rank],
      delta: Unit,
      reduction: Reduction
    ): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_4]
    inline def huberLoss[T_4 /* <: Tensor[Rank] */, O_4 /* <: Tensor[Rank] */](labels: T_4 | TensorLike, predictions: T_4 | TensorLike, weights: TensorLike): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_4]
    inline def huberLoss[T_4 /* <: Tensor[Rank] */, O_4 /* <: Tensor[Rank] */](labels: T_4 | TensorLike, predictions: T_4 | TensorLike, weights: TensorLike, delta: Double): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[O_4]
    inline def huberLoss[T_4 /* <: Tensor[Rank] */, O_4 /* <: Tensor[Rank] */](
      labels: T_4 | TensorLike,
      predictions: T_4 | TensorLike,
      weights: TensorLike,
      delta: Double,
      reduction: Reduction
    ): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_4]
    inline def huberLoss[T_4 /* <: Tensor[Rank] */, O_4 /* <: Tensor[Rank] */](
      labels: T_4 | TensorLike,
      predictions: T_4 | TensorLike,
      weights: TensorLike,
      delta: Unit,
      reduction: Reduction
    ): O_4 = (^.asInstanceOf[js.Dynamic].applyDynamic("huberLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_4]
    
    inline def logLoss[T_5 /* <: Tensor[Rank] */, O_5 /* <: Tensor[Rank] */](labels: T_5 | TensorLike, predictions: T_5 | TensorLike): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any])).asInstanceOf[O_5]
    inline def logLoss[T_5 /* <: Tensor[Rank] */, O_5 /* <: Tensor[Rank] */](labels: T_5 | TensorLike, predictions: T_5 | TensorLike, weights: Unit, epsilon: Double): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[O_5]
    inline def logLoss[T_5 /* <: Tensor[Rank] */, O_5 /* <: Tensor[Rank] */](
      labels: T_5 | TensorLike,
      predictions: T_5 | TensorLike,
      weights: Unit,
      epsilon: Double,
      reduction: Reduction
    ): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_5]
    inline def logLoss[T_5 /* <: Tensor[Rank] */, O_5 /* <: Tensor[Rank] */](
      labels: T_5 | TensorLike,
      predictions: T_5 | TensorLike,
      weights: Unit,
      epsilon: Unit,
      reduction: Reduction
    ): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_5]
    inline def logLoss[T_5 /* <: Tensor[Rank] */, O_5 /* <: Tensor[Rank] */](labels: T_5 | TensorLike, predictions: T_5 | TensorLike, weights: Tensor[Rank]): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_5]
    inline def logLoss[T_5 /* <: Tensor[Rank] */, O_5 /* <: Tensor[Rank] */](labels: T_5 | TensorLike, predictions: T_5 | TensorLike, weights: Tensor[Rank], epsilon: Double): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[O_5]
    inline def logLoss[T_5 /* <: Tensor[Rank] */, O_5 /* <: Tensor[Rank] */](
      labels: T_5 | TensorLike,
      predictions: T_5 | TensorLike,
      weights: Tensor[Rank],
      epsilon: Double,
      reduction: Reduction
    ): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_5]
    inline def logLoss[T_5 /* <: Tensor[Rank] */, O_5 /* <: Tensor[Rank] */](
      labels: T_5 | TensorLike,
      predictions: T_5 | TensorLike,
      weights: Tensor[Rank],
      epsilon: Unit,
      reduction: Reduction
    ): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_5]
    inline def logLoss[T_5 /* <: Tensor[Rank] */, O_5 /* <: Tensor[Rank] */](labels: T_5 | TensorLike, predictions: T_5 | TensorLike, weights: TensorLike): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_5]
    inline def logLoss[T_5 /* <: Tensor[Rank] */, O_5 /* <: Tensor[Rank] */](labels: T_5 | TensorLike, predictions: T_5 | TensorLike, weights: TensorLike, epsilon: Double): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[O_5]
    inline def logLoss[T_5 /* <: Tensor[Rank] */, O_5 /* <: Tensor[Rank] */](
      labels: T_5 | TensorLike,
      predictions: T_5 | TensorLike,
      weights: TensorLike,
      epsilon: Double,
      reduction: Reduction
    ): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_5]
    inline def logLoss[T_5 /* <: Tensor[Rank] */, O_5 /* <: Tensor[Rank] */](
      labels: T_5 | TensorLike,
      predictions: T_5 | TensorLike,
      weights: TensorLike,
      epsilon: Unit,
      reduction: Reduction
    ): O_5 = (^.asInstanceOf[js.Dynamic].applyDynamic("logLoss")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_5]
    
    inline def meanSquaredError[T_6 /* <: Tensor[Rank] */, O_6 /* <: Tensor[Rank] */](labels: T_6 | TensorLike, predictions: T_6 | TensorLike): O_6 = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any])).asInstanceOf[O_6]
    inline def meanSquaredError[T_6 /* <: Tensor[Rank] */, O_6 /* <: Tensor[Rank] */](labels: T_6 | TensorLike, predictions: T_6 | TensorLike, weights: Unit, reduction: Reduction): O_6 = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_6]
    inline def meanSquaredError[T_6 /* <: Tensor[Rank] */, O_6 /* <: Tensor[Rank] */](labels: T_6 | TensorLike, predictions: T_6 | TensorLike, weights: Tensor[Rank]): O_6 = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_6]
    inline def meanSquaredError[T_6 /* <: Tensor[Rank] */, O_6 /* <: Tensor[Rank] */](
      labels: T_6 | TensorLike,
      predictions: T_6 | TensorLike,
      weights: Tensor[Rank],
      reduction: Reduction
    ): O_6 = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_6]
    inline def meanSquaredError[T_6 /* <: Tensor[Rank] */, O_6 /* <: Tensor[Rank] */](labels: T_6 | TensorLike, predictions: T_6 | TensorLike, weights: TensorLike): O_6 = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_6]
    inline def meanSquaredError[T_6 /* <: Tensor[Rank] */, O_6 /* <: Tensor[Rank] */](labels: T_6 | TensorLike, predictions: T_6 | TensorLike, weights: TensorLike, reduction: Reduction): O_6 = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(labels.asInstanceOf[js.Any], predictions.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_6]
    
    inline def sigmoidCrossEntropy[T_7 /* <: Tensor[Rank] */, O_7 /* <: Tensor[Rank] */](multiClassLabels: T_7 | TensorLike, logits: T_7 | TensorLike): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any])).asInstanceOf[O_7]
    inline def sigmoidCrossEntropy[T_7 /* <: Tensor[Rank] */, O_7 /* <: Tensor[Rank] */](
      multiClassLabels: T_7 | TensorLike,
      logits: T_7 | TensorLike,
      weights: Unit,
      labelSmoothing: Double
    ): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any])).asInstanceOf[O_7]
    inline def sigmoidCrossEntropy[T_7 /* <: Tensor[Rank] */, O_7 /* <: Tensor[Rank] */](
      multiClassLabels: T_7 | TensorLike,
      logits: T_7 | TensorLike,
      weights: Unit,
      labelSmoothing: Double,
      reduction: Reduction
    ): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_7]
    inline def sigmoidCrossEntropy[T_7 /* <: Tensor[Rank] */, O_7 /* <: Tensor[Rank] */](
      multiClassLabels: T_7 | TensorLike,
      logits: T_7 | TensorLike,
      weights: Unit,
      labelSmoothing: Unit,
      reduction: Reduction
    ): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_7]
    inline def sigmoidCrossEntropy[T_7 /* <: Tensor[Rank] */, O_7 /* <: Tensor[Rank] */](multiClassLabels: T_7 | TensorLike, logits: T_7 | TensorLike, weights: Tensor[Rank]): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_7]
    inline def sigmoidCrossEntropy[T_7 /* <: Tensor[Rank] */, O_7 /* <: Tensor[Rank] */](
      multiClassLabels: T_7 | TensorLike,
      logits: T_7 | TensorLike,
      weights: Tensor[Rank],
      labelSmoothing: Double
    ): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any])).asInstanceOf[O_7]
    inline def sigmoidCrossEntropy[T_7 /* <: Tensor[Rank] */, O_7 /* <: Tensor[Rank] */](
      multiClassLabels: T_7 | TensorLike,
      logits: T_7 | TensorLike,
      weights: Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_7]
    inline def sigmoidCrossEntropy[T_7 /* <: Tensor[Rank] */, O_7 /* <: Tensor[Rank] */](
      multiClassLabels: T_7 | TensorLike,
      logits: T_7 | TensorLike,
      weights: Tensor[Rank],
      labelSmoothing: Unit,
      reduction: Reduction
    ): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_7]
    inline def sigmoidCrossEntropy[T_7 /* <: Tensor[Rank] */, O_7 /* <: Tensor[Rank] */](multiClassLabels: T_7 | TensorLike, logits: T_7 | TensorLike, weights: TensorLike): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_7]
    inline def sigmoidCrossEntropy[T_7 /* <: Tensor[Rank] */, O_7 /* <: Tensor[Rank] */](
      multiClassLabels: T_7 | TensorLike,
      logits: T_7 | TensorLike,
      weights: TensorLike,
      labelSmoothing: Double
    ): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any])).asInstanceOf[O_7]
    inline def sigmoidCrossEntropy[T_7 /* <: Tensor[Rank] */, O_7 /* <: Tensor[Rank] */](
      multiClassLabels: T_7 | TensorLike,
      logits: T_7 | TensorLike,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: Reduction
    ): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_7]
    inline def sigmoidCrossEntropy[T_7 /* <: Tensor[Rank] */, O_7 /* <: Tensor[Rank] */](
      multiClassLabels: T_7 | TensorLike,
      logits: T_7 | TensorLike,
      weights: TensorLike,
      labelSmoothing: Unit,
      reduction: Reduction
    ): O_7 = (^.asInstanceOf[js.Dynamic].applyDynamic("sigmoidCrossEntropy")(multiClassLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_7]
    
    inline def softmaxCrossEntropy[T_8 /* <: Tensor[Rank] */, O_8 /* <: Tensor[Rank] */](onehotLabels: T_8 | TensorLike, logits: T_8 | TensorLike): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any])).asInstanceOf[O_8]
    inline def softmaxCrossEntropy[T_8 /* <: Tensor[Rank] */, O_8 /* <: Tensor[Rank] */](onehotLabels: T_8 | TensorLike, logits: T_8 | TensorLike, weights: Unit, labelSmoothing: Double): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any])).asInstanceOf[O_8]
    inline def softmaxCrossEntropy[T_8 /* <: Tensor[Rank] */, O_8 /* <: Tensor[Rank] */](
      onehotLabels: T_8 | TensorLike,
      logits: T_8 | TensorLike,
      weights: Unit,
      labelSmoothing: Double,
      reduction: Reduction
    ): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_8]
    inline def softmaxCrossEntropy[T_8 /* <: Tensor[Rank] */, O_8 /* <: Tensor[Rank] */](
      onehotLabels: T_8 | TensorLike,
      logits: T_8 | TensorLike,
      weights: Unit,
      labelSmoothing: Unit,
      reduction: Reduction
    ): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_8]
    inline def softmaxCrossEntropy[T_8 /* <: Tensor[Rank] */, O_8 /* <: Tensor[Rank] */](onehotLabels: T_8 | TensorLike, logits: T_8 | TensorLike, weights: Tensor[Rank]): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_8]
    inline def softmaxCrossEntropy[T_8 /* <: Tensor[Rank] */, O_8 /* <: Tensor[Rank] */](
      onehotLabels: T_8 | TensorLike,
      logits: T_8 | TensorLike,
      weights: Tensor[Rank],
      labelSmoothing: Double
    ): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any])).asInstanceOf[O_8]
    inline def softmaxCrossEntropy[T_8 /* <: Tensor[Rank] */, O_8 /* <: Tensor[Rank] */](
      onehotLabels: T_8 | TensorLike,
      logits: T_8 | TensorLike,
      weights: Tensor[Rank],
      labelSmoothing: Double,
      reduction: Reduction
    ): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_8]
    inline def softmaxCrossEntropy[T_8 /* <: Tensor[Rank] */, O_8 /* <: Tensor[Rank] */](
      onehotLabels: T_8 | TensorLike,
      logits: T_8 | TensorLike,
      weights: Tensor[Rank],
      labelSmoothing: Unit,
      reduction: Reduction
    ): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_8]
    inline def softmaxCrossEntropy[T_8 /* <: Tensor[Rank] */, O_8 /* <: Tensor[Rank] */](onehotLabels: T_8 | TensorLike, logits: T_8 | TensorLike, weights: TensorLike): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[O_8]
    inline def softmaxCrossEntropy[T_8 /* <: Tensor[Rank] */, O_8 /* <: Tensor[Rank] */](
      onehotLabels: T_8 | TensorLike,
      logits: T_8 | TensorLike,
      weights: TensorLike,
      labelSmoothing: Double
    ): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any])).asInstanceOf[O_8]
    inline def softmaxCrossEntropy[T_8 /* <: Tensor[Rank] */, O_8 /* <: Tensor[Rank] */](
      onehotLabels: T_8 | TensorLike,
      logits: T_8 | TensorLike,
      weights: TensorLike,
      labelSmoothing: Double,
      reduction: Reduction
    ): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_8]
    inline def softmaxCrossEntropy[T_8 /* <: Tensor[Rank] */, O_8 /* <: Tensor[Rank] */](
      onehotLabels: T_8 | TensorLike,
      logits: T_8 | TensorLike,
      weights: TensorLike,
      labelSmoothing: Unit,
      reduction: Reduction
    ): O_8 = (^.asInstanceOf[js.Dynamic].applyDynamic("softmaxCrossEntropy")(onehotLabels.asInstanceOf[js.Any], logits.asInstanceOf[js.Any], weights.asInstanceOf[js.Any], labelSmoothing.asInstanceOf[js.Any], reduction.asInstanceOf[js.Any])).asInstanceOf[O_8]
  }
  
  inline def lowerBound(sortedSequence: Tensor[Rank], values: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(sortedSequence.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def lowerBound(sortedSequence: Tensor[Rank], values: TensorLike): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(sortedSequence.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def lowerBound(sortedSequence: TensorLike, values: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(sortedSequence.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def lowerBound(sortedSequence: TensorLike, values: TensorLike): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(sortedSequence.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank], transposeA: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank], transposeA: Boolean, transposeB: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any], transposeB.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank], transposeA: Unit, transposeB: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any], transposeB.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike, transposeA: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike, transposeA: Boolean, transposeB: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any], transposeB.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def matMul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike, transposeA: Unit, transposeB: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any], transposeB.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank], transposeA: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank], transposeA: Boolean, transposeB: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any], transposeB.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank], transposeA: Unit, transposeB: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any], transposeB.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: Boolean, transposeB: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any], transposeB.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def matMul[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike, transposeA: Unit, transposeB: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], transposeA.asInstanceOf[js.Any], transposeB.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def max[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def max[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def max[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def max[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def max[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def max[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def max[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def max[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def max[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def max[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def max[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def max[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: same_ | valid_,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: Double,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: ExplicitPadding): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: ExplicitPadding,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: Double,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: ExplicitPadding): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: ExplicitPadding,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: same_ | valid_): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: Double,
    pad: same_ | valid_,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: Double,
    pad: Double,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: ExplicitPadding): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maxPool[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: Double,
    pad: ExplicitPadding,
    dimRoundingMode: ceil | floor | round
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def maxPool3d[T /* <: Tensor4D | Tensor5D */](
    x: T | TensorLike,
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    dimRoundingMode: js.UndefOr[floor | round | ceil],
    dataFormat: js.UndefOr[NDHWC | NCDHW]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPool3d")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: js.Tuple2[Double, Double],
    pad: Double,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: same_ | valid_): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: same_ | valid_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: js.Tuple2[Double, Double], strides: Double, pad: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: js.Tuple2[Double, Double],
    strides: Double,
    pad: Double,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: same_ | valid_): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: same_ | valid_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: js.Tuple2[Double, Double], pad: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: js.Tuple2[Double, Double],
    pad: Double,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: same_ | valid_): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](
    x: T | TensorLike,
    filterSize: Double,
    strides: Double,
    pad: same_ | valid_,
    includeBatchInIndex: Boolean
  ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: Double): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  inline def maxPoolWithArgmax[T /* <: Tensor4D */](x: T | TensorLike, filterSize: Double, strides: Double, pad: Double, includeBatchInIndex: Boolean): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("maxPoolWithArgmax")(x.asInstanceOf[js.Any], filterSize.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], includeBatchInIndex.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
  
  inline def maximum[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maximum")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maximum[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maximum")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maximum[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maximum")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def maximum[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("maximum")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def mean[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def mean[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def mean[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def mean[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def mean[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def mean[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def mean[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mean")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def meshgrid[T /* <: Tensor[Rank] */](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("meshgrid")().asInstanceOf[js.Array[T]]
  inline def meshgrid[T /* <: Tensor[Rank] */](x: T | TensorLike): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("meshgrid")(x.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def meshgrid[T /* <: Tensor[Rank] */](x: T | TensorLike, y: T | TensorLike): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("meshgrid")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def meshgrid[T /* <: Tensor[Rank] */](x: T | TensorLike, y: T | TensorLike, param2: Indexing): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("meshgrid")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def meshgrid[T /* <: Tensor[Rank] */](x: T | TensorLike, y: Unit, param2: Indexing): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("meshgrid")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def meshgrid[T /* <: Tensor[Rank] */](x: Unit, y: T | TensorLike): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("meshgrid")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def meshgrid[T /* <: Tensor[Rank] */](x: Unit, y: T | TensorLike, param2: Indexing): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("meshgrid")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def meshgrid[T /* <: Tensor[Rank] */](x: Unit, y: Unit, param2: Indexing): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("meshgrid")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def min[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def min[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def min[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def min[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def min[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def min[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def min[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def min[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def min[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def min[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def min[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def min[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def minimum[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("minimum")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def minimum[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("minimum")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def minimum[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("minimum")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def minimum[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("minimum")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def mirrorPad[T /* <: Tensor[Rank] */](x: T | TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], mode: reflect | symmetric): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mirrorPad")(x.asInstanceOf[js.Any], paddings.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def mod[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def mod[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def mod[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def mod[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "moments")
  @js.native
  val moments: js.Function3[
    /* x */ Tensor[Rank] | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    /* keepDims */ js.UndefOr[Boolean], 
    Mean
  ] = js.native
  
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Double, step: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Double, step: Double, zeroDebias: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any], zeroDebias.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Double, step: Unit, zeroDebias: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any], zeroDebias.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Double, step: Scalar): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Double, step: Scalar, zeroDebias: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any], zeroDebias.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Scalar): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Scalar, step: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Scalar, step: Double, zeroDebias: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any], zeroDebias.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Scalar, step: Unit, zeroDebias: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any], zeroDebias.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Scalar, step: Scalar): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def movingAverage[T /* <: Tensor[Rank] */](v: T | TensorLike, x: T | TensorLike, decay: Scalar, step: Scalar, zeroDebias: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("movingAverage")(v.asInstanceOf[js.Any], x.asInstanceOf[js.Any], decay.asInstanceOf[js.Any], step.asInstanceOf[js.Any], zeroDebias.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def mul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def mul[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def mul[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def mul[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mul")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "multiRNNCell")
  @js.native
  val multiRNNCell: js.Function4[
    /* lstmCells */ js.Array[LSTMCellFunc], 
    /* data */ Tensor2D | TensorLike, 
    /* c */ js.Array[Tensor2D | TensorLike], 
    /* h */ js.Array[Tensor2D | TensorLike], 
    js.Tuple2[js.Array[Tensor2D], js.Array[Tensor2D]]
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "multinomial")
  @js.native
  val multinomial: js.Function4[
    /* logits */ Tensor1D | Tensor2D | TensorLike, 
    /* numSamples */ Double, 
    /* seed */ js.UndefOr[Double], 
    /* normalized */ js.UndefOr[Boolean], 
    Tensor1D | Tensor2D
  ] = js.native
  
  inline def neg[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("neg")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "norm")
  @js.native
  val norm: js.Function4[
    /* x */ Tensor[Rank] | TensorLike, 
    /* ord */ js.UndefOr[Double | euclidean | fro], 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    /* keepDims */ js.UndefOr[Boolean], 
    Tensor[Rank]
  ] = js.native
  
  inline def notEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def notEqual[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def notEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def notEqual[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "oneHot")
  @js.native
  val oneHot: js.Function5[
    /* indices */ Tensor[Rank] | TensorLike, 
    /* depth */ Double, 
    /* onValue */ js.UndefOr[Double], 
    /* offValue */ js.UndefOr[Double], 
    /* dtype */ js.UndefOr[DataType], 
    Tensor[Rank]
  ] = js.native
  
  inline def ones[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("ones")(shape.asInstanceOf[js.Any]).asInstanceOf[Tensor[R]]
  inline def ones[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("ones")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  inline def onesLike[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("onesLike")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def op[T /* <: js.Function */](f: StringDictionary[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("op")(f.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "outerProduct")
  @js.native
  val outerProduct: js.Function2[/* v1 */ Tensor1D | TensorLike, /* v2 */ Tensor1D | TensorLike, Tensor2D] = js.native
  
  inline def pad[T /* <: Tensor[Rank] */](x: T | TensorLike, paddings: js.Array[js.Tuple2[Double, Double]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(x.asInstanceOf[js.Any], paddings.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def pad[T /* <: Tensor[Rank] */](x: T | TensorLike, paddings: js.Array[js.Tuple2[Double, Double]], constantValue: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(x.asInstanceOf[js.Any], paddings.asInstanceOf[js.Any], constantValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "pad1d")
  @js.native
  val pad1d: js.Function3[
    /* x */ Tensor1D | TensorLike, 
    /* paddings */ js.Tuple2[Double, Double], 
    /* constantValue */ js.UndefOr[Double], 
    Tensor1D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "pad2d")
  @js.native
  val pad2d: js.Function3[
    /* x */ Tensor2D | TensorLike, 
    /* paddings */ js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
    /* constantValue */ js.UndefOr[Double], 
    Tensor2D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "pad3d")
  @js.native
  val pad3d: js.Function3[
    /* x */ Tensor3D | TensorLike, 
    /* paddings */ js.Tuple3[js.Tuple2[Double, Double], js.Tuple2[Double, Double], js.Tuple2[Double, Double]], 
    /* constantValue */ js.UndefOr[Double], 
    Tensor3D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "pad4d")
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
  
  inline def pool[T /* <: Tensor3D | Tensor4D */](
    input: T | TensorLike,
    windowShape: (js.Tuple2[Double, Double]) | Double,
    poolingType: avg | max,
    pad: valid_ | same_ | Double | ExplicitPadding,
    dilations: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    strides: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    dimRoundingMode: js.UndefOr[floor | round | ceil]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pool")(input.asInstanceOf[js.Any], windowShape.asInstanceOf[js.Any], poolingType.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilations.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], dimRoundingMode.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def pow[T /* <: Tensor[Rank] */](base: Tensor[Rank], exp: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(base.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def pow[T /* <: Tensor[Rank] */](base: Tensor[Rank], exp: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(base.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def pow[T /* <: Tensor[Rank] */](base: TensorLike, exp: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(base.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def pow[T /* <: Tensor[Rank] */](base: TensorLike, exp: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(base.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def prelu[T /* <: Tensor[Rank] */](x: T | TensorLike, alpha: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prelu")(x.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def print[T /* <: Tensor[Rank] */](x: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(x.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def print[T /* <: Tensor[Rank] */](x: T, verbose: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(x.asInstanceOf[js.Any], verbose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def prod[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def prod[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def prod[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def prod[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def prod[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def prod[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def prod[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("prod")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "raggedGather")
  @js.native
  val raggedGather: js.Function4[
    /* paramsNestedSplits */ js.Array[Tensor[Rank]], 
    /* paramsDenseValues */ Tensor[Rank] | TensorLike, 
    /* indices */ Tensor[Rank] | TensorLike, 
    /* outputRaggedRank */ Double, 
    RaggedGatherMap
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "raggedRange")
  @js.native
  val raggedRange: js.Function3[
    /* starts */ Tensor[Rank] | TensorLike, 
    /* limits */ Tensor[Rank] | TensorLike, 
    /* deltas */ Tensor[Rank] | TensorLike, 
    NamedTensorMap
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "raggedTensorToTensor")
  @js.native
  val raggedTensorToTensor: js.Function5[
    /* shape */ Tensor[Rank] | TensorLike, 
    /* values */ Tensor[Rank] | TensorLike, 
    /* defaultValue */ Tensor[Rank] | TensorLike, 
    /* rowPartitionTensors */ js.Array[Tensor[Rank]], 
    /* rowPartitionTypes */ js.Array[String], 
    Tensor[Rank]
  ] = js.native
  
  inline def rand[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    randFunction: js.Function0[Double]
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("rand")(shape.asInstanceOf[js.Any], randFunction.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def rand[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    randFunction: js.Function0[Double],
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("rand")(shape.asInstanceOf[js.Any], randFunction.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  inline def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Double,
    dtype: float32 | int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Double,
    dtype: float32 | int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Double,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Unit,
    dtype: float32 | int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Unit,
    dtype: float32 | int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomGamma[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    alpha: Double,
    beta: Unit,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomGamma")(shape.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  inline def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any]).asInstanceOf[Tensor[R]]
  inline def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: float32 | int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: float32 | int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Unit,
    dtype: float32 | int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Unit,
    dtype: float32 | int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Unit,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double,
    dtype: float32 | int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double,
    dtype: float32 | int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Unit,
    dtype: float32 | int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Unit,
    dtype: float32 | int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Unit,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  inline def randomStandardNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("randomStandardNormal")(shape.asInstanceOf[js.Any]).asInstanceOf[Tensor[R]]
  inline def randomStandardNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: float32 | int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomStandardNormal")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomStandardNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: float32 | int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomStandardNormal")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomStandardNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomStandardNormal")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any]).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    dtype: Unit,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    dtype: DataType,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    dtype: DataType,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Unit,
    dtype: Unit,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Unit,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Unit,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Unit,
    dtype: DataType,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Unit,
    dtype: DataType,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Double,
    dtype: Unit,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Double,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Double,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Double,
    dtype: DataType,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Double,
    dtype: DataType,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Unit,
    dtype: Unit,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Unit,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Unit,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Unit,
    dtype: DataType,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniform[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Unit,
    maxval: Unit,
    dtype: DataType,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  inline def randomUniformInt[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniformInt")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniformInt[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    seed: String
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniformInt")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def randomUniformInt[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    minval: Double,
    maxval: Double,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("randomUniformInt")(shape.asInstanceOf[js.Any], minval.asInstanceOf[js.Any], maxval.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  inline def range(start: Double, stop: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def range(start: Double, stop: Double, step: Double): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def range(start: Double, stop: Double, step: Double, dtype: float32 | int32): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  inline def range(start: Double, stop: Double, step: Unit, dtype: float32 | int32): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  
  inline def real[T /* <: Tensor[Rank] */](input: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("real")(input.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def reciprocal[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("reciprocal")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def relu[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("relu")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def relu6[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("relu6")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def reshape[R /* <: Rank */](
    x: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(x.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def reshape[R /* <: Rank */](
    x: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(x.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  inline def reverse[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def reverse[T /* <: Tensor[Rank] */](x: T | TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def reverse[T /* <: Tensor[Rank] */](x: T | TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "reverse1d")
  @js.native
  val reverse1d: js.Function1[/* x */ Tensor1D | TensorLike, Tensor1D] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "reverse2d")
  @js.native
  val reverse2d: js.Function2[
    /* x */ Tensor2D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor2D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "reverse3d")
  @js.native
  val reverse3d: js.Function2[
    /* x */ Tensor3D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor3D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "reverse4d")
  @js.native
  val reverse4d: js.Function2[
    /* x */ Tensor4D | TensorLike, 
    /* axis */ js.UndefOr[Double | js.Array[Double]], 
    Tensor4D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "rfft")
  @js.native
  val rfft: js.Function2[/* input */ Tensor[Rank], /* fftLength */ js.UndefOr[Double], Tensor[Rank]] = js.native
  
  inline def round[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def rsqrt[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("rsqrt")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def scalar(value: String): Scalar = ^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any]).asInstanceOf[Scalar]
  inline def scalar(value: String, dtype: DataType): Scalar = (^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Scalar]
  inline def scalar(value: js.typedarray.Uint8Array): Scalar = ^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any]).asInstanceOf[Scalar]
  inline def scalar(value: js.typedarray.Uint8Array, dtype: DataType): Scalar = (^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Scalar]
  inline def scalar(value: Boolean): Scalar = ^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any]).asInstanceOf[Scalar]
  inline def scalar(value: Boolean, dtype: DataType): Scalar = (^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Scalar]
  inline def scalar(value: Double): Scalar = ^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any]).asInstanceOf[Scalar]
  inline def scalar(value: Double, dtype: DataType): Scalar = (^.asInstanceOf[js.Dynamic].applyDynamic("scalar")(value.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Scalar]
  
  inline def scatterND[R /* <: Rank */](
    indices: Tensor[Rank],
    updates: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("scatterND")(indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def scatterND[R /* <: Rank */](
    indices: Tensor[Rank],
    updates: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("scatterND")(indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def scatterND[R /* <: Rank */](
    indices: TensorLike,
    updates: Tensor[Rank],
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("scatterND")(indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def scatterND[R /* <: Rank */](
    indices: TensorLike,
    updates: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("scatterND")(indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "searchSorted")
  @js.native
  val searchSorted: js.Function3[
    /* sortedSequence */ Tensor[Rank] | TensorLike, 
    /* values */ Tensor[Rank] | TensorLike, 
    /* side */ js.UndefOr[left | right], 
    Tensor[Rank]
  ] = js.native
  
  inline def selu[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("selu")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def separableConv2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    depthwiseFilter: Tensor4D | TensorLike,
    pointwiseFilter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_,
    dilation: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    dataFormat: js.UndefOr[NHWC | NCHW]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("separableConv2d")(x.asInstanceOf[js.Any], depthwiseFilter.asInstanceOf[js.Any], pointwiseFilter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilation.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "setdiff1dAsync")
  @js.native
  val setdiff1dAsync: js.Function2[
    /* x */ Tensor[Rank] | TensorLike, 
    /* y */ Tensor[Rank] | TensorLike, 
    js.Promise[js.Tuple2[Tensor[Rank], Tensor[Rank]]]
  ] = js.native
  
  inline def sigmoid[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sigmoid")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def sign[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  object signal {
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "signal")
    @js.native
    val ^ : js.Any = js.native
    
    inline def frame(signal: Tensor1D, frameLength: Double, frameStep: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("frame")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def frame(signal: Tensor1D, frameLength: Double, frameStep: Double, padEnd: Boolean): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("frame")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any], padEnd.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def frame(signal: Tensor1D, frameLength: Double, frameStep: Double, padEnd: Boolean, padValue: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("frame")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any], padEnd.asInstanceOf[js.Any], padValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def frame(signal: Tensor1D, frameLength: Double, frameStep: Double, padEnd: Unit, padValue: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("frame")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any], padEnd.asInstanceOf[js.Any], padValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def hammingWindow(windowLength: Double): Tensor1D = ^.asInstanceOf[js.Dynamic].applyDynamic("hammingWindow")(windowLength.asInstanceOf[js.Any]).asInstanceOf[Tensor1D]
    
    inline def hannWindow(windowLength: Double): Tensor1D = ^.asInstanceOf[js.Dynamic].applyDynamic("hannWindow")(windowLength.asInstanceOf[js.Any]).asInstanceOf[Tensor1D]
    
    inline def stft(signal: Tensor1D, frameLength: Double, frameStep: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stft")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def stft(signal: Tensor1D, frameLength: Double, frameStep: Double, fftLength: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stft")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any], fftLength.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def stft(
      signal: Tensor1D,
      frameLength: Double,
      frameStep: Double,
      fftLength: Double,
      windowFn: js.Function1[/* length */ Double, Tensor1D]
    ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stft")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any], fftLength.asInstanceOf[js.Any], windowFn.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def stft(
      signal: Tensor1D,
      frameLength: Double,
      frameStep: Double,
      fftLength: Unit,
      windowFn: js.Function1[/* length */ Double, Tensor1D]
    ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stft")(signal.asInstanceOf[js.Any], frameLength.asInstanceOf[js.Any], frameStep.asInstanceOf[js.Any], fftLength.asInstanceOf[js.Any], windowFn.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  }
  
  inline def sin[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sin")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def sinh[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sinh")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T | TensorLike, begin: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T | TensorLike, begin: js.Array[Double], size: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T | TensorLike, begin: js.Array[Double], size: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T | TensorLike, begin: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T | TensorLike, begin: Double, size: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def slice[R /* <: Rank */, T /* <: Tensor[R] */](x: T | TensorLike, begin: Double, size: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(x.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "slice1d")
  @js.native
  val slice1d: js.Function3[/* x */ Tensor1D | TensorLike, /* begin */ Double, /* size */ Double, Tensor1D] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "slice2d")
  @js.native
  val slice2d: js.Function3[
    /* x */ Tensor2D | TensorLike, 
    /* begin */ js.Tuple2[Double, Double], 
    /* size */ js.Tuple2[Double, Double], 
    Tensor2D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "slice3d")
  @js.native
  val slice3d: js.Function3[
    /* x */ Tensor3D | TensorLike, 
    /* begin */ js.Tuple3[Double, Double, Double], 
    /* size */ js.Tuple3[Double, Double, Double], 
    Tensor3D
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "slice4d")
  @js.native
  val slice4d: js.Function3[
    /* x */ Tensor4D | TensorLike, 
    /* begin */ js.Tuple4[Double, Double, Double, Double], 
    /* size */ js.Tuple4[Double, Double, Double, Double], 
    Tensor4D
  ] = js.native
  
  inline def softmax[T /* <: Tensor[Rank] */](logits: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("softmax")(logits.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def softmax[T /* <: Tensor[Rank] */](logits: T | TensorLike, dim: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("softmax")(logits.asInstanceOf[js.Any], dim.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def softplus[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("softplus")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def spaceToBatchND[T /* <: Tensor[Rank] */](x: T | TensorLike, blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("spaceToBatchND")(x.asInstanceOf[js.Any], blockShape.asInstanceOf[js.Any], paddings.asInstanceOf[js.Any])).asInstanceOf[T]
  
  object sparse {
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "sparse")
    @js.native
    val ^ : js.Any = js.native
    
    inline def sparseFillEmptyRows(indices: Tensor2D, values: Tensor1D, denseShape: Tensor1D, defaultValue: Scalar): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRows")(indices.asInstanceOf[js.Any], values.asInstanceOf[js.Any], denseShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseFillEmptyRows(indices: Tensor2D, values: Tensor1D, denseShape: Tensor1D, defaultValue: ScalarLike): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRows")(indices.asInstanceOf[js.Any], values.asInstanceOf[js.Any], denseShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseFillEmptyRows(indices: Tensor2D, values: Tensor1D, denseShape: TensorLike, defaultValue: Scalar): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRows")(indices.asInstanceOf[js.Any], values.asInstanceOf[js.Any], denseShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseFillEmptyRows(indices: Tensor2D, values: Tensor1D, denseShape: TensorLike, defaultValue: ScalarLike): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRows")(indices.asInstanceOf[js.Any], values.asInstanceOf[js.Any], denseShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseFillEmptyRows(indices: Tensor2D, values: TensorLike, denseShape: Tensor1D, defaultValue: Scalar): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRows")(indices.asInstanceOf[js.Any], values.asInstanceOf[js.Any], denseShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseFillEmptyRows(indices: Tensor2D, values: TensorLike, denseShape: Tensor1D, defaultValue: ScalarLike): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRows")(indices.asInstanceOf[js.Any], values.asInstanceOf[js.Any], denseShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseFillEmptyRows(indices: Tensor2D, values: TensorLike, denseShape: TensorLike, defaultValue: Scalar): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRows")(indices.asInstanceOf[js.Any], values.asInstanceOf[js.Any], denseShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseFillEmptyRows(indices: Tensor2D, values: TensorLike, denseShape: TensorLike, defaultValue: ScalarLike): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRows")(indices.asInstanceOf[js.Any], values.asInstanceOf[js.Any], denseShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseFillEmptyRows(indices: TensorLike, values: Tensor1D, denseShape: Tensor1D, defaultValue: Scalar): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRows")(indices.asInstanceOf[js.Any], values.asInstanceOf[js.Any], denseShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseFillEmptyRows(indices: TensorLike, values: Tensor1D, denseShape: Tensor1D, defaultValue: ScalarLike): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRows")(indices.asInstanceOf[js.Any], values.asInstanceOf[js.Any], denseShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseFillEmptyRows(indices: TensorLike, values: Tensor1D, denseShape: TensorLike, defaultValue: Scalar): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRows")(indices.asInstanceOf[js.Any], values.asInstanceOf[js.Any], denseShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseFillEmptyRows(indices: TensorLike, values: Tensor1D, denseShape: TensorLike, defaultValue: ScalarLike): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRows")(indices.asInstanceOf[js.Any], values.asInstanceOf[js.Any], denseShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseFillEmptyRows(indices: TensorLike, values: TensorLike, denseShape: Tensor1D, defaultValue: Scalar): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRows")(indices.asInstanceOf[js.Any], values.asInstanceOf[js.Any], denseShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseFillEmptyRows(indices: TensorLike, values: TensorLike, denseShape: Tensor1D, defaultValue: ScalarLike): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRows")(indices.asInstanceOf[js.Any], values.asInstanceOf[js.Any], denseShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseFillEmptyRows(indices: TensorLike, values: TensorLike, denseShape: TensorLike, defaultValue: Scalar): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRows")(indices.asInstanceOf[js.Any], values.asInstanceOf[js.Any], denseShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseFillEmptyRows(indices: TensorLike, values: TensorLike, denseShape: TensorLike, defaultValue: ScalarLike): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseFillEmptyRows")(indices.asInstanceOf[js.Any], values.asInstanceOf[js.Any], denseShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    
    inline def sparseReshape(inputIndices: Tensor2D, inputShape: Tensor1D, newShape: Tensor1D): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseReshape")(inputIndices.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any], newShape.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseReshape(inputIndices: Tensor2D, inputShape: Tensor1D, newShape: TensorLike): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseReshape")(inputIndices.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any], newShape.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseReshape(inputIndices: Tensor2D, inputShape: TensorLike, newShape: Tensor1D): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseReshape")(inputIndices.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any], newShape.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseReshape(inputIndices: Tensor2D, inputShape: TensorLike, newShape: TensorLike): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseReshape")(inputIndices.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any], newShape.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseReshape(inputIndices: TensorLike, inputShape: Tensor1D, newShape: Tensor1D): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseReshape")(inputIndices.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any], newShape.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseReshape(inputIndices: TensorLike, inputShape: Tensor1D, newShape: TensorLike): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseReshape")(inputIndices.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any], newShape.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseReshape(inputIndices: TensorLike, inputShape: TensorLike, newShape: Tensor1D): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseReshape")(inputIndices.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any], newShape.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def sparseReshape(inputIndices: TensorLike, inputShape: TensorLike, newShape: TensorLike): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseReshape")(inputIndices.asInstanceOf[js.Any], inputShape.asInstanceOf[js.Any], newShape.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    
    inline def sparseSegmentMean(data: Tensor[Rank], indices: Tensor1D, segmentIds: Tensor1D): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentMean")(data.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def sparseSegmentMean(data: Tensor[Rank], indices: Tensor1D, segmentIds: TensorLike): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentMean")(data.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def sparseSegmentMean(data: Tensor[Rank], indices: TensorLike, segmentIds: Tensor1D): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentMean")(data.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def sparseSegmentMean(data: Tensor[Rank], indices: TensorLike, segmentIds: TensorLike): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentMean")(data.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def sparseSegmentMean(data: TensorLike, indices: Tensor1D, segmentIds: Tensor1D): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentMean")(data.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def sparseSegmentMean(data: TensorLike, indices: Tensor1D, segmentIds: TensorLike): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentMean")(data.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def sparseSegmentMean(data: TensorLike, indices: TensorLike, segmentIds: Tensor1D): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentMean")(data.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def sparseSegmentMean(data: TensorLike, indices: TensorLike, segmentIds: TensorLike): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentMean")(data.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def sparseSegmentSum(data: Tensor[Rank], indices: Tensor1D, segmentIds: Tensor1D): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentSum")(data.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def sparseSegmentSum(data: Tensor[Rank], indices: Tensor1D, segmentIds: TensorLike): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentSum")(data.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def sparseSegmentSum(data: Tensor[Rank], indices: TensorLike, segmentIds: Tensor1D): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentSum")(data.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def sparseSegmentSum(data: Tensor[Rank], indices: TensorLike, segmentIds: TensorLike): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentSum")(data.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def sparseSegmentSum(data: TensorLike, indices: Tensor1D, segmentIds: Tensor1D): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentSum")(data.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def sparseSegmentSum(data: TensorLike, indices: Tensor1D, segmentIds: TensorLike): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentSum")(data.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def sparseSegmentSum(data: TensorLike, indices: TensorLike, segmentIds: Tensor1D): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentSum")(data.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def sparseSegmentSum(data: TensorLike, indices: TensorLike, segmentIds: TensorLike): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseSegmentSum")(data.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  }
  
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: Tensor[Rank],
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: Tensor[Rank],
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: Scalar
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def sparseToDense[R /* <: Rank */](
    sparseIndices: TensorLike,
    sparseValues: TensorLike,
    outputShape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    defaultValue: ScalarLike
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseToDense")(sparseIndices.asInstanceOf[js.Any], sparseValues.asInstanceOf[js.Any], outputShape.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  object spectral {
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "spectral")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fft(input: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("fft")(input.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
    
    inline def ifft(input: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("ifft")(input.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
    
    inline def irfft(input: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("irfft")(input.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
    
    inline def rfft(input: Tensor[Rank]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("rfft")(input.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
    inline def rfft(input: Tensor[Rank], fftLength: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("rfft")(input.asInstanceOf[js.Any], fftLength.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  }
  
  inline def split[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: js.Array[Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def split[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def split[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def split[T /* <: Tensor[Rank] */](x: Tensor[Rank], numOrSizeSplits: Double, axis: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def split[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: js.Array[Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def split[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def split[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def split[T /* <: Tensor[Rank] */](x: TensorLike, numOrSizeSplits: Double, axis: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(x.asInstanceOf[js.Any], numOrSizeSplits.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def sqrt[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sqrt")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def square[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("square")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def squaredDifference[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDifference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def squaredDifference[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDifference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def squaredDifference[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDifference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def squaredDifference[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("squaredDifference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def squeeze[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("squeeze")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def squeeze[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("squeeze")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def squeeze[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("squeeze")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def squeeze[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("squeeze")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def stack[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike]): Tensor[Rank] = ^.asInstanceOf[js.Dynamic].applyDynamic("stack")(tensors.asInstanceOf[js.Any]).asInstanceOf[Tensor[Rank]]
  inline def stack[T /* <: Tensor[Rank] */](tensors: js.Array[T | TensorLike], axis: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(tensors.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def step[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("step")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def step[T /* <: Tensor[Rank] */](x: T | TensorLike, alpha: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("step")(x.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "stridedSlice")
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
  
  object string {
    
    @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "string")
    @js.native
    val ^ : js.Any = js.native
    
    inline def staticRegexReplace(input: Tensor[Rank], pattern: String, rewrite: String): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("staticRegexReplace")(input.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], rewrite.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def staticRegexReplace(input: Tensor[Rank], pattern: String, rewrite: String, replaceGlobal: Boolean): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("staticRegexReplace")(input.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], rewrite.asInstanceOf[js.Any], replaceGlobal.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def staticRegexReplace(input: TensorLike, pattern: String, rewrite: String): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("staticRegexReplace")(input.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], rewrite.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def staticRegexReplace(input: TensorLike, pattern: String, rewrite: String, replaceGlobal: Boolean): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("staticRegexReplace")(input.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], rewrite.asInstanceOf[js.Any], replaceGlobal.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def stringNGrams(
      data: Tensor1D,
      dataSplits: Tensor[Rank],
      separator: String,
      nGramWidths: js.Array[Double],
      leftPad: String,
      rightPad: String,
      padWidth: Double,
      preserveShortSequences: Boolean
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringNGrams")(data.asInstanceOf[js.Any], dataSplits.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], nGramWidths.asInstanceOf[js.Any], leftPad.asInstanceOf[js.Any], rightPad.asInstanceOf[js.Any], padWidth.asInstanceOf[js.Any], preserveShortSequences.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def stringNGrams(
      data: Tensor1D,
      dataSplits: TensorLike,
      separator: String,
      nGramWidths: js.Array[Double],
      leftPad: String,
      rightPad: String,
      padWidth: Double,
      preserveShortSequences: Boolean
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringNGrams")(data.asInstanceOf[js.Any], dataSplits.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], nGramWidths.asInstanceOf[js.Any], leftPad.asInstanceOf[js.Any], rightPad.asInstanceOf[js.Any], padWidth.asInstanceOf[js.Any], preserveShortSequences.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def stringNGrams(
      data: TensorLike,
      dataSplits: Tensor[Rank],
      separator: String,
      nGramWidths: js.Array[Double],
      leftPad: String,
      rightPad: String,
      padWidth: Double,
      preserveShortSequences: Boolean
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringNGrams")(data.asInstanceOf[js.Any], dataSplits.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], nGramWidths.asInstanceOf[js.Any], leftPad.asInstanceOf[js.Any], rightPad.asInstanceOf[js.Any], padWidth.asInstanceOf[js.Any], preserveShortSequences.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def stringNGrams(
      data: TensorLike,
      dataSplits: TensorLike,
      separator: String,
      nGramWidths: js.Array[Double],
      leftPad: String,
      rightPad: String,
      padWidth: Double,
      preserveShortSequences: Boolean
    ): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringNGrams")(data.asInstanceOf[js.Any], dataSplits.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], nGramWidths.asInstanceOf[js.Any], leftPad.asInstanceOf[js.Any], rightPad.asInstanceOf[js.Any], padWidth.asInstanceOf[js.Any], preserveShortSequences.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    
    inline def stringSplit(input: Tensor1D, delimiter: Scalar): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplit")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def stringSplit(input: Tensor1D, delimiter: Scalar, skipEmpty: Boolean): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplit")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], skipEmpty.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def stringSplit(input: Tensor1D, delimiter: ScalarLike): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplit")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def stringSplit(input: Tensor1D, delimiter: ScalarLike, skipEmpty: Boolean): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplit")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], skipEmpty.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def stringSplit(input: TensorLike, delimiter: Scalar): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplit")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def stringSplit(input: TensorLike, delimiter: Scalar, skipEmpty: Boolean): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplit")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], skipEmpty.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def stringSplit(input: TensorLike, delimiter: ScalarLike): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplit")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    inline def stringSplit(input: TensorLike, delimiter: ScalarLike, skipEmpty: Boolean): NamedTensorMap = (^.asInstanceOf[js.Dynamic].applyDynamic("stringSplit")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any], skipEmpty.asInstanceOf[js.Any])).asInstanceOf[NamedTensorMap]
    
    inline def stringToHashBucketFast(input: Tensor[Rank], numBuckets: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToHashBucketFast")(input.asInstanceOf[js.Any], numBuckets.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    inline def stringToHashBucketFast(input: TensorLike, numBuckets: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToHashBucketFast")(input.asInstanceOf[js.Any], numBuckets.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  }
  
  inline def sub[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def sub[T /* <: Tensor[Rank] */](a: Tensor[Rank], b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def sub[T /* <: Tensor[Rank] */](a: TensorLike, b: Tensor[Rank]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def sub[T /* <: Tensor[Rank] */](a: TensorLike, b: TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def sum[T /* <: Tensor[Rank] */](x: Tensor[Rank], axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def sum[T /* <: Tensor[Rank] */](x: TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def sum[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def sum[T /* <: Tensor[Rank] */](x: TensorLike, axis: js.Array[Double], keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def sum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def sum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Double, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def sum[T /* <: Tensor[Rank] */](x: TensorLike, axis: Unit, keepDims: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sum")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], keepDims.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def tan[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tan")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def tanh[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tanh")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def tensor[R /* <: Rank */](values: TensorLike): Tensor[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor[R]]
  inline def tensor[R /* <: Rank */](
    values: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensor[R /* <: Rank */](
    values: TensorLike,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensor[R /* <: Rank */](values: TensorLike, shape: Unit, dtype: DataType): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensor[R /* <: Rank */](values: WebGLData): Tensor[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor[R]]
  inline def tensor[R /* <: Rank */](
    values: WebGLData,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensor[R /* <: Rank */](
    values: WebGLData,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensor[R /* <: Rank */](values: WebGLData, shape: Unit, dtype: DataType): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensor[R /* <: Rank */](values: WebGPUData): Tensor[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor[R]]
  inline def tensor[R /* <: Rank */](
    values: WebGPUData,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensor[R /* <: Rank */](
    values: WebGPUData,
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensor[R /* <: Rank */](values: WebGPUData, shape: Unit, dtype: DataType): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  inline def tensor1d(values: TensorLike1D): Tensor1D = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor1d")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor1D]
  inline def tensor1d(values: TensorLike1D, dtype: DataType): Tensor1D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor1d")(values.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor1D]
  
  inline def tensor2d(values: TensorLike2D): Tensor2D = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor2d")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor2D]
  inline def tensor2d(values: TensorLike2D, shape: js.Tuple2[Double, Double]): Tensor2D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor2d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor2D]
  inline def tensor2d(values: TensorLike2D, shape: js.Tuple2[Double, Double], dtype: DataType): Tensor2D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor2d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor2D]
  inline def tensor2d(values: TensorLike2D, shape: Unit, dtype: DataType): Tensor2D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor2d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor2D]
  
  inline def tensor3d(values: TensorLike3D): Tensor3D = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor3d")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor3D]
  inline def tensor3d(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double]): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor3d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  inline def tensor3d(values: TensorLike3D, shape: js.Tuple3[Double, Double, Double], dtype: DataType): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor3d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  inline def tensor3d(values: TensorLike3D, shape: Unit, dtype: DataType): Tensor3D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor3d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor3D]
  
  inline def tensor4d(values: TensorLike4D): Tensor4D = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor4d")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor4D]
  inline def tensor4d(values: TensorLike4D, shape: js.Tuple4[Double, Double, Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor4d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def tensor4d(values: TensorLike4D, shape: js.Tuple4[Double, Double, Double, Double], dtype: DataType): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor4d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  inline def tensor4d(values: TensorLike4D, shape: Unit, dtype: DataType): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor4d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
  
  inline def tensor5d(values: TensorLike5D): Tensor5D = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor5d")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor5D]
  inline def tensor5d(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double]): Tensor5D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor5d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor5D]
  inline def tensor5d(values: TensorLike5D, shape: js.Tuple5[Double, Double, Double, Double, Double], dtype: DataType): Tensor5D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor5d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor5D]
  inline def tensor5d(values: TensorLike5D, shape: Unit, dtype: DataType): Tensor5D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor5d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor5D]
  
  inline def tensor6d(values: TensorLike6D): Tensor6D = ^.asInstanceOf[js.Dynamic].applyDynamic("tensor6d")(values.asInstanceOf[js.Any]).asInstanceOf[Tensor6D]
  inline def tensor6d(values: TensorLike6D, shape: js.Tuple6[Double, Double, Double, Double, Double, Double]): Tensor6D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor6d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[Tensor6D]
  inline def tensor6d(
    values: TensorLike6D,
    shape: js.Tuple6[Double, Double, Double, Double, Double, Double],
    dtype: DataType
  ): Tensor6D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor6d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor6D]
  inline def tensor6d(values: TensorLike6D, shape: Unit, dtype: DataType): Tensor6D = (^.asInstanceOf[js.Dynamic].applyDynamic("tensor6d")(values.asInstanceOf[js.Any], shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor6D]
  
  inline def tensorScatterUpdate[R /* <: Rank */](tensor: Tensor[R], indices: Tensor[Rank], updates: Tensor[Rank]): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorScatterUpdate")(tensor.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensorScatterUpdate[R /* <: Rank */](tensor: Tensor[R], indices: Tensor[Rank], updates: TensorLike): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorScatterUpdate")(tensor.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensorScatterUpdate[R /* <: Rank */](tensor: Tensor[R], indices: TensorLike, updates: Tensor[Rank]): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorScatterUpdate")(tensor.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensorScatterUpdate[R /* <: Rank */](tensor: Tensor[R], indices: TensorLike, updates: TensorLike): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorScatterUpdate")(tensor.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensorScatterUpdate[R /* <: Rank */](tensor: TensorLike, indices: Tensor[Rank], updates: Tensor[Rank]): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorScatterUpdate")(tensor.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensorScatterUpdate[R /* <: Rank */](tensor: TensorLike, indices: Tensor[Rank], updates: TensorLike): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorScatterUpdate")(tensor.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensorScatterUpdate[R /* <: Rank */](tensor: TensorLike, indices: TensorLike, updates: Tensor[Rank]): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorScatterUpdate")(tensor.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def tensorScatterUpdate[R /* <: Rank */](tensor: TensorLike, indices: TensorLike, updates: TensorLike): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("tensorScatterUpdate")(tensor.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  inline def tile[T /* <: Tensor[Rank] */](x: T | TensorLike, reps: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("tile")(x.asInstanceOf[js.Any], reps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def topk[T /* <: Tensor[Rank] */](x: T | TensorLike): Indices[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("topk")(x.asInstanceOf[js.Any]).asInstanceOf[Indices[T]]
  inline def topk[T /* <: Tensor[Rank] */](x: T | TensorLike, k: Double): Indices[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("topk")(x.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Indices[T]]
  inline def topk[T /* <: Tensor[Rank] */](x: T | TensorLike, k: Double, sorted: Boolean): Indices[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("topk")(x.asInstanceOf[js.Any], k.asInstanceOf[js.Any], sorted.asInstanceOf[js.Any])).asInstanceOf[Indices[T]]
  inline def topk[T /* <: Tensor[Rank] */](x: T | TensorLike, k: Unit, sorted: Boolean): Indices[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("topk")(x.asInstanceOf[js.Any], k.asInstanceOf[js.Any], sorted.asInstanceOf[js.Any])).asInstanceOf[Indices[T]]
  
  inline def transpose[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def transpose[T /* <: Tensor[Rank] */](x: T | TensorLike, perm: js.Array[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(x.asInstanceOf[js.Any], perm.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def transpose[T /* <: Tensor[Rank] */](x: T | TensorLike, perm: js.Array[Double], conjugate: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(x.asInstanceOf[js.Any], perm.asInstanceOf[js.Any], conjugate.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def transpose[T /* <: Tensor[Rank] */](x: T | TensorLike, perm: Unit, conjugate: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("transpose")(x.asInstanceOf[js.Any], perm.asInstanceOf[js.Any], conjugate.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any]).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: float32 | int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: float32 | int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Double,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Unit,
    dtype: float32 | int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Unit,
    dtype: float32 | int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Double,
    stdDev: Unit,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double,
    dtype: float32 | int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double,
    dtype: float32 | int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Double,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Unit,
    dtype: float32 | int32
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Unit,
    dtype: float32 | int32,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  inline def truncatedNormal[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    mean: Unit,
    stdDev: Unit,
    dtype: Unit,
    seed: Double
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(shape.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], stdDev.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  inline def unique[T /* <: Tensor[Rank] */](x: T | TensorLike): Values[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("unique")(x.asInstanceOf[js.Any]).asInstanceOf[Values[T]]
  inline def unique[T /* <: Tensor[Rank] */](x: T | TensorLike, axis: Double): Values[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unique")(x.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Values[T]]
  
  inline def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: T | TensorLike, segmentIds: Tensor1D, numSegments: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unsortedSegmentSum")(x.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any], numSegments.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def unsortedSegmentSum[T /* <: Tensor[Rank] */](x: T | TensorLike, segmentIds: TensorLike, numSegments: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("unsortedSegmentSum")(x.asInstanceOf[js.Any], segmentIds.asInstanceOf[js.Any], numSegments.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "unstack")
  @js.native
  val unstack: js.Function2[
    /* x */ Tensor[Rank] | TensorLike, 
    /* axis */ js.UndefOr[Double], 
    js.Array[Tensor[Rank]]
  ] = js.native
  
  inline def upperBound(sortedSequence: Tensor[Rank], values: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("upperBound")(sortedSequence.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def upperBound(sortedSequence: Tensor[Rank], values: TensorLike): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("upperBound")(sortedSequence.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def upperBound(sortedSequence: TensorLike, values: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("upperBound")(sortedSequence.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def upperBound(sortedSequence: TensorLike, values: TensorLike): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("upperBound")(sortedSequence.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def variable[R /* <: Rank */](initialValue: Tensor[R]): Variable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any]).asInstanceOf[Variable[R]]
  inline def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
  inline def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean, name: String): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
  inline def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean, name: String, dtype: DataType): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
  inline def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Boolean, name: Unit, dtype: DataType): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
  inline def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Unit, name: String): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
  inline def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Unit, name: String, dtype: DataType): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
  inline def variable[R /* <: Rank */](initialValue: Tensor[R], trainable: Unit, name: Unit, dtype: DataType): Variable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("variable")(initialValue.asInstanceOf[js.Any], trainable.asInstanceOf[js.Any], name.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Variable[R]]
  
  inline def where[T /* <: Tensor[Rank] */](condition: Tensor[Rank], a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(condition.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def where[T /* <: Tensor[Rank] */](condition: TensorLike, a: T | TensorLike, b: T | TensorLike): T = (^.asInstanceOf[js.Dynamic].applyDynamic("where")(condition.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/ops", "whereAsync")
  @js.native
  val whereAsync: js.Function1[/* condition */ Tensor[Rank] | TensorLike, js.Promise[Tensor2D]] = js.native
  
  inline def zeros[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any
  ): Tensor[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(shape.asInstanceOf[js.Any]).asInstanceOf[Tensor[R]]
  inline def zeros[R /* <: Rank */](
    shape: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any,
    dtype: DataType
  ): Tensor[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Tensor[R]]
  
  inline def zerosLike[T /* <: Tensor[Rank] */](x: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("zerosLike")(x.asInstanceOf[js.Any]).asInstanceOf[T]
}
