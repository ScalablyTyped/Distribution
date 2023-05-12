package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUBufferBinding
  extends StObject
     with GPUBindingResource {
  
  /**
    * The {@link GPUBuffer} to bind.
    */
  var buffer: GPUBuffer
  
  /**
    * The offset, in bytes, from the beginning of {@link GPUBufferBinding#buffer} to the
    * beginning of the range exposed to the shader by the buffer binding.
    */
  var offset: js.UndefOr[GPUSize64] = js.undefined
  
  /**
    * The size, in bytes, of the buffer binding.
    * If not map/exist|provided, specifies the range starting at
    * {@link GPUBufferBinding#offset} and ending at the end of {@link GPUBufferBinding#buffer}.
    */
  var size: js.UndefOr[GPUSize64] = js.undefined
}
object GPUBufferBinding {
  
  inline def apply(buffer: GPUBuffer): GPUBufferBinding = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUBufferBinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUBufferBinding] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: GPUBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: GPUSize64): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setSize(value: GPUSize64): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
