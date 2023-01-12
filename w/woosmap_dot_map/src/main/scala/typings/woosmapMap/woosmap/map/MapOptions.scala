package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MapOptions object used to define the properties that can be set on a Map.
  */
trait MapOptions extends StObject {
  
  /**
    * The initial map center to start from.
    */
  var center: LatLng | LatLngLiteral
  
  var defaultStyle: js.UndefOr[String] = js.undefined
  
  /**
    * Disables the default maps controls interface.
    */
  var disableDefaultUI: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This option controls how the gesture are handled
    * Depending on the value when gesture on the map is detected (scroll on desktop, one finger pan on mobile)
    * an overlay asking the user to use Cmd or Ctrl while scrolling or use two finger gesture to pan on mobile will be
    * shown.
    */
  var gestureHandling: js.UndefOr[GestureHandlingMode] = js.undefined
  
  var styles: js.UndefOr[js.Array[MapStyleSpec] | Null] = js.undefined
  
  /**
    * The initial map zoom level to start from.
    */
  var zoom: Double
}
object MapOptions {
  
  inline def apply(center: LatLng | LatLngLiteral, zoom: Double): MapOptions = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapOptions] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: LatLng | LatLngLiteral): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setDefaultStyle(value: String): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
    
    inline def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
    
    inline def setDisableDefaultUI(value: Boolean): Self = StObject.set(x, "disableDefaultUI", value.asInstanceOf[js.Any])
    
    inline def setDisableDefaultUIUndefined: Self = StObject.set(x, "disableDefaultUI", js.undefined)
    
    inline def setGestureHandling(value: GestureHandlingMode): Self = StObject.set(x, "gestureHandling", value.asInstanceOf[js.Any])
    
    inline def setGestureHandlingUndefined: Self = StObject.set(x, "gestureHandling", js.undefined)
    
    inline def setStyles(value: js.Array[MapStyleSpec]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesNull: Self = StObject.set(x, "styles", null)
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: MapStyleSpec*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
