package typings.tensorflowTfjsNode.mod

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.RequestInit
import typings.std.Response
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.anon.KeptDims
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.FlatVector
import typings.tensorflowTfjsCore.distTypesMod.NumericDataType
import typings.tensorflowTfjsCore.distTypesMod.RecursiveArray
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.bool
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.complex64
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.float32
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.int32
import typings.tensorflowTfjsNode.tensorflowTfjsNodeStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "util")
@js.native
object util extends js.Object {
  def arraysEqual(n1: FlatVector, n2: FlatVector): Boolean = js.native
  def assert(expr: Boolean, msg: js.Function0[String]): Unit = js.native
  def assertNonNegativeIntegerDimensions(shape: js.Array[Double]): Unit = js.native
  def assertNonNull(a: TensorLike): Unit = js.native
  def assertShapesMatch(shapeA: js.Array[Double], shapeB: js.Array[Double]): Unit = js.native
  def assertShapesMatch(shapeA: js.Array[Double], shapeB: js.Array[Double], errorMessagePrefix: String): Unit = js.native
  def bytesFromStringArray(arr: js.Array[Uint8Array]): Double = js.native
  def bytesPerElement(dtype: DataType): Double = js.native
  @JSName("checkConversionForErrors")
  def checkConversionForErrors_bool(vals: js.Array[Double], dtype: bool): Unit = js.native
  @JSName("checkConversionForErrors")
  def checkConversionForErrors_bool(vals: Uint8Array, dtype: bool): Unit = js.native
  @JSName("checkConversionForErrors")
  def checkConversionForErrors_complex64(vals: js.Array[Double], dtype: complex64): Unit = js.native
  @JSName("checkConversionForErrors")
  def checkConversionForErrors_complex64(vals: Float32Array, dtype: complex64): Unit = js.native
  @JSName("checkConversionForErrors")
  def checkConversionForErrors_float32(vals: js.Array[Double], dtype: float32): Unit = js.native
  @JSName("checkConversionForErrors")
  def checkConversionForErrors_float32(vals: Float32Array, dtype: float32): Unit = js.native
  @JSName("checkConversionForErrors")
  def checkConversionForErrors_int32(vals: js.Array[Double], dtype: int32): Unit = js.native
  @JSName("checkConversionForErrors")
  def checkConversionForErrors_int32(vals: Int32Array, dtype: int32): Unit = js.native
  @JSName("checkConversionForErrors")
  def checkConversionForErrors_string(vals: js.Array[Double | String], dtype: string): Unit = js.native
  def clamp(min: Double, x: Double, max: Double): Double = js.native
  def computeStrides(shape: js.Array[Double]): js.Array[Double] = js.native
  def createShuffledIndices(n: Double): Uint32Array = js.native
  def decodeString(bytes: Uint8Array): String = js.native
  def decodeString(bytes: Uint8Array, encoding: String): String = js.native
  def distSquared(a: FlatVector, b: FlatVector): Double = js.native
  def encodeString(s: String): Uint8Array = js.native
  def encodeString(s: String, encoding: String): Uint8Array = js.native
  def fetch(path: String): js.Promise[Response] = js.native
  def fetch(path: String, requestInits: RequestInit): js.Promise[Response] = js.native
  def flatten(arr: String): js.Array[String] = js.native
  def flatten(arr: String, result: js.UndefOr[scala.Nothing], skipTypedArray: Boolean): js.Array[String] = js.native
  def flatten(arr: String, result: js.Array[String]): js.Array[String] = js.native
  def flatten(arr: String, result: js.Array[String], skipTypedArray: Boolean): js.Array[String] = js.native
  def flatten(arr: js.Promise[Double]): js.Array[js.Promise[Double]] = js.native
  def flatten(arr: js.Promise[Double], result: js.UndefOr[scala.Nothing], skipTypedArray: Boolean): js.Array[js.Promise[Double]] = js.native
  def flatten(arr: js.Promise[Double], result: js.Array[js.Promise[Double]]): js.Array[js.Promise[Double]] = js.native
  def flatten(arr: js.Promise[Double], result: js.Array[js.Promise[Double]], skipTypedArray: Boolean): js.Array[js.Promise[Double]] = js.native
  def flatten(arr: Boolean): js.Array[Boolean] = js.native
  def flatten(arr: Boolean, result: js.UndefOr[scala.Nothing], skipTypedArray: Boolean): js.Array[Boolean] = js.native
  def flatten(arr: Boolean, result: js.Array[Boolean]): js.Array[Boolean] = js.native
  def flatten(arr: Boolean, result: js.Array[Boolean], skipTypedArray: Boolean): js.Array[Boolean] = js.native
  def flatten(arr: Double): js.Array[Double] = js.native
  def flatten(arr: Double, result: js.UndefOr[scala.Nothing], skipTypedArray: Boolean): js.Array[Double] = js.native
  def flatten(arr: Double, result: js.Array[Double]): js.Array[Double] = js.native
  def flatten(arr: Double, result: js.Array[Double], skipTypedArray: Boolean): js.Array[Double] = js.native
  def flatten(arr: Float32Array): js.Array[Float32Array] = js.native
  def flatten(arr: Float32Array, result: js.UndefOr[scala.Nothing], skipTypedArray: Boolean): js.Array[Float32Array] = js.native
  def flatten(arr: Float32Array, result: js.Array[Float32Array]): js.Array[Float32Array] = js.native
  def flatten(arr: Float32Array, result: js.Array[Float32Array], skipTypedArray: Boolean): js.Array[Float32Array] = js.native
  def flatten(arr: Int32Array): js.Array[Int32Array] = js.native
  def flatten(arr: Int32Array, result: js.UndefOr[scala.Nothing], skipTypedArray: Boolean): js.Array[Int32Array] = js.native
  def flatten(arr: Int32Array, result: js.Array[Int32Array]): js.Array[Int32Array] = js.native
  def flatten(arr: Int32Array, result: js.Array[Int32Array], skipTypedArray: Boolean): js.Array[Int32Array] = js.native
  def flatten(arr: Uint8Array): js.Array[Uint8Array] = js.native
  def flatten(arr: Uint8Array, result: js.UndefOr[scala.Nothing], skipTypedArray: Boolean): js.Array[Uint8Array] = js.native
  def flatten(arr: Uint8Array, result: js.Array[Uint8Array]): js.Array[Uint8Array] = js.native
  def flatten(arr: Uint8Array, result: js.Array[Uint8Array], skipTypedArray: Boolean): js.Array[Uint8Array] = js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T]): js.Array[T] = js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T], result: js.UndefOr[scala.Nothing], skipTypedArray: Boolean): js.Array[T] = js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T], result: js.Array[T]): js.Array[T] = js.native
  def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T], result: js.Array[T], skipTypedArray: Boolean): js.Array[T] = js.native
  @JSName("getArrayFromDType")
  def getArrayFromDType_bool(dtype: bool, size: Double): Uint8Array = js.native
  @JSName("getArrayFromDType")
  def getArrayFromDType_complex64(dtype: complex64, size: Double): Float32Array = js.native
  @JSName("getArrayFromDType")
  def getArrayFromDType_float32(dtype: float32, size: Double): Float32Array = js.native
  @JSName("getArrayFromDType")
  def getArrayFromDType_int32(dtype: int32, size: Double): Int32Array = js.native
  @JSName("getArrayFromDType")
  def getArrayFromDType_string(dtype: string, size: Double): js.Array[String] = js.native
  def getTypedArrayFromDType[D /* <: NumericDataType */](dtype: D, size: Double): /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any = js.native
  def hasEncodingLoss(oldType: DataType, newType: DataType): Boolean = js.native
  def indexToLoc(index: Double, rank: Double, strides: js.Array[Double]): js.Array[Double] = js.native
  def inferDtype(values: TensorLike): DataType = js.native
  def inferFromImplicitShape(shape: js.Array[Double], size: Double): js.Array[Double] = js.native
  def isBoolean(value: js.Object): Boolean = js.native
  def isFunction(f: js.Function): Boolean = js.native
  def isInt(a: Double): Boolean = js.native
  def isNumber(value: js.Object): Boolean = js.native
  def isScalarShape(shape: js.Array[Double]): Boolean = js.native
  def isString(value: js.Object): /* is string */ Boolean = js.native
  def isTypedArray(a: js.Object): Boolean = js.native
  def isValidDtype(dtype: DataType): Boolean = js.native
  def locToIndex(locs: js.Array[Double], rank: Double, strides: js.Array[Double]): Double = js.native
  @JSName("makeOnesTypedArray")
  def makeOnesTypedArray_bool(size: Double, dtype: bool): Uint8Array = js.native
  @JSName("makeOnesTypedArray")
  def makeOnesTypedArray_complex64(size: Double, dtype: complex64): Float32Array = js.native
  @JSName("makeOnesTypedArray")
  def makeOnesTypedArray_float32(size: Double, dtype: float32): Float32Array = js.native
  @JSName("makeOnesTypedArray")
  def makeOnesTypedArray_int32(size: Double, dtype: int32): Int32Array = js.native
  @JSName("makeOnesTypedArray")
  def makeOnesTypedArray_string(size: Double, dtype: string): js.Array[String] = js.native
  @JSName("makeZerosTypedArray")
  def makeZerosTypedArray_bool(size: Double, dtype: bool): Uint8Array = js.native
  @JSName("makeZerosTypedArray")
  def makeZerosTypedArray_complex64(size: Double, dtype: complex64): Float32Array = js.native
  @JSName("makeZerosTypedArray")
  def makeZerosTypedArray_float32(size: Double, dtype: float32): Float32Array = js.native
  @JSName("makeZerosTypedArray")
  def makeZerosTypedArray_int32(size: Double, dtype: int32): Int32Array = js.native
  @JSName("makeZerosTypedArray")
  def makeZerosTypedArray_string(size: Double, dtype: string): js.Array[String] = js.native
  def nearestDivisor(size: Double, start: Double): Double = js.native
  def nearestLargerEven(`val`: Double): Double = js.native
  def now(): Double = js.native
  def parseAxisParam(axis: js.Array[Double], shape: js.Array[Double]): js.Array[Double] = js.native
  def parseAxisParam(axis: Double, shape: js.Array[Double]): js.Array[Double] = js.native
  def randUniform(a: Double, b: Double): Double = js.native
  def repeatedTry(checkFn: js.Function0[Boolean]): js.Promise[Unit] = js.native
  def repeatedTry(checkFn: js.Function0[Boolean], delayFn: js.UndefOr[scala.Nothing], maxCounter: Double): js.Promise[Unit] = js.native
  def repeatedTry(checkFn: js.Function0[Boolean], delayFn: js.Function1[/* counter */ Double, Double]): js.Promise[Unit] = js.native
  def repeatedTry(
    checkFn: js.Function0[Boolean],
    delayFn: js.Function1[/* counter */ Double, Double],
    maxCounter: Double
  ): js.Promise[Unit] = js.native
  def rightPad(a: String, size: Double): String = js.native
  def shuffle(array: js.Array[_]): Unit = js.native
  def shuffle(array: Float32Array): Unit = js.native
  def shuffle(array: Int32Array): Unit = js.native
  def shuffle(array: Uint32Array): Unit = js.native
  def sizeFromShape(shape: js.Array[Double]): Double = js.native
  def sizeToSquarishShape(size: Double): js.Tuple2[Double, Double] = js.native
  def squeezeShape(shape: js.Array[Double]): KeptDims = js.native
  def squeezeShape(shape: js.Array[Double], axis: js.Array[Double]): KeptDims = js.native
  def sum(arr: js.Array[Double]): Double = js.native
  def tanh(x: Double): Double = js.native
  def toNestedArray(shape: js.Array[Double], a: TypedArray): Double | js.Array[_] = js.native
  def toTypedArray(a: TensorLike, dtype: DataType, debugMode: Boolean): TypedArray = js.native
}

