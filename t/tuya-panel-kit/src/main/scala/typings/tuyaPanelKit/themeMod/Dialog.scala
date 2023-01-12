package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :string,   basic :tuya-panel-kit.tuya-panel-kit/theme.DialogTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.DialogTheme,   system :tuya-panel-kit.tuya-panel-kit/theme.DialogTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.DialogTheme> */
trait Dialog extends StObject {
  
  var basic: DialogTheme
  
  var bg: js.UndefOr[String] = js.undefined
  
  var cancelFontColor: js.UndefOr[String] = js.undefined
  
  var cancelFontSize: js.UndefOr[Double] = js.undefined
  
  var cellHeight: js.UndefOr[Double] = js.undefined
  
  var confirmFontColor: js.UndefOr[String] = js.undefined
  
  var confirmFontSize: js.UndefOr[Double] = js.undefined
  
  var dark: DialogTheme
  
  var lineColor: js.UndefOr[String] = js.undefined
  
  var prompt: js.UndefOr[PromptTheme] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var subTitleFontColor: js.UndefOr[String] = js.undefined
  
  var subTitleFontSize: js.UndefOr[Double] = js.undefined
  
  var system: DialogTheme
  
  var titleFontColor: js.UndefOr[String] = js.undefined
  
  var titleFontSize: js.UndefOr[Double] = js.undefined
  
  var `type`: String
  
  var width: js.UndefOr[Double] = js.undefined
}
object Dialog {
  
  inline def apply(basic: DialogTheme, dark: DialogTheme, system: DialogTheme, `type`: String): Dialog = {
    val __obj = js.Dynamic.literal(basic = basic.asInstanceOf[js.Any], dark = dark.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dialog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dialog] (val x: Self) extends AnyVal {
    
    inline def setBasic(value: DialogTheme): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
    
    inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
    inline def setCancelFontColor(value: String): Self = StObject.set(x, "cancelFontColor", value.asInstanceOf[js.Any])
    
    inline def setCancelFontColorUndefined: Self = StObject.set(x, "cancelFontColor", js.undefined)
    
    inline def setCancelFontSize(value: Double): Self = StObject.set(x, "cancelFontSize", value.asInstanceOf[js.Any])
    
    inline def setCancelFontSizeUndefined: Self = StObject.set(x, "cancelFontSize", js.undefined)
    
    inline def setCellHeight(value: Double): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
    
    inline def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
    
    inline def setConfirmFontColor(value: String): Self = StObject.set(x, "confirmFontColor", value.asInstanceOf[js.Any])
    
    inline def setConfirmFontColorUndefined: Self = StObject.set(x, "confirmFontColor", js.undefined)
    
    inline def setConfirmFontSize(value: Double): Self = StObject.set(x, "confirmFontSize", value.asInstanceOf[js.Any])
    
    inline def setConfirmFontSizeUndefined: Self = StObject.set(x, "confirmFontSize", js.undefined)
    
    inline def setDark(value: DialogTheme): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setPrompt(value: PromptTheme): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSubTitleFontColor(value: String): Self = StObject.set(x, "subTitleFontColor", value.asInstanceOf[js.Any])
    
    inline def setSubTitleFontColorUndefined: Self = StObject.set(x, "subTitleFontColor", js.undefined)
    
    inline def setSubTitleFontSize(value: Double): Self = StObject.set(x, "subTitleFontSize", value.asInstanceOf[js.Any])
    
    inline def setSubTitleFontSizeUndefined: Self = StObject.set(x, "subTitleFontSize", js.undefined)
    
    inline def setSystem(value: DialogTheme): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setTitleFontColor(value: String): Self = StObject.set(x, "titleFontColor", value.asInstanceOf[js.Any])
    
    inline def setTitleFontColorUndefined: Self = StObject.set(x, "titleFontColor", js.undefined)
    
    inline def setTitleFontSize(value: Double): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
    
    inline def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
