package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.ButtonTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.ButtonTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.ButtonTheme> */
trait Button extends StObject {
  
  var bgHeight: js.UndefOr[Double | Null] = js.undefined
  
  var bgRadius: js.UndefOr[Double | Null] = js.undefined
  
  var bgWidth: js.UndefOr[Double | Null] = js.undefined
  
  var dark: ButtonTheme
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var iconSize: js.UndefOr[Double] = js.undefined
  
  var light: ButtonTheme
  
  var margin: js.UndefOr[js.Array[Double]] = js.undefined
}
object Button {
  
  @scala.inline
  def apply(dark: ButtonTheme, light: ButtonTheme): Button = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  
  @scala.inline
  implicit class ButtonMutableBuilder[Self <: Button] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBgHeight(value: Double): Self = StObject.set(x, "bgHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgHeightNull: Self = StObject.set(x, "bgHeight", null)
    
    @scala.inline
    def setBgHeightUndefined: Self = StObject.set(x, "bgHeight", js.undefined)
    
    @scala.inline
    def setBgRadius(value: Double): Self = StObject.set(x, "bgRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgRadiusNull: Self = StObject.set(x, "bgRadius", null)
    
    @scala.inline
    def setBgRadiusUndefined: Self = StObject.set(x, "bgRadius", js.undefined)
    
    @scala.inline
    def setBgWidth(value: Double): Self = StObject.set(x, "bgWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgWidthNull: Self = StObject.set(x, "bgWidth", null)
    
    @scala.inline
    def setBgWidthUndefined: Self = StObject.set(x, "bgWidth", js.undefined)
    
    @scala.inline
    def setDark(value: ButtonTheme): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    @scala.inline
    def setLight(value: ButtonTheme): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: js.Array[Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMarginVarargs(value: Double*): Self = StObject.set(x, "margin", js.Array(value :_*))
  }
}
