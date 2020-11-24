package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderTheme extends js.Object {
  
  var maximumTrackTintColor: String = js.native
  
  var thumbRadius: Double = js.native
  
  var thumbSize: Double = js.native
  
  var thumbTintColor: String = js.native
  
  var trackHeight: Double = js.native
  
  var trackRadius: Double = js.native
  
  var width: Double | Null = js.native
}
object SliderTheme {
  
  @scala.inline
  def apply(
    maximumTrackTintColor: String,
    thumbRadius: Double,
    thumbSize: Double,
    thumbTintColor: String,
    trackHeight: Double,
    trackRadius: Double
  ): SliderTheme = {
    val __obj = js.Dynamic.literal(maximumTrackTintColor = maximumTrackTintColor.asInstanceOf[js.Any], thumbRadius = thumbRadius.asInstanceOf[js.Any], thumbSize = thumbSize.asInstanceOf[js.Any], thumbTintColor = thumbTintColor.asInstanceOf[js.Any], trackHeight = trackHeight.asInstanceOf[js.Any], trackRadius = trackRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderTheme]
  }
  
  @scala.inline
  implicit class SliderThemeOps[Self <: SliderTheme] (val x: Self) extends AnyVal {
    
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
    def setMaximumTrackTintColor(value: String): Self = this.set("maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbRadius(value: Double): Self = this.set("thumbRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbSize(value: Double): Self = this.set("thumbSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbTintColor(value: String): Self = this.set("thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackHeight(value: Double): Self = this.set("trackHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackRadius(value: Double): Self = this.set("trackRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthNull: Self = this.set("width", null)
  }
}
