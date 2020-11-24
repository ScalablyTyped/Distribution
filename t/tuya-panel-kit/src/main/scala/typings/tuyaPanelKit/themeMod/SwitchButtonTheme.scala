package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchButtonTheme extends js.Object {
  
  var height: Double = js.native
  
  var margin: Double = js.native
  
  var onThumbTintColor: String = js.native
  
  var onTintColor: String = js.native
  
  var thumbSize: Double = js.native
  
  var thumbTintColor: String = js.native
  
  var tintColor: String = js.native
  
  var width: Double = js.native
}
object SwitchButtonTheme {
  
  @scala.inline
  def apply(
    height: Double,
    margin: Double,
    onThumbTintColor: String,
    onTintColor: String,
    thumbSize: Double,
    thumbTintColor: String,
    tintColor: String,
    width: Double
  ): SwitchButtonTheme = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], onThumbTintColor = onThumbTintColor.asInstanceOf[js.Any], onTintColor = onTintColor.asInstanceOf[js.Any], thumbSize = thumbSize.asInstanceOf[js.Any], thumbTintColor = thumbTintColor.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchButtonTheme]
  }
  
  @scala.inline
  implicit class SwitchButtonThemeOps[Self <: SwitchButtonTheme] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnThumbTintColor(value: String): Self = this.set("onThumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTintColor(value: String): Self = this.set("onTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbSize(value: Double): Self = this.set("thumbSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbTintColor(value: String): Self = this.set("thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
