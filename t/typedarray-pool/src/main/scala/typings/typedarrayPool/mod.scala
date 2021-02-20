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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typedarray-pool", "clearCache")
  @js.native
  def clearCache(): Unit = js.native
  
  @JSImport("typedarray-pool", "free")
  @js.native
  def free(array: js.Any): Unit = js.native
  
  @JSImport("typedarray-pool", "freeArrayBuffer")
  @js.native
  def freeArrayBuffer(buffer: ArrayBuffer): Unit = js.native
  
  @JSImport("typedarray-pool", "freeBuffer")
  @js.native
  def freeBuffer(buffer: js.Any): Unit = js.native
  
  @JSImport("typedarray-pool", "freeDataView")
  @js.native
  def freeDataView(view: DataView): Unit = js.native
  
  @JSImport("typedarray-pool", "freeDouble")
  @js.native
  def freeDouble(array: Float64Array): Unit = js.native
  
  @JSImport("typedarray-pool", "freeFloat")
  @js.native
  def freeFloat(array: Float32Array): Unit = js.native
  
  @JSImport("typedarray-pool", "freeInt16")
  @js.native
  def freeInt16(array: Int16Array): Unit = js.native
  
  @JSImport("typedarray-pool", "freeInt32")
  @js.native
  def freeInt32(array: Int32Array): Unit = js.native
  
  @JSImport("typedarray-pool", "freeInt8")
  @js.native
  def freeInt8(array: Int8Array): Unit = js.native
  
  @JSImport("typedarray-pool", "freeUint16")
  @js.native
  def freeUint16(array: Uint16Array): Unit = js.native
  
  @JSImport("typedarray-pool", "freeUint32")
  @js.native
  def freeUint32(array: Uint32Array): Unit = js.native
  
  @JSImport("typedarray-pool", "freeUint8")
  @js.native
  def freeUint8(array: Uint8Array): Unit = js.native
  
  @JSImport("typedarray-pool", "freeUint8Clamped")
  @js.native
  def freeUint8Clamped(array: Uint8ClampedArray): Unit = js.native
  
  @JSImport("typedarray-pool", "malloc")
  @js.native
  def malloc(n: Double): js.Any = js.native
  @JSImport("typedarray-pool", "malloc")
  @js.native
  def malloc(n: Double, dtype: DataType): js.Any = js.native
  
  @JSImport("typedarray-pool", "mallocArrayBuffer")
  @js.native
  def mallocArrayBuffer(n: Double): ArrayBuffer = js.native
  
  @JSImport("typedarray-pool", "mallocBuffer")
  @js.native
  def mallocBuffer(n: Double): js.Any = js.native
  
  @JSImport("typedarray-pool", "mallocDataView")
  @js.native
  def mallocDataView(n: Double): DataView = js.native
  
  @JSImport("typedarray-pool", "mallocDouble")
  @js.native
  def mallocDouble(n: Double): Float64Array = js.native
  
  @JSImport("typedarray-pool", "mallocFloat")
  @js.native
  def mallocFloat(n: Double): Float32Array = js.native
  
  @JSImport("typedarray-pool", "mallocInt16")
  @js.native
  def mallocInt16(n: Double): Int16Array = js.native
  
  @JSImport("typedarray-pool", "mallocInt32")
  @js.native
  def mallocInt32(n: Double): Int32Array = js.native
  
  @JSImport("typedarray-pool", "mallocInt8")
  @js.native
  def mallocInt8(n: Double): Int8Array = js.native
  
  @JSImport("typedarray-pool", "mallocUint16")
  @js.native
  def mallocUint16(n: Double): Uint16Array = js.native
  
  @JSImport("typedarray-pool", "mallocUint32")
  @js.native
  def mallocUint32(n: Double): Uint32Array = js.native
  
  @JSImport("typedarray-pool", "mallocUint8")
  @js.native
  def mallocUint8(n: Double): Uint8Array = js.native
  
  @JSImport("typedarray-pool", "mallocUint8Clamped")
  @js.native
  def mallocUint8Clamped(n: Double): Uint8ClampedArray = js.native
  
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
    
    @scala.inline
    def arraybuffer: typings.typedarrayPool.typedarrayPoolStrings.arraybuffer = "arraybuffer".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.arraybuffer]
    
    @scala.inline
    def buffer: typings.typedarrayPool.typedarrayPoolStrings.buffer = "buffer".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.buffer]
    
    @scala.inline
    def data: typings.typedarrayPool.typedarrayPoolStrings.data = "data".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.data]
    
    @scala.inline
    def dataview: typings.typedarrayPool.typedarrayPoolStrings.dataview = "dataview".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.dataview]
    
    @scala.inline
    def double: typings.typedarrayPool.typedarrayPoolStrings.double = "double".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.double]
    
    @scala.inline
    def float: typings.typedarrayPool.typedarrayPoolStrings.float = "float".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.float]
    
    @scala.inline
    def float32: typings.typedarrayPool.typedarrayPoolStrings.float32 = "float32".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.float32]
    
    @scala.inline
    def float64: typings.typedarrayPool.typedarrayPoolStrings.float64 = "float64".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.float64]
    
    @scala.inline
    def int16: typings.typedarrayPool.typedarrayPoolStrings.int16 = "int16".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.int16]
    
    @scala.inline
    def int32: typings.typedarrayPool.typedarrayPoolStrings.int32 = "int32".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.int32]
    
    @scala.inline
    def int8: typings.typedarrayPool.typedarrayPoolStrings.int8 = "int8".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.int8]
    
    @scala.inline
    def uint16: typings.typedarrayPool.typedarrayPoolStrings.uint16 = "uint16".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.uint16]
    
    @scala.inline
    def uint32: typings.typedarrayPool.typedarrayPoolStrings.uint32 = "uint32".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.uint32]
    
    @scala.inline
    def uint8: typings.typedarrayPool.typedarrayPoolStrings.uint8 = "uint8".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.uint8]
    
    @scala.inline
    def uint8_clamped: typings.typedarrayPool.typedarrayPoolStrings.uint8_clamped = "uint8_clamped".asInstanceOf[typings.typedarrayPool.typedarrayPoolStrings.uint8_clamped]
  }
}
