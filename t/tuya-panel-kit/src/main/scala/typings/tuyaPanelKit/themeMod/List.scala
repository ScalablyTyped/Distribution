package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.ListTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.ListTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.ListTheme> */
@js.native
trait List extends StObject {
  
  var boardBg: js.UndefOr[String] = js.native
  
  var cellBg: js.UndefOr[String] = js.native
  
  var cellLine: js.UndefOr[String] = js.native
  
  var cellRadius: js.UndefOr[Double] = js.native
  
  var dark: ListTheme = js.native
  
  var descFontColor: js.UndefOr[String] = js.native
  
  var fontColor: js.UndefOr[String] = js.native
  
  var iconColor: js.UndefOr[String] = js.native
  
  var light: ListTheme = js.native
  
  var margin: js.UndefOr[js.Array[Double]] = js.native
  
  var padding: js.UndefOr[js.Array[Double]] = js.native
  
  var subFontColor: js.UndefOr[String] = js.native
}
object List {
  
  @scala.inline
  def apply(dark: ListTheme, light: ListTheme): List = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
  
  @scala.inline
  implicit class ListMutableBuilder[Self <: List] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoardBg(value: String): Self = StObject.set(x, "boardBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoardBgUndefined: Self = StObject.set(x, "boardBg", js.undefined)
    
    @scala.inline
    def setCellBg(value: String): Self = StObject.set(x, "cellBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellBgUndefined: Self = StObject.set(x, "cellBg", js.undefined)
    
    @scala.inline
    def setCellLine(value: String): Self = StObject.set(x, "cellLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellLineUndefined: Self = StObject.set(x, "cellLine", js.undefined)
    
    @scala.inline
    def setCellRadius(value: Double): Self = StObject.set(x, "cellRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellRadiusUndefined: Self = StObject.set(x, "cellRadius", js.undefined)
    
    @scala.inline
    def setDark(value: ListTheme): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescFontColor(value: String): Self = StObject.set(x, "descFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescFontColorUndefined: Self = StObject.set(x, "descFontColor", js.undefined)
    
    @scala.inline
    def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    @scala.inline
    def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    @scala.inline
    def setLight(value: ListTheme): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: js.Array[Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMarginVarargs(value: Double*): Self = StObject.set(x, "margin", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
    
    @scala.inline
    def setSubFontColor(value: String): Self = StObject.set(x, "subFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubFontColorUndefined: Self = StObject.set(x, "subFontColor", js.undefined)
  }
}
