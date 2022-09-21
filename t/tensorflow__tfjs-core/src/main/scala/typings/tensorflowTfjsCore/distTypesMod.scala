package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Rank extends StObject
  @JSImport("@tensorflow/tfjs-core/dist/types", "Rank")
  @js.native
  object Rank extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Rank & String] = js.native
    
    @js.native
    sealed trait R0
      extends StObject
         with Rank
    /* "R0" */ val R0: typings.tensorflowTfjsCore.distTypesMod.Rank.R0 & String = js.native
    
    @js.native
    sealed trait R1
      extends StObject
         with Rank
    /* "R1" */ val R1: typings.tensorflowTfjsCore.distTypesMod.Rank.R1 & String = js.native
    
    @js.native
    sealed trait R2
      extends StObject
         with Rank
    /* "R2" */ val R2: typings.tensorflowTfjsCore.distTypesMod.Rank.R2 & String = js.native
    
    @js.native
    sealed trait R3
      extends StObject
         with Rank
    /* "R3" */ val R3: typings.tensorflowTfjsCore.distTypesMod.Rank.R3 & String = js.native
    
    @js.native
    sealed trait R4
      extends StObject
         with Rank
    /* "R4" */ val R4: typings.tensorflowTfjsCore.distTypesMod.Rank.R4 & String = js.native
    
    @js.native
    sealed trait R5
      extends StObject
         with Rank
    /* "R5" */ val R5: typings.tensorflowTfjsCore.distTypesMod.Rank.R5 & String = js.native
    
    @js.native
    sealed trait R6
      extends StObject
         with Rank
    /* "R6" */ val R6: typings.tensorflowTfjsCore.distTypesMod.Rank.R6 & String = js.native
  }
  
  inline def sumOutType(`type`: DataType): DataType = ^.asInstanceOf[js.Dynamic].applyDynamic("sumOutType")(`type`.asInstanceOf[js.Any]).asInstanceOf[DataType]
  
  inline def upcastType(typeA: DataType, typeB: DataType): DataType = (^.asInstanceOf[js.Dynamic].applyDynamic("upcastType")(typeA.asInstanceOf[js.Any], typeB.asInstanceOf[js.Any])).asInstanceOf[DataType]
  
  trait ArrayMap extends StObject {
    
    var R0: Double
    
    var R1: js.Array[Double]
    
    var R2: js.Array[js.Array[Double]]
    
    var R3: js.Array[js.Array[js.Array[Double]]]
    
    var R4: js.Array[js.Array[js.Array[js.Array[Double]]]]
    
    var R5: js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]
    
    var R6: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]]
  }
  object ArrayMap {
    
    inline def apply(
      R0: Double,
      R1: js.Array[Double],
      R2: js.Array[js.Array[Double]],
      R3: js.Array[js.Array[js.Array[Double]]],
      R4: js.Array[js.Array[js.Array[js.Array[Double]]]],
      R5: js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]],
      R6: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]]
    ): ArrayMap = {
      val __obj = js.Dynamic.literal(R0 = R0.asInstanceOf[js.Any], R1 = R1.asInstanceOf[js.Any], R2 = R2.asInstanceOf[js.Any], R3 = R3.asInstanceOf[js.Any], R4 = R4.asInstanceOf[js.Any], R5 = R5.asInstanceOf[js.Any], R6 = R6.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayMap]
    }
    
    extension [Self <: ArrayMap](x: Self) {
      
      inline def setR0(value: Double): Self = StObject.set(x, "R0", value.asInstanceOf[js.Any])
      
      inline def setR1(value: js.Array[Double]): Self = StObject.set(x, "R1", value.asInstanceOf[js.Any])
      
      inline def setR1Varargs(value: Double*): Self = StObject.set(x, "R1", js.Array(value*))
      
      inline def setR2(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "R2", value.asInstanceOf[js.Any])
      
      inline def setR2Varargs(value: js.Array[Double]*): Self = StObject.set(x, "R2", js.Array(value*))
      
      inline def setR3(value: js.Array[js.Array[js.Array[Double]]]): Self = StObject.set(x, "R3", value.asInstanceOf[js.Any])
      
      inline def setR3Varargs(value: js.Array[js.Array[Double]]*): Self = StObject.set(x, "R3", js.Array(value*))
      
      inline def setR4(value: js.Array[js.Array[js.Array[js.Array[Double]]]]): Self = StObject.set(x, "R4", value.asInstanceOf[js.Any])
      
      inline def setR4Varargs(value: js.Array[js.Array[js.Array[Double]]]*): Self = StObject.set(x, "R4", js.Array(value*))
      
      inline def setR5(value: js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]): Self = StObject.set(x, "R5", value.asInstanceOf[js.Any])
      
      inline def setR5Varargs(value: js.Array[js.Array[js.Array[js.Array[Double]]]]*): Self = StObject.set(x, "R5", js.Array(value*))
      
      inline def setR6(value: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]]): Self = StObject.set(x, "R6", value.asInstanceOf[js.Any])
      
      inline def setR6Varargs(value: js.Array[js.Array[js.Array[js.Array[js.Array[Double]]]]]*): Self = StObject.set(x, "R6", js.Array(value*))
    }
  }
  
  type BackendValues = js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.Array[js.typedarray.Uint8Array]
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
  */
  trait DataType extends StObject
  
  trait DataTypeMap extends StObject {
    
    var bool: js.typedarray.Uint8Array
    
    var complex64: js.typedarray.Float32Array
    
    var float32: js.typedarray.Float32Array
    
    var int32: js.typedarray.Int32Array
    
    var string: js.Array[String]
  }
  object DataTypeMap {
    
    inline def apply(
      bool: js.typedarray.Uint8Array,
      complex64: js.typedarray.Float32Array,
      float32: js.typedarray.Float32Array,
      int32: js.typedarray.Int32Array,
      string: js.Array[String]
    ): DataTypeMap = {
      val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], complex64 = complex64.asInstanceOf[js.Any], float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataTypeMap]
    }
    
    extension [Self <: DataTypeMap](x: Self) {
      
      inline def setBool(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      inline def setComplex64(value: js.typedarray.Float32Array): Self = StObject.set(x, "complex64", value.asInstanceOf[js.Any])
      
      inline def setFloat32(value: js.typedarray.Float32Array): Self = StObject.set(x, "float32", value.asInstanceOf[js.Any])
      
      inline def setInt32(value: js.typedarray.Int32Array): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
      
      inline def setString(value: js.Array[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringVarargs(value: String*): Self = StObject.set(x, "string", js.Array(value*))
    }
  }
  
  /* Inlined @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataType] */
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.map
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.length
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.entries
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.pop
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.set
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.fill
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.join
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.copyWithin
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BYTES_PER_ELEMENT
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.buffer
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.keys
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.sort
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.forEach
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.concat
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.includes
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.slice
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valueOf
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.shift
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.push
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reverse
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.flat
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.splice
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.some
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.at
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.unshift
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.filter
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.subarray
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.toString
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.indexOf
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reduceRight
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.findIndex
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reduce
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.byteLength
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.values
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.flatMap
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.toLocaleString
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.every
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.lastIndexOf
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.byteOffset
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.find
  */
  trait DataValues extends StObject
  object DataValues {
    
    inline def BYTES_PER_ELEMENT: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BYTES_PER_ELEMENT = "BYTES_PER_ELEMENT".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.BYTES_PER_ELEMENT]
    
    inline def at: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.at = "at".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.at]
    
    inline def buffer: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.buffer = "buffer".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.buffer]
    
    inline def byteLength: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.byteLength = "byteLength".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.byteLength]
    
    inline def byteOffset: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.byteOffset = "byteOffset".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.byteOffset]
    
    inline def concat: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.concat = "concat".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.concat]
    
    inline def copyWithin: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.copyWithin = "copyWithin".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.copyWithin]
    
    inline def entries: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.entries = "entries".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.entries]
    
    inline def every: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.every = "every".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.every]
    
    inline def fill: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.fill = "fill".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.fill]
    
    inline def filter: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.filter = "filter".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.filter]
    
    inline def find: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.find = "find".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.find]
    
    inline def findIndex: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.findIndex = "findIndex".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.findIndex]
    
    inline def flat: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.flat = "flat".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.flat]
    
    inline def flatMap: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.flatMap = "flatMap".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.flatMap]
    
    inline def forEach: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.forEach = "forEach".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.forEach]
    
    inline def includes: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.includes = "includes".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.includes]
    
    inline def indexOf: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.indexOf = "indexOf".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.indexOf]
    
    inline def join: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.join = "join".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.join]
    
    inline def keys: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.keys = "keys".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.keys]
    
    inline def lastIndexOf: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.lastIndexOf = "lastIndexOf".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.lastIndexOf]
    
    inline def length: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.length = "length".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.length]
    
    inline def map: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.map = "map".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.map]
    
    inline def pop: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.pop = "pop".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.pop]
    
    inline def push: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.push = "push".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.push]
    
    inline def reduce: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reduce = "reduce".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reduce]
    
    inline def reduceRight: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reduceRight = "reduceRight".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reduceRight]
    
    inline def reverse: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reverse = "reverse".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reverse]
    
    inline def set: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.set = "set".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.set]
    
    inline def shift: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.shift = "shift".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.shift]
    
    inline def slice: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.slice = "slice".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.slice]
    
    inline def some: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.some = "some".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.some]
    
    inline def sort: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.sort = "sort".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.sort]
    
    inline def splice: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.splice = "splice".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.splice]
    
    inline def subarray: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.subarray = "subarray".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.subarray]
    
    inline def unshift: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.unshift = "unshift".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.unshift]
    
    inline def values: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.values = "values".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.values]
  }
  
  type FlatVector = (js.Array[Boolean | Double]) | TypedArray
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
    - typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
  */
  trait NumericDataType extends StObject
  object NumericDataType {
    
    inline def bool: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool = "bool".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool]
    
    inline def complex64: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64 = "complex64".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64]
    
    inline def float32: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32 = "float32".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32]
    
    inline def int32: typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32 = "int32".asInstanceOf[typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32]
  }
  
  trait PixelData extends StObject {
    
    var data: js.typedarray.Uint8Array
    
    var height: Double
    
    var width: Double
  }
  object PixelData {
    
    inline def apply(data: js.typedarray.Uint8Array, height: Double, width: Double): PixelData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PixelData]
    }
    
    extension [Self <: PixelData](x: Self) {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecursiveArray[T /* <: Any */]
    extends StObject
       with /* index */ NumberDictionary[T | RecursiveArray[T]]
  object RecursiveArray {
    
    inline def apply[T /* <: Any */](): RecursiveArray[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecursiveArray[T]]
    }
  }
  
  type RegularArray[T] = js.Array[(js.Array[(js.Array[(js.Array[(js.Array[js.Array[T] | T]) | T]) | T]) | T]) | T]
  
  type ScalarLike = Double | Boolean | String | js.typedarray.Uint8Array
  
  trait ShapeMap extends StObject {
    
    var R0: js.Array[Double]
    
    var R1: js.Array[Double]
    
    var R2: js.Tuple2[Double, Double]
    
    var R3: js.Tuple3[Double, Double, Double]
    
    var R4: js.Tuple4[Double, Double, Double, Double]
    
    var R5: js.Tuple5[Double, Double, Double, Double, Double]
    
    var R6: js.Tuple6[Double, Double, Double, Double, Double, Double]
  }
  object ShapeMap {
    
    inline def apply(
      R0: js.Array[Double],
      R1: js.Array[Double],
      R2: js.Tuple2[Double, Double],
      R3: js.Tuple3[Double, Double, Double],
      R4: js.Tuple4[Double, Double, Double, Double],
      R5: js.Tuple5[Double, Double, Double, Double, Double],
      R6: js.Tuple6[Double, Double, Double, Double, Double, Double]
    ): ShapeMap = {
      val __obj = js.Dynamic.literal(R0 = R0.asInstanceOf[js.Any], R1 = R1.asInstanceOf[js.Any], R2 = R2.asInstanceOf[js.Any], R3 = R3.asInstanceOf[js.Any], R4 = R4.asInstanceOf[js.Any], R5 = R5.asInstanceOf[js.Any], R6 = R6.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShapeMap]
    }
    
    extension [Self <: ShapeMap](x: Self) {
      
      inline def setR0(value: js.Array[Double]): Self = StObject.set(x, "R0", value.asInstanceOf[js.Any])
      
      inline def setR0Varargs(value: Double*): Self = StObject.set(x, "R0", js.Array(value*))
      
      inline def setR1(value: js.Array[Double]): Self = StObject.set(x, "R1", value.asInstanceOf[js.Any])
      
      inline def setR1Varargs(value: Double*): Self = StObject.set(x, "R1", js.Array(value*))
      
      inline def setR2(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "R2", value.asInstanceOf[js.Any])
      
      inline def setR3(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "R3", value.asInstanceOf[js.Any])
      
      inline def setR4(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "R4", value.asInstanceOf[js.Any])
      
      inline def setR5(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = StObject.set(x, "R5", value.asInstanceOf[js.Any])
      
      inline def setR6(value: js.Tuple6[Double, Double, Double, Double, Double, Double]): Self = StObject.set(x, "R6", value.asInstanceOf[js.Any])
    }
  }
  
  trait SingleValueMap extends StObject {
    
    var bool: Boolean
    
    var complex64: Double
    
    var float32: Double
    
    var int32: Double
    
    var string: String
  }
  object SingleValueMap {
    
    inline def apply(bool: Boolean, complex64: Double, float32: Double, int32: Double, string: String): SingleValueMap = {
      val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], complex64 = complex64.asInstanceOf[js.Any], float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleValueMap]
    }
    
    extension [Self <: SingleValueMap](x: Self) {
      
      inline def setBool(value: Boolean): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      inline def setComplex64(value: Double): Self = StObject.set(x, "complex64", value.asInstanceOf[js.Any])
      
      inline def setFloat32(value: Double): Self = StObject.set(x, "float32", value.asInstanceOf[js.Any])
      
      inline def setInt32(value: Double): Self = StObject.set(x, "int32", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
  
  type TensorLike = TypedArray | Double | Boolean | String | (RecursiveArray[js.Array[Double] | Boolean | Double | String | TypedArray]) | js.Array[js.typedarray.Uint8Array]
  
  type TensorLike1D = TypedArray | (js.Array[Boolean | Double | String | js.typedarray.Uint8Array])
  
  type TensorLike2D = TypedArray | (js.Array[
    (js.Array[Boolean | Double | String | js.typedarray.Uint8Array]) | Boolean | Double | String | js.typedarray.Uint8Array
  ])
  
  type TensorLike3D = TypedArray | (js.Array[
    (js.Array[js.Array[Boolean | Double | String | js.typedarray.Uint8Array]]) | Boolean | Double | String | js.typedarray.Uint8Array
  ])
  
  type TensorLike4D = TypedArray | (js.Array[
    (js.Array[js.Array[js.Array[Boolean | Double | String | js.typedarray.Uint8Array]]]) | Boolean | Double | String | js.typedarray.Uint8Array
  ])
  
  type TensorLike5D = TypedArray | (js.Array[
    (js.Array[
      js.Array[js.Array[js.Array[Boolean | Double | String | js.typedarray.Uint8Array]]]
    ]) | Boolean | Double | String | js.typedarray.Uint8Array
  ])
  
  type TensorLike6D = TypedArray | (js.Array[
    (js.Array[
      js.Array[
        js.Array[js.Array[(js.Array[Boolean | Double | String]) | js.typedarray.Uint8Array]]
      ]
    ]) | Boolean | Double | String | js.typedarray.Uint8Array
  ])
  
  type TypedArray = js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint8Array
}
