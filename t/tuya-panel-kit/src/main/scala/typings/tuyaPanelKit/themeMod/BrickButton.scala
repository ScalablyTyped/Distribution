package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.BrickButtonTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.BrickButtonTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.BrickButtonTheme> */
trait BrickButton extends StObject {
  
  var bgBorder: js.UndefOr[String] = js.undefined
  
  var bgBorderWidth: js.UndefOr[Double] = js.undefined
  
  var bgRadius: js.UndefOr[Double] = js.undefined
  
  var dark: BrickButtonTheme
  
  var fontColor: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var light: BrickButtonTheme
  
  var loadingBackground: js.UndefOr[String] = js.undefined
  
  var loadingColor: js.UndefOr[String] = js.undefined
}
object BrickButton {
  
  @scala.inline
  def apply(dark: BrickButtonTheme, light: BrickButtonTheme): BrickButton = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrickButton]
  }
  
  @scala.inline
  implicit class BrickButtonMutableBuilder[Self <: BrickButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBgBorder(value: String): Self = StObject.set(x, "bgBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgBorderUndefined: Self = StObject.set(x, "bgBorder", js.undefined)
    
    @scala.inline
    def setBgBorderWidth(value: Double): Self = StObject.set(x, "bgBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgBorderWidthUndefined: Self = StObject.set(x, "bgBorderWidth", js.undefined)
    
    @scala.inline
    def setBgRadius(value: Double): Self = StObject.set(x, "bgRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgRadiusUndefined: Self = StObject.set(x, "bgRadius", js.undefined)
    
    @scala.inline
    def setDark(value: BrickButtonTheme): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setLight(value: BrickButtonTheme): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingBackground(value: String): Self = StObject.set(x, "loadingBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingBackgroundUndefined: Self = StObject.set(x, "loadingBackground", js.undefined)
    
    @scala.inline
    def setLoadingColor(value: String): Self = StObject.set(x, "loadingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingColorUndefined: Self = StObject.set(x, "loadingColor", js.undefined)
  }
}
