package typings.tensorflowTfjsCore

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.anon.KeptDims
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.FlatVector
import typings.tensorflowTfjsCore.distTypesMod.NumericDataType
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilBaseMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def arraysEqual(n1: FlatVector, n2: FlatVector): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysEqual")(n1.asInstanceOf[js.Any], n2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def assert(expr: Boolean, msg: js.Function0[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(expr.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def assertNonNegativeIntegerDimensions(shape: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNonNegativeIntegerDimensions")(shape.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def assertNonNull(a: TensorLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNonNull")(a.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def assertShapesMatch(shapeA: js.Array[Double], shapeB: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertShapesMatch")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def assertShapesMatch(shapeA: js.Array[Double], shapeB: js.Array[Double], errorMessagePrefix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertShapesMatch")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], errorMessagePrefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def bytesFromStringArray(arr: js.Array[Uint8Array]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesFromStringArray")(arr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def bytesPerElement(dtype: DataType): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesPerElement")(dtype.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def checkConversionForErrors_bool(vals: js.Array[Double], dtype: bool): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkConversionForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def checkConversionForErrors_bool(vals: Uint8Array, dtype: bool): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkConversionForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def checkConversionForErrors_complex64(vals: js.Array[Double], dtype: complex64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkConversionForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def checkConversionForErrors_complex64(vals: Float32Array, dtype: complex64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkConversionForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def checkConversionForErrors_float32(vals: js.Array[Double], dtype: float32): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkConversionForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def checkConversionForErrors_float32(vals: Float32Array, dtype: float32): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkConversionForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def checkConversionForErrors_int32(vals: js.Array[Double], dtype: int32): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkConversionForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def checkConversionForErrors_int32(vals: Int32Array, dtype: int32): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkConversionForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def checkConversionForErrors_string(vals: js.Array[Double | String], dtype: string): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkConversionForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def clamp(min: Double, x: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(min.asInstanceOf[js.Any], x.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def computeStrides(shape: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeStrides")(shape.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def createShuffledIndices(n: Double): Uint32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("createShuffledIndices")(n.asInstanceOf[js.Any]).asInstanceOf[Uint32Array]
  
  @scala.inline
  def distSquared(a: FlatVector, b: FlatVector): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distSquared")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: T, result: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: T, result: js.Array[T], skipTypedArray: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any], result.asInstanceOf[js.Any], skipTypedArray.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: T, result: Unit, skipTypedArray: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any], result.asInstanceOf[js.Any], skipTypedArray.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T], result: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T], result: js.Array[T], skipTypedArray: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any], result.asInstanceOf[js.Any], skipTypedArray.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T], result: Unit, skipTypedArray: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any], result.asInstanceOf[js.Any], skipTypedArray.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def getArrayFromDType_bool(dtype: bool, size: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrayFromDType")(dtype.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  @scala.inline
  def getArrayFromDType_complex64(dtype: complex64, size: Double): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrayFromDType")(dtype.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  
  @scala.inline
  def getArrayFromDType_float32(dtype: float32, size: Double): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrayFromDType")(dtype.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  
  @scala.inline
  def getArrayFromDType_int32(dtype: int32, size: Double): Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrayFromDType")(dtype.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Int32Array]
  
  @scala.inline
  def getArrayFromDType_string(dtype: string, size: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrayFromDType")(dtype.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def getTypedArrayFromDType[D /* <: NumericDataType */](dtype: D, size: Double): /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypedArrayFromDType")(dtype.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any]
  
  @scala.inline
  def hasEncodingLoss(oldType: DataType, newType: DataType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasEncodingLoss")(oldType.asInstanceOf[js.Any], newType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def indexToLoc(index: Double, rank: Double, strides: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToLoc")(index.asInstanceOf[js.Any], rank.asInstanceOf[js.Any], strides.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def inferDtype(values: TensorLike): DataType = ^.asInstanceOf[js.Dynamic].applyDynamic("inferDtype")(values.asInstanceOf[js.Any]).asInstanceOf[DataType]
  
  @scala.inline
  def inferFromImplicitShape(shape: js.Array[Double], size: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("inferFromImplicitShape")(shape.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def isBoolean(value: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isFunction(f: js.Function): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(f.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isInt(a: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInt")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isNumber(value: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isPromise(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isScalarShape(shape: js.Array[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScalarShape")(shape.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isString(value: js.Object): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  @scala.inline
  def isTypedArray(a: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypedArray")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidDtype(dtype: DataType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidDtype")(dtype.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def locToIndex(locs: js.Array[Double], rank: Double, strides: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("locToIndex")(locs.asInstanceOf[js.Any], rank.asInstanceOf[js.Any], strides.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def makeOnesTypedArray_bool(size: Double, dtype: bool): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("makeOnesTypedArray")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  @scala.inline
  def makeOnesTypedArray_complex64(size: Double, dtype: complex64): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("makeOnesTypedArray")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  
  @scala.inline
  def makeOnesTypedArray_float32(size: Double, dtype: float32): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("makeOnesTypedArray")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  
  @scala.inline
  def makeOnesTypedArray_int32(size: Double, dtype: int32): Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("makeOnesTypedArray")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Int32Array]
  
  @scala.inline
  def makeOnesTypedArray_string(size: Double, dtype: string): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeOnesTypedArray")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def makeZerosNestedTypedArray_bool(shape: js.Array[Double], dtype: bool): Double | js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeZerosNestedTypedArray")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[js.Any]]
  
  @scala.inline
  def makeZerosNestedTypedArray_complex64(shape: js.Array[Double], dtype: complex64): Double | js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeZerosNestedTypedArray")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[js.Any]]
  
  @scala.inline
  def makeZerosNestedTypedArray_float32(shape: js.Array[Double], dtype: float32): Double | js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeZerosNestedTypedArray")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[js.Any]]
  
  @scala.inline
  def makeZerosNestedTypedArray_int32(shape: js.Array[Double], dtype: int32): Double | js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeZerosNestedTypedArray")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[js.Any]]
  
  @scala.inline
  def makeZerosNestedTypedArray_string(shape: js.Array[Double], dtype: string): Double | js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeZerosNestedTypedArray")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[js.Any]]
  
  @scala.inline
  def makeZerosTypedArray_bool(size: Double, dtype: bool): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("makeZerosTypedArray")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  @scala.inline
  def makeZerosTypedArray_complex64(size: Double, dtype: complex64): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("makeZerosTypedArray")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  
  @scala.inline
  def makeZerosTypedArray_float32(size: Double, dtype: float32): Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("makeZerosTypedArray")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Float32Array]
  
  @scala.inline
  def makeZerosTypedArray_int32(size: Double, dtype: int32): Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("makeZerosTypedArray")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Int32Array]
  
  @scala.inline
  def makeZerosTypedArray_string(size: Double, dtype: string): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeZerosTypedArray")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def nearestDivisor(size: Double, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestDivisor")(size.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def nearestLargerEven(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nearestLargerEven")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def parseAxisParam(axis: js.Array[Double], shape: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAxisParam")(axis.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def parseAxisParam(axis: Double, shape: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAxisParam")(axis.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def randUniform(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randUniform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def repeatedTry(checkFn: js.Function0[Boolean]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeatedTry")(checkFn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def repeatedTry(checkFn: js.Function0[Boolean], delayFn: js.Function1[/* counter */ Double, Double]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeatedTry")(checkFn.asInstanceOf[js.Any], delayFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def repeatedTry(
    checkFn: js.Function0[Boolean],
    delayFn: js.Function1[/* counter */ Double, Double],
    maxCounter: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeatedTry")(checkFn.asInstanceOf[js.Any], delayFn.asInstanceOf[js.Any], maxCounter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def repeatedTry(checkFn: js.Function0[Boolean], delayFn: Unit, maxCounter: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeatedTry")(checkFn.asInstanceOf[js.Any], delayFn.asInstanceOf[js.Any], maxCounter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def rightPad(a: String, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rightPad")(a.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def shuffle(array: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def shuffle(array: Float32Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def shuffle(array: Int32Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def shuffle(array: Uint32Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def sizeFromShape(shape: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeFromShape")(shape.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def sizeToSquarishShape(size: Double): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeToSquarishShape")(size.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  
  @scala.inline
  def squeezeShape(shape: js.Array[Double]): KeptDims = ^.asInstanceOf[js.Dynamic].applyDynamic("squeezeShape")(shape.asInstanceOf[js.Any]).asInstanceOf[KeptDims]
  @scala.inline
  def squeezeShape(shape: js.Array[Double], axis: js.Array[Double]): KeptDims = (^.asInstanceOf[js.Dynamic].applyDynamic("squeezeShape")(shape.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[KeptDims]
  
  @scala.inline
  def sum(arr: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(arr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def tanh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tanh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def toNestedArray(shape: js.Array[Double], a: TypedArray): Double | js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toNestedArray")(shape.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[js.Any]]
}
