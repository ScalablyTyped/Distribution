package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUImageCopyTexture extends StObject {
  
  /**
    * Defines which aspects of the {@link GPUImageCopyTexture#texture} to copy to/from.
    */
  var aspect: js.UndefOr[GPUTextureAspect] = js.undefined
  
  /**
    * Mip-map level of the {@link GPUImageCopyTexture#texture} to copy to/from.
    */
  var mipLevel: js.UndefOr[GPUIntegerCoordinate] = js.undefined
  
  /**
    * Defines the origin of the copy - the minimum corner of the texture sub-region to copy to/from.
    * Together with `copySize`, defines the full copy sub-region.
    */
  var origin: js.UndefOr[GPUOrigin3D] = js.undefined
  
  /**
    * Texture to copy to/from.
    */
  var texture: GPUTexture
}
object GPUImageCopyTexture {
  
  inline def apply(texture: GPUTexture): GPUImageCopyTexture = {
    val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUImageCopyTexture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUImageCopyTexture] (val x: Self) extends AnyVal {
    
    inline def setAspect(value: GPUTextureAspect): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    inline def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
    
    inline def setMipLevel(value: GPUIntegerCoordinate): Self = StObject.set(x, "mipLevel", value.asInstanceOf[js.Any])
    
    inline def setMipLevelUndefined: Self = StObject.set(x, "mipLevel", js.undefined)
    
    inline def setOrigin(value: GPUOrigin3D): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setTexture(value: GPUTexture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
  }
}
