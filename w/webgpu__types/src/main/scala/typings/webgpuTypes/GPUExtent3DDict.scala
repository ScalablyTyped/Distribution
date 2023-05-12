package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUExtent3DDict extends StObject {
  
  /**
    * The depth of the extent or the number of array layers it contains.
    * If used with a {@link GPUTexture} with a {@link GPUTextureDimension} of {@link GPUTextureDimension#"3d"}
    * defines the depth of the texture. If used with a {@link GPUTexture} with a {@link GPUTextureDimension}
    * of {@link GPUTextureDimension#"2d"} defines the number of array layers in the texture.
    */
  var depthOrArrayLayers: js.UndefOr[GPUIntegerCoordinate] = js.undefined
  
  /**
    * The height of the extent
    */
  var height: js.UndefOr[GPUIntegerCoordinate] = js.undefined
  
  /**
    * The width of the extent
    */
  var width: GPUIntegerCoordinate
}
object GPUExtent3DDict {
  
  inline def apply(width: GPUIntegerCoordinate): GPUExtent3DDict = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUExtent3DDict]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUExtent3DDict] (val x: Self) extends AnyVal {
    
    inline def setDepthOrArrayLayers(value: GPUIntegerCoordinate): Self = StObject.set(x, "depthOrArrayLayers", value.asInstanceOf[js.Any])
    
    inline def setDepthOrArrayLayersUndefined: Self = StObject.set(x, "depthOrArrayLayers", js.undefined)
    
    inline def setHeight(value: GPUIntegerCoordinate): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: GPUIntegerCoordinate): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
