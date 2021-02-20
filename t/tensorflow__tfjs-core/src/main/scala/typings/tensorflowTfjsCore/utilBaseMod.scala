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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilBaseMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "arraysEqual")
  @js.native
  def arraysEqual(n1: FlatVector, n2: FlatVector): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "assert")
  @js.native
  def assert(expr: Boolean, msg: js.Function0[String]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "assertNonNegativeIntegerDimensions")
  @js.native
  def assertNonNegativeIntegerDimensions(shape: js.Array[Double]): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "assertNonNull")
  @js.native
  def assertNonNull(a: TensorLike): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "assertShapesMatch")
  @js.native
  def assertShapesMatch(shapeA: js.Array[Double], shapeB: js.Array[Double]): Unit = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "assertShapesMatch")
  @js.native
  def assertShapesMatch(shapeA: js.Array[Double], shapeB: js.Array[Double], errorMessagePrefix: String): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "bytesFromStringArray")
  @js.native
  def bytesFromStringArray(arr: js.Array[Uint8Array]): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "bytesPerElement")
  @js.native
  def bytesPerElement(dtype: DataType): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "checkConversionForErrors")
  @js.native
  def checkConversionForErrors_bool(vals: js.Array[Double], dtype: bool): Unit = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "checkConversionForErrors")
  @js.native
  def checkConversionForErrors_bool(vals: Uint8Array, dtype: bool): Unit = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "checkConversionForErrors")
  @js.native
  def checkConversionForErrors_complex64(vals: js.Array[Double], dtype: complex64): Unit = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "checkConversionForErrors")
  @js.native
  def checkConversionForErrors_complex64(vals: Float32Array, dtype: complex64): Unit = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "checkConversionForErrors")
  @js.native
  def checkConversionForErrors_float32(vals: js.Array[Double], dtype: float32): Unit = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "checkConversionForErrors")
  @js.native
  def checkConversionForErrors_float32(vals: Float32Array, dtype: float32): Unit = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "checkConversionForErrors")
  @js.native
  def checkConversionForErrors_int32(vals: js.Array[Double], dtype: int32): Unit = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "checkConversionForErrors")
  @js.native
  def checkConversionForErrors_int32(vals: Int32Array, dtype: int32): Unit = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "checkConversionForErrors")
  @js.native
  def checkConversionForErrors_string(vals: js.Array[Double | String], dtype: string): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "clamp")
  @js.native
  def clamp(min: Double, x: Double, max: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "computeStrides")
  @js.native
  def computeStrides(shape: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "createShuffledIndices")
  @js.native
  def createShuffledIndices(n: Double): Uint32Array = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "distSquared")
  @js.native
  def distSquared(a: FlatVector, b: FlatVector): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "flatten")
  @js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: T): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "flatten")
  @js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: T, result: js.UndefOr[scala.Nothing], skipTypedArray: Boolean): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "flatten")
  @js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: T, result: js.Array[T]): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "flatten")
  @js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: T, result: js.Array[T], skipTypedArray: Boolean): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "flatten")
  @js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T]): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "flatten")
  @js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T], result: js.UndefOr[scala.Nothing], skipTypedArray: Boolean): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "flatten")
  @js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T], result: js.Array[T]): js.Array[T] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "flatten")
  @js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T], result: js.Array[T], skipTypedArray: Boolean): js.Array[T] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "getArrayFromDType")
  @js.native
  def getArrayFromDType_bool(dtype: bool, size: Double): Uint8Array = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "getArrayFromDType")
  @js.native
  def getArrayFromDType_complex64(dtype: complex64, size: Double): Float32Array = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "getArrayFromDType")
  @js.native
  def getArrayFromDType_float32(dtype: float32, size: Double): Float32Array = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "getArrayFromDType")
  @js.native
  def getArrayFromDType_int32(dtype: int32, size: Double): Int32Array = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "getArrayFromDType")
  @js.native
  def getArrayFromDType_string(dtype: string, size: Double): js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "getTypedArrayFromDType")
  @js.native
  def getTypedArrayFromDType[D /* <: NumericDataType */](dtype: D, size: Double): /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "hasEncodingLoss")
  @js.native
  def hasEncodingLoss(oldType: DataType, newType: DataType): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "indexToLoc")
  @js.native
  def indexToLoc(index: Double, rank: Double, strides: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "inferDtype")
  @js.native
  def inferDtype(values: TensorLike): DataType = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "inferFromImplicitShape")
  @js.native
  def inferFromImplicitShape(shape: js.Array[Double], size: Double): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "isBoolean")
  @js.native
  def isBoolean(value: js.Object): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "isFunction")
  @js.native
  def isFunction(f: js.Function): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "isInt")
  @js.native
  def isInt(a: Double): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "isNumber")
  @js.native
  def isNumber(value: js.Object): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "isPromise")
  @js.native
  def isPromise(`object`: js.Any): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "isScalarShape")
  @js.native
  def isScalarShape(shape: js.Array[Double]): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "isString")
  @js.native
  def isString(value: js.Object): /* is string */ Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "isTypedArray")
  @js.native
  def isTypedArray(a: js.Object): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "isValidDtype")
  @js.native
  def isValidDtype(dtype: DataType): Boolean = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "locToIndex")
  @js.native
  def locToIndex(locs: js.Array[Double], rank: Double, strides: js.Array[Double]): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "makeOnesTypedArray")
  @js.native
  def makeOnesTypedArray_bool(size: Double, dtype: bool): Uint8Array = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "makeOnesTypedArray")
  @js.native
  def makeOnesTypedArray_complex64(size: Double, dtype: complex64): Float32Array = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "makeOnesTypedArray")
  @js.native
  def makeOnesTypedArray_float32(size: Double, dtype: float32): Float32Array = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "makeOnesTypedArray")
  @js.native
  def makeOnesTypedArray_int32(size: Double, dtype: int32): Int32Array = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "makeOnesTypedArray")
  @js.native
  def makeOnesTypedArray_string(size: Double, dtype: string): js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "makeZerosNestedTypedArray")
  @js.native
  def makeZerosNestedTypedArray_bool(shape: js.Array[Double], dtype: bool): Double | js.Array[_] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "makeZerosNestedTypedArray")
  @js.native
  def makeZerosNestedTypedArray_complex64(shape: js.Array[Double], dtype: complex64): Double | js.Array[_] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "makeZerosNestedTypedArray")
  @js.native
  def makeZerosNestedTypedArray_float32(shape: js.Array[Double], dtype: float32): Double | js.Array[_] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "makeZerosNestedTypedArray")
  @js.native
  def makeZerosNestedTypedArray_int32(shape: js.Array[Double], dtype: int32): Double | js.Array[_] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "makeZerosNestedTypedArray")
  @js.native
  def makeZerosNestedTypedArray_string(shape: js.Array[Double], dtype: string): Double | js.Array[_] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "makeZerosTypedArray")
  @js.native
  def makeZerosTypedArray_bool(size: Double, dtype: bool): Uint8Array = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "makeZerosTypedArray")
  @js.native
  def makeZerosTypedArray_complex64(size: Double, dtype: complex64): Float32Array = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "makeZerosTypedArray")
  @js.native
  def makeZerosTypedArray_float32(size: Double, dtype: float32): Float32Array = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "makeZerosTypedArray")
  @js.native
  def makeZerosTypedArray_int32(size: Double, dtype: int32): Int32Array = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "makeZerosTypedArray")
  @js.native
  def makeZerosTypedArray_string(size: Double, dtype: string): js.Array[String] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "nearestDivisor")
  @js.native
  def nearestDivisor(size: Double, start: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "nearestLargerEven")
  @js.native
  def nearestLargerEven(`val`: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "parseAxisParam")
  @js.native
  def parseAxisParam(axis: js.Array[Double], shape: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "parseAxisParam")
  @js.native
  def parseAxisParam(axis: Double, shape: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "randUniform")
  @js.native
  def randUniform(a: Double, b: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "repeatedTry")
  @js.native
  def repeatedTry(checkFn: js.Function0[Boolean]): js.Promise[Unit] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "repeatedTry")
  @js.native
  def repeatedTry(checkFn: js.Function0[Boolean], delayFn: js.UndefOr[scala.Nothing], maxCounter: Double): js.Promise[Unit] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "repeatedTry")
  @js.native
  def repeatedTry(checkFn: js.Function0[Boolean], delayFn: js.Function1[/* counter */ Double, Double]): js.Promise[Unit] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "repeatedTry")
  @js.native
  def repeatedTry(
    checkFn: js.Function0[Boolean],
    delayFn: js.Function1[/* counter */ Double, Double],
    maxCounter: Double
  ): js.Promise[Unit] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "rightPad")
  @js.native
  def rightPad(a: String, size: Double): String = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "shuffle")
  @js.native
  def shuffle(array: js.Array[_]): Unit = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "shuffle")
  @js.native
  def shuffle(array: Float32Array): Unit = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "shuffle")
  @js.native
  def shuffle(array: Int32Array): Unit = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "shuffle")
  @js.native
  def shuffle(array: Uint32Array): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "sizeFromShape")
  @js.native
  def sizeFromShape(shape: js.Array[Double]): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "sizeToSquarishShape")
  @js.native
  def sizeToSquarishShape(size: Double): js.Tuple2[Double, Double] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "squeezeShape")
  @js.native
  def squeezeShape(shape: js.Array[Double]): KeptDims = js.native
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "squeezeShape")
  @js.native
  def squeezeShape(shape: js.Array[Double], axis: js.Array[Double]): KeptDims = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "sum")
  @js.native
  def sum(arr: js.Array[Double]): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "tanh")
  @js.native
  def tanh(x: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/util_base", "toNestedArray")
  @js.native
  def toNestedArray(shape: js.Array[Double], a: TypedArray): Double | js.Array[_] = js.native
}
