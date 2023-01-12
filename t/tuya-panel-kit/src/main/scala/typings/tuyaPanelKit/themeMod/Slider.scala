package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.SliderTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.SliderTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.SliderTheme> */
trait Slider extends StObject {
  
  var dark: SliderTheme
  
  var light: SliderTheme
  
  var maximumTrackTintColor: js.UndefOr[String] = js.undefined
  
  var thumbRadius: js.UndefOr[Double] = js.undefined
  
  var thumbSize: js.UndefOr[Double] = js.undefined
  
  var thumbTintColor: js.UndefOr[String] = js.undefined
  
  var trackHeight: js.UndefOr[Double] = js.undefined
  
  var trackRadius: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double | Null] = js.undefined
}
object Slider {
  
  inline def apply(dark: SliderTheme, light: SliderTheme): Slider = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Slider] (val x: Self) extends AnyVal {
    
    inline def setDark(value: SliderTheme): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setLight(value: SliderTheme): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setMaximumTrackTintColor(value: String): Self = StObject.set(x, "maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    inline def setMaximumTrackTintColorUndefined: Self = StObject.set(x, "maximumTrackTintColor", js.undefined)
    
    inline def setThumbRadius(value: Double): Self = StObject.set(x, "thumbRadius", value.asInstanceOf[js.Any])
    
    inline def setThumbRadiusUndefined: Self = StObject.set(x, "thumbRadius", js.undefined)
    
    inline def setThumbSize(value: Double): Self = StObject.set(x, "thumbSize", value.asInstanceOf[js.Any])
    
    inline def setThumbSizeUndefined: Self = StObject.set(x, "thumbSize", js.undefined)
    
    inline def setThumbTintColor(value: String): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    inline def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
    
    inline def setTrackHeight(value: Double): Self = StObject.set(x, "trackHeight", value.asInstanceOf[js.Any])
    
    inline def setTrackHeightUndefined: Self = StObject.set(x, "trackHeight", js.undefined)
    
    inline def setTrackRadius(value: Double): Self = StObject.set(x, "trackRadius", value.asInstanceOf[js.Any])
    
    inline def setTrackRadiusUndefined: Self = StObject.set(x, "trackRadius", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
