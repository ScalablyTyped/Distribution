package typings.yandexMaps.anon

import typings.yandexMaps.mod.IProjection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordRendering extends StObject {
  
  var coordRendering: js.UndefOr["shortestPath" | "straightPath"] = js.undefined
  
  var geodesic: js.UndefOr[Boolean] = js.undefined
  
  var pixelRendering: js.UndefOr["jumpy" | "static"] = js.undefined
  
  var projection: js.UndefOr[IProjection] = js.undefined
  
  var simplification: js.UndefOr[Boolean] = js.undefined
}
object CoordRendering {
  
  inline def apply(): CoordRendering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoordRendering]
  }
  
  extension [Self <: CoordRendering](x: Self) {
    
    inline def setCoordRendering(value: "shortestPath" | "straightPath"): Self = StObject.set(x, "coordRendering", value.asInstanceOf[js.Any])
    
    inline def setCoordRenderingUndefined: Self = StObject.set(x, "coordRendering", js.undefined)
    
    inline def setGeodesic(value: Boolean): Self = StObject.set(x, "geodesic", value.asInstanceOf[js.Any])
    
    inline def setGeodesicUndefined: Self = StObject.set(x, "geodesic", js.undefined)
    
    inline def setPixelRendering(value: "jumpy" | "static"): Self = StObject.set(x, "pixelRendering", value.asInstanceOf[js.Any])
    
    inline def setPixelRenderingUndefined: Self = StObject.set(x, "pixelRendering", js.undefined)
    
    inline def setProjection(value: IProjection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setSimplification(value: Boolean): Self = StObject.set(x, "simplification", value.asInstanceOf[js.Any])
    
    inline def setSimplificationUndefined: Self = StObject.set(x, "simplification", js.undefined)
  }
}
