package typings.viewportMercatorProject.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebMercatorViewportOptions extends StObject {
  
  var altitude: js.UndefOr[Double] = js.undefined
  
  var bearing: js.UndefOr[Double] = js.undefined
  
  var farZMultiplier: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var latitude: js.UndefOr[Double] = js.undefined
  
  var longitude: js.UndefOr[Double] = js.undefined
  
  var nearZMultiplier: js.UndefOr[Double] = js.undefined
  
  var pitch: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object WebMercatorViewportOptions {
  
  @scala.inline
  def apply(): WebMercatorViewportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebMercatorViewportOptions]
  }
  
  @scala.inline
  implicit class WebMercatorViewportOptionsMutableBuilder[Self <: WebMercatorViewportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
    
    @scala.inline
    def setFarZMultiplier(value: Double): Self = StObject.set(x, "farZMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFarZMultiplierUndefined: Self = StObject.set(x, "farZMultiplier", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    @scala.inline
    def setNearZMultiplier(value: Double): Self = StObject.set(x, "nearZMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearZMultiplierUndefined: Self = StObject.set(x, "nearZMultiplier", js.undefined)
    
    @scala.inline
    def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
