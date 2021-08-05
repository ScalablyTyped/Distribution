package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoardBg extends StObject {
  
  var boardBg: js.UndefOr[String] = js.undefined
  
  var cellBg: js.UndefOr[String] = js.undefined
  
  var cellLine: js.UndefOr[String] = js.undefined
  
  var cellRadius: js.UndefOr[Double] = js.undefined
  
  var descFontColor: js.UndefOr[String] = js.undefined
  
  var fontColor: js.UndefOr[String] = js.undefined
  
  var margin: js.UndefOr[js.Array[Double] | Double] = js.undefined
  
  var padding: js.UndefOr[js.Array[Double] | Double] = js.undefined
  
  var subFontColor: js.UndefOr[String] = js.undefined
}
object BoardBg {
  
  inline def apply(): BoardBg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoardBg]
  }
  
  extension [Self <: BoardBg](x: Self) {
    
    inline def setBoardBg(value: String): Self = StObject.set(x, "boardBg", value.asInstanceOf[js.Any])
    
    inline def setBoardBgUndefined: Self = StObject.set(x, "boardBg", js.undefined)
    
    inline def setCellBg(value: String): Self = StObject.set(x, "cellBg", value.asInstanceOf[js.Any])
    
    inline def setCellBgUndefined: Self = StObject.set(x, "cellBg", js.undefined)
    
    inline def setCellLine(value: String): Self = StObject.set(x, "cellLine", value.asInstanceOf[js.Any])
    
    inline def setCellLineUndefined: Self = StObject.set(x, "cellLine", js.undefined)
    
    inline def setCellRadius(value: Double): Self = StObject.set(x, "cellRadius", value.asInstanceOf[js.Any])
    
    inline def setCellRadiusUndefined: Self = StObject.set(x, "cellRadius", js.undefined)
    
    inline def setDescFontColor(value: String): Self = StObject.set(x, "descFontColor", value.asInstanceOf[js.Any])
    
    inline def setDescFontColorUndefined: Self = StObject.set(x, "descFontColor", js.undefined)
    
    inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    inline def setMargin(value: js.Array[Double] | Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarginVarargs(value: Double*): Self = StObject.set(x, "margin", js.Array(value :_*))
    
    inline def setPadding(value: js.Array[Double] | Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
    
    inline def setSubFontColor(value: String): Self = StObject.set(x, "subFontColor", value.asInstanceOf[js.Any])
    
    inline def setSubFontColorUndefined: Self = StObject.set(x, "subFontColor", js.undefined)
  }
}
