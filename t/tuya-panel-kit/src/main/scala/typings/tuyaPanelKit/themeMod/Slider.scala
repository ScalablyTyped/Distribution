package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.SliderTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.SliderTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.SliderTheme> */
@js.native
trait Slider extends StObject {
  
  var dark: SliderTheme = js.native
  
  var light: SliderTheme = js.native
  
  var maximumTrackTintColor: js.UndefOr[String] = js.native
  
  var thumbRadius: js.UndefOr[Double] = js.native
  
  var thumbSize: js.UndefOr[Double] = js.native
  
  var thumbTintColor: js.UndefOr[String] = js.native
  
  var trackHeight: js.UndefOr[Double] = js.native
  
  var trackRadius: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double | Null] = js.native
}
object Slider {
  
  @scala.inline
  def apply(dark: SliderTheme, light: SliderTheme): Slider = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Slider]
  }
  
  @scala.inline
  implicit class SliderMutableBuilder[Self <: Slider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDark(value: SliderTheme): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: SliderTheme): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumTrackTintColor(value: String): Self = StObject.set(x, "maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumTrackTintColorUndefined: Self = StObject.set(x, "maximumTrackTintColor", js.undefined)
    
    @scala.inline
    def setThumbRadius(value: Double): Self = StObject.set(x, "thumbRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbRadiusUndefined: Self = StObject.set(x, "thumbRadius", js.undefined)
    
    @scala.inline
    def setThumbSize(value: Double): Self = StObject.set(x, "thumbSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbSizeUndefined: Self = StObject.set(x, "thumbSize", js.undefined)
    
    @scala.inline
    def setThumbTintColor(value: String): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbTintColorUndefined: Self = StObject.set(x, "thumbTintColor", js.undefined)
    
    @scala.inline
    def setTrackHeight(value: Double): Self = StObject.set(x, "trackHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackHeightUndefined: Self = StObject.set(x, "trackHeight", js.undefined)
    
    @scala.inline
    def setTrackRadius(value: Double): Self = StObject.set(x, "trackRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackRadiusUndefined: Self = StObject.set(x, "trackRadius", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthNull: Self = StObject.set(x, "width", null)
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
