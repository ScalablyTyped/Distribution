package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUBufferDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  /**
    * If `true` creates the buffer in an already mapped state, allowing
    * {@link GPUBuffer#getMappedRange} to be called immediately. It is valid to set
    * {@link GPUBufferDescriptor#mappedAtCreation} to `true` even if {@link GPUBufferDescriptor#usage}
    * does not contain {@link GPUBufferUsage#MAP_READ} or {@link GPUBufferUsage#MAP_WRITE}. This can be
    * used to set the buffer's initial data.
    * Guarantees that even if the buffer creation eventually fails, it will still appear as if the
    * mapped range can be written/read to until it is unmapped.
    */
  var mappedAtCreation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size of the buffer in bytes.
    */
  var size: GPUSize64
  
  /**
    * The allowed usages for the buffer.
    */
  var usage: GPUBufferUsageFlags
}
object GPUBufferDescriptor {
  
  inline def apply(size: GPUSize64, usage: GPUBufferUsageFlags): GPUBufferDescriptor = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUBufferDescriptor]
  }
  
  extension [Self <: GPUBufferDescriptor](x: Self) {
    
    inline def setMappedAtCreation(value: Boolean): Self = StObject.set(x, "mappedAtCreation", value.asInstanceOf[js.Any])
    
    inline def setMappedAtCreationUndefined: Self = StObject.set(x, "mappedAtCreation", js.undefined)
    
    inline def setSize(value: GPUSize64): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setUsage(value: GPUBufferUsageFlags): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
  }
}
