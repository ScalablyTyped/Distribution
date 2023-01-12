package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUComputePassDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  /**
    * A sequence of {@link GPUComputePassTimestampWrite} values define where and when timestamp values will be written for this pass.
    */
  var timestampWrites: js.UndefOr[js.Iterable[GPUComputePassTimestampWrite]] = js.undefined
}
object GPUComputePassDescriptor {
  
  inline def apply(): GPUComputePassDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUComputePassDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUComputePassDescriptor] (val x: Self) extends AnyVal {
    
    inline def setTimestampWrites(value: js.Iterable[GPUComputePassTimestampWrite]): Self = StObject.set(x, "timestampWrites", value.asInstanceOf[js.Any])
    
    inline def setTimestampWritesUndefined: Self = StObject.set(x, "timestampWrites", js.undefined)
  }
}
