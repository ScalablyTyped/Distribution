package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrickButtonTheme extends js.Object {
  
  var bgBorder: String = js.native
  
  var bgBorderWidth: Double = js.native
  
  var bgRadius: Double = js.native
  
  var fontColor: String = js.native
  
  var fontSize: Double = js.native
  
  var loadingBackground: String = js.native
  
  var loadingColor: String = js.native
}
object BrickButtonTheme {
  
  @scala.inline
  def apply(
    bgBorder: String,
    bgBorderWidth: Double,
    bgRadius: Double,
    fontColor: String,
    fontSize: Double,
    loadingBackground: String,
    loadingColor: String
  ): BrickButtonTheme = {
    val __obj = js.Dynamic.literal(bgBorder = bgBorder.asInstanceOf[js.Any], bgBorderWidth = bgBorderWidth.asInstanceOf[js.Any], bgRadius = bgRadius.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], loadingBackground = loadingBackground.asInstanceOf[js.Any], loadingColor = loadingColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrickButtonTheme]
  }
  
  @scala.inline
  implicit class BrickButtonThemeOps[Self <: BrickButtonTheme] (val x: Self) extends AnyVal {
    
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
    def setBgBorder(value: String): Self = this.set("bgBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgBorderWidth(value: Double): Self = this.set("bgBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgRadius(value: Double): Self = this.set("bgRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingBackground(value: String): Self = this.set("loadingBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingColor(value: String): Self = this.set("loadingColor", value.asInstanceOf[js.Any])
  }
}
