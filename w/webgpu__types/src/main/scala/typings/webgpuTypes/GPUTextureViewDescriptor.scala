package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUTextureViewDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  /**
    * How many array layers, starting with {@link GPUTextureViewDescriptor#baseArrayLayer}, are accessible
    * to the texture view.
    */
  var arrayLayerCount: js.UndefOr[GPUIntegerCoordinate] = js.undefined
  
  /**
    * Which {@link GPUTextureAspect|aspect(s)} of the texture are accessible to the texture view.
    */
  var aspect: js.UndefOr[GPUTextureAspect] = js.undefined
  
  /**
    * The index of the first array layer accessible to the texture view.
    */
  var baseArrayLayer: js.UndefOr[GPUIntegerCoordinate] = js.undefined
  
  /**
    * The first (most detailed) mipmap level accessible to the texture view.
    */
  var baseMipLevel: js.UndefOr[GPUIntegerCoordinate] = js.undefined
  
  /**
    * The dimension to view the texture as.
    */
  var dimension: js.UndefOr[GPUTextureViewDimension] = js.undefined
  
  /**
    * The format of the texture view. Must be either the {@link GPUTextureDescriptor#format} of the
    * texture or one of the {@link GPUTextureDescriptor#viewFormats} specified during its creation.
    */
  var format: js.UndefOr[GPUTextureFormat] = js.undefined
  
  /**
    * How many mipmap levels, starting with {@link GPUTextureViewDescriptor#baseMipLevel}, are accessible to
    * the texture view.
    */
  var mipLevelCount: js.UndefOr[GPUIntegerCoordinate] = js.undefined
}
object GPUTextureViewDescriptor {
  
  inline def apply(): GPUTextureViewDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUTextureViewDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUTextureViewDescriptor] (val x: Self) extends AnyVal {
    
    inline def setArrayLayerCount(value: GPUIntegerCoordinate): Self = StObject.set(x, "arrayLayerCount", value.asInstanceOf[js.Any])
    
    inline def setArrayLayerCountUndefined: Self = StObject.set(x, "arrayLayerCount", js.undefined)
    
    inline def setAspect(value: GPUTextureAspect): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    inline def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
    
    inline def setBaseArrayLayer(value: GPUIntegerCoordinate): Self = StObject.set(x, "baseArrayLayer", value.asInstanceOf[js.Any])
    
    inline def setBaseArrayLayerUndefined: Self = StObject.set(x, "baseArrayLayer", js.undefined)
    
    inline def setBaseMipLevel(value: GPUIntegerCoordinate): Self = StObject.set(x, "baseMipLevel", value.asInstanceOf[js.Any])
    
    inline def setBaseMipLevelUndefined: Self = StObject.set(x, "baseMipLevel", js.undefined)
    
    inline def setDimension(value: GPUTextureViewDimension): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setFormat(value: GPUTextureFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMipLevelCount(value: GPUIntegerCoordinate): Self = StObject.set(x, "mipLevelCount", value.asInstanceOf[js.Any])
    
    inline def setMipLevelCountUndefined: Self = StObject.set(x, "mipLevelCount", js.undefined)
  }
}
