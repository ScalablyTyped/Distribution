package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTheme extends StObject {
  
  var boardBg: String
  
  var cellBg: String
  
  var cellLine: String
  
  var cellRadius: Double
  
  var descFontColor: String
  
  var fontColor: String
  
  var iconColor: String
  
  var margin: js.Array[Double]
  
  var padding: js.Array[Double]
  
  var subFontColor: String
}
object ListTheme {
  
  inline def apply(
    boardBg: String,
    cellBg: String,
    cellLine: String,
    cellRadius: Double,
    descFontColor: String,
    fontColor: String,
    iconColor: String,
    margin: js.Array[Double],
    padding: js.Array[Double],
    subFontColor: String
  ): ListTheme = {
    val __obj = js.Dynamic.literal(boardBg = boardBg.asInstanceOf[js.Any], cellBg = cellBg.asInstanceOf[js.Any], cellLine = cellLine.asInstanceOf[js.Any], cellRadius = cellRadius.asInstanceOf[js.Any], descFontColor = descFontColor.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], iconColor = iconColor.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], subFontColor = subFontColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTheme]
  }
  
  extension [Self <: ListTheme](x: Self) {
    
    inline def setBoardBg(value: String): Self = StObject.set(x, "boardBg", value.asInstanceOf[js.Any])
    
    inline def setCellBg(value: String): Self = StObject.set(x, "cellBg", value.asInstanceOf[js.Any])
    
    inline def setCellLine(value: String): Self = StObject.set(x, "cellLine", value.asInstanceOf[js.Any])
    
    inline def setCellRadius(value: Double): Self = StObject.set(x, "cellRadius", value.asInstanceOf[js.Any])
    
    inline def setDescFontColor(value: String): Self = StObject.set(x, "descFontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: js.Array[Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginVarargs(value: Double*): Self = StObject.set(x, "margin", js.Array(value :_*))
    
    inline def setPadding(value: js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value :_*))
    
    inline def setSubFontColor(value: String): Self = StObject.set(x, "subFontColor", value.asInstanceOf[js.Any])
  }
}
