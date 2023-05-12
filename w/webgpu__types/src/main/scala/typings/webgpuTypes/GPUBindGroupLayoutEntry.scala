package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUBindGroupLayoutEntry extends StObject {
  
  /**
    * A unique identifier for a resource binding within the {@link GPUBindGroupLayout}, corresponding
    * to a {@link GPUBindGroupEntry#binding|GPUBindGroupEntry.binding} and a @binding
    * attribute in the {@link GPUShaderModule}.
    */
  var binding: GPUIndex32
  
  /**
    * When map/exist|provided, indicates the binding resource type for this {@link GPUBindGroupLayoutEntry}
    * is {@link GPUBufferBinding}.
    */
  var buffer: js.UndefOr[GPUBufferBindingLayout] = js.undefined
  
  /**
    * When map/exist|provided, indicates the binding resource type for this {@link GPUBindGroupLayoutEntry}
    * is {@link GPUExternalTexture}.
    */
  var externalTexture: js.UndefOr[GPUExternalTextureBindingLayout] = js.undefined
  
  /**
    * When map/exist|provided, indicates the binding resource type for this {@link GPUBindGroupLayoutEntry}
    * is {@link GPUSampler}.
    */
  var sampler: js.UndefOr[GPUSamplerBindingLayout] = js.undefined
  
  /**
    * When map/exist|provided, indicates the binding resource type for this {@link GPUBindGroupLayoutEntry}
    * is {@link GPUTextureView}.
    */
  var storageTexture: js.UndefOr[GPUStorageTextureBindingLayout] = js.undefined
  
  /**
    * When map/exist|provided, indicates the binding resource type for this {@link GPUBindGroupLayoutEntry}
    * is {@link GPUTextureView}.
    */
  var texture: js.UndefOr[GPUTextureBindingLayout] = js.undefined
  
  /**
    * A bitset of the members of {@link GPUShaderStage}.
    * Each set bit indicates that a {@link GPUBindGroupLayoutEntry}'s resource
    * will be accessible from the associated shader stage.
    */
  var visibility: GPUShaderStageFlags
}
object GPUBindGroupLayoutEntry {
  
  inline def apply(binding: GPUIndex32, visibility: GPUShaderStageFlags): GPUBindGroupLayoutEntry = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUBindGroupLayoutEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUBindGroupLayoutEntry] (val x: Self) extends AnyVal {
    
    inline def setBinding(value: GPUIndex32): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    inline def setBuffer(value: GPUBufferBindingLayout): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    inline def setExternalTexture(value: GPUExternalTextureBindingLayout): Self = StObject.set(x, "externalTexture", value.asInstanceOf[js.Any])
    
    inline def setExternalTextureUndefined: Self = StObject.set(x, "externalTexture", js.undefined)
    
    inline def setSampler(value: GPUSamplerBindingLayout): Self = StObject.set(x, "sampler", value.asInstanceOf[js.Any])
    
    inline def setSamplerUndefined: Self = StObject.set(x, "sampler", js.undefined)
    
    inline def setStorageTexture(value: GPUStorageTextureBindingLayout): Self = StObject.set(x, "storageTexture", value.asInstanceOf[js.Any])
    
    inline def setStorageTextureUndefined: Self = StObject.set(x, "storageTexture", js.undefined)
    
    inline def setTexture(value: GPUTextureBindingLayout): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    inline def setTextureUndefined: Self = StObject.set(x, "texture", js.undefined)
    
    inline def setVisibility(value: GPUShaderStageFlags): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
