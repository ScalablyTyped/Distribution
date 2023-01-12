package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonTheme extends StObject {
  
  var bgHeight: Double | Null
  
  var bgRadius: Double | Null
  
  var bgWidth: Double | Null
  
  var fontSize: Double
  
  var iconSize: Double
  
  var margin: js.Array[Double]
}
object ButtonTheme {
  
  inline def apply(fontSize: Double, iconSize: Double, margin: js.Array[Double]): ButtonTheme = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], iconSize = iconSize.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], bgHeight = null, bgRadius = null, bgWidth = null)
    __obj.asInstanceOf[ButtonTheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonTheme] (val x: Self) extends AnyVal {
    
    inline def setBgHeight(value: Double): Self = StObject.set(x, "bgHeight", value.asInstanceOf[js.Any])
    
    inline def setBgHeightNull: Self = StObject.set(x, "bgHeight", null)
    
    inline def setBgRadius(value: Double): Self = StObject.set(x, "bgRadius", value.asInstanceOf[js.Any])
    
    inline def setBgRadiusNull: Self = StObject.set(x, "bgRadius", null)
    
    inline def setBgWidth(value: Double): Self = StObject.set(x, "bgWidth", value.asInstanceOf[js.Any])
    
    inline def setBgWidthNull: Self = StObject.set(x, "bgWidth", null)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: js.Array[Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginVarargs(value: Double*): Self = StObject.set(x, "margin", js.Array(value*))
  }
}
