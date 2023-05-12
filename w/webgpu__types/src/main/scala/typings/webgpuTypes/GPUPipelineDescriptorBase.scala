package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUPipelineDescriptorBase
  extends StObject
     with GPUObjectDescriptorBase {
  
  /**
    * The {@link GPUPipelineLayout} for this pipeline or {@link GPUAutoLayoutMode#"auto"}, to generate
    * the pipeline layout automatically.
    * Note: If {@link GPUAutoLayoutMode#"auto"} is used the pipeline cannot share {@link GPUBindGroup}s
    * with any other pipelines.
    */
  var layout: GPUPipelineLayout | GPUAutoLayoutMode
}
object GPUPipelineDescriptorBase {
  
  inline def apply(layout: GPUPipelineLayout | GPUAutoLayoutMode): GPUPipelineDescriptorBase = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUPipelineDescriptorBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUPipelineDescriptorBase] (val x: Self) extends AnyVal {
    
    inline def setLayout(value: GPUPipelineLayout | GPUAutoLayoutMode): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
