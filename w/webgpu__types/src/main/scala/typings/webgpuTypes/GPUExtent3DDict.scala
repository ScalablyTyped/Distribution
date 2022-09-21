package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUExtent3DDict extends StObject {
  
  var depthOrArrayLayers: js.UndefOr[GPUIntegerCoordinate] = js.undefined
  
  var height: js.UndefOr[GPUIntegerCoordinate] = js.undefined
  
  var width: GPUIntegerCoordinate
}
object GPUExtent3DDict {
  
  inline def apply(width: GPUIntegerCoordinate): GPUExtent3DDict = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUExtent3DDict]
  }
  
  extension [Self <: GPUExtent3DDict](x: Self) {
    
    inline def setDepthOrArrayLayers(value: GPUIntegerCoordinate): Self = StObject.set(x, "depthOrArrayLayers", value.asInstanceOf[js.Any])
    
    inline def setDepthOrArrayLayersUndefined: Self = StObject.set(x, "depthOrArrayLayers", js.undefined)
    
    inline def setHeight(value: GPUIntegerCoordinate): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: GPUIntegerCoordinate): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
