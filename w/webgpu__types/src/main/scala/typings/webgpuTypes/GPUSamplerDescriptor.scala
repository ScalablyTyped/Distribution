package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUSamplerDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  /**
    */
  var addressModeU: js.UndefOr[GPUAddressMode] = js.undefined
  
  /**
    */
  var addressModeV: js.UndefOr[GPUAddressMode] = js.undefined
  
  /**
    * Specifies the {{GPUAddressMode|address modes}} for the texture width, height, and depth
    * coordinates, respectively.
    */
  var addressModeW: js.UndefOr[GPUAddressMode] = js.undefined
  
  /**
    * When provided the sampler will be a comparison sampler with the specified
    * {@link GPUCompareFunction}.
    * Note: Comparison samplers may use filtering, but the sampling results will be
    * implementation-dependent and may differ from the normal filtering rules.
    */
  var compare: js.UndefOr[GPUCompareFunction] = js.undefined
  
  /**
    * Specifies the minimum and maximum levels of detail, respectively, used internally when
    * sampling a texture.
    */
  var lodMaxClamp: js.UndefOr[Double] = js.undefined
  
  /**
    */
  var lodMinClamp: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the sampling behavior when the sample footprint is smaller than or equal to one
    * texel.
    */
  var magFilter: js.UndefOr[GPUFilterMode] = js.undefined
  
  /**
    * Specifies the maximum anisotropy value clamp used by the sampler.
    * Note: Most implementations support {@link GPUSamplerDescriptor#maxAnisotropy} values in range
    * between 1 and 16, inclusive. The used value of {@link GPUSamplerDescriptor#maxAnisotropy} will
    * be clamped to the maximum value that the platform supports.
    */
  var maxAnisotropy: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the sampling behavior when the sample footprint is larger than one texel.
    */
  var minFilter: js.UndefOr[GPUFilterMode] = js.undefined
  
  /**
    * Specifies behavior for sampling between mipmap levels.
    */
  var mipmapFilter: js.UndefOr[GPUMipmapFilterMode] = js.undefined
}
object GPUSamplerDescriptor {
  
  inline def apply(): GPUSamplerDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUSamplerDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUSamplerDescriptor] (val x: Self) extends AnyVal {
    
    inline def setAddressModeU(value: GPUAddressMode): Self = StObject.set(x, "addressModeU", value.asInstanceOf[js.Any])
    
    inline def setAddressModeUUndefined: Self = StObject.set(x, "addressModeU", js.undefined)
    
    inline def setAddressModeV(value: GPUAddressMode): Self = StObject.set(x, "addressModeV", value.asInstanceOf[js.Any])
    
    inline def setAddressModeVUndefined: Self = StObject.set(x, "addressModeV", js.undefined)
    
    inline def setAddressModeW(value: GPUAddressMode): Self = StObject.set(x, "addressModeW", value.asInstanceOf[js.Any])
    
    inline def setAddressModeWUndefined: Self = StObject.set(x, "addressModeW", js.undefined)
    
    inline def setCompare(value: GPUCompareFunction): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    inline def setLodMaxClamp(value: Double): Self = StObject.set(x, "lodMaxClamp", value.asInstanceOf[js.Any])
    
    inline def setLodMaxClampUndefined: Self = StObject.set(x, "lodMaxClamp", js.undefined)
    
    inline def setLodMinClamp(value: Double): Self = StObject.set(x, "lodMinClamp", value.asInstanceOf[js.Any])
    
    inline def setLodMinClampUndefined: Self = StObject.set(x, "lodMinClamp", js.undefined)
    
    inline def setMagFilter(value: GPUFilterMode): Self = StObject.set(x, "magFilter", value.asInstanceOf[js.Any])
    
    inline def setMagFilterUndefined: Self = StObject.set(x, "magFilter", js.undefined)
    
    inline def setMaxAnisotropy(value: Double): Self = StObject.set(x, "maxAnisotropy", value.asInstanceOf[js.Any])
    
    inline def setMaxAnisotropyUndefined: Self = StObject.set(x, "maxAnisotropy", js.undefined)
    
    inline def setMinFilter(value: GPUFilterMode): Self = StObject.set(x, "minFilter", value.asInstanceOf[js.Any])
    
    inline def setMinFilterUndefined: Self = StObject.set(x, "minFilter", js.undefined)
    
    inline def setMipmapFilter(value: GPUMipmapFilterMode): Self = StObject.set(x, "mipmapFilter", value.asInstanceOf[js.Any])
    
    inline def setMipmapFilterUndefined: Self = StObject.set(x, "mipmapFilter", js.undefined)
  }
}
