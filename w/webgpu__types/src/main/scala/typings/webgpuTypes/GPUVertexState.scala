package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUVertexState
  extends StObject
     with GPUProgrammableStage {
  
  var buffers: js.UndefOr[js.Iterable[GPUVertexBufferLayout | Null]] = js.undefined
}
object GPUVertexState {
  
  inline def apply(entryPoint: String, module: GPUShaderModule): GPUVertexState = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUVertexState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUVertexState] (val x: Self) extends AnyVal {
    
    inline def setBuffers(value: js.Iterable[GPUVertexBufferLayout | Null]): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
    
    inline def setBuffersUndefined: Self = StObject.set(x, "buffers", js.undefined)
  }
}
