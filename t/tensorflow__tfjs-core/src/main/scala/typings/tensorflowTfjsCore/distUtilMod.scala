package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.NumberDictionary
import typings.std.RequestInit
import typings.std.Response
import typings.tensorflowTfjsCore.anon.KeptDims
import typings.tensorflowTfjsCore.distTypesMod.BackendValues
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

object distUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arraysEqual(n1: FlatVector, n2: FlatVector): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysEqual")(n1.asInstanceOf[js.Any], n2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def assert(expr: Boolean, msg: js.Function0[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(expr.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def assertNonNegativeIntegerDimensions(shape: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNonNegativeIntegerDimensions")(shape.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def assertNonNull(a: TensorLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNonNull")(a.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def assertShapesMatch(shapeA: js.Array[Double], shapeB: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertShapesMatch")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def assertShapesMatch(shapeA: js.Array[Double], shapeB: js.Array[Double], errorMessagePrefix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertShapesMatch")(shapeA.asInstanceOf[js.Any], shapeB.asInstanceOf[js.Any], errorMessagePrefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def bytesFromStringArray(arr: js.Array[js.typedarray.Uint8Array]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesFromStringArray")(arr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def bytesPerElement(dtype: DataType): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesPerElement")(dtype.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def checkConversionForErrors_bool(vals: js.Array[Double], dtype: bool): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkConversionForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkConversionForErrors_bool(vals: js.typedarray.Uint8Array, dtype: bool): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkConversionForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkConversionForErrors_complex64(vals: js.Array[Double], dtype: complex64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkConversionForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkConversionForErrors_complex64(vals: js.typedarray.Float32Array, dtype: complex64): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkConversionForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkConversionForErrors_float32(vals: js.Array[Double], dtype: float32): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkConversionForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkConversionForErrors_float32(vals: js.typedarray.Float32Array, dtype: float32): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkConversionForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkConversionForErrors_int32(vals: js.Array[Double], dtype: int32): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkConversionForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkConversionForErrors_int32(vals: js.typedarray.Int32Array, dtype: int32): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkConversionForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkConversionForErrors_string(vals: js.Array[Double | String], dtype: string): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkConversionForErrors")(vals.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clamp(min: Double, x: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(min.asInstanceOf[js.Any], x.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def computeStrides(shape: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeStrides")(shape.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def createScalarValue(value: DataType, dtype: DataType): BackendValues = (^.asInstanceOf[js.Dynamic].applyDynamic("createScalarValue")(value.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[BackendValues]
  
  inline def createShuffledIndices(n: Double): js.typedarray.Uint32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("createShuffledIndices")(n.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint32Array]
  
  inline def decodeString(bytes: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeString")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decodeString(bytes: js.typedarray.Uint8Array, encoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeString")(bytes.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def distSquared(a: FlatVector, b: FlatVector): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distSquared")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def encodeString(s: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeString")(s.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def encodeString(s: String, encoding: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeString")(s.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def fetch(path: String): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  inline def fetch(path: String, requestInits: RequestInit): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(path.asInstanceOf[js.Any], requestInits.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  
  inline def fingerPrint64(s: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fingerPrint64")(s.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def fingerPrint64(s: js.typedarray.Uint8Array, len: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fingerPrint64")(s.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: T, result: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: T, result: js.Array[T], skipTypedArray: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any], result.asInstanceOf[js.Any], skipTypedArray.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: T, result: Unit, skipTypedArray: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any], result.asInstanceOf[js.Any], skipTypedArray.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T], result: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T], result: js.Array[T], skipTypedArray: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any], result.asInstanceOf[js.Any], skipTypedArray.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def flatten[T /* <: Double | Boolean | String | js.Promise[Double] | TypedArray */](arr: RecursiveArray[T], result: Unit, skipTypedArray: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any], result.asInstanceOf[js.Any], skipTypedArray.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def getArrayFromDType_bool(dtype: bool, size: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrayFromDType")(dtype.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def getArrayFromDType_complex64(dtype: complex64, size: Double): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrayFromDType")(dtype.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  
  inline def getArrayFromDType_float32(dtype: float32, size: Double): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrayFromDType")(dtype.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  
  inline def getArrayFromDType_int32(dtype: int32, size: Double): js.typedarray.Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrayFromDType")(dtype.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int32Array]
  
  inline def getArrayFromDType_string(dtype: string, size: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrayFromDType")(dtype.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getTypedArrayFromDType[D /* <: NumericDataType */](dtype: D, size: Double): /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypedArrayFromDType")(dtype.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any]
  
  inline def hasEncodingLoss(oldType: DataType, newType: DataType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasEncodingLoss")(oldType.asInstanceOf[js.Any], newType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hexToLong(hex: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToLong")(hex.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def indexToLoc(index: Double, rank: Double, strides: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("indexToLoc")(index.asInstanceOf[js.Any], rank.asInstanceOf[js.Any], strides.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def inferDtype(values: TensorLike): DataType = ^.asInstanceOf[js.Dynamic].applyDynamic("inferDtype")(values.asInstanceOf[js.Any]).asInstanceOf[DataType]
  
  inline def inferFromImplicitShape(shape: js.Array[Double], size: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("inferFromImplicitShape")(shape.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def isBoolean(value: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunction(f: js.Function): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(f.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInt(a: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInt")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumber(value: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPromise(`object`: Any): /* is std.Promise<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<unknown> */ Boolean]
  
  inline def isScalarShape(shape: js.Array[Double]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScalarShape")(shape.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(value: js.Object): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isTypedArray(a: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypedArray")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidDtype(dtype: DataType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidDtype")(dtype.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def locToIndex(locs: js.Array[Double], rank: Double, strides: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("locToIndex")(locs.asInstanceOf[js.Any], rank.asInstanceOf[js.Any], strides.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def makeOnesTypedArray_bool(size: Double, dtype: bool): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("makeOnesTypedArray")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def makeOnesTypedArray_complex64(size: Double, dtype: complex64): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("makeOnesTypedArray")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  
  inline def makeOnesTypedArray_float32(size: Double, dtype: float32): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("makeOnesTypedArray")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  
  inline def makeOnesTypedArray_int32(size: Double, dtype: int32): js.typedarray.Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("makeOnesTypedArray")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int32Array]
  
  inline def makeOnesTypedArray_string(size: Double, dtype: string): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeOnesTypedArray")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def makeZerosNestedTypedArray_bool(shape: js.Array[Double], dtype: bool): Double | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeZerosNestedTypedArray")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[Any]]
  
  inline def makeZerosNestedTypedArray_complex64(shape: js.Array[Double], dtype: complex64): Double | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeZerosNestedTypedArray")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[Any]]
  
  inline def makeZerosNestedTypedArray_float32(shape: js.Array[Double], dtype: float32): Double | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeZerosNestedTypedArray")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[Any]]
  
  inline def makeZerosNestedTypedArray_int32(shape: js.Array[Double], dtype: int32): Double | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeZerosNestedTypedArray")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[Any]]
  
  inline def makeZerosNestedTypedArray_string(shape: js.Array[Double], dtype: string): Double | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeZerosNestedTypedArray")(shape.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[Any]]
  
  inline def makeZerosTypedArray_bool(size: Double, dtype: bool): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("makeZerosTypedArray")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def makeZerosTypedArray_complex64(size: Double, dtype: complex64): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("makeZerosTypedArray")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  
  inline def makeZerosTypedArray_float32(size: Double, dtype: float32): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("makeZerosTypedArray")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  
  inline def makeZerosTypedArray_int32(size: Double, dtype: int32): js.typedarray.Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("makeZerosTypedArray")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int32Array]
  
  inline def makeZerosTypedArray_string(size: Double, dtype: string): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeZerosTypedArray")(size.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def nearestDivisor(size: Double, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestDivisor")(size.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def nearestLargerEven(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nearestLargerEven")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  inline def parseAxisParam(axis: js.Array[Double], shape: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAxisParam")(axis.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def parseAxisParam(axis: Double, shape: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAxisParam")(axis.asInstanceOf[js.Any], shape.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def randUniform(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randUniform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def repeatedTry(checkFn: js.Function0[Boolean]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeatedTry")(checkFn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def repeatedTry(checkFn: js.Function0[Boolean], delayFn: js.Function1[/* counter */ Double, Double]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeatedTry")(checkFn.asInstanceOf[js.Any], delayFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def repeatedTry(
    checkFn: js.Function0[Boolean],
    delayFn: js.Function1[/* counter */ Double, Double],
    maxCounter: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeatedTry")(checkFn.asInstanceOf[js.Any], delayFn.asInstanceOf[js.Any], maxCounter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def repeatedTry(checkFn: js.Function0[Boolean], delayFn: Unit, maxCounter: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeatedTry")(checkFn.asInstanceOf[js.Any], delayFn.asInstanceOf[js.Any], maxCounter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def rightPad(a: String, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rightPad")(a.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def shuffle(array: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def shuffle(array: js.typedarray.Float32Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def shuffle(array: js.typedarray.Int32Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def shuffle(array: js.typedarray.Uint32Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def shuffleCombo(array: js.Array[Any], array2: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffleCombo")(array.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def shuffleCombo(array: js.Array[Any], array2: js.typedarray.Float32Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffleCombo")(array.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def shuffleCombo(array: js.Array[Any], array2: js.typedarray.Int32Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffleCombo")(array.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def shuffleCombo(array: js.Array[Any], array2: js.typedarray.Uint32Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffleCombo")(array.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def shuffleCombo(array: js.typedarray.Float32Array, array2: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffleCombo")(array.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def shuffleCombo(array: js.typedarray.Float32Array, array2: js.typedarray.Float32Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffleCombo")(array.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def shuffleCombo(array: js.typedarray.Float32Array, array2: js.typedarray.Int32Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffleCombo")(array.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def shuffleCombo(array: js.typedarray.Float32Array, array2: js.typedarray.Uint32Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffleCombo")(array.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def shuffleCombo(array: js.typedarray.Int32Array, array2: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffleCombo")(array.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def shuffleCombo(array: js.typedarray.Int32Array, array2: js.typedarray.Float32Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffleCombo")(array.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def shuffleCombo(array: js.typedarray.Int32Array, array2: js.typedarray.Int32Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffleCombo")(array.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def shuffleCombo(array: js.typedarray.Int32Array, array2: js.typedarray.Uint32Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffleCombo")(array.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def shuffleCombo(array: js.typedarray.Uint32Array, array2: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffleCombo")(array.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def shuffleCombo(array: js.typedarray.Uint32Array, array2: js.typedarray.Float32Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffleCombo")(array.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def shuffleCombo(array: js.typedarray.Uint32Array, array2: js.typedarray.Int32Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffleCombo")(array.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def shuffleCombo(array: js.typedarray.Uint32Array, array2: js.typedarray.Uint32Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffleCombo")(array.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sizeFromShape(shape: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeFromShape")(shape.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sizeToSquarishShape(size: Double): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeToSquarishShape")(size.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def squeezeShape(shape: js.Array[Double]): KeptDims = ^.asInstanceOf[js.Dynamic].applyDynamic("squeezeShape")(shape.asInstanceOf[js.Any]).asInstanceOf[KeptDims]
  inline def squeezeShape(shape: js.Array[Double], axis: js.Array[Double]): KeptDims = (^.asInstanceOf[js.Dynamic].applyDynamic("squeezeShape")(shape.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[KeptDims]
  
  inline def sum(arr: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(arr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def swap[T](`object`: NumberDictionary[T], left: Double, right: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("swap")(`object`.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def tanh(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tanh")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toNestedArray(shape: js.Array[Double], a: TypedArray): Double | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toNestedArray")(shape.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[Any]]
  inline def toNestedArray(shape: js.Array[Double], a: TypedArray, isComplex: Boolean): Double | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toNestedArray")(shape.asInstanceOf[js.Any], a.asInstanceOf[js.Any], isComplex.asInstanceOf[js.Any])).asInstanceOf[Double | js.Array[Any]]
  
  inline def toTypedArray(a: TensorLike, dtype: DataType): TypedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("toTypedArray")(a.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[TypedArray]
}
