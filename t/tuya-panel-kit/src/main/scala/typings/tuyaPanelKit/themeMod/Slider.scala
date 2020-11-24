package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.SliderTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.SliderTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.SliderTheme> */
@js.native
trait Slider extends js.Object {
  
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
  implicit class SliderOps[Self <: Slider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDark(value: SliderTheme): Self = this.set("dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: SliderTheme): Self = this.set("light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumTrackTintColor(value: String): Self = this.set("maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumTrackTintColor: Self = this.set("maximumTrackTintColor", js.undefined)
    
    @scala.inline
    def setThumbRadius(value: Double): Self = this.set("thumbRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbRadius: Self = this.set("thumbRadius", js.undefined)
    
    @scala.inline
    def setThumbSize(value: Double): Self = this.set("thumbSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbSize: Self = this.set("thumbSize", js.undefined)
    
    @scala.inline
    def setThumbTintColor(value: String): Self = this.set("thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbTintColor: Self = this.set("thumbTintColor", js.undefined)
    
    @scala.inline
    def setTrackHeight(value: Double): Self = this.set("trackHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackHeight: Self = this.set("trackHeight", js.undefined)
    
    @scala.inline
    def setTrackRadius(value: Double): Self = this.set("trackRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackRadius: Self = this.set("trackRadius", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWidthNull: Self = this.set("width", null)
  }
}
