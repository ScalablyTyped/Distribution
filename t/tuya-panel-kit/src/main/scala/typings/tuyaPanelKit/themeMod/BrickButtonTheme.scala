package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrickButtonTheme extends StObject {
  
  var bgBorder: String
  
  var bgBorderWidth: Double
  
  var bgRadius: Double
  
  var fontColor: String
  
  var fontSize: Double
  
  var loadingBackground: String
  
  var loadingColor: String
}
object BrickButtonTheme {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: BrickButtonTheme] (val x: Self) extends AnyVal {
    
    inline def setBgBorder(value: String): Self = StObject.set(x, "bgBorder", value.asInstanceOf[js.Any])
    
    inline def setBgBorderWidth(value: Double): Self = StObject.set(x, "bgBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setBgRadius(value: Double): Self = StObject.set(x, "bgRadius", value.asInstanceOf[js.Any])
    
    inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLoadingBackground(value: String): Self = StObject.set(x, "loadingBackground", value.asInstanceOf[js.Any])
    
    inline def setLoadingColor(value: String): Self = StObject.set(x, "loadingColor", value.asInstanceOf[js.Any])
  }
}
