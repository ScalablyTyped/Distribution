package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUBindGroupEntry extends StObject {
  
  /**
    * A unique identifier for a resource binding within the {@link GPUBindGroup}, corresponding to a
    * {@link GPUBindGroupLayoutEntry#binding|GPUBindGroupLayoutEntry.binding} and a @binding
    * attribute in the {@link GPUShaderModule}.
    */
  var binding: GPUIndex32
  
  /**
    * The resource to bind, which may be a {@link GPUSampler}, {@link GPUTextureView},
    * {@link GPUExternalTexture}, or {@link GPUBufferBinding}.
    */
  var resource: GPUBindingResource
}
object GPUBindGroupEntry {
  
  inline def apply(binding: GPUIndex32, resource: GPUBindingResource): GPUBindGroupEntry = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUBindGroupEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUBindGroupEntry] (val x: Self) extends AnyVal {
    
    inline def setBinding(value: GPUIndex32): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    inline def setResource(value: GPUBindingResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
