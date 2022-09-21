package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUVertexBufferLayout extends StObject {
  
  /**
    * The stride, in bytes, between elements of this array.
    */
  var arrayStride: GPUSize64
  
  /**
    * An array defining the layout of the vertex attributes within each element.
    */
  var attributes: js.Iterable[GPUVertexAttribute]
  
  /**
    * Whether each element of this array represents per-vertex data or per-instance data
    */
  var stepMode: js.UndefOr[GPUVertexStepMode] = js.undefined
}
object GPUVertexBufferLayout {
  
  inline def apply(arrayStride: GPUSize64, attributes: js.Iterable[GPUVertexAttribute]): GPUVertexBufferLayout = {
    val __obj = js.Dynamic.literal(arrayStride = arrayStride.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUVertexBufferLayout]
  }
  
  extension [Self <: GPUVertexBufferLayout](x: Self) {
    
    inline def setArrayStride(value: GPUSize64): Self = StObject.set(x, "arrayStride", value.asInstanceOf[js.Any])
    
    inline def setAttributes(value: js.Iterable[GPUVertexAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setStepMode(value: GPUVertexStepMode): Self = StObject.set(x, "stepMode", value.asInstanceOf[js.Any])
    
    inline def setStepModeUndefined: Self = StObject.set(x, "stepMode", js.undefined)
  }
}
