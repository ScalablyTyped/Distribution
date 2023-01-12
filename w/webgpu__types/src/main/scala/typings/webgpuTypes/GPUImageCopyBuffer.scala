package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUImageCopyBuffer
  extends StObject
     with GPUImageDataLayout {
  
  /**
    * A buffer which either contains image data to be copied or will store the image data being
    * copied, depending on the method it is being passed to.
    */
  var buffer: GPUBuffer
}
object GPUImageCopyBuffer {
  
  inline def apply(buffer: GPUBuffer): GPUImageCopyBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUImageCopyBuffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUImageCopyBuffer] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: GPUBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
  }
}
