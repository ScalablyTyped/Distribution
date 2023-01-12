package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchButtonTheme extends StObject {
  
  var height: Double
  
  var margin: Double
  
  var onThumbTintColor: String
  
  var onTintColor: String
  
  var thumbSize: Double
  
  var thumbTintColor: String
  
  var tintColor: String
  
  var width: Double
}
object SwitchButtonTheme {
  
  inline def apply(
    height: Double,
    margin: Double,
    onThumbTintColor: String,
    onTintColor: String,
    thumbSize: Double,
    thumbTintColor: String,
    tintColor: String,
    width: Double
  ): SwitchButtonTheme = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], onThumbTintColor = onThumbTintColor.asInstanceOf[js.Any], onTintColor = onTintColor.asInstanceOf[js.Any], thumbSize = thumbSize.asInstanceOf[js.Any], thumbTintColor = thumbTintColor.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchButtonTheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwitchButtonTheme] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setOnThumbTintColor(value: String): Self = StObject.set(x, "onThumbTintColor", value.asInstanceOf[js.Any])
    
    inline def setOnTintColor(value: String): Self = StObject.set(x, "onTintColor", value.asInstanceOf[js.Any])
    
    inline def setThumbSize(value: Double): Self = StObject.set(x, "thumbSize", value.asInstanceOf[js.Any])
    
    inline def setThumbTintColor(value: String): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
