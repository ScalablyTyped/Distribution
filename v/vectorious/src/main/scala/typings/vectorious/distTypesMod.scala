package typings.vectorious

import typings.std.Float32ArrayConstructor
import typings.std.Float64ArrayConstructor
import typings.std.Int16ArrayConstructor
import typings.std.Int32ArrayConstructor
import typings.std.Int8ArrayConstructor
import typings.std.Uint16ArrayConstructor
import typings.std.Uint32ArrayConstructor
import typings.std.Uint8ArrayConstructor
import typings.std.Uint8ClampedArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.vectorious.vectoriousStrings.int8
    - typings.vectorious.vectoriousStrings.uint8
    - typings.vectorious.vectoriousStrings.int16
    - typings.vectorious.vectoriousStrings.uint16
    - typings.vectorious.vectoriousStrings.int32
    - typings.vectorious.vectoriousStrings.uint32
    - typings.vectorious.vectoriousStrings.uint8c
    - typings.vectorious.vectoriousStrings.float32
    - typings.vectorious.vectoriousStrings.float64
    - typings.vectorious.vectoriousStrings.complex64
    - typings.vectorious.vectoriousStrings.complex128
  */
  trait DType extends StObject
  object DType {
    
    inline def complex128: typings.vectorious.vectoriousStrings.complex128 = "complex128".asInstanceOf[typings.vectorious.vectoriousStrings.complex128]
    
    inline def complex64: typings.vectorious.vectoriousStrings.complex64 = "complex64".asInstanceOf[typings.vectorious.vectoriousStrings.complex64]
    
    inline def float32: typings.vectorious.vectoriousStrings.float32 = "float32".asInstanceOf[typings.vectorious.vectoriousStrings.float32]
    
    inline def float64: typings.vectorious.vectoriousStrings.float64 = "float64".asInstanceOf[typings.vectorious.vectoriousStrings.float64]
    
    inline def int16: typings.vectorious.vectoriousStrings.int16 = "int16".asInstanceOf[typings.vectorious.vectoriousStrings.int16]
    
    inline def int32: typings.vectorious.vectoriousStrings.int32 = "int32".asInstanceOf[typings.vectorious.vectoriousStrings.int32]
    
    inline def int8: typings.vectorious.vectoriousStrings.int8 = "int8".asInstanceOf[typings.vectorious.vectoriousStrings.int8]
    
    inline def uint16: typings.vectorious.vectoriousStrings.uint16 = "uint16".asInstanceOf[typings.vectorious.vectoriousStrings.uint16]
    
    inline def uint32: typings.vectorious.vectoriousStrings.uint32 = "uint32".asInstanceOf[typings.vectorious.vectoriousStrings.uint32]
    
    inline def uint8: typings.vectorious.vectoriousStrings.uint8 = "uint8".asInstanceOf[typings.vectorious.vectoriousStrings.uint8]
    
    inline def uint8c: typings.vectorious.vectoriousStrings.uint8c = "uint8c".asInstanceOf[typings.vectorious.vectoriousStrings.uint8c]
  }
  
  trait INDArray extends StObject {
    
    var data: TypedArray
    
    var dtype: DType
    
    var length: Double
    
    var shape: js.Array[Double]
    
    var strides: js.Array[Double]
  }
  object INDArray {
    
    inline def apply(data: TypedArray, dtype: DType, length: Double, shape: js.Array[Double], strides: js.Array[Double]): INDArray = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
      __obj.asInstanceOf[INDArray]
    }
    
    extension [Self <: INDArray](x: Self) {
      
      inline def setData(value: TypedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDtype(value: DType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
      
      inline def setStrides(value: js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      inline def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value*))
    }
  }
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array
  
  type TypedArrayConstructor = Int8ArrayConstructor | Uint8ArrayConstructor | Int16ArrayConstructor | Uint16ArrayConstructor | Int32ArrayConstructor | Uint32ArrayConstructor | Uint8ClampedArrayConstructor | Float32ArrayConstructor | Float64ArrayConstructor
}
