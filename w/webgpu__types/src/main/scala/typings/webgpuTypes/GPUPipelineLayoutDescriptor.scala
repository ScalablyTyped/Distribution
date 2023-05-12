package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUPipelineLayoutDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  /**
    * A list of {@link GPUBindGroupLayout}s the pipeline will use. Each element corresponds to a
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUPipelineLayoutDescriptor] (val x: Self) extends AnyVal {
    
    inline def setBindGroupLayouts(value: js.Iterable[GPUBindGroupLayout]): Self = StObject.set(x, "bindGroupLayouts", value.asInstanceOf[js.Any])
  }
}
