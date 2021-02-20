package typings.yandexMaps.anon

import typings.yandexMaps.mod.IProjection
import typings.yandexMaps.yandexMapsStrings.jumpy
import typings.yandexMaps.yandexMapsStrings.shortestPath
import typings.yandexMaps.yandexMapsStrings.static
import typings.yandexMaps.yandexMapsStrings.straightPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoordRendering extends StObject {
  
  var coordRendering: js.UndefOr[shortestPath | straightPath] = js.native
  
  var geodesic: js.UndefOr[Boolean] = js.native
  
  var pixelRendering: js.UndefOr[jumpy | static] = js.native
  
  var projection: js.UndefOr[IProjection] = js.native
  
  var simplification: js.UndefOr[Boolean] = js.native
}
object CoordRendering {
  
  @scala.inline
  def apply(): CoordRendering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoordRendering]
  }
  
  @scala.inline
  implicit class CoordRenderingMutableBuilder[Self <: CoordRendering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordRendering(value: shortestPath | straightPath): Self = StObject.set(x, "coordRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordRenderingUndefined: Self = StObject.set(x, "coordRendering", js.undefined)
    
    @scala.inline
    def setGeodesic(value: Boolean): Self = StObject.set(x, "geodesic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeodesicUndefined: Self = StObject.set(x, "geodesic", js.undefined)
    
    @scala.inline
    def setPixelRendering(value: jumpy | static): Self = StObject.set(x, "pixelRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelRenderingUndefined: Self = StObject.set(x, "pixelRendering", js.undefined)
    
    @scala.inline
    def setProjection(value: IProjection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    @scala.inline
    def setSimplification(value: Boolean): Self = StObject.set(x, "simplification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimplificationUndefined: Self = StObject.set(x, "simplification", js.undefined)
  }
}
