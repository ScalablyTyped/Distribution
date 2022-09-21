package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUPipelineLayoutDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  /**
    * A list of {@link GPUBindGroupLayout}s the pipline will use. Each element corresponds to a
    * @group attribute in the {@link GPUShaderModule}, with the `N`th element corresponding with
    * `@group(N)`.
    */
  var bindGroupLayouts: js.Iterable[GPUBindGroupLayout]
}
object GPUPipelineLayoutDescriptor {
  
  inline def apply(bindGroupLayouts: js.Iterable[GPUBindGroupLayout]): GPUPipelineLayoutDescriptor = {
    val __obj = js.Dynamic.literal(bindGroupLayouts = bindGroupLayouts.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUPipelineLayoutDescriptor]
  }
  
  extension [Self <: GPUPipelineLayoutDescriptor](x: Self) {
    
    inline def setBindGroupLayouts(value: js.Iterable[GPUBindGroupLayout]): Self = StObject.set(x, "bindGroupLayouts", value.asInstanceOf[js.Any])
  }
}
