package typings.typedarrayPool

import typings.std.ArrayBuffer
import typings.std.DataView
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typedarray-pool", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
  
  inline def free(array: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("free")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def freeArrayBuffer(buffer: ArrayBuffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("freeArrayBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def freeBuffer(buffer: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("freeBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def freeDataView(view: DataView): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("freeDataView")(view.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def freeDouble(array: Float64Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("freeDouble")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def freeFloat(array: Float32Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("freeFloat")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def freeInt16(array: Int16Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("freeInt16")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def freeInt32(array: Int32Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("freeInt32")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def freeInt8(array: Int8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("freeInt8")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def freeUint16(array: Uint16Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("freeUint16")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def freeUint32(array: Uint32Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("freeUint32")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def freeUint8(array: Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("freeUint8")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def freeUint8Clamped(array: Uint8ClampedArray): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("freeUint8Clamped")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def malloc(n: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("malloc")(n.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def malloc(n: Double, dtype: DataType): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("malloc")(n.asInstanceOf[js.Any], dtype.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def mallocArrayBuffer(n: Double): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("mallocArrayBuffer")(n.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  
  inline def mallocBuffer(n: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mallocBuffer")(n.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def mallocDataView(n: Double): DataView = ^.asInstanceOf[js.Dynamic].applyDynamic("mallocDataView")(n.asInstanceOf[js.Any]).asInstanceOf[DataView]
  
  inline def mallocDouble(n: Double): Float64Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mallocDouble")(n.asInstanceOf[js.Any]).asInstanceOf[Float64Array]
  
  inline def mallocFloat(n: Double): Float32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mallocFloat")(n.asInstanceOf[js.Any]).asInstanceOf[Float32Array]
  
  inline def mallocInt16(n: Double): Int16Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mallocInt16")(n.asInstanceOf[js.Any]).asInstanceOf[Int16Array]
  
  inline def mallocInt32(n: Double): Int32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mallocInt32")(n.asInstanceOf[js.Any]).asInstanceOf[Int32Array]
  
  inline def mallocInt8(n: Double): Int8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mallocInt8")(n.asInstanceOf[js.Any]).asInstanceOf[Int8Array]
  
  inline def mallocUint16(n: Double): Uint16Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mallocUint16")(n.asInstanceOf[js.Any]).asInstanceOf[Uint16Array]
  
  inline def mallocUint32(n: Double): Uint32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mallocUint32")(n.asInstanceOf[js.Any]).asInstanceOf[Uint32Array]
  
  inline def mallocUint8(n: Double): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mallocUint8")(n.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  inline def mallocUint8Clamped(n: Double): Uint8ClampedArray = ^.asInstanceOf[js.Dynamic].applyDynamic("mallocUint8Clamped")(n.asInstanceOf[js.Any]).asInstanceOf[Uint8ClampedArray]
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedarrayPool.typedarrayPoolStrings.uint8
    - typings.typedarrayPool.typedarrayPoolStrings.uint16
    - typings.typedarrayPool.typedarrayPoolStrings.uint32
    - typings.typedarrayPool.typedarrayPoolStrings.int8
    - typings.typedarrayPool.typedarrayPoolStrings.int16
    - typings.typedarrayPool.typedarrayPoolStrings.int32
    - typings.typedarrayPool.typedarrayPoolStrings.float
    - typings.typedarrayPool.typedarrayPoolStrings.float32
    - typings.typedarrayPool.typedarrayPoolStrings.double
    - typings.typedarrayPool.typedarrayPoolStrings.float64
    - typings.typedarrayPool.typedarrayPoolStrings.arraybuffer
    - typings.typedarrayPool.typedarrayPoolStrings.data
    - typings.typedarrayPool.typedarrayPoolStrings.dataview
    - typings.typedarrayPool.typedarrayPoolStrings.uint8_clamped
    - typings.typedarrayPool.typedarrayPoolStrings.buffer
  */
  trait DataType extends StObject
  object DataType {
    
    inline def arraybuffer: typings.typedarrayPool.typedarrayPoolStrings.arraybuffer = "arraybuffer".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.arraybuffer]
    
    inline def buffer: typings.typedarrayPool.typedarrayPoolStrings.buffer = "buffer".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.buffer]
    
    inline def data: typings.typedarrayPool.typedarrayPoolStrings.data = "data".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.data]
    
    inline def dataview: typings.typedarrayPool.typedarrayPoolStrings.dataview = "dataview".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.dataview]
    
    inline def double: typings.typedarrayPool.typedarrayPoolStrings.double = "double".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.double]
    
    inline def float: typings.typedarrayPool.typedarrayPoolStrings.float = "float".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.float]
    
    inline def float32: typings.typedarrayPool.typedarrayPoolStrings.float32 = "float32".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.float32]
    
    inline def float64: typings.typedarrayPool.typedarrayPoolStrings.float64 = "float64".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.float64]
    
    inline def int16: typings.typedarrayPool.typedarrayPoolStrings.int16 = "int16".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.int16]
    
    inline def int32: typings.typedarrayPool.typedarrayPoolStrings.int32 = "int32".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.int32]
    
    inline def int8: typings.typedarrayPool.typedarrayPoolStrings.int8 = "int8".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.int8]
    
    inline def uint16: typings.typedarrayPool.typedarrayPoolStrings.uint16 = "uint16".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.uint16]
    
    inline def uint32: typings.typedarrayPool.typedarrayPoolStrings.uint32 = "uint32".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.uint32]
    
    inline def uint8: typings.typedarrayPool.typedarrayPoolStrings.uint8 = "uint8".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.uint8]
    
    inline def uint8_clamped: typings.typedarrayPool.typedarrayPoolStrings.uint8_clamped = "uint8_clamped".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.uint8_clamped]
  }
}
