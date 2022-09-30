package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.ListTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.ListTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.ListTheme> */
trait List extends StObject {
  
  var boardBg: js.UndefOr[String] = js.undefined
  
  var cellBg: js.UndefOr[String] = js.undefined
  
  var cellLine: js.UndefOr[String] = js.undefined
  
  var cellRadius: js.UndefOr[Double] = js.undefined
  
  var dark: ListTheme
  
  var descFontColor: js.UndefOr[String] = js.undefined
  
  var fontColor: js.UndefOr[String] = js.undefined
  
  var iconColor: js.UndefOr[String] = js.undefined
  
  var light: ListTheme
  
  var margin: js.UndefOr[js.Array[Double]] = js.undefined
  
  var padding: js.UndefOr[js.Array[Double]] = js.undefined
  
  var subFontColor: js.UndefOr[String] = js.undefined
}
object List {
  
  inline def apply(dark: ListTheme, light: ListTheme): typings.tuyaPanelKit.themeMod.List = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tuyaPanelKit.themeMod.List]
  }
  
  extension [Self <: typings.tuyaPanelKit.themeMod.List](x: Self) {
    
    inline def setBoardBg(value: String): Self = StObject.set(x, "boardBg", value.asInstanceOf[js.Any])
    
    inline def setBoardBgUndefined: Self = StObject.set(x, "boardBg", js.undefined)
    
    inline def setCellBg(value: String): Self = StObject.set(x, "cellBg", value.asInstanceOf[js.Any])
    
    inline def setCellBgUndefined: Self = StObject.set(x, "cellBg", js.undefined)
    
    inline def setCellLine(value: String): Self = StObject.set(x, "cellLine", value.asInstanceOf[js.Any])
    
    inline def setCellLineUndefined: Self = StObject.set(x, "cellLine", js.undefined)
    
    inline def setCellRadius(value: Double): Self = StObject.set(x, "cellRadius", value.asInstanceOf[js.Any])
    
    inline def setCellRadiusUndefined: Self = StObject.set(x, "cellRadius", js.undefined)
    
    inline def setDark(value: ListTheme): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDescFontColor(value: String): Self = StObject.set(x, "descFontColor", value.asInstanceOf[js.Any])
    
    inline def setDescFontColorUndefined: Self = StObject.set(x, "descFontColor", js.undefined)
    
    inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    inline def setLight(value: ListTheme): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: js.Array[Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarginVarargs(value: Double*): Self = StObject.set(x, "margin", js.Array(value*))
    
    inline def setPadding(value: js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setSubFontColor(value: String): Self = StObject.set(x, "subFontColor", value.asInstanceOf[js.Any])
    
    inline def setSubFontColorUndefined: Self = StObject.set(x, "subFontColor", js.undefined)
  }
}
