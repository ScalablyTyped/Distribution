package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUPipelineDescriptorBase
  extends StObject
     with GPUObjectDescriptorBase {
  
  var layout: GPUPipelineLayout | GPUAutoLayoutMode
}
object GPUPipelineDescriptorBase {
  
  inline def apply(layout: GPUPipelineLayout | GPUAutoLayoutMode): GPUPipelineDescriptorBase = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUPipelineDescriptorBase]
  }
  
  extension [Self <: GPUPipelineDescriptorBase](x: Self) {
    
    inline def setLayout(value: GPUPipelineLayout | GPUAutoLayoutMode): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
